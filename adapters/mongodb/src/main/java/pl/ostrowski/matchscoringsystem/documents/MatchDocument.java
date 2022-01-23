package pl.ostrowski.matchscoringsystem.documents;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.core.mapping.Document;
import pl.ostrowski.matchscoringsystem.model.Result;

import java.time.Instant;
import java.util.UUID;

@Data
@Builder
@Document(collection = "matches")
public class MatchDocument {
    @Id
    @Builder.Default
    private UUID id = UUID.randomUUID();
    private Instant matchDate;
    private String stadium;
    private Integer numberOfSpectators;
    private TeamDocument hostTeam;
    private TeamDocument guestTeam;
    private Result result;
    private int round;
    private String season;

    public static Example<MatchDocument> getExampleOf(int round, String season) {
        return Example.of(
                MatchDocument.builder()
                        .round(round)
                        .season(season)
                        .build()
        );
    }
}
