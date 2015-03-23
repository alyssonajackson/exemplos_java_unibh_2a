package banco;

public class ContaCorrente extends Conta {

	public ContaCorrente(Pessoa titular, Double saldo) {
		super(titular, saldo);
	}

	public ContaCorrente(Pessoa titular) {
		super(titular, 0D);
	}
	
}
