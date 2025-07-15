package exercicios_aulas;

import java.util.Scanner;

public class EstruturaDeRepeticaoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String senha; 
		String senhaCorreta = "arnia123";
		
		do {
			System.out.println("Digite sua senha");
			Scanner sc = new Scanner(System.in);
			senha = sc.nextLine();
		} while (!senha.equals(senhaCorreta));
		System.out.println("Autenticacao realizada com sucesso!");
	}

}
