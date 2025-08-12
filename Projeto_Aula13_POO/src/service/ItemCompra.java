package service;

import java.util.List;

public class ItemCompra {

	private String produto;
	private int quantidade;
	
	public ItemCompra(String produto, int quantidade) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getValorTotal(List<Produto> listaProduto) {
		double totalCompra = 0;
			for (Produto p : listaProduto) {
				if (p.getNomeProduto().equals(this.getProduto())) {
					totalCompra += p.getPreco() * this.getQuantidade();
					p.setQuantidadeVendida(p.getQuantidadeVendida() + this.getQuantidade());
				}
			}
		return totalCompra;
	}

	@Override
	public String toString() {
		return produto + " - Quantidade: " + quantidade;


	}
	
}
