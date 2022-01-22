package pl.ostrowski.matchscoringsystem.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import pl.ostrowski.matchscoringsystem.documents.TeamDocument;

import java.util.UUID;

public interface SpringTeamRepository extends MongoRepository<TeamDocument, UUID> {
}
