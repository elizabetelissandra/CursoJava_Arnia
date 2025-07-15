package metodos;

import java.util.Scanner;

public class CalculoMaiorVetor {

	public int[] lerNumeros(Scanner sc, int qtdN) {
		int[] numeros = new int[qtdN];
		for (int i = 0; i < qtdN; i++) {

			System.out.println("Informe o " + (i + 1) + "º número:");
			int n = sc.nextInt();

			numeros[i] = n;
		}
		return numeros;
	}
	
	public int procurarPosicaoMaior(int[] numeros) {
		int posicaoMaior = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] > numeros[posicaoMaior]) {
				posicaoMaior = i;
			}
			
		}
		return posicaoMaior;
	}

}

