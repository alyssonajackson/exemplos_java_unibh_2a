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

		Pessoa p2 = new Pessoa("Maria Bonita", "5678");
		Carro c2 = new Carro();

		c2.setModelo("Ka");
		c2.setMarca("Ford");
		c2.setKm_por_litro(16D);
		c2.setCliente(p2);

		c2.imprimirFichaDoVeiculo();

		System.out.println("-----");

		Pessoa p3 = new Pessoa("Carlo", "9876");
		Moto c3 = new Moto();

		c3.setModelo("Fan");
		c3.setMarca("Honda");
		c3.setKm_por_litro(22D);
		c3.setCliente(p3);

		c3.imprimirFichaDoVeiculo();

		System.out.println("-----");

		Pessoa p4 = new Pessoa("Bernadete", "6785");
		Moto c4 = new Moto();

		c4.setModelo("Biz");
		c4.setMarca("Honda");
		c4.setKm_por_litro(50D);
		c4.setCliente(p4);

		c4.imprimirFichaDoVeiculo();

	}

}
