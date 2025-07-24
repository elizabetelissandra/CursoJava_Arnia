package service;

public class Conta {

	private String titular;
	private int conta;
	private double saldo;
	
	public Conta(int conta, String titular, double depositoInicial) {
		this.conta = conta;
		this.saldo = depositoInicial;
		this.titular = titular;
	}
	
	public Conta(int conta, String titular) {
        this.conta = conta;
        this.titular = titular;
        this.saldo = 0.0;
    }

	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double depositoInicial) {
		this.saldo = depositoInicial;
	}
	
	public void depositar(double valor) {
		if(valor > 0 ) {
			saldo += valor;
		}
	}
	
	public void sacar(double valor) {
		double taxa = 5.0;
		saldo -= (valor + taxa);
	}
	
	public String toString() {
		return String.format("Conta %d, Titular: %s, Saldo: R$%.2f,", new Object[] { Integer.valueOf(conta), titular,Double.valueOf( saldo) });
	}
}
