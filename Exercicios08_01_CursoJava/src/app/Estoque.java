package app;

import java.util.Scanner;

import service.Produto;

public class Estoque {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("informe o nome do produto");
		String nome = sc.nextLine();
		System.out.println("informe o preço do produto");
		double prc = sc.nextDouble();
		System.out.println("informe a quantidade do produto");
		int qtd = sc.nextInt();

		Produto produto = new Produto();

		produto.nome = nome;
		produto.prc = prc;
		produto.qtd = qtd;

		System.out.println("Dados do produto:");
		System.out.println(produto);
		
		int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar ao estoque");
            System.out.println("2 - Remover do estoque");
            System.out.println("3 - Mostrar dados do produto");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Quantidade para adicionar: ");
                    int entrada = sc.nextInt();
                    produto.adicionarProdutos(entrada);
                    System.out.println("Produto atualizado:");
                    System.out.println(produto.toString());
                    break;

                case 2:
                    System.out.print("Quantidade para remover: ");
                    int saida = sc.nextInt();
                    produto.removerProdutos(saida);
                    System.out.println("Produto atualizado:");
                    System.out.println(produto.toString());
                    break;

                case 3:
                    System.out.println("Dados do produto:");
                    System.out.println(produto.toString());
                    break;

                case 4:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);
	}

}
