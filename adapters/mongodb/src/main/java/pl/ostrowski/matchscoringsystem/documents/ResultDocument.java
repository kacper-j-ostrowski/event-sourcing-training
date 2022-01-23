package pl.ostrowski.matchscoringsystem.documents;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
@Builder
public class ResultDocument {
    private int hostTeamScore;
    private int guestTeamScore;
    private boolean walkOver;
    @DBRef
    private TeamDocument winner;
}
