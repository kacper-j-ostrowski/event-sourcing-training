package pl.ostrowski.matchscoringsystem.model;

public record Result(
        int hostTeamScore,
        int guestTeamScore,
        boolean walkOver,
        Team winner
) {
}
