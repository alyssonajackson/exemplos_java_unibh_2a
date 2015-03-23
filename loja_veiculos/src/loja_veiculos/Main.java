package loja_veiculos;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("José da Silva", "1234");
		Carro c1 = new Carro();
		
		c1.setModelo("Corolla");
		c1.setMarca("Toyota");
		c1.setKm_por_litro(9D);
		c1.setCliente(p1);
		
		c1.imprimirFichaDoVeiculo();

		System.out.println("-----");
		
		Pessoa p2 = new Pessoa("Maria Bonita", "1234");
		Carro c2 = new Carro();
		
		c2.setModelo("Ka");
		c2.setMarca("Ford");
		c2.setKm_por_litro(16D);
		c2.setCliente(p2);
		
		c2.imprimirFichaDoVeiculo();
		
	}

}
