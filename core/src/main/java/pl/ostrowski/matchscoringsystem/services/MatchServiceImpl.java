package pl.ostrowski.matchscoringsystem.services;

import lombok.RequiredArgsConstructor;
import pl.ostrowski.matchscoringsystem.repositories.CommandRepository;

@RequiredArgsConstructor
public class MatchServiceImpl implements MatchService {
    private final CommandRepository commandRepository;
}
