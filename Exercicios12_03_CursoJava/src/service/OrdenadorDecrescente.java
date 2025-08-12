package service;

import java.util.Comparator;

public class OrdenadorDecrescente implements Comparator<Participante>{

	@Override
	public int compare(Participante o1, Participante o2) {
		if (o1.idade > o2.getIdade()) return -1;
	    if (o1.idade < o2.getIdade()) return 1;
	    return o1.nome.compareToIgnoreCase(o2.getNome());
	}
	
	

}
