package principal;

import java.util.Scanner;

import metodos.CalculoVetor;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de vetores do seu vetor");
		int qtdN = sc.nextInt();
		
		int[] vetorA = CalculoVetor.recebendoVetores(sc, qtdN);
		int[] vetorB = CalculoVetor.recebendoVetores(sc, qtdN);
		int[] vetorC = CalculoVetor.somaVetores(vetorA, vetorB);
		
		System.out.println("Aqui está o vetor c:");
		CalculoVetor.mostrarValores(vetorC);
	}

}
