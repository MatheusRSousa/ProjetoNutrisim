package projeto.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import projeto.Domain.Pessoa;

@Repository
public interface PessoaRepository extends MongoRepository<Pessoa, String>{
	
	public boolean existsByTelefone(String telefone);
	public boolean existsByEmail(String email);
	
}
