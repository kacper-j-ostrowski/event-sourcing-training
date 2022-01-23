package pl.ostrowski.matchscoringsystem.documents;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

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
    @DBRef
    private TeamDocument hostTeam;
    @DBRef
    private TeamDocument guestTeam;
    private ResultDocument result;
    private int round;
    private String season;
}
