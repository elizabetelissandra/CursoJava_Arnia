package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import service.Funcionarios;


public class CadastroFuncionarios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Funcionarios> listaFuncionarios = new ArrayList<Funcionarios>();
		int opcao;
		
		listaFuncionarios.add(new Funcionarios("Ana Silva", "Gerente de Projetos", 7500.00));
		listaFuncionarios.add(new Funcionarios("Bruno Costa", "Analista de Sistemas", 5200.00));
		listaFuncionarios.add(new Funcionarios("Carla Mendes", "Designer Gráfico", 4300.00));
		listaFuncionarios.add(new Funcionarios("Diego Santos", "Suporte Técnico", 3200.00));
		listaFuncionarios.add(new Funcionarios("Fernanda Lima", "Recursos Humanos", 6000.00));
		listaFuncionarios.add(new Funcionarios("Luana Batista", "Marketing Digital", 4800.00));
		listaFuncionarios.add(new Funcionarios("Renato Azevedo", "Financeiro", 5100.00));
		listaFuncionarios.add(new Funcionarios("Tatiane Borges", "Desenvolvedora Backend", 6700.00));
		listaFuncionarios.add(new Funcionarios("Eduardo Nogueira", "Supervisor de Vendas", 5300.00));
		listaFuncionarios.add(new Funcionarios("Marcela Antunes", "UX Designer", 5900.00));

		
		do {
			System.out.println("\n--- MENU ---");
			System.out.println("1. Cadastrar Funcionário");
			System.out.println("2. Atualizar salário");
			System.out.println("3. Listar Funcionários por ordem alfabética");
			System.out.println("4. Sair do Sistema");
			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch (opcao) {
			case 1:
				System.out.println("Informe o nome do funcionario:");
				String nome = sc.nextLine();
				
				System.out.println("\nInforme o cargo:");
				String cargo = sc.nextLine();
				
				System.out.println("\nQual o salário do funcionário?");
				double salario = sc.nextDouble();
				
				listaFuncionarios.add(new Funcionarios(nome, cargo, salario));
				break;
			case 2:
				System.out.println("Informe qual o funcionario que terá o salario atualizado:");
				int i = 0;
				for (Funcionarios funcionarios : listaFuncionarios) {
					System.out.println(i +" - "+funcionarios);
					i++;
				}
				int indice = sc.nextInt();
				sc.nextLine();
				System.out.println("O valor do salário que irá alterar");
				double novoSalario = sc.nextDouble();
				
				Funcionarios funcionario = listaFuncionarios.get(indice);
				funcionario.setSalario(novoSalario);
				break;
			case 3:
				Collections.sort(listaFuncionarios);
				System.out.println("Funcionarios por ordem alfabetica");
				for (Funcionarios funcionarios : listaFuncionarios) {
					System.out.println(funcionarios);
				}
				break;
			case 4:
				System.out.println("Saindo do sistema...");
				break;
			default:
				System.out.println("Opção inválida, tente novamente");
				break;
			}
		} while (opcao != 4);

	}

}
