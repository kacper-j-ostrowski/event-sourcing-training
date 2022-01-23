package pl.ostrowski.matchscoringsystem.strategies;

import pl.ostrowski.matchscoringsystem.model.TablePosition;

import java.util.Comparator;

public class TotalStatisticsComparator implements Comparator<TablePosition> {
    @Override
    public int compare(TablePosition o1, TablePosition o2) {
        return o1.getTotalPoints() - o2.getTotalPoints();
    }
}
