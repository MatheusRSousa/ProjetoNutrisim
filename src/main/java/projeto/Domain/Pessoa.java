package projeto.Domain;

import org.springframework.data.annotation.Id;

public class Pessoa {

	@Id
	private String id;
	private String nome;
	private String telefone;
	private String email;
	private long senha;
	private int idade;
	private double altura;
	private double peso;
	
	public Pessoa() {
	}

	public Pessoa(String id, String nome, String telefone, String email, long senha, int idade, double altura,
			double peso) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getSenha() {
		return senha;
	}

	public void setSenha(long senha) {
		this.senha = senha;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
