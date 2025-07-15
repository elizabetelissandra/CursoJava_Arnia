package Principal;

import java.util.Scanner;

public class exercicios04 {

	public static void main(String[] args) {
		Calculo calculo = new Calculo();
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Digite um número:");
		int n = sc.nextInt();
		System.out.println("Escolha a opção: 1- Calcular o dobro, 2- Calcular o triplo, 3- Calcular o quadrado do número, 4 - Verificar se é par.");
		int opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:
			
			System.out.println("O dobro de "+n+" é "+calculo.dobro(n));
			break;
		case 2:
			System.out.println("O triplo de "+n+" é "+calculo.triplo(n));
			break;
		case 3:
			System.out.println("O quadrado de "+n+" é "+calculo.quadrado(n));
			break;
		case 4: 
			System.out.println("O par de "+n+" é "+calculo.par(n));
			break;
		default:
			System.out.println("Essa opção não existe.");
			break;
		}
		*/
		
		
		//Exercicio 2
		/*
		System.out.println("Quantos anos você fuma?");
		int anos = sc.nextInt();
		
		System.out.println("Quantos cigarros você fuma por dia?");
		int qtdCigarro = sc.nextInt();
		
		System.out.println("Qual o preço do maço de cigarro?");
		double prcCigarro = sc.nextDouble();
		
		System.out.println("Você gastou aproximadamente R$ "+calculo.gastouFumante(anos, qtdCigarro, prcCigarro));
		*/
		
		//Exercicio 3
		/*
		System.out.println("Qual é o seu peso?");
		double peso = sc.nextDouble();
		
		System.out.println("Qual é a sua altura?");
		double altura = sc.nextDouble();
		
		System.out.println("De acordo com os dados fornecidos, você está: "+calculo.calculoIMC(peso, altura));
		*/
		
		//Exercicio 4 
		/*
		System.out.println("Digite suas tres notas:");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		
		System.out.println("A média final foi "+calculo.mediaArit(n1, n2, n3)+", e a situação do aluno é: "+calculo.resultadoFinal(calculo.mediaArit(n1, n2, n3)));
		*/
		
		//Exercicio 5
		
		System.out.println("Selecione a opção para qual quer converter.");
		System.out.println("1- Celsius para Fahrenheit, 2- Fahrenheit para Celsius");
		int opcao = sc.nextInt();
		
		System.out.println("Insira a temperatura a ser convertida");
		double temp = sc.nextDouble();
		
		calculo.conversor(temp, opcao));
		
		
	}

}
