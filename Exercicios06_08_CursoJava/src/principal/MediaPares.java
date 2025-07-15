package principal;

import java.util.Scanner;

import metodos.CalculoPares;

public class MediaPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalculoPares calculo = new CalculoPares();

		System.out.println("Informe a quantidade de numeros no vetor:");
		int qtdVetor = sc.nextInt();

		int[] vetor = calculo.recebendoVetores(sc, qtdVetor);

		int[] vetoresPares = calculo.quantidadePares(vetor);

		if (vetoresPares.length == 0) {
			System.out.println("Nenhum número par foi encontrado.");

		} else {
			double media = calculo.mediaVetores(vetoresPares);
			System.out.println("Média dos números pares: " + media);
		}

	}

}
