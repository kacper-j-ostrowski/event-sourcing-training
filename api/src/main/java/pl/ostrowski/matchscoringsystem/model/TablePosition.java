package pl.ostrowski.matchscoringsystem.model;

public record TablePosition(
        Team team,
        int totalPoints,
        int position,
        int matchesWon,
        int matchesDraw,
        int matchesLost,
        int scoredGoals,
        int lostGoals
) {
}
