package pl.ostrowski.matchscoringsystem.dtos;

import org.springframework.lang.Nullable;

import java.time.Instant;
import java.util.UUID;

public record MatchDto(
        @Nullable
        UUID id,
        Instant matchDate,
        String stadium,
        Integer numberOfSpectators,
        TeamDto hostTeam,
        TeamDto guestTeam,
        ResultDto result,
        int round,
        String season
) {
}
