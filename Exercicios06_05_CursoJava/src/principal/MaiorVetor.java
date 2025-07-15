package principal;

import java.util.Scanner;

import metodos.CalculoMaiorVetor;

public class MaiorVetor {

	public static void main(String[] args) {
		CalculoMaiorVetor calculo = new CalculoMaiorVetor();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a quantidade de numeros que serao adicionados:");
		int qtdN = sc.nextInt();

		int[] numeros = calculo.lerNumeros(sc, qtdN);
		
		int posicaoMaior = calculo.procurarPosicaoMaior(numeros);
		
		System.out.println("O maior número encontrado é: "+numeros[posicaoMaior]);
		System.out.println("E a sua posição no vetor é: "+posicaoMaior);
		
		
		

	}

}
