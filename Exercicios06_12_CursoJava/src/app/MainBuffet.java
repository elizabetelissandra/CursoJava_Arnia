package app;

import java.util.Iterator;
import java.util.Scanner;

import service.GerenciadorBuffet;

public class MainBuffet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GerenciadorBuffet calculo = new GerenciadorBuffet();

		System.out.println("Informe a quantidade de itens para cadastrar:");
		int n = sc.nextInt();

		String[] nomes = new String[n];
		int[] qtd = new int[n];
		double[] prc = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.println("informe o nome do " + (i + 1) + "º item:");
			sc.nextLine();
			String nomeItem = sc.nextLine();
			nomes[i] = nomeItem;

			System.out.println("Informe a quantidade desejada");
			int qtdItem = sc.nextInt();
			qtd[i] = qtdItem;

			System.out.println("Informe o preço do produto:");
			double prcItem = sc.nextDouble();
			prc[i] = prcItem;
		}
		
		System.out.println("Agora será mostrado a relação final da compra:");
		for (int i = 0; i < prc.length; i++) {
			System.out.println(nomes[i]+" = "+qtd[i]+" unidades x R$"+prc[i]+" = R$"+calculo.custoTotal(qtd, prc)[i]);
		}
		
		System.out.println("O valor total geral foi: R$"+calculo.custoGeral(calculo.custoTotal(qtd, prc)));

	}

}
