package metodos;

import java.util.Scanner;

import modelos.ResultadosAprovados;

public class Logicas {

	public String[] recebendoNomes(int nAlunos, Scanner sc) {
		String[] nomes = new String[nAlunos];
		for (int i = 0; i < nAlunos; i++) {
			System.out.println("Infome o nome do " + (i + 1) + "º aluno:");
			String nome = sc.next();
			nomes[i] = nome;
		}
		return nomes;
	}

	public double[] recebendoNotas(int nAlunos, Scanner sc) {
		double[] vetorNotas = new double[nAlunos];
		for (int i = 0; i < nAlunos; i++) {
			System.out.println("Infome a nota do " + (i + 1) + "º aluno:");
			double n = sc.nextDouble();

			vetorNotas[i] = n;

		}
		return vetorNotas;
	}

	public ResultadosAprovados mediaAprovados(double[] nota1, double[] nota2 ) {
		int nAprovados = 0;
		
		for (int i = 0; i < nota2.length; i++) {
			if((nota1[i] + nota2[i])/2  >= 6){
				nAprovados++;
			}
		}
		int index = 0;
		
		double[] mediasAprovados = new double[nAprovados];
		int[] posicao = new int[nAprovados];
		for (int i = 0; i < nAprovados; i++) {
			double media = (nota1[i] + nota2[i])/2;
			if(media >= 6){
				mediasAprovados[index] = media;
				posicao[index] = i;
				index++;
			}
		}
		return new ResultadosAprovados(mediasAprovados, posicao);
	}
}
