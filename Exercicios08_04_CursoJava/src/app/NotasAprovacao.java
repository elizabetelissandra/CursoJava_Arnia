package app;

import java.util.Scanner;

import service.Notas;

public class NotasAprovacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do aluno");
		String nome = sc.nextLine();
		
		double[] notas = new double[3];
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Agora informe a "+(i+1)+"ª nota.");
			System.out.println("Sendo ela de 0 a 30.");
			double nota = sc.nextDouble();
			notas[i] = nota;
		}
		
		Notas calculoNotas = new Notas();
		calculoNotas.nome = nome;
		calculoNotas.notas= notas;
		
		System.out.println(calculoNotas);
	}

}
