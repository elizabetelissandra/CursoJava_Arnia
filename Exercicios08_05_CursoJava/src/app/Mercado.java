package app;

import java.util.Scanner;

import service.Produto;

public class Mercado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados do produto");
		System.out.println("Digite o nome:");
		String nome = sc.nextLine();
		
		System.out.println("Digite o preço unitário");
		double preco = sc.nextDouble();
		
		System.out.println("Digite a quantidade comprada");
		int quantidade = sc.nextInt();
		
		Produto calculoProduto = new Produto();
		
		calculoProduto.nome = nome;
		calculoProduto.preco = preco;
		calculoProduto.quantidade = quantidade;
		
		System.out.println(calculoProduto);

	}

}
