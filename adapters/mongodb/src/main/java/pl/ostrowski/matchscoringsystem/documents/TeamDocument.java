package pl.ostrowski.matchscoringsystem.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document
public record TeamDocument(
        @Id
        UUID id,
        String name,
        String city,
        String stadium
) {
}
