package pl.ostrowski.matchscoringsystem.model;

import java.util.Map;

public record LeagueTable(
        Map<Integer, TablePosition> positions
) {
}
