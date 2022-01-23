package pl.ostrowski.matchscoringsystem.services;

import pl.ostrowski.matchscoringsystem.model.LeagueTable;

public interface LeagueTableService {
    LeagueTable getTableForSeason(String season);
}
