package app;

import java.util.Scanner;

import service.ValidarSenha;

public class Autenticacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua senha:");
		String senha = sc.nextLine();
		
		ValidarSenha validador = new ValidarSenha();
		
		if(validador.senhaValida(senha)) {
			System.out.println("Cadastro realizado com sucesso");
		}else {
			System.out.println("Senha invalida. Tente novamente.");
		}

	}

}
