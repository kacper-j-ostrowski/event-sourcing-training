package pl.ostrowski.matchscoringsystem.model;

import java.time.Instant;
import java.util.UUID;

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
