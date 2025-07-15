package padronizacao;

import java.util.Scanner;

import util.Calculo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculo calculo = new Calculo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da soma");
		double valor1 = sc.nextDouble();
		System.out.println("Digite o outro valor");
		double valor2 = sc.nextDouble();
		
		System.out.println("O resultado da Soma é: "+ calculo.somaValores(valor1, valor2));
		
		System.out.println("O resultado da subtracao é: "+ calculo.subtraiValores(valor1, valor2));
		
		System.out.println("O resultado da multiplicacao é: "+ calculo.multiplicaValor(valor1, valor2));
	}

}
