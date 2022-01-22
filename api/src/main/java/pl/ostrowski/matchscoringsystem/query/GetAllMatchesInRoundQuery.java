package pl.ostrowski.matchscoringsystem.query;

public record GetAllMatchesInRoundQuery(
        int round,
        String season
) {
}
