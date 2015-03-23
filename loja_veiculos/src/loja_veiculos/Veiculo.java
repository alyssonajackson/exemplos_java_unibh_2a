package loja_veiculos;

public abstract class Veiculo {

	private String modelo;
	private String marca;
	private Pessoa cliente;
	private Double preco;
	private Double km_por_litro;
	private String tipo_combustivel;
	private int rodas;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Pessoa getCliente() {
		return cliente;
	}
	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Double getKm_por_litro() {
		return km_por_litro;
	}
	public void setKm_por_litro(Double km_por_litro) {
		this.km_por_litro = km_por_litro;
	}
	public String getTipo_combustivel() {
		return tipo_combustivel;
	}
	public void setTipo_combustivel(String tipo_combustivel) {
		this.tipo_combustivel = tipo_combustivel;
	}
	
	public void verifica_economia(){
	}
	
	public void imprimirFichaDoVeiculo(){
		System.out.println("Cliente: " + cliente.getNome() + "(CPF: " + cliente.getCpf() + ")");
		System.out.println("Marca: " + this.getMarca());
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Km por litro: " + this.getKm_por_litro());
		this.verifica_economia();
	}
	
}
