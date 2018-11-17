package projeto.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import projeto.Domain.Almoco;

@Repository
public interface AlmocoRepository extends MongoRepository<Almoco, String>{

	
}
