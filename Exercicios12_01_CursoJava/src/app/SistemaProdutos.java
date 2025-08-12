package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import service.Produto;

public class SistemaProdutos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto produtos;
		List<Produto> Lista = new ArrayList<Produto>();
		char adicionar;
		
		System.out.println();
		
		do {
			System.out.println("Nome do produto:");
			String nome = sc.nextLine();
			
			System.out.println("Preço do produto:");
			double preco = sc.nextDouble();
			sc.nextLine();
			
			Lista.add(new Produto(nome, preco));
			
			System.out.println("Irá adicionar outro produto? (s/n)");
			adicionar = sc.nextLine().charAt(0);
			
		} while (adicionar == 's');
		
		Collections.sort(Lista, new Comparator<Produto>() {
		    @Override
		    public int compare(Produto p1, Produto p2) {
		        return p1.getNome().compareToIgnoreCase(p2.getNome());
		    }
		});
		
		System.out.println("Todos os produtos cadastrados");
		for (Produto produto : Lista) {
			System.out.println(produto);
		}

	}

}
