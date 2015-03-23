package banco;

public class Main {

	public static void main(String args[]) {
		Pessoa titular1 = new Pessoa("Maria", "123456-01", "31 3232-3232");
		ContaCorrente conta1 = new ContaCorrente(titular1);
		
		System.out.println("Saldo inicial da conta corrente da Maria: " + conta1.pegaSaldo());
		
		conta1.depositar(100D);
		System.out.println("Saldo da conta corrente da Maria, após DEPOSITAR 100 reais: " + conta1.pegaSaldo());
		
		conta1.retirar(50D);
		System.out.println("Saldo da conta corrente da Maria, após RETIRAR 50 reais: " + conta1.pegaSaldo());

		System.out.println("----");
		
		Pessoa titular2 = new Pessoa("José", "555333-01", "11 8484-1234");
		ContaPoupanca poup1 = new ContaPoupanca(titular2, 1000D);
		
		System.out.println("Saldo inicial da conta poupança do José: " + poup1.pegaSaldo());

		poup1.depositar(90D);
		System.out.println("Saldo da conta poupança do José, após DEPOSITAR 90 reais: " + poup1.pegaSaldo());
		
		poup1.retirar(430D);
		System.out.println("Saldo da conta poupança do José, após DEPOSITAR 430 reais: " + poup1.pegaSaldo());
		
	}
	
}
