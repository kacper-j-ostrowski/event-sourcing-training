package pl.ostrowski.matchscoringsystem.model;

import java.util.UUID;

public record Team(
        UUID id,
        String name,
        String city,
        String stadium
) {
}
