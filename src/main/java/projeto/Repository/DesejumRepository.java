package projeto.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import projeto.Domain.Desejum;

@Repository
public interface DesejumRepository extends MongoRepository<Desejum, String>{

	
}
