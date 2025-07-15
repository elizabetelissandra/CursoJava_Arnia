package meuProjeto;

import java.util.Scanner;

public class EstruturaDeDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite o primeiro numero inteiro:");
		Scanner sc = new Scanner(System.in);
		int primeiroNumero = sc.nextInt();
		System.out.println("Digite o segundo número inteiro:");
		int segundoNumero = sc.nextInt();
		
		if(primeiroNumero == segundoNumero) {
			System.out.println("Os números são iguais.");
			
		}else if(primeiroNumero > segundoNumero) {
			System.out.println("Primeiro número maior que o segundo número.");
		}else {
			System.out.println("O primeiro número é menor que o segundo.");
		}
		
	}

}
