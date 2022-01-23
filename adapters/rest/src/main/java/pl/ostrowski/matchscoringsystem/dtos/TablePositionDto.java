package pl.ostrowski.matchscoringsystem.dtos;

public record TablePositionDto(
        TeamDto team,
        int totalPoints,
        int matchesWon,
        int matchesDraw,
        int matchesLost,
        int scoredGoals,
        int lostGoals
) {
}
