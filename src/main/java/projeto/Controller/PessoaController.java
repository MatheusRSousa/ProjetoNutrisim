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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import projeto.Domain.Pessoa;
import projeto.Service.PessoaService;

@Controller
public class PessoaController {
	
	@Autowired
	PessoaService service;
	
	@GetMapping("/pessoa")//LER TODOS
	public ResponseEntity<List<Pessoa>> listaPessoas()
	{	return new ResponseEntity<List<Pessoa>>(service.ListarTodos(),HttpStatus.OK);
	}
	
	@GetMapping("/pessoa/{id}")//LER POR ID
	public ResponseEntity<Pessoa> listaPorId(@PathVariable String id)
	{	return new ResponseEntity<Pessoa>(service.getById(id),HttpStatus.OK);
	}
	
	@PostMapping("/pessoa") //ADD PESSOA
	public ResponseEntity<Pessoa> addPessoa(@RequestBody Pessoa pessoa)
	{	service.CadastrarPessoa(pessoa);
		return new ResponseEntity<Pessoa>(service.CadastrarPessoa(pessoa),HttpStatus.OK);
	}
	
	@PutMapping("/pessoa") //ATUALIZA PESSOA
	public ResponseEntity<Pessoa> atualizaPessoa(@RequestBody Pessoa pessoa)
	{	service.atualizarPessoa(pessoa);
		return new ResponseEntity<Pessoa>(service.atualizarPessoa(pessoa),HttpStatus.OK);
	}
	
	@DeleteMapping("/pessoa/{id}")
	public ResponseEntity<String> deletaPessoa(@PathVariable String id)
	{	service.deletaPessoa(id);
		return new ResponseEntity<String>("DELETADO",HttpStatus.OK);
	}
}
