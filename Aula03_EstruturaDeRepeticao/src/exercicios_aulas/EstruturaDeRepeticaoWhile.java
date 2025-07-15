package exercicios_aulas;

import java.util.Scanner;

public class EstruturaDeRepeticaoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		boolean sair = false;
		while (!sair) {
			System.out.println("Digite alguma coisa ou digite sair para encerrar!");
			String textoDigitado = sc.nextLine();
			if(textoDigitado.equals("sair")) {
				System.out.println("O programa será finalizado agora.");
				sair = true;
			}
		}
		
	}

}
