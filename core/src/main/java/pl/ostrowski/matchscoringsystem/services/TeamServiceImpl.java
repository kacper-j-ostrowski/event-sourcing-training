package pl.ostrowski.matchscoringsystem.services;

import lombok.RequiredArgsConstructor;
import pl.ostrowski.matchscoringsystem.model.Team;
import pl.ostrowski.matchscoringsystem.repositories.CommandRepository;

@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService {

    private final CommandRepository commandRepository;

    @Override
    public Team create(Team team) {
        return commandRepository.addTeam(team);
    }
}
