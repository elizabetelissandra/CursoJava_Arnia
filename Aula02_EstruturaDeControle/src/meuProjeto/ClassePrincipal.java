package meuProjeto;

import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite seu primeiro nome");
		Scanner ler = new Scanner(System.in);
		String nome = ler.next();
		System.out.println("Digite sua idade:");
		int idade = ler.nextInt();
		
		if(idade >= 18) {
			System.out.println(nome+" é maior de idade.");
		}else {
			System.out.println(nome+" é menor de idade.");
		}
		

	}

}
