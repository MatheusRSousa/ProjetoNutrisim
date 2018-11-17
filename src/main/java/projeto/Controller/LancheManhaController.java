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

import projeto.Domain.LancheManha;
import projeto.Service.LancheManhaService;

@Controller
public class LancheManhaController {
	
	@Autowired
	LancheManhaService service;
	
	@GetMapping("/lanchemanha")//LER TODOS
	public ResponseEntity<List<LancheManha>> listaLancheManha()
	{	return new ResponseEntity<List<LancheManha>>(service.ListarTodos(),HttpStatus.OK);
	}
	
	@GetMapping("/lanchemanha/{id}")//LER POR ID
	public ResponseEntity<LancheManha> listaPorId(@PathVariable String id)
	{	return new ResponseEntity<LancheManha>(service.getById(id),HttpStatus.OK);
	}
	
	@PostMapping("/lanchemanha") //ADD 
	public ResponseEntity<LancheManha> addLancheManha(@RequestBody LancheManha lanchemanha)
	{	
		return new ResponseEntity<LancheManha>(service.addLancheManha(lanchemanha),HttpStatus.OK);
	}
	
	
	@DeleteMapping("/lanchemanha/{id}")
	public ResponseEntity<String> deletaLancheManha(@PathVariable String id)
	{	service.deletaLancheManha(id);
		return new ResponseEntity<String>("DELETADO",HttpStatus.OK);
	}

}
