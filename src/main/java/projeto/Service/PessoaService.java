package projeto.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import projeto.Domain.Pessoa;

import projeto.Exception.Excessoes;

import projeto.Repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	PessoaRepository repository;

	public Pessoa CadastrarPessoa(Pessoa pessoa) {
		try {
		validacaoDeNome(pessoa);
		validacaoTelefone(pessoa);
		validacaoSenha(pessoa);
		validacaoIdade(pessoa);
		validacaoAltura(pessoa);
		validacaoPeso(pessoa);
		validacaoEmail(pessoa);
		repository.save(pessoa);
		
		}catch (Excessoes e) {
			System.out.println(e.getMessage());
		}
		return pessoa;
	}
	
	private void validacaoEmail(Pessoa pessoa) throws Excessoes
	{	if (repository.existsByEmail(pessoa.getEmail()) == true) 
		{	throw new Excessoes("O e-mail já existe! ");
		}
	}
	
	private void validacaoPeso(Pessoa pessoa) throws Excessoes 
	{ 	if (pessoa.getPeso() < 7 || pessoa.getPeso() > 300) {
			throw new Excessoes("Peso incorreto. Digite o peso certo");
		}	
	}

	private void validacaoAltura(Pessoa pessoa) throws Excessoes {
		if (pessoa.getAltura() < 0.62 || pessoa.getAltura() > 2.5) {
			throw new Excessoes("Altura deve ser entre 0.62m e 2.5m");
		}
	}

	private void validacaoIdade(Pessoa pessoa) throws Excessoes {
		if (pessoa.getIdade() < 1 || pessoa.getIdade() > 100) {
			throw new Excessoes("Idade invalida. Verifique se a idade é entre [1 a 100]");

		}
	}

	private void validacaoSenha(Pessoa pessoa) throws Excessoes {
		String senha = String.valueOf(pessoa.getSenha());
		if (senha.length() < 8) {
			throw new Excessoes("Senha incorreta, verifique se sua senha tem 8 digitos ou mais.");
		}
	}

	private void validacaoTelefone(Pessoa pessoa) throws Excessoes {
		String telefone = String.valueOf(pessoa.getTelefone());
		if (telefone.length() != 11) {
			throw new Excessoes("Telefone inválido. Numero deve ter um DDD.");
		}
		if (repository.existsByTelefone(telefone) == true) 
		{
			throw new Excessoes("O numero do telefone já existe.");
		}

	}

	private void validacaoDeNome(Pessoa pessoa) throws Excessoes {
		String primeironome[] = pessoa.getNome().split(" ");

		if (pessoa.getNome().length() < 5 && primeironome[0].length() < 2 && primeironome[1].length() < 2) {
			throw new Excessoes("Nome inválido, verifique o nome:");
		}
	}

	public Pessoa atualizarPessoa(Pessoa pessoa) {
		if (repository.existsById(pessoa.getId())) {
			repository.save(pessoa);
		}
		return pessoa;
	}

	public void deletaPessoa(String id) {
		if (repository.existsById(id)) {
			repository.deleteById(id);
		}
	}

	public List<Pessoa> ListarTodos() {
		return repository.findAll();
	}

	public Pessoa getById(String id) {
		return repository.findById(id).get();
	}

}
