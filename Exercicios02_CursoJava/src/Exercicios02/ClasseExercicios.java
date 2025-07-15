package Exercicios02;

import java.util.Scanner;

public class ClasseExercicios {

	private static final String Estudante = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Digite um número:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n>0) {
			System.out.println("Esse número é positivo");
		}else {
			System.out.println("Esse número é negativo.");
		}
		*/
		
		//Exercicio 2
		
		/*
		System.out.println("Digite um número:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("O número "+n+ " é par");
		}else {
			System.out.println("O número "+n+ " é ímpar");
		}
		*/
		
		//Exercicio 3
		/*
		System.out.println("Digite dois números para saber se são múltiplos.");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if(n1 % n2 == 0) {
			System.out.println(n1+" e "+n2+" são múltiplos");
		}else {
			System.out.println(n1+" e "+n2+" não são múltiplos");
		}
		*/
		
		//Exercicio 4 
		
		/*
		System.out.println("Digite o código, a quantidade e o valor dos produtos a pagar:");
		Scanner sc = new Scanner(System.in);
		int cod1 = sc.nextInt();
		int qtd1 = sc.nextInt();
		double prc1 = sc.nextDouble();
		System.out.println("Digite o código, a quantidade e o valor dos produtos a pagar:");
		int cod2 = sc.nextInt();
		int qtd2 = sc.nextInt();
		double prc2 = sc.nextDouble();
		System.out.println("Digite o código, a quantidade e o valor dos produtos a pagar:");
		int cod3 = sc.nextInt();
		int qtd3 = sc.nextInt();
		double prc3 = sc.nextDouble();
		System.out.println("Digite o código, a quantidade e o valor dos produtos a pagar:");
		int cod4 = sc.nextInt();
		int qtd4 = sc.nextInt();
		double prc4 = sc.nextDouble();
		System.out.println("Digite o código, a quantidade e o valor dos produtos a pagar:");
		int cod5 = sc.nextInt();
		int qtd5 = sc.nextInt();
		double prc5 = sc.nextDouble();
		
		
		double resultado = (qtd1*prc1)+(qtd2*prc2)+(qtd3*prc3)+(qtd4*prc4)+(qtd5*prc5);
		System.out.println("O valor total da conta é: "+resultado);
		*/
		
		//Exercicio 5
		
		/*
		System.out.println("Informe o seu salario bruto:");
		Scanner sc = new Scanner(System.in);
		double salario = sc.nextDouble();
		
		double percentualDesconto;
        if (salario <= 3000.00) {
            percentualDesconto = 11.0;
        } else if (salario <= 6000.00) {
            percentualDesconto = 15.0;
        } else {
            percentualDesconto = 20.0;
        }


		
		double valorDesconto = salario * (percentualDesconto/100);
		double valorLiquido = salario - valorDesconto;
		
		System.out.println("O valor do desconto é de: "+valorDesconto);
		System.out.println("O valor do salário líquido é de: "+valorLiquido);
		*/
		
		//Exercicio 6 
		/*
		System.out.println("Informe o seu tipo de passagem (1 - Estudante, 2 - Idoso, 3 - Comum)e depois o tipo de transporte (1 - Onibus, 2 - Metro, 3- Trem) que irá usar:");
		Scanner sc = new Scanner(System.in);
		int passageiro = sc.nextInt();
		int transporte = sc.nextInt();
		

		if(passageiro == 1 ) {
			if(transporte == 1) {
			System.out.println("Irá pagar o valor de R$2,25");
			}else if(transporte == 2 ) {
				System.out.println("Irá pagar o valor de R$2,50");
			}else {
				System.out.println("Irá pagar o valor de R$3,00");
			}
		}else if(passageiro == 2) {
			if(transporte == 1 ) {
				System.out.println("Irá pagar o valor de R$3,15");
			}else if(transporte == 2) {
				System.out.println("Irá pagar o valor de R$3,50");
			}else {
				System.out.println("Irá pagar o valor de R$4,20");
			}
		}else {
			if(transporte == 1) {
				System.out.println("Irá pagar o valor de R$4,50");
			}else if(transporte == 2) {
				System.out.println("Irá pagar o valor de R$5,00");
			}else {
				System.out.println("Irá pagar o valor de R$6,00");
			}
		}
		*/
		
		//Exercicio 7
		
		/*
		System.out.println("Informe os valores de x e y, respectivamente:");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if(x == 0 && y == 0) {
			System.out.println("Estão em seu ponto de origem.");
		}else {
			System.out.println("Eixo X "+x+ " e Eixo Y "+y);
		}
		 */
		
		//Exercicio 8
		
		System.out.println("Informe o valor da sua nota:");
		Scanner sc = new Scanner(System.in);
		double nota = sc.nextDouble();
		System.out.println("Informe a sua renda R$:");
		double renda = sc.nextDouble();
		System.out.println("Você possui alguma deficiência?");
		boolean deficiencia = sc.nextBoolean();
		System.out.println("Estudou em escola pública?");
		boolean escolaPublica = sc.nextBoolean();
		
		
		if(nota >= 8.5 && renda <=1500 || deficiencia == true && escolaPublica == true) {
			System.out.println("Candidato tem direito a bolsa Integral!");			
		}else if(nota >=7 && renda <=3000 && escolaPublica == true) {
			System.out.println("Candidato tem direito a bolsa Parcial!");			
		}else {
			System.out.println("Candidato não tem direito a bolsa!");			
		}
		
		
	}

}
