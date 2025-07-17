package app;

import java.util.Scanner;

public class ContagemNomes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char letra = 0;

		System.out.println("Informe uma letra:");
		String entrada = sc.nextLine().toLowerCase();

		if (entrada.length() == 1 && Character.isLetter(entrada.charAt(0))) {
			letra = entrada.charAt(0);
			
			System.out.println("Quantos nomes serão adicionados?");
			int qtdNomes = sc.nextInt();
			sc.nextLine();

			System.out.println("Agora informe vários nomes: ");
			String[] nomes = new String[qtdNomes];
			for (int i = 0; i < qtdNomes; i++) {
				System.out.println("Informe o " + (i + 1) + "º nome.");
				String nome = sc.nextLine();
				nomes[i] = nome;
			}

			int contNomes = 0;
			for (int i = 0; i < nomes.length; i++) {
				if (nomes[i].toLowerCase().charAt(0) == letra) {
					contNomes++;
				}
			}

			System.out.println("Existem " + contNomes + " nomes que começam com a letra " + letra);
			return;
		} else {
			System.out.println("Entrada inválida. Digite apenas uma letra do alfabeto.");
		}

		
	}

}
