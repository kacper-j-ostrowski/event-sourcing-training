package pl.ostrowski.matchscoringsystem.mapper;

import org.mapstruct.Mapper;
import pl.ostrowski.matchscoringsystem.documents.MatchDocument;
import pl.ostrowski.matchscoringsystem.documents.ResultDocument;
import pl.ostrowski.matchscoringsystem.documents.TeamDocument;
import pl.ostrowski.matchscoringsystem.model.Match;
import pl.ostrowski.matchscoringsystem.model.Result;
import pl.ostrowski.matchscoringsystem.model.Team;

@Mapper(componentModel = "spring")
public interface EntityMapper {

    Team fromDocument(TeamDocument teamDocument);

    TeamDocument toDocument(Team team);

    Match fromDocument(MatchDocument matchDocument);

    MatchDocument toDocument(Match match);

    ResultDocument toDocument(Result result);

    Result fromDocument(ResultDocument resultDocument);
}
