package loja_veiculos;

public abstract class Veiculo {

	private String modelo;
	private String marca;
	private Pessoa cliente;
	private Double preco;
	private Double km_por_litro;
	private String tipo_combustivel;
	private int rodas;
	private Boolean farol_aceso = false;
	private Boolean ligado = false;
	
	public int getRodas() {
		return rodas;
	}
	public void setRodas(int rodas) {
		this.rodas = rodas;
	}
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
	
	public Boolean verifica_farol(){
		return this.farol_aceso;
	}
	
	public void acende_farol(){
		if(this.farol_aceso){
			System.out.println("O farol já está aceso.");
		}else{
			this.farol_aceso = true;
			System.out.println("O farol estava apagado, agora está aceso.");
		}
	}
	
	public void apaga_farol(){
		if(this.farol_aceso){
			this.farol_aceso = false;
			System.out.println("O farol foi apagado.");
		}else{
			System.out.println("O farol já está apagado.");
		}
	}
	
	public void imprimirFichaDoVeiculo(){
		System.out.println("Cliente: " + cliente.getNome() + " (CPF: " + cliente.getCpf() + ")");
		System.out.println("Marca: " + this.getMarca());
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Km por litro: " + this.getKm_por_litro());
		System.out.println("Rodas: " + this.getRodas());
		this.verifica_economia();
	}
	
	public void ligar(){
		if(this.ligado){
			System.out.println("Já está ligado.");
		}else{
			this.ligado = true;
			System.out.println("Veículo ligado.");
		}
	}
	
}
