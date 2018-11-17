package projeto.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projeto.Domain.LancheManha;
import projeto.Repository.LancheManhaRepository;

@Service
public class LancheManhaService {

	@Autowired
	LancheManhaRepository repository;

	public LancheManha addLancheManha(LancheManha lanchemanha) {
		repository.save(lanchemanha);
		return lanchemanha;
	}

	public void deletaLancheManha(String id) {
		repository.deleteById(id);
	}

	public List<LancheManha> ListarTodos() {
		return repository.findAll();
	}

	public LancheManha getById(String id) {
		return repository.findById(id).get();
	}
}
