package exercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicios03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exercicio 1
		/*
		 Scanner sc = new Scanner(System.in);
	        int senhaCorreta = 2002;
	        int senha;

	        System.out.println("Digite sua senha:");
	        senha = sc.nextInt(); 

	        while (senha != senhaCorreta) {
	            System.out.println("Senha invalida");
	            System.out.println("Digite sua senha:");
	            senha = sc.nextInt(); 
	        }

	        System.out.println("Acesso Permitido");

	*/	
		
		//Exercicio 2
		/*
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int codigo;

        do {
            System.out.println("Qual é o seu produto de preferência?");
            codigo = sc.nextInt();

            switch (codigo) {
                case 1:
                    alcool++;
                    System.out.println("Voto contabilizado.");
                    break;
                case 2:
                    gasolina++;
                    System.out.println("Voto contabilizado.");
                    break;
                case 3:
                    diesel++;
                    System.out.println("Voto contabilizado.");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Tente novamente!");
            }

        } while (codigo != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
		*/
		
		//Exercicio 3
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número para saber seus ímpares.");
		int n = sc.nextInt();
		
		
		for (int i = 0; i < n; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		*/
		
		//Exercicio 4
		/*
		Scanner sc = new Scanner(System.in);
		int in = 0;
		int out = 0;
		
		System.out.println("Digite um número para o contador:");
		int n = sc.nextInt();
		
		for(int i = 0;i < n; i++ ) {
			System.out.println("Digite um número para verificar:");
			int n1 = sc.nextInt();
			
			if(n1 >= 10 && n1<=20) {
				in++;
			}else {
				out++;
			}
		}
		System.out.println(+in+" In");
		System.out.println(+out+" Out");
		*/
		
		//Exercicio 5
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número para saber seus divisores:");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
		*/
		
		//Exercicio 6
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de produtos que vai cadastrar:");
		int n = sc.nextInt();
		int precoTotal = 0;
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Digite o nome do Produto:");
			String nome = sc.next();
			System.out.println("Digite a quantidade do produto:");
			int quantidade = sc.nextInt();
			System.out.println("Digite o preço:");
			int preco = sc.nextInt();
			
			precoTotal = precoTotal + (quantidade*preco);
		}
		System.out.println("O valor total da compra é: "+precoTotal);
		*/
		}  
					
	}


