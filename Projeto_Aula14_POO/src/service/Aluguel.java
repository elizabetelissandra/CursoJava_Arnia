package service;

import java.util.List;

public class Aluguel {

	private List<ItemAluguel> listaAluguel;
	private double total;
	private Cliente Cliente;

	public Aluguel(List<ItemAluguel> listaAluguel, double total, service.Cliente cliente) {
		super();
		this.listaAluguel = listaAluguel;
		this.total = total;
		Cliente = cliente;
	}

	public List<ItemAluguel> getListaAluguel() {
		return listaAluguel;
	}

	public void setListaAluguel(List<ItemAluguel> listaAluguel) {
		this.listaAluguel = listaAluguel;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}

	public double calcularTotal() {
		total = 0;
		for (ItemAluguel itemAluguel : listaAluguel) {
			total += itemAluguel.calcularSubTotal();
		}
		return total;
	}
	
	public double calcularTotalComDesconto() {
		double valorBruto = 0;
		for (ItemAluguel itemAluguel : listaAluguel) {
			total += itemAluguel.calcularSubTotal();
		}
		this.total = getCliente().aplicarDesconto(valorBruto);
		return total;
	}
	
}
