package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um número de 1 a 10");
		int qtdNum = sc.nextInt();

		int[] negativosTemp = new int[qtdNum];
		int qtdNegativos = 0;
		int[] numeros = new int[qtdNum];

		for (int i = 0; i < qtdNum; i++) {
			System.out.println("Informe o número " + (i + 1));
			int num = sc.nextInt();

			numeros[i] = num;

			if (num < 0) {
				negativosTemp[qtdNegativos] = num;
                qtdNegativos++;

			}

		}

		System.out.println("Números negativos:");
		for (int j = 0; j < qtdNegativos; j++) {
			System.out.println(negativosTemp[j]);
		}
	}

}
