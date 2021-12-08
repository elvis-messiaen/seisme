package fr.api.repositories;

import fr.api.entities.Localisation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocalisationRepository extends MongoRepository<Localisation,String> {
}
