package app;


import java.util.Scanner;

public class ContarVogais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um nome");
		String nome = sc.nextLine().toLowerCase();
		
		int contadorVogais = 0;
		
		for (int i = 0; i < nome.length(); i++) {
			char c =  nome.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				contadorVogais++;
			}
		}
		
		System.out.println("O nome tem "+contadorVogais+" vogais.");
	}

}
