package principal;

import java.util.Scanner;

import calculo_media.CalculoMedia;

public class CalcularNota {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalculoMedia media = new CalculoMedia();
		
		System.out.println("Infome o nome do aluno");
		String nome = sc.next();
		System.out.println("Informe a primeira nota (ex: de 0 a 10");
		int n1 = sc.nextInt();
		System.out.println("Informe a segunda nota (ex: de 0 a 10");
		int n2 = sc.nextInt();
		
		System.out.println("O aluno "+nome+" com as notas "+n1+" e "+n2+" \n"
				+ "e média final "+media.mediaArit(n1, n2)+" teve o "
						+ "status final: "+media.statusAluno(media.mediaArit(n1, n2)));
		
	}

}
