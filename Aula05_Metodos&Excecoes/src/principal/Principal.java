package principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor ");
		String textoDigitado = sc.next();
		int textoConvertidoInteiro;
		try {
			textoConvertidoInteiro = Integer.parseInt(textoDigitado);
			System.out.println("O conteúdo digitado é um número inteiro válido.");
		} catch (ArithmeticException e) {
			System.out.println("O conteúdo "+textoDigitado+" não é um inteiro válido.");
		}

		
		
	}

}
