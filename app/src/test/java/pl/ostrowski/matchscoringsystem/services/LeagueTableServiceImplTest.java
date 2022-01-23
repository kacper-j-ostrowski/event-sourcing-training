package pl.ostrowski.matchscoringsystem.services;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.ostrowski.matchscoringsystem.repositories.QueryRepository;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class LeagueTableServiceImplTest {

    @Mock
    private QueryRepository queryRepository;

    @InjectMocks
    private LeagueTableServiceImpl service;


    @Test
    void shouldProjectLeagueTable() {
//        when(queryRepository.getAllMatches())
//                .thenReturn();
    }

}