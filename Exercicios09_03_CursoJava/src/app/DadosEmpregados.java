package app;

import java.util.Scanner;

import service.Empregado;
import service.Gerente;
import service.Vendedor;

public class DadosEmpregados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Empregado empregado;
		Vendedor vendedor;
		Gerente gerente;

		// Cadastrando o empregado

		System.out.println("Digite o nome do empregado");
		String nome = sc.nextLine();

		System.out.println("Agora informe seu salário:");
		float salario = sc.nextFloat();

		empregado = new Empregado(nome, salario);

		System.out.println("Dados do empregado:");
		System.out.println(empregado);
		
		//Inicio do Loop
		int opcao;
		do {

			System.out.println("-----------Menu------------");
			System.out.println("1---Cadastrar Empregado----");
			System.out.println("2---Cadastrar Vendedor-----");
			System.out.println("3---Cadastrar Gerente------");
			System.out.println("4----------Sair------------");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do empregado");
				nome = sc.nextLine();

				System.out.println("Agora informe seu salário:");
				salario = sc.nextFloat();
				sc.nextLine();
				empregado = new Empregado(nome, salario);

				System.out.println("Dados do vendedor:");
				System.out.println(empregado);
				break;
			case 2:
				System.out.println("Digite o nome do vendedor");
				nome = sc.nextLine();

				System.out.println("Agora informe seu salário:");
				salario = sc.nextFloat();
				sc.nextLine();
				System.out.println("Informe o percentual no salário");
				float percentual = sc.nextFloat();
				sc.nextLine();
				vendedor = new Vendedor(nome, salario, percentual);

				System.out.println("Dados do vendedor:");
				System.out.println(vendedor);
				break;
			case 3:
				System.out.println("Digite o nome do Gerente");
				nome = sc.nextLine();

				System.out.println("Agora informe seu salário:");
				salario = sc.nextFloat();
				sc.nextLine();
				System.out.println("Informe o departamento:");
				String departamento = sc.nextLine();

				gerente = new Gerente(nome, salario, departamento);

				System.out.println("Dados do gerente:");
				System.out.println(gerente);
				break;
			case 4:
				System.out.println("Encerrando o sistema...");
				break;
			default:
				System.out.println("Opção inválida, tente novamente!");
				break;
			}
		} while (opcao != 4);
	}

}
