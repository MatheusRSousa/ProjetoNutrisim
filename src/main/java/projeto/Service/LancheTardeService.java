package projeto.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projeto.Domain.LancheTarde;
import projeto.Repository.LancheTardeRepository;

@Service
public class LancheTardeService {

	@Autowired
	LancheTardeRepository repository;

	public LancheTarde addLancheTarde(LancheTarde lanchetarde) {
		repository.save(lanchetarde);
		return lanchetarde;
	}

	public void deletaLancheTarde(String id) {
		repository.deleteById(id);;
	}

	public List<LancheTarde> ListarTodos() {
		return repository.findAll();
	}

	public LancheTarde getById(String id) {
		return repository.findById(id).get();
	}
}
