package metodos;

import java.util.Scanner;

public class CalculoPares {

	public int[] recebendoVetores(Scanner sc, int qtd) {
		int[] vetor = new int[qtd];

		for (int i = 0; i < qtd; i++) {
			System.out.println("Informe o " + (i + 1) + "º número:");
			int n = sc.nextInt();

			vetor[i] = n;
		}

		return vetor;
	}

	public int[] quantidadePares(int[] vetor) {
		int qtdPares = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				qtdPares++;
			}
		}

		int[] vetoresPares = new int[qtdPares];
		int index = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				vetoresPares[index] = vetor[i];
				index++;
			}
		}

		return vetoresPares;
	}

	public double mediaVetores(int[] vetoresPares) {

		if (vetoresPares.length == 0) {
			return 0.0;
		}
		int somaVetores = 0;

		for (int i = 0; i < vetoresPares.length; i++) {
			somaVetores += vetoresPares[i];
		}

		int media = somaVetores / vetoresPares.length;

		return media;
	}

}
