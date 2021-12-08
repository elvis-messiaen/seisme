package fr.api.repositories;

import fr.api.entities.Seisme;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SeismeRepository extends MongoRepository<Seisme,String> {

}
