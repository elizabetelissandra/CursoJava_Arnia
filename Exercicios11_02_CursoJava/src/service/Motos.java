package service;

public class Motos extends Veiculo{

	public Motos(String marca, String modelo, int ano, double valor) {
		super(marca, modelo, ano, valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double valorIPVA() {
		return valor * 0.02;
	}
 
}
