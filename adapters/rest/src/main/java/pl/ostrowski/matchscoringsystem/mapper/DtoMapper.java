package pl.ostrowski.matchscoringsystem.mapper;

import org.mapstruct.Mapper;
import pl.ostrowski.matchscoringsystem.dtos.TeamDto;
import pl.ostrowski.matchscoringsystem.model.Team;

@Mapper(componentModel = "spring")
public interface DtoMapper {

    TeamDto toDto(Team team);

    Team fromDto(TeamDto teamDto);
}
