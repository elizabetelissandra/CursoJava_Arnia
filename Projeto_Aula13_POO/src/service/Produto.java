package service;

import java.util.List;
import java.util.Random;

public class Produto {

	private String id;
	private String nomeProduto;
	private List<Produto> listaProduto;
	protected double preco;
	protected int quantidadeVendida;
	
	
	public Produto(String nomeProduto, List<Produto> listaProduto, double preco, int quantidadeVendida) {
		super();
		this.id = Long.toHexString(new Random().nextLong());
		this.nomeProduto = nomeProduto;
		this.listaProduto = listaProduto;
		this.preco = preco;
		this.quantidadeVendida = quantidadeVendida;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getQuantidadeVendida() {
		return quantidadeVendida;
	}

	public void setQuantidadeVendida(int quantidadeVendida) {
		this.quantidadeVendida = quantidadeVendida;
	}

	public List<Produto> getListaProduto() {
		return listaProduto;
	}

	public void setListaProduto(List<Produto> listaProduto) {
		this.listaProduto = listaProduto;
	}
	
	public int vender(int quantidade) {
		return 0;
	}

	@Override
	public String toString() {
		return "Produto: " + nomeProduto + " | Preço: R$" + preco + " | Quantidade Vendida: " + quantidadeVendida;

	}

	
	
	
	
}
