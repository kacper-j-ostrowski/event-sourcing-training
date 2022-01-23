package pl.ostrowski.matchscoringsystem.dtos;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.UUID;

public record TeamDto(
        @Nullable
        UUID id,
        @NonNull
        String name,
        @NonNull
        String city,
        @NonNull
        String stadium
) {
}
