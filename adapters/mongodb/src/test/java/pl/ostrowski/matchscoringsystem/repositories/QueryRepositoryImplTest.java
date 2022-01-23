package pl.ostrowski.matchscoringsystem.repositories;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import pl.ostrowski.matchscoringsystem.mapper.EntityMapper;
import pl.ostrowski.matchscoringsystem.documents.TeamDocument;

import static org.assertj.core.api.Assertions.assertThat;

@DataMongoTest
@EnableMongoRepositories(basePackageClasses = {QueryRepositoryImpl.class,})
@ComponentScan(basePackageClasses = {QueryRepositoryImpl.class})
class QueryRepositoryImplTest {

    @Autowired
    private SpringTeamRepository springTeamRepository;

    @Autowired
    private SpringMatchRepository springMatchRepository;

    @Autowired
    private QueryRepositoryImpl queryRepository;

    @Configuration
    @Import({
            SpringTeamRepository.class,
            SpringMatchRepository.class,
            EntityMapper.class

    })
    public static class Config {
    }

    //@BeforeEach
    void setup() {
        springMatchRepository.deleteAll();
        springTeamRepository.deleteAll();
    }

    //@Test
    void test() {

    }

}
