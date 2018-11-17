package projeto.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projeto.Domain.Jantar;
import projeto.Repository.JantarRepository;

@Service
public class JantarService {

	@Autowired
	JantarRepository repository;

	public Jantar addJantar(Jantar jantar) {
		repository.save(jantar);
		return jantar;
	}

	public void deletaJantar(String id) {
		repository.deleteById(id);
	}

	public List<Jantar> ListarTodos() {
		return repository.findAll();
	}

	public Jantar getById(String id) {
		return repository.findById(id).get();
	}
}
