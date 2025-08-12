package service;

public class Carros extends Veiculo{

	public Carros(String marca, String modelo, int ano, double valor) {
		super(marca, modelo, ano, valor);
		
	}

	@Override
	public double valorIPVA() {
		return valor * 0.04;
	}

}
