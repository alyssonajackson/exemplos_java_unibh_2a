package loja_veiculos;

public class Moto extends Veiculo{

	private int cilidradas;

	public int getCilidradas() {
		return cilidradas;
	}

	public void setCilidradas(int cilidradas) {
		this.cilidradas = cilidradas;
	}
	
	public void verifica_economia(){
		if(this.getKm_por_litro() > 25){
			System.out.println("Moto econômica");
		}else{
			System.out.println("Moto não econômica");
		}
	}
	
}
