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

import projeto.Domain.Jantar;
import projeto.Service.JantarService;

@Controller
public class JantarController {
	
	
	@Autowired
	JantarService service;
	
	@GetMapping("/jantar")//LER TODOS
	public ResponseEntity<List<Jantar>> listaJantar()
	{	return new ResponseEntity<List<Jantar>>(service.ListarTodos(),HttpStatus.OK);
	}
	
	@GetMapping("/jantar/{id}")//LER POR ID
	public ResponseEntity<Jantar> listaPorId(@PathVariable String id)
	{	return new ResponseEntity<Jantar>(service.getById(id),HttpStatus.OK);
	}
	
	@PostMapping("/jantar") //ADD PESSOA
	public ResponseEntity<Jantar> addJantar(@RequestBody Jantar jantar)
	{	
		return new ResponseEntity<Jantar>(service.addJantar(jantar),HttpStatus.OK);
	}
	

	@DeleteMapping("/jantar/{id}")
	public ResponseEntity<String> deletaJantar(@PathVariable String id)
	{	service.deletaJantar(id);
		return new ResponseEntity<String>("DELETADO",HttpStatus.OK);
	}

}
