package pl.ostrowski.matchscoringsystem.model;

import java.util.List;

public record SeasonInfo(
        String season,
        List<Integer> rounds
) {
}
