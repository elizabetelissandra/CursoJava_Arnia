package service;

import java.text.DecimalFormat;
import java.util.List;

import app.SistemaEcommerce;

public class Compra{
	
	
	private Cliente cliente;
	private List<ItemCompra> itens;
	private String data;
	private double valorTotal;

	public Compra(Cliente cliente, List<ItemCompra> itens, String data, double valorTotal) {
		super();
		this.cliente = cliente;
		this.itens = itens;
		this.data = data;
		this.valorTotal = valorTotal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public List<ItemCompra> getItens() {
		return itens;
	}

	public void setItens(List<ItemCompra> itens) {
		this.itens = itens;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}


	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.00");
		return "\n-------------------------------\nCompra :\ncliente = " + cliente + ",\nitens = " + itens + ",\ndata = " + data + ",\nvalorTotal =  R$"
				+ df.format(valorTotal);
	}
	
}
