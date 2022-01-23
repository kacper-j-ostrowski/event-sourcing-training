package pl.ostrowski.matchscoringsystem.repositories;

import lombok.RequiredArgsConstructor;
import pl.ostrowski.matchscoringsystem.documents.MatchDocument;
import pl.ostrowski.matchscoringsystem.documents.TeamDocument;
import pl.ostrowski.matchscoringsystem.mapper.EntityMapper;
import pl.ostrowski.matchscoringsystem.model.Match;
import pl.ostrowski.matchscoringsystem.model.Team;

import java.util.UUID;

@RequiredArgsConstructor
public class CommandRepositoryImpl implements CommandRepository {

    private final SpringMatchRepository springMatchRepository;
    private final SpringTeamRepository springTeamRepository;
    private final EntityMapper entityMapper;

    @Override
    public Team addTeam(Team team) {
        TeamDocument teamDocument = entityMapper.toDocument(team);
        teamDocument.setId(UUID.randomUUID());
        return entityMapper.fromDocument(springTeamRepository.save(teamDocument));
    }

    @Override
    public Match addMatch(Match match) {
        MatchDocument matchDocument = entityMapper.toDocument(match);
        matchDocument.setId(UUID.randomUUID());
        return entityMapper.fromDocument(springMatchRepository.save(matchDocument));
    }
}
