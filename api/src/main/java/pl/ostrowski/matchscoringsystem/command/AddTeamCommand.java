package pl.ostrowski.matchscoringsystem.command;

public record AddTeamCommand(
        String name,
        String city,
        String stadium
) {
}
