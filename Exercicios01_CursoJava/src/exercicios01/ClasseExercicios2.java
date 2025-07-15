package exercicios01;

import java.util.Scanner;

public class ClasseExercicios2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Insira o valor do raio de um cubo: ");
		Scanner r1= new Scanner(System.in);
		double raio1 = r1.nextDouble();
		double a = (double) 3.14159*(Math.pow(raio1, 2));
		
		System.out.println("O valor da área do círculo é: "+a);
	}

}
