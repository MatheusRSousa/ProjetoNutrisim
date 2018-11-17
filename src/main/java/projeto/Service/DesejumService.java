package projeto.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projeto.Domain.Desejum;
import projeto.Repository.DesejumRepository;

@Service
public class DesejumService {
	
	@Autowired
	DesejumRepository repository;

	public Desejum addDesejum(Desejum desejum) {
		repository.save(desejum);
		return desejum;
	}

	public void deletaDesejum(String id) {
		repository.deleteById(id);;
	}

	public List<Desejum> ListarTodos() {
		return repository.findAll();
	}

	public Desejum getById(String id) {
		return repository.findById(id).get();
	}
}
