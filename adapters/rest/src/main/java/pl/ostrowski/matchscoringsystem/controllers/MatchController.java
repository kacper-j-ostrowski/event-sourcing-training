package pl.ostrowski.matchscoringsystem.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.ostrowski.matchscoringsystem.dtos.MatchDto;
import pl.ostrowski.matchscoringsystem.mapper.DtoMapper;
import pl.ostrowski.matchscoringsystem.services.MatchService;

@RestController
@RequestMapping("/api/v1/matches")
@RequiredArgsConstructor
public class MatchController {

    private final MatchService matchService;
    private final DtoMapper dtoMapper;

    @PostMapping
    public MatchDto addMatch(@Validated @RequestBody MatchDto matchDto) {
        return dtoMapper.toDto(matchService.addMatch(dtoMapper.fromDto(matchDto)));
    }

}
