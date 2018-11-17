package projeto.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projeto.Domain.Almoco;
import projeto.Repository.AlmocoRepository;

@Service
public class AlmocoService {

	@Autowired
	AlmocoRepository repository;

	public Almoco addAlmoco(Almoco almoco) {
		repository.save(almoco);
		return almoco;
	}

	public void deletaAlmoco(String id) {
		repository.deleteById(id);;
	}

	public List<Almoco> ListarTodos() {
		return repository.findAll();
	}

	public Almoco getById(String id) {
		return repository.findById(id).get();
	}

}
