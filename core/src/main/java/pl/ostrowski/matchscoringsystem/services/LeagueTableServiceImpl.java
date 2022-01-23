package pl.ostrowski.matchscoringsystem.services;

import lombok.RequiredArgsConstructor;
import pl.ostrowski.matchscoringsystem.model.LeagueTable;
import pl.ostrowski.matchscoringsystem.repositories.QueryRepository;

@RequiredArgsConstructor
public class LeagueTableServiceImpl implements LeagueTableService{

    private final QueryRepository queryRepository;

    @Override
    public LeagueTable getTable() {
        return null;
    }
}
