package projeto.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import projeto.Domain.Jantar;

@Repository
public interface JantarRepository extends MongoRepository<Jantar, String>{

}
