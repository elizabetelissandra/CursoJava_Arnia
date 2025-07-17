package service;

import java.text.DecimalFormat;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;

	public double valorTotal() {
		return preco * quantidade;

	}

	public double descontos() {
		return valorTotal() * 0.90;
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("#.00");
		if (quantidade <= 10) {
			return "O valor total do produto é R$" + df.format(valorTotal());
		} else {
			return "O valor total do produto com desconto é R$" + df.format(descontos());
		}
	}
}
