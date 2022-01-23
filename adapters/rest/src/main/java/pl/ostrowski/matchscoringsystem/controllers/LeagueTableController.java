package pl.ostrowski.matchscoringsystem.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.ostrowski.matchscoringsystem.dtos.LeagueTableDto;
import pl.ostrowski.matchscoringsystem.mapper.DtoMapper;
import pl.ostrowski.matchscoringsystem.services.LeagueTableService;

@RestController
@RequestMapping("/api/v1/leaguetable")
@RequiredArgsConstructor
public class LeagueTableController {

    private final LeagueTableService leagueTableService;
    private final DtoMapper dtoMapper;

    @GetMapping("/seasons/{season}")
    LeagueTableDto getLeagueTableForSeason(@PathVariable("season") String season) {
        return dtoMapper.toDto(leagueTableService.getTableForSeason(season));
    }

}
