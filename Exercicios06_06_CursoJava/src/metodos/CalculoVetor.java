package metodos;

import java.util.Scanner;

public class CalculoVetor {

	public static int[] recebendoVetores(Scanner sc, int qtdN) {
		int[] vetor = new int[qtdN];

		for (int j = 0; j < qtdN; j++) {
			System.out.println("Informe o " + (j + 1) + "º número do vetor:");
			int n = sc.nextInt();

			vetor[j] = n;
		}
		return vetor;
	}

	public static int[] somaVetores(int[] vetorA, int[] vetorB) {
		int[] vetorC = new int[vetorA.length];
		for (int i = 0; i < vetorC.length; i++) {
			int num = vetorA[i] + vetorB[i];
			vetorC[i] = num;
			
			
		}
		return vetorC;
	}
	
	public static void mostrarValores(int[] vetorC) {
		for (int i = 0; i < vetorC.length; i++) {
			System.out.println("Num "+vetorC[i]);
		}
	}
}
