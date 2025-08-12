package service;

import java.util.Comparator;

public class OrdenadorQuantidade implements Comparator<Produto> {

	@Override
	public int compare(Produto o1, Produto o2) {
		return o2.getQuantidadeVendida() - o1.getQuantidadeVendida();
	}

}
