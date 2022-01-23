package pl.ostrowski.matchscoringsystem.repositories;

import pl.ostrowski.matchscoringsystem.model.Match;
import pl.ostrowski.matchscoringsystem.model.Team;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface QueryRepository {
    Team getById(UUID id);

    List<Team> getAllTeams();

    Set<Team> getTeamsForSeason(String season);

    List<Match> getMatchesByTeamAndSeason(Team team, String season);
}
