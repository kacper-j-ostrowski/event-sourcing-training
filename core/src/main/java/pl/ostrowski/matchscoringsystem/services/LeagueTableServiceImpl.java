package pl.ostrowski.matchscoringsystem.services;

import lombok.RequiredArgsConstructor;
import pl.ostrowski.matchscoringsystem.model.LeagueTable;
import pl.ostrowski.matchscoringsystem.model.Match;
import pl.ostrowski.matchscoringsystem.model.TablePosition;
import pl.ostrowski.matchscoringsystem.model.Team;
import pl.ostrowski.matchscoringsystem.repositories.QueryRepository;
import pl.ostrowski.matchscoringsystem.strategies.TotalStatisticsCalculator;
import pl.ostrowski.matchscoringsystem.strategies.TotalStatisticsComparator;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@RequiredArgsConstructor
public class LeagueTableServiceImpl implements LeagueTableService {

    private final QueryRepository queryRepository;
    private final TotalStatisticsCalculator totalStatisticsCalculator;

    @Override
    public LeagueTable getTableForSeason(String season) {
        Set<Team> teamsInSeason = queryRepository.getTeamsForSeason(season);
        List<TablePosition> positions = new ArrayList<>();
        teamsInSeason.forEach(team -> {
            List<Match> matches = queryRepository.getMatchesByTeamAndSeason(team, season);
            TablePosition statistics = totalStatisticsCalculator.calculate(team, matches);
            positions.add(statistics);
        });
        positions.sort(new TotalStatisticsComparator());
        Map<Integer, TablePosition> table = new HashMap<>();
        AtomicInteger pos = new AtomicInteger(1);
        positions.forEach(p -> {
            table.put(pos.getAndIncrement(), p);
        });
        return new LeagueTable(table);
    }
}
