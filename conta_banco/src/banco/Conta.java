package banco;

public abstract class Conta {

	private Pessoa titular;
	private Double saldo;
	
	public Conta(Pessoa titular, Double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public Double pegaSaldo(){
		return this.saldo;
	}
	
	public void retirar(Double valor_a_ser_sacado){
		this.saldo -= valor_a_ser_sacado;
	}

	public void depositar(Double valor_depositado){
		this.saldo += valor_depositado;
	}
	
}
