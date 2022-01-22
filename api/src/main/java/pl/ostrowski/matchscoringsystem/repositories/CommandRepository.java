package pl.ostrowski.matchscoringsystem.repositories;

import pl.ostrowski.matchscoringsystem.model.Match;
import pl.ostrowski.matchscoringsystem.model.Team;

public interface CommandRepository {
    Team addTeam(Team team);
    Match addMatch(Match match);
}
