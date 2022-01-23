package pl.ostrowski.matchscoringsystem.repositories;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import pl.ostrowski.matchscoringsystem.documents.MatchDocument;
import pl.ostrowski.matchscoringsystem.mapper.EntityMapper;
import pl.ostrowski.matchscoringsystem.model.Match;
import pl.ostrowski.matchscoringsystem.model.Team;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
    public Set<Team> getTeamsForSeason(String season) {
        Set<Team> teamsForSeason = new HashSet<>();
        Example<MatchDocument> example = Example.of(MatchDocument.builder()
                .season(season)
                .build());
        List<MatchDocument> matches = springMatchRepository.findAll(example);
        matches.forEach(match -> {
            teamsForSeason.add(entityMapper.fromDocument(match.getHostTeam()));
            teamsForSeason.add(entityMapper.fromDocument(match.getGuestTeam()));
        });
        return teamsForSeason;
    }

    @Override
    public List<Match> getMatchesByTeamAndSeason(Team team, String season) {
        Example<MatchDocument> asHost = Example.of(MatchDocument.builder()
                .hostTeam(entityMapper.toDocument(team))
                .season(season)
                .build());
        Example<MatchDocument> asGuest = Example.of(MatchDocument.builder()
                .guestTeam(entityMapper.toDocument(team))
                .season(season)
                .build());
        return Stream.concat(
                        springMatchRepository.findAll(asHost).stream(),
                        springMatchRepository.findAll(asGuest).stream())
                .map(entityMapper::fromDocument)
                .collect(Collectors.toList());
    }

}
