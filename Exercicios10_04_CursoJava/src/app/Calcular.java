package app;

import java.util.Scanner;

import services.Multiplicar;
import services.Somar;

public class Calcular {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Informe o primeiro número");
		double numero1 = sc.nextDouble();
		
		System.out.println("Informe o segundo número");
		double numero2 = sc.nextDouble();
		
		Somar soma = new Somar(numero1, numero2);
		Multiplicar multiplica = new Multiplicar(numero1, numero2);
		
		System.out.println("O resultado da soma é "+soma.calcular());
		System.out.println("O resultado da multiplicacao é "+multiplica.calcular());

	}

}
