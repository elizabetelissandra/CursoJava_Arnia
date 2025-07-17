package app;

import java.util.Scanner;

public class ContePalavras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira uma frase:");
		String frase = sc.nextLine();
		
		String[] palavrasFrase = frase.split(" ");
		
		System.out.println("A frase contém "+palavrasFrase.length+" palavras;");
	}

}
