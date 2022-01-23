package pl.ostrowski.matchscoringsystem.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import pl.ostrowski.matchscoringsystem.controllers.LeagueTableController;
import pl.ostrowski.matchscoringsystem.controllers.MatchController;
import pl.ostrowski.matchscoringsystem.controllers.TeamController;
import pl.ostrowski.matchscoringsystem.repositories.CommandRepositoryImpl;
import pl.ostrowski.matchscoringsystem.repositories.QueryRepositoryImpl;
import pl.ostrowski.matchscoringsystem.services.LeagueTableServiceImpl;
import pl.ostrowski.matchscoringsystem.services.MatchServiceImpl;
import pl.ostrowski.matchscoringsystem.services.TeamServiceImpl;
import pl.ostrowski.matchscoringsystem.strategies.TotalStatisticsCalculator;

@EnableMongoAuditing
@Configuration
@Import({
        TeamController.class,
        MatchController.class,
        LeagueTableController.class,
        CommandRepositoryImpl.class,
        QueryRepositoryImpl.class,
        TeamServiceImpl.class,
        MatchServiceImpl.class,
        LeagueTableServiceImpl.class,
        TotalStatisticsCalculator.class
})
public class AppConfig {
}
