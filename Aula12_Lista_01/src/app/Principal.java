package app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<String> listaArrayList = new ArrayList<String>();
		List<String> listaLinkedList = new LinkedList<String>();

		int tamanho = 100000;
		long inicioForArrayList = System.currentTimeMillis();
		for (int i = 0; i < tamanho; i++) {
			listaArrayList.add(i);
			listaLinkedList.add(i);
		}

		long fimForArrayList = System.currentTimeMillis();
		long inicioForLinkedList = System.currentTimeMillis();
		while (!listaArrayList.isEmpty()) {
			listaArrayList.remove(0);
		}

		long fimForLinkedList = System.currentTimeMillis();

		System.out.println("Tempo de delecao arrayList: " + (fimForArrayList - inicioForArrayList));
	}

}
