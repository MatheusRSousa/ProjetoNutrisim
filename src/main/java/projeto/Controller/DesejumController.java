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

import projeto.Domain.Desejum;
import projeto.Service.DesejumService;

@Controller
public class DesejumController {

	@Autowired
	DesejumService service;
	
	@GetMapping("/desejum")//LER TODOS
	public ResponseEntity<List<Desejum>> listaDesejum()
	{	return new ResponseEntity<List<Desejum>>(service.ListarTodos(),HttpStatus.OK);
	}
	
	@GetMapping("/desejum/{id}")//LER POR ID
	public ResponseEntity<Desejum> listaPorId(@PathVariable String id)
	{	return new ResponseEntity<Desejum>(service.getById(id),HttpStatus.OK);
	}
	
	@PostMapping("/desejum") //ADD PESSOA
	public ResponseEntity<Desejum> addDesejum(@RequestBody Desejum desejum)
	{	
		return new ResponseEntity<Desejum>(service.addDesejum(desejum),HttpStatus.OK);
	}
	
	@DeleteMapping("/desejum/{id}")
	public ResponseEntity<String> deletaDesejum(@PathVariable String id)
	{	service.deletaDesejum(id);
		return new ResponseEntity<String>("DELETADO",HttpStatus.OK);
	}
}
