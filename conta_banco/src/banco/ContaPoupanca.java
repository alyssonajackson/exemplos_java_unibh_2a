package banco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Pessoa titular, Double saldo) {
		super(titular, saldo);
	}

	public ContaPoupanca(Pessoa titular) {
		super(titular, 0D);
	}
	
	public void atualiza_saldo_com_base_selic(double txAno){
		//conta poupança -> atualizar com 75% da taxa selic, portanto: txAno / 0.75
		super.atualiza_saldo_com_base_selic(txAno * .75);
	}
	

}
