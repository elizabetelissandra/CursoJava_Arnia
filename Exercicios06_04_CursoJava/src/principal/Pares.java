package principal;

import java.util.Scanner;

import metodos.CalculoPares;

public class Pares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de números inteiros que serão lidos:");
		int qtdN = sc.nextInt();
		int[] numeros = new int[qtdN];
		
		
		for (int i = 0; i < qtdN; i++) {
			System.out.println("Digite o número "+(i+1));
			int n = sc.nextInt();
			
			numeros[i] = n;
		}
		
		int qtd = CalculoPares.calcularPares(numeros);
		System.out.println("A quantidade de números pares é: "+qtd);
		System.out.println("Os números pares encontrados:");
		CalculoPares.nPares(numeros);
	}

}
