package metodos;

import java.util.Scanner;

public class LogicaCadastroPessoas {

	public String[] cadastroNomes(int qtd, Scanner sc) {
		String[] nomes = new String[qtd];
		for (int i = 0; i <qtd; i++) {
			System.out.println("Informe a nome da "+(i+1)+"ª pessoa");
			String nome = sc.next();
			
			nomes[i] = nome;
		}
		return nomes;
	}
	
	public int[] idadesCadastro(int qtd, Scanner sc) {
		int[] idades = new int[qtd];
		for (int i = 0; i <qtd; i++) {
			System.out.println("Informe a idade da "+(i+1)+"ª pessoa");
			int idade = sc.nextInt();
			
			idades[i] = idade;
		}
		return idades;
	}
	
	public int pessoaMaisVelha(int[] idades) {
		int maiorIdade = 0;
		int posicaoMaiorIdade = 0;
		for (int i = 0; i < idades.length; i++) {
			if(idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				posicaoMaiorIdade = i;
			}
		}
		return posicaoMaiorIdade;
	}
}
