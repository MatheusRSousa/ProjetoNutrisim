package projeto.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import projeto.Domain.LancheManha;

@Repository
public interface LancheManhaRepository extends MongoRepository<LancheManha, String>{

}
