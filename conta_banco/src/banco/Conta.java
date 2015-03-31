package banco;

public abstract class Conta {

	private Pessoa titular;
	private Double saldo;
	
	public Conta(Pessoa titular, Double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public Double pegaSaldo(){
		return saldo;
	}
	
	public void retirar(Double valor_a_ser_sacado){
		this.saldo -= valor_a_ser_sacado;
	}

	public void depositar(Double valor_depositado){
		this.saldo += valor_depositado;
	}
	
	public Pessoa getTitular() {
		return titular;
	}

	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}

	protected void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void atualiza_saldo_com_base_selic(double txAno){
		txAno = txAno / 100;
		double txMes = Math.pow((txAno+ 1), 1/12) - 1;
		double novo_saldo = this.saldo * (1 + txMes);
		this.saldo = novo_saldo;
	}
	
}
