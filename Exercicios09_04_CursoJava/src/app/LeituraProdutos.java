package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import service.ImportedProduct;
import service.Product;
import service.UsedProduct;

public class LeituraProdutos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product product;
		UsedProduct usedProduct;
		ImportedProduct importedProduct;

		System.out.println("Informe quantos produtos lidos:");
		int qtdProdutosLidos = sc.nextInt();
		sc.nextLine();

		String[] produtos = new String[qtdProdutosLidos];

		int i = 0;
		while (i < produtos.length) {
			char caracter;

			System.out.println("Comum, usado ou importado? (c/u/i)");
			caracter = sc.nextLine().charAt(0);
			String nome;
			double preco;

			if (caracter == 'c') {
				System.out.println("Nome:");
				nome = sc.nextLine();

				System.out.println("Preço:");
				preco = sc.nextDouble();
				sc.nextLine();

				product = new Product(nome, preco);

				produtos[i] = product.toString();
				i++;
			} else if (caracter == 'u') {
				System.out.println("Nome:");
				nome = sc.nextLine();

				System.out.println("Preço:");
				preco = sc.nextDouble();
				sc.nextLine();

				System.out.println("Data de fabricação: (DD/MM/YYYY)");
				String dataTexto = sc.nextLine();

				SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
				Date dataFabricacao = null;

				try {
					dataFabricacao = formato.parse(dataTexto);
					usedProduct = new UsedProduct(nome, preco, dataFabricacao);

					produtos[i] = usedProduct.toString();
					i++;
				} catch (ParseException e) {
					System.out.println("Formato de data inválido. Use DD/MM/YYYY."); 
				}

			} else if (caracter == 'i') {
				System.out.println("Nome:");
				nome = sc.nextLine();

				System.out.println("Preço:");
				preco = sc.nextDouble();
				sc.nextLine();

				System.out.println("Taxa de Importação:");
				double taxaImportacao = sc.nextDouble();
				sc.nextLine();

				importedProduct = new ImportedProduct(nome, preco, taxaImportacao);

				produtos[i] = importedProduct.toString();
				i++;
			}

			
		}
		System.out.println("Todos os produtos cadastrados:");
		for (int j = 0; j < produtos.length; j++) {
			System.out.println(produtos[j]);
		}
	}

}
