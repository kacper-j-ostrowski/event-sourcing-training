package pl.ostrowski.matchscoringsystem.dtos;

import java.util.Map;

public record LeagueTableDto(
        Map<Integer, TablePositionDto> positions
) {
}
