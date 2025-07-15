package exercicios01;

import java.util.Scanner;

public class ClasseExercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Insira 4 números para realizar a diferença. Insira o primeiro: ");
		Scanner nu1 = new Scanner(System.in);
		int numero1 = nu1.nextInt();
		System.out.println("Insira o segundo número: ");
		int numero2 = nu1.nextInt();
		System.out.println("Insira o terceiro número: ");
		int numero3 = nu1.nextInt();
		System.out.println("Insira o quarto número: ");
		int numero4 = nu1.nextInt();
		
		int diferenca = (numero1 * numero2) - (numero3*numero4);
		System.out.println("O resultado da diferença entre os números é: "+diferenca);
		
	}

}
