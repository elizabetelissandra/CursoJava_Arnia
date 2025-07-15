package exercicios_aulas;

import java.util.Scanner;

public class EstruturaDeRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite um número inteiro, para calcular a tabuada.");
	int numero = sc.nextInt();
	
	for(int i= 1; i < 11; i++) {
		System.out.println("O resultado de "+numero+" x "+i+" é " +(numero*i));
	}
	}

}
