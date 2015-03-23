package loja_veiculos;

public class Carro extends Veiculo{
	
	private Boolean possui_ar_condicionado;
	private Boolean possui_4_portas;
	private Boolean portas_abertas;
	
	public Carro(){
		this.setRodas(4);
	}
	
	public Boolean getPossui_ar_condicionado() {
		return possui_ar_condicionado;
	}
	public void setPossui_ar_condicionado(Boolean possui_ar_condicionado) {
		this.possui_ar_condicionado = possui_ar_condicionado;
	}
	public Boolean getPossui_4_portas() {
		return possui_4_portas;
	}
	public void setPossui_4_portas(Boolean possui_4_portas) {
		this.possui_4_portas = possui_4_portas;
	}
	
	public void abrir_portas(){
		if(portas_abertas){
			System.out.println("As portas já estão abertas.");
			//não faz nada
		}else{
			System.out.println("Abrindo portas...");
			//muda o status das portas para true
			this.portas_abertas = true;
			System.out.println("As portas foram abertas.");
		}
	}
	
	public void verifica_economia(){
		if(this.getKm_por_litro() > 10){
			System.out.println("Carro econômico");
		}else{
			System.out.println("Carro não econômico");
		}
	}
	
}
