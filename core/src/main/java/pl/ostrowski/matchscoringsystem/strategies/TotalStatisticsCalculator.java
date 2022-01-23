package pl.ostrowski.matchscoringsystem.strategies;


import pl.ostrowski.matchscoringsystem.model.Match;
import pl.ostrowski.matchscoringsystem.model.TablePosition;
import pl.ostrowski.matchscoringsystem.model.Team;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class TotalStatisticsCalculator {

    public TablePosition calculate(Team team, List<Match> matches) {
        AtomicInteger totalPoints = new AtomicInteger();
        AtomicInteger matchesWon = new AtomicInteger();
        AtomicInteger matchesLost = new AtomicInteger();
        AtomicInteger scoredGoals = new AtomicInteger();
        AtomicInteger lostGoals = new AtomicInteger();

        matches.forEach(match -> {
            if (match.hostTeam().id().equals(team.id())) {
                scoredGoals.addAndGet(match.result().hostTeamScore());
                lostGoals.addAndGet(match.result().guestTeamScore());
                if(match.result().winner().equals(team)) {
                    matchesWon.addAndGet(1);
                    totalPoints.addAndGet(3);
                } else {
                    matchesLost.addAndGet(1);
                }
            } else if (match.guestTeam().id().equals(team.id())) {
                scoredGoals.addAndGet(match.result().guestTeamScore());
                lostGoals.addAndGet(match.result().hostTeamScore());
                if(match.result().winner().equals(team)) {
                    matchesWon.addAndGet(1);
                    totalPoints.addAndGet(3);
                } else {
                    matchesLost.addAndGet(1);
                }
            } else {
                throw new IllegalStateException("Team " + team + " didn't play in that match!! " + match);
            }
        });

        return TablePosition.builder()
                .matchesWon(matchesWon.get())
                .lostGoals(lostGoals.get())
                .totalPoints(totalPoints.get())
                .scoredGoals(scoredGoals.get())
                .matchesLost(matchesLost.get())
                .team(team)
                .build();
    }

}
