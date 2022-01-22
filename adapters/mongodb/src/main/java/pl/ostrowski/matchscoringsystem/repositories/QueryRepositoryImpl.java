package pl.ostrowski.matchscoringsystem.repositories;

import lombok.RequiredArgsConstructor;
import pl.ostrowski.matchscoringsystem.EntityMapper;
import pl.ostrowski.matchscoringsystem.documents.MatchDocument;
import pl.ostrowski.matchscoringsystem.model.Match;
import pl.ostrowski.matchscoringsystem.model.Team;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class QueryRepositoryImpl implements QueryRepository {

    private final SpringMatchRepository springMatchRepository;
    private final SpringTeamRepository springTeamRepository;
    private final EntityMapper entityMapper;

    @Override
    public Team getById(UUID id) {
        return entityMapper.fromDocument(springTeamRepository.findById(id).orElseThrow());
    }

    @Override
    public List<Team> getAllTeams() {
        return springTeamRepository.findAll()
                .stream()
                .map(entityMapper::fromDocument)
                .collect(Collectors.toList());
    }

    @Override
    public List<Match> getAllMatchesByRoundAndSeason(int round, String season) {
        return springMatchRepository.findAll(MatchDocument.getExampleOf(round, season))
                .stream()
                .map(entityMapper::fromDocument)
                .collect(Collectors.toList());
    }
}
