package pl.ostrowski.matchscoringsystem.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import pl.ostrowski.matchscoringsystem.documents.MatchDocument;

import java.util.UUID;

public interface SpringMatchRepository extends MongoRepository<MatchDocument, UUID> {
}
