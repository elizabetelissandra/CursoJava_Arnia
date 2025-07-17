package app;

import java.util.Scanner;

public class ModificarNomes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um nome completo:");
		String nomeCompleto = sc.nextLine();
		
		System.out.println("Infome uma parte que vai ser substituida");
		String parteSubstituir = sc.nextLine();
		
		System.out.println("E uma nova parte para ocupar da que foi retirada");
		String novaParte = sc.nextLine();
		
		String nomeModificado = nomeCompleto.replace(parteSubstituir, novaParte);
		
		System.out.println("Nome Modificado: "+ nomeModificado);

	}

}
