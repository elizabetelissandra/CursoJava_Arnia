package app;

import java.util.Scanner;

import service.Conta;

public class Banco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Número da Conta:");
		int numero = sc.nextInt();
		sc.nextLine();

		System.out.println("Nome do titular:");
		String nome = sc.nextLine();

		System.out.println("Irá fazer depósito inicial? s/n");
		char resposta = sc.next().charAt(0);

		Conta conta;
		if (resposta == 's') {
			System.out.println("Informe o valor do depósito inicial?");
			double deposito = sc.nextDouble();
			conta = new Conta(resposta, nome, deposito);
		} else {
			conta= new Conta(resposta, nome);
		}

		System.out.println("Informações da Conta:");
		System.out.println(conta);

		int opcao;
		do {
			System.out.println("---------Menu de Opções---------");
			System.out.println("1 - Depositar");
			System.out.println("2 - Sacar");
			System.out.println("3 - Saldo");
			System.out.println("4 - Sair");
			
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("\nValor para depósito: ");
				double valorDeposito = sc.nextDouble();
				conta.depositar(valorDeposito);
				System.out.println("Dados atualizados:");
				System.out.println(conta);
				break;
			case 2:
				System.out.print("\nValor para saque: ");
				double valorSaque = sc.nextDouble();
				conta.sacar(valorSaque);
				System.out.println("Dados atualizados:");
				System.out.println(conta);
				break;
			case 3:
				System.out.println("Dados atualizados:");
				System.out.println(conta);
			case 4:
				System.out.println("Fechando o menu...");
				break;
			}
		} while (opcao != 4);

	}

}
