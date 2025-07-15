package service;

import java.util.Scanner;

public class ControleNotas {

	public void calculaNotaFinal() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos alunos a classe possui? \n");
		int qtdAlunos = sc.nextInt();

		if (qtdAlunos <= 0) {
			System.out.println("Quantidade de alunos deve ser maior que zero.");
			return;
		}
		double[] notasAlunos = new double[qtdAlunos];
		String[] nomesAlunos = new String[qtdAlunos];
		for (int i = 0; i < notasAlunos.length; i++) {
			System.out.println("Digite o nome do aluno " + (i + 1));
			String nome = sc.next();
			nomesAlunos[i] = nome;
			boolean notaValida = false;
			while (!notaValida) {
				System.out.println("Digite a nota do aluno " + nome);
				double nota = sc.nextDouble();

				if (nota < 0 || nota > 25) {
					System.out.println("Nota deve estar entre 0 e 25");
				} else {

					notaValida = true;
					notasAlunos[i] = nota;
				}
			}

			notasAlunos[i] += 5;
		}
		
		 for(int j = 0; j < notasAlunos.length; j++) {
		 System.out.println("O aluno "+nomesAlunos[j]+"tirou "+notasAlunos[j]);
		 
			
		}
	}

}
