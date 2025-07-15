package principal;

import java.util.Scanner;

import metodos.Logicas;
import modelos.ResultadosAprovados;

public class MediaAlunos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Logicas logica = new Logicas();
		
		System.out.println("Informe a quantidade de alunos:");
		int nAlunos = sc.nextInt();
		
		String[] nomesAlunos = logica.recebendoNomes(nAlunos, sc);
	
		System.out.println("Agora vamos receber as notas do 1º Semestre.");
		double[] notas1  = logica.recebendoNotas(nAlunos, sc);
		
		System.out.println("Agora vamos receber as notas do 2º Semestre.");
		double[] notas2  = logica.recebendoNotas(nAlunos, sc);
		
		ResultadosAprovados resultado = logica.mediaAprovados(notas1, notas2);
		
		if(resultado.posicoes.length == 0) {
			System.out.println("Nenhum aluno passou.");
		}else {
		for (int i = 0; i < resultado.posicoes.length; i++) {
		    System.out.println("Aluno " + nomesAlunos[resultado.posicoes[i]] +
		                       " teve média: " + resultado.medias[i]);
		}
		}
		
		
		

		
	}

}
