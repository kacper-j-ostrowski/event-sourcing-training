package pl.ostrowski.matchscoringsystem.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TablePosition {
    private Team team;
    private int totalPoints;
    private int matchesWon;
    private int matchesDraw;
    private int matchesLost;
    private int scoredGoals;
    private int lostGoals;
}
