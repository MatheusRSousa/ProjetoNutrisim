package projeto.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projeto.Domain.Pessoa;
import projeto.Repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	PessoaRepository repository;
	
	public Pessoa CadastrarPessoa(Pessoa pessoa) 
	{	String primeironome[] = pessoa.getNome().split(" ");
		String telefone = String.valueOf(pessoa.getTelefone());
		String senha = String.valueOf(pessoa.getSenha());
		if (pessoa.getNome().length() >= 5 && primeironome[0].length() >= 2 && primeironome[1].length() >= 2) 
		{	if (telefone.length() == 11) 
			//{	if (repository.findByTelefone(pessoa.getTelefone())) 
				//{		if(email == true) 
					{		if (senha.length() >= 8) 
						{		if (pessoa.getIdade() >= 1 && pessoa.getIdade() <= 100) 
							{		if (pessoa.getAltura() >= 0.62 && pessoa.getAltura() <= 2.5) 
								{		if (pessoa.getPeso() >= 7.5 && pessoa.getPeso() <= 300) 
									{	repository.save(pessoa);
									}
								}
							}
						}
					}
				//}
			//}
		}
		return pessoa;
	}
	
	
	public Pessoa atualizarPessoa(Pessoa pessoa) 
	{	if(repository.existsById(pessoa.getId())) 
			{	repository.save(pessoa);
			}
		return pessoa;
	}
	
	public void deletaPessoa(String id) 
	{	if(repository.existsById(id)) 
		{	repository.deleteById(id);
		}
	}
	
	public List<Pessoa> ListarTodos()
	{	return repository.findAll();
	}
	
	public Pessoa getById(String id) 
	{ return repository.findById(id).get();
	}

}
