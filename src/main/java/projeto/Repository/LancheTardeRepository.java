package projeto.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import projeto.Domain.LancheTarde;

@Repository
public interface LancheTardeRepository extends MongoRepository<LancheTarde, String>{

}
