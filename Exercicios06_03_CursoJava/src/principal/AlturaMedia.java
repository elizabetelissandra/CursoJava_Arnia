package principal;

import java.text.DecimalFormat;
import java.util.Scanner;

import calculo_media_altura.MediaAltura;

public class AlturaMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MediaAltura media = new MediaAltura();
		
		System.out.println("Informe a quantidade de pessoas \nque serão cadastradas:");
		int qtdPessoas = sc.nextInt();
		
		String[] nomesPessoas = new String[qtdPessoas];
		int[] idadePessoas = new int[qtdPessoas];
		double[] alturaPessoas = new double[qtdPessoas];
		
		for(int i = 0; i < qtdPessoas; i++) {
			System.out.println("Informe o nome da pessoa "+(i+1));
			String nome = sc.next();
			nomesPessoas[i] = nome;
			
			System.out.println("Informe a idade da pessoa "+(i+1));
			int idade = sc.nextInt();
			idadePessoas[i] = idade;
			
			System.out.println("Informe a altura da pessoa "+(i+1));
			double altura = sc.nextDouble();
			alturaPessoas[i] = altura;
			
			
		}
		
		DecimalFormat formato = new DecimalFormat("#,##0.00");
		System.out.println("A média de altura das pessoas cadastradas é: "+formato.format(media.MediaIdade(idadePessoas)));
		DecimalFormat formato1 = new DecimalFormat("##0.00");
		System.out.println("A média das pessoas cadastradas com menos de 16 anos: "+formato1.format(media.MediaIdade(idadePessoas))+"%");
		
		 for (int i = 0; i < nomesPessoas.length; i++) {
	            if (idadePessoas[i] < 16) {
	                System.out.println(nomesPessoas[i]);
	            }
	        }

	}

}
