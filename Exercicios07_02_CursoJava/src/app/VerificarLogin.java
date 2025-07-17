package app;

import java.util.Scanner;

public class VerificarLogin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String user = "admin";
		String pass = "1234";
		String usuario;
		String senha;

		while (true) {
			System.out.println("Digite seu usuário:");
			usuario = sc.nextLine().toLowerCase();

			System.out.println("Agora digite sua senha:");
			senha = sc.nextLine().toLowerCase();

			if (usuario.equals(user) && senha.equals(pass)) {
				System.out.println("Acesso permitido!");
				break;
			} else {
				System.out.println("Nome de usuário ou senha incorretos.");
			}
		}
	}

}
