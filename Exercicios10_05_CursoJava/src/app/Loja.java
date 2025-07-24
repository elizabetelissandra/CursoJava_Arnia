package app;

import java.text.DecimalFormat;
import java.util.Scanner;

import service.Produto;

public class Loja {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o nome do produto: ");
		String nome = sc.nextLine();

		System.out.println("Informe o valor do produto");
		double valor = sc.nextDouble();

		System.out.println("Informe a quantidade do produto");
		int qtd = sc.nextInt();
		sc.nextLine();

		Produto produto = new Produto(nome, valor, qtd);

		DecimalFormat df = new DecimalFormat("#,###.00");
		if (produto.calcularTotal() > 500) {
			System.out.println("O produto " + nome + " foi comprado " + qtd + " unidades no valor R$ " + valor
					+ " (cada). O total da compra com desconto de 20%: R$ "
					+ df.format(produto.calcularComDesconto20()));
		} else if (produto.calcularTotal() > 100) {
			System.out.println("O produto " + nome + " foi comprado " + qtd + " unidades no valor R$ " + valor
					+ " (cada). O total da compra com desconto de 10%: R$ "
					+ df.format(produto.calcularComDesconto10()));
		} else {
			System.out.println("O produto " + nome + " foi comprado " + qtd + " unidades no valor R$ " + valor
					+ " (cada). O total da compra: R$ " + df.format(produto.calcularTotal()));
		}

	}

}
