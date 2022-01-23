package pl.ostrowski.matchscoringsystem.services;

import pl.ostrowski.matchscoringsystem.model.Team;

import java.util.List;

public interface TeamService {
    Team create(Team team);
    List<Team> getAllTeams();
}
