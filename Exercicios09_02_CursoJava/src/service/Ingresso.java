package service;

public class Ingresso {

	private double valor;

	public Ingresso(double valor) {
	    this.valor = valor;
	}


	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String toString() {

		return "O valor do ingresso é R$" + String.format("%.2f", new Object[] { Double.valueOf(valor) });
	}
}
