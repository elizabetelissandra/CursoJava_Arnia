package service;

import java.text.DecimalFormat;

public class Produto {
	public String nome;
	public double prc;
	public int qtd;

	public double valorTotalEstoque() {
		return prc * qtd;
	}

	public void adicionarProdutos(int quantidade) {
		qtd += quantidade;
	}

	public void removerProdutos(int quantidade) {
		qtd -= quantidade;
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		return "Produto: " + nome + "\nPreço: R$ " + df.format(prc) + "\nQuantidade: " + qtd
				+ "\nValor total: R$ " + df.format(valorTotalEstoque());
	}
}