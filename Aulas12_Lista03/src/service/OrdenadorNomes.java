package service;

import java.util.Comparator;

public class OrdenadorNomes implements Comparator<Pessoas>{

	@Override
	public int compare(Pessoas o1, Pessoas o2) {
		return o1.getNome().compareToIgnoreCase(o2.getNome());
	}

}

