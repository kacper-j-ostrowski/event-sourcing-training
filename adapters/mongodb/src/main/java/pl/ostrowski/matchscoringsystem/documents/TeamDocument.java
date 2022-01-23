package pl.ostrowski.matchscoringsystem.documents;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@Builder
@Document(collection = "teams")
public class TeamDocument {
        @Id
        @Builder.Default
        private UUID id = UUID.randomUUID();
        private String name;
        private String city;
        private String stadium;
}
