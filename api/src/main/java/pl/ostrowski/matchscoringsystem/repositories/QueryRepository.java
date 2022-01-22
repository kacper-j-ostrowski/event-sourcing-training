package pl.ostrowski.matchscoringsystem.repositories;

import pl.ostrowski.matchscoringsystem.model.Match;
import pl.ostrowski.matchscoringsystem.model.Team;

import java.util.List;
import java.util.UUID;

public interface QueryRepository {
    Team getById(UUID id);
    List<Team> getAllTeams();
    List<Match> getAllMatchesByRoundAndSeason(int round, String season);
}
