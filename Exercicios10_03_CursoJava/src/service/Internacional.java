package service;

public class Internacional extends Produto {

	public Internacional(String nome, double preco) {
		super(nome, preco);
	}

	public double valorTotal() {
		return preco + (preco * 0.050);
	}

	

}
