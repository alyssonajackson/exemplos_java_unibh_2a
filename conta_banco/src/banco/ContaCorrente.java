package banco;

public class ContaCorrente extends Conta {

	public ContaCorrente(Pessoa titular, Double saldo) {
		super(titular, saldo);
	}

	public ContaCorrente(Pessoa titular) {
		super(titular, 0D);
	}
	
	public void atualiza_saldo_com_base_selic(double txAno){
		//conta corrente, atualiza com o dobro da taxa selic, portanto, multiplica-se txAno por 2
		super.atualiza_saldo_com_base_selic(txAno * 2);
		
		//após atualizar a partir do método original:
		this.setSaldo(this.pegaSaldo() - 15); //subtrai 15 reais de taxa bancária
	}
	
}
