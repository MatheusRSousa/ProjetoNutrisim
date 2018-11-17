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

import projeto.Domain.LancheTarde;
import projeto.Service.LancheTardeService;


@Controller
public class LancheTardeController {
	
	@Autowired
	LancheTardeService service;
	
	@GetMapping("/lanchetarde")//LER TODOS
	public ResponseEntity<List<LancheTarde>> listaLancheTarde()
	{	return new ResponseEntity<List<LancheTarde>>(service.ListarTodos(),HttpStatus.OK);
	}
	
	@GetMapping("/lanchetarde/{id}")//LER POR ID
	public ResponseEntity<LancheTarde> listaPorId(@PathVariable String id)
	{	return new ResponseEntity<LancheTarde>(service.getById(id),HttpStatus.OK);
	}
	
	@PostMapping("/lanchetarde") //ADD PESSOA
	public ResponseEntity<LancheTarde> addLancheTarde(@RequestBody LancheTarde lanchetarde)
	{	
		return new ResponseEntity<LancheTarde>(service.addLancheTarde(lanchetarde),HttpStatus.OK);
	}
	
	@DeleteMapping("/lanchetarde/{id}")
	public ResponseEntity<String> deletaLancheTarde(@PathVariable String id)
	{	service.deletaLancheTarde(id);;
		return new ResponseEntity<String>("DELETADO",HttpStatus.OK);
	}


}
