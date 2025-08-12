package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import service.Livro;

public class BibliotecaDigital {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Livro> listaLivros = new ArrayList<Livro>();
		
		listaLivros.add(new Livro("Dom Casmurro", "Machado de Assis", 1899));
		listaLivros.add(new Livro("Grande Sertão: Veredas", "João Guimarães Rosa", 1956));
		listaLivros.add(new Livro("O Alquimista", "Paulo Coelho", 1988));
		listaLivros.add(new Livro("1984", "George Orwell", 1949));
		listaLivros.add(new Livro("Cem Anos de Solidão", "Gabriel García Márquez", 1967));
		listaLivros.add(new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943));
		listaLivros.add(new Livro("Capitães da Areia", "Jorge Amado", 1937));

		
		int opcao;
		do {
			System.out.println("\n--- MENU ---");
			System.out.println("1. Cadastrar Livro");
			System.out.println("2. Buscar Livro por Título");
			System.out.println("3. Listar Livros por Ano de Publicação");
			System.out.println("4. Sair do Sistema");
			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Informe o nome do livro:");
				String nome = sc.nextLine();
				
				System.out.println("\nInforme o nome do autor:");
				String autor = sc.nextLine();
				
				System.out.println("\nQual o ano de publicação:");
				int anoPublicacao = sc.nextInt();
				sc.nextLine();
				
				listaLivros.add(new Livro(nome, autor, anoPublicacao));
				break;
			case 2:
				System.out.println("Informe qual o livro que voce quer ler");
				String busca = sc.nextLine();
				for (Livro livro : listaLivros) {
					if(livro.getLivro().toLowerCase().contains(busca.toLowerCase())) {
						System.out.println(livro);
					}
				}
				break;
			case 3:
				System.out.println("Livros por ano de Publicação");
				Collections.sort(listaLivros);
				for (Livro livro : listaLivros) {
					System.out.println(livro);
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
