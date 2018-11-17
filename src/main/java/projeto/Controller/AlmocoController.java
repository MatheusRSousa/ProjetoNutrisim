package projeto.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import projeto.Domain.Almoco;

import projeto.Service.AlmocoService;

@Controller
public class AlmocoController {

	@Autowired
	AlmocoService service;
	
	@GetMapping("/almoco")//LER TODOS
	public ResponseEntity<List<Almoco>> listaAlmoco()
	{	return new ResponseEntity<List<Almoco>>(service.ListarTodos(),HttpStatus.OK);
	}
	
	@GetMapping("/almoco/{id}")//LER POR ID
	public ResponseEntity<Almoco> listaPorId(@PathVariable String id)
	{	return new ResponseEntity<Almoco>(service.getById(id),HttpStatus.OK);
	}
	
	@PostMapping("/almoco") //ADD
	public ResponseEntity<Almoco> addAlmoco(@RequestBody Almoco almoco){
		return new ResponseEntity<Almoco>(service.addAlmoco(almoco),HttpStatus.OK);
	}
	
	/////@PutMapping("/pessoa") //ATUALIZA PESSOA
	//public ResponseEntity<Pessoa> atualizaPessoa(@RequestBody Almoco almoco)
	//{	service.(almoco);
		//return new ResponseEntity<Pessoa>(service.atualizarPessoa(pessoa),HttpStatus.OK);
	//}
	
	@DeleteMapping("/almoco/{id}")
	public ResponseEntity<String> deletaAlmoco(@PathVariable String id)
	{	service.deletaAlmoco(id);
		return new ResponseEntity<String>("DELETADO",HttpStatus.OK);
	}

}
