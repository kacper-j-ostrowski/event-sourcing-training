package pl.ostrowski.matchscoringsystem.model;

import lombok.Builder;

import java.time.Instant;
import java.util.UUID;

@Builder
public record Match(
        UUID id,
        Instant matchDate,
        String stadium,
        Integer numberOfSpectators,
        Team hostTeam,
        Team guestTeam,
        Result result,
        int round,
        String season
) {
}
