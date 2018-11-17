package projeto.Domain;

public class Refeicao {

	private String produto;
	private int quantidade;
	private String medida;
	private int calorias;
	private int carboidratos;
	private int lipidos;
	
	
	
	public Refeicao() {
	}
	
	public Refeicao(String produto, int quantidade, String medida, int calorias, int carboidratos, int lipidos) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.medida = medida;
		this.calorias = calorias;
		this.carboidratos = carboidratos;
		this.lipidos = lipidos;
	}
	
	public String getProduto() {
		return produto;
	}
	
	public void setProduto(String produto) {
		this.produto = produto;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String getMedida() {
		return medida;
	}
	
	public void setMedida(String medida) {
		this.medida = medida;
	}
	
	public int getCalorias() {
		return calorias;
	}
	
	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}
	
	public int getCarboidratos() {
		return carboidratos;
	}
	
	public void setCarboidratos(int carboidratos) {
		this.carboidratos = carboidratos;
	}
	
	public int getLipidos() {
		return lipidos;
	}
	
	public void setLipidos(int lipidos) {
		this.lipidos = lipidos;
	}
}
