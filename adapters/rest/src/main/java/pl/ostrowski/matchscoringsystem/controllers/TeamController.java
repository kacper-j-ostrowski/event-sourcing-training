package pl.ostrowski.matchscoringsystem.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.ostrowski.matchscoringsystem.dtos.TeamDto;
import pl.ostrowski.matchscoringsystem.mapper.DtoMapper;
import pl.ostrowski.matchscoringsystem.services.TeamService;

@RestController
@RequestMapping("/api/v1/teams")
@RequiredArgsConstructor
public class TeamController {

    private final TeamService teamService;
    private final DtoMapper dtoMapper;

    @PostMapping
    public TeamDto create(@Validated @RequestBody TeamDto teamDto) {
        return dtoMapper.toDto(teamService.create(dtoMapper.fromDto(teamDto)));
    }

}
