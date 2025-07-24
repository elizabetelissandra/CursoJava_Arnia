package service;

public class IngressoVip extends Ingresso {

	private double valorAdicional;
	
	public IngressoVip(double valor, double valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
	}
	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	public double precoVIP() {
		return getValor() + valorAdicional;
	}

	public String toString() {
		return "O valor do ingresso VIP é R$" + String.format("%.2f", new Object[] { Double.valueOf(precoVIP())});
	}
}
