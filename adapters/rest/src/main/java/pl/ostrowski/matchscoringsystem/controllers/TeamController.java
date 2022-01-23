package pl.ostrowski.matchscoringsystem.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pl.ostrowski.matchscoringsystem.dtos.TeamDto;
import pl.ostrowski.matchscoringsystem.mapper.DtoMapper;
import pl.ostrowski.matchscoringsystem.services.TeamService;

import java.util.List;
import java.util.stream.Collectors;

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

    @GetMapping
    public List<TeamDto> getAllTeams() {
        return teamService.getAllTeams().stream().map(dtoMapper::toDto).collect(Collectors.toList());
    }

}
