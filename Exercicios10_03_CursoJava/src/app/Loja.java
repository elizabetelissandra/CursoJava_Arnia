package app;

import service.Internacional;
import service.Nacional;

public class Loja {

	public static void main(String[] args) {
		Internacional internacional = new Internacional("Notebook estrangeiro", 5000.00);
		Nacional nacional = new Nacional("Chapinha Britania", 300.00);
		
		System.out.println("---------Internacional----------------\n\n");
		internacional.exibirNome();
		System.out.println("o valor final do produto ficou "+internacional.valorTotal());
		
		System.out.println("\n\n-------------Nacional---------------------\n\n");
		nacional.exibirNome();
		System.out.println("o valor final do produto ficou "+nacional.valorTotal());

	}

}
