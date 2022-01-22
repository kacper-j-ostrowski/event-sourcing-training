package pl.ostrowski.matchscoringsystem.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Example;
import pl.ostrowski.matchscoringsystem.model.Result;

import java.time.Instant;
import java.util.UUID;

public record MatchDocument(
        @Id
        UUID id,
        Instant matchDate,
        String stadium,
        Integer numberOfSpectators,
        TeamDocument hostTeam,
        TeamDocument guestTeam,
        Result result,
        int round,
        String season) {

        public static Example<MatchDocument> getExampleOf(int round, String season) {
                return Example.of(
                        new MatchDocument(null,
                                null,
                                null,
                                null,
                                null,
                                null,
                                null,
                                round,
                                season)
                );
        }
}
