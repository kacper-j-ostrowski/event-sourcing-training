package pl.ostrowski.matchscoringsystem.dtos;

public record ResultDto(
        int hostTeamScore,
        int guestTeamScore,
        boolean walkOver,
        TeamDto winner
) {
}
