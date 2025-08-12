package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import service.Tarefas;

public class OrganizadorTarefas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Tarefas> lista = new ArrayList<Tarefas>();
		int opcao;

		do {
			System.out.println("-------------MENU-----------");
			System.out.println("------- 1 - ADICIONAR ------");
			System.out.println("--- 2 - MARCAR CONCLUIDA ---");
			System.out.println("---- 3 - REMOVER TAREFA ----");
			System.out.println("---- 4 - EXIBIR LISTA ------");
			System.out.println("---------- 5 - SAIR --------");

			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Insira a descricao da tarefa");
				sc.nextLine();
				String descricao = sc.nextLine();


				System.out.println("Sua tarefa está concluida");
				boolean concluida = sc.nextBoolean();
				sc.nextLine();

				lista.add(new Tarefas(descricao, concluida));
				break;
			case 2:
				System.out.println("Informe a posicao da sua tarefa");
				int indice = sc.nextInt();
				sc.nextLine();
				Tarefas marcado = lista.get(indice);
				marcado.setConcluida(!marcado.isConcluida());
				System.out.println(marcado);
				break;
			case 3:
				System.out.println("Qual a posicao da sua tarefa");
				int posicao = sc.nextInt();
				sc.nextLine();
				lista.remove(posicao);
				break;
			case 4:
				Collections.sort(lista);
				for (Tarefas tarefas : lista) {
					System.out.println(tarefas);
				}
				break;
			case 5:
				System.out.println("Saindo do programa");
				break;
			default:
				System.out.println("Valor inválido, tente novamente");
				break;
			}

		} while (opcao != 5);
	}

}
