package banco;

public class Main {

	public static void main(String args[]) {
		Pessoa titular1 = new Pessoa("Maria", "123456-01", "31 3232-3232");
		ContaCorrente cor1 = new ContaCorrente(titular1);
		
		Pessoa titular2 = new Pessoa("José", "555333-01", "11 8484-1234");
		ContaPoupanca poup1 = new ContaPoupanca(titular2, 1000D);
	}
	
}
