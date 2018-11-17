package projeto.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import projeto.Domain.Pessoa;

@Repository
public interface PessoaRepository extends MongoRepository<Pessoa, String>{
	
	public long findByTelefone(long telefone);
	public String findByEmail(String email);

}
