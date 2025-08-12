package service;

public class ClienteComum extends Cliente{

	public ClienteComum(String email, String nome) {
		super(email, nome);
		
	}

	@Override
	public double aplicarDesconto(double total) {
		return total * 0.95;
	}
	
}
