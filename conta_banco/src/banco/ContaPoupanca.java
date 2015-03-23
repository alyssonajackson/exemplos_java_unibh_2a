package banco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Pessoa titular, Double saldo) {
		super(titular, saldo);
	}

	public ContaPoupanca(Pessoa titular) {
		super(titular, 0D);
	}
	

}
