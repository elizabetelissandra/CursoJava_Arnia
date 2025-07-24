package service;

public class Nacional extends Produto{

	public Nacional(String nome, double preco) {
		super(nome, preco);
	}

	public double valorTotal() {
		return preco - (preco * 0.030);
	}

}
