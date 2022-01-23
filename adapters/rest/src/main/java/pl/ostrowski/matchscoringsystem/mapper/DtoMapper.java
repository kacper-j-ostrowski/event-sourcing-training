package pl.ostrowski.matchscoringsystem.mapper;

import org.mapstruct.Mapper;
import pl.ostrowski.matchscoringsystem.dtos.LeagueTableDto;
import pl.ostrowski.matchscoringsystem.dtos.MatchDto;
import pl.ostrowski.matchscoringsystem.dtos.TablePositionDto;
import pl.ostrowski.matchscoringsystem.dtos.TeamDto;
import pl.ostrowski.matchscoringsystem.model.LeagueTable;
import pl.ostrowski.matchscoringsystem.model.Match;
import pl.ostrowski.matchscoringsystem.model.TablePosition;
import pl.ostrowski.matchscoringsystem.model.Team;

@Mapper(componentModel = "spring")
public interface DtoMapper {

    TeamDto toDto(Team team);

    Team fromDto(TeamDto teamDto);

    LeagueTableDto toDto(LeagueTable leagueTable);

    TablePositionDto toDto(TablePosition tablePosition);

    MatchDto toDto(Match match);

    Match fromDto(MatchDto matchDto);
}
