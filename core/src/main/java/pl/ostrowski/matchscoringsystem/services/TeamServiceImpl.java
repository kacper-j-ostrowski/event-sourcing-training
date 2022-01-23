package pl.ostrowski.matchscoringsystem.services;

import lombok.RequiredArgsConstructor;
import pl.ostrowski.matchscoringsystem.model.Team;
import pl.ostrowski.matchscoringsystem.repositories.CommandRepository;
import pl.ostrowski.matchscoringsystem.repositories.QueryRepository;

import java.util.List;

@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService {

    private final CommandRepository commandRepository;
    private final QueryRepository queryRepository;

    @Override
    public Team create(Team team) {
        return commandRepository.addTeam(team);
    }

    @Override
    public List<Team> getAllTeams() {
        return queryRepository.getAllTeams();
    }
}
