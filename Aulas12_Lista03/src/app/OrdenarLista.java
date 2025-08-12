package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import service.OrdenadorNomes;
import service.Pessoas;

public class OrdenarLista {

	public static void main(String[] args) {
		List<Pessoas> lista = new ArrayList<Pessoas>();
		
		Pessoas pessoa1 = new Pessoas("Ana Beatriz", 29);
		Pessoas pessoa2 = new Pessoas("João Pedro Moura", 34);
		Pessoas pessoa3 = new Pessoas("Camila Ferreira", 22);
		Pessoas pessoa4 = new Pessoas("Rodrigo Vasconcelos", 40);
		Pessoas pessoa5 = new Pessoas("Leticia Andrade", 31);
		
		lista.add(pessoa1);
		lista.add(pessoa2);
		lista.add(pessoa3);
		lista.add(pessoa4);
		lista.add(pessoa5);
		
		System.out.println("----------Ordenacao por idade--------");
		Collections.sort(lista);
		
		for (Pessoas pessoas : lista) {
			System.out.println(pessoas);
		}
		System.out.println("----------Ordenacao por nome--------");
		Collections.sort(lista, new OrdenadorNomes());
		
		for (Pessoas pessoas : lista) {
			System.out.println(pessoas);
		}
	}

}
