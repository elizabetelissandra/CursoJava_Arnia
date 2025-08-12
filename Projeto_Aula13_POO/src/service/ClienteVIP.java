package service;

public class ClienteVIP extends Cliente{

	public ClienteVIP(String email, String nome) {
		super(email, nome);
		
	}

	@Override
	public double aplicarDesconto(double total) {
		return total * 0.85;
	}

}
