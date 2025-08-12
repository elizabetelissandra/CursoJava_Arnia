package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import service.Cliente;
import service.ClienteComum;
import service.ClienteVIP;
import service.Compra;
import service.ItemCompra;
import service.OrdenadorQuantidade;
import service.Produto;
import java.util.Date;
import java.util.Iterator;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class SistemaEcommerce {

	public static void main(String[] args) {
		List<Cliente> listaCliente = new ArrayList<Cliente>();
		List<Produto> listaProduto = new ArrayList<Produto>();
		List<ItemCompra> listaCarrinho = new LinkedList<ItemCompra>();
		List<Compra> historicoCompra = new LinkedList<Compra>();
		Scanner sc = new Scanner(System.in);
		int opcao;
		

		listaCliente.add(new ClienteVIP("Maria", "maria@email.com"));
		listaCliente.add(new ClienteComum("João", "joao@email.com"));
		listaCliente.add(new ClienteVIP("Ana", "ana@email.com"));

		listaProduto.add(new Produto("Caneta", listaProduto, 1.50, 120));
		listaProduto.add(new Produto("Caderno", listaProduto, 8.90, 85));
		listaProduto.add(new Produto("Borracha", listaProduto, 0.99, 200));

		do {
			System.out.println("1 - Cadastrar Cliente");
			System.out.println("2 - Cadastrar Produto");
			System.out.println("3 - Adicionar Item ao Carrinho");
			System.out.println("4 - Remover Item do Carrinho");
			System.out.println("5 - Finalizar Compra");
			System.out.println("6 - Ver Histórico de Compras");
			System.out.println("7 - Relatório de Produtos Mais Vendidos");
			System.out.println("0 - Sair");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Informe os dados do cliente:");
				System.out.println("Nome:");
				String nomeCliente = sc.nextLine();
				System.out.println("Email:");
				String emailCliente = sc.nextLine();
				System.out.println("Você é cliente VIP? (s/n)");
				char resposta = sc.nextLine().charAt(0);
				
				if(resposta == 's') {
					Cliente clienteVIP = new ClienteVIP(emailCliente, nomeCliente);
					listaCliente.add(clienteVIP);
				}else {
					Cliente clienteComun = new ClienteComum(emailCliente, nomeCliente);
					listaCliente.add(clienteComun);
				}
				

				for (Cliente cliente : listaCliente) {
					System.out.println(cliente);
				}
				break;
			case 2:
				System.out.println("Informe os dados do produto:");
				System.out.println("Nome:");
				String nomeProduto = sc.nextLine();
				System.out.println("Preço:");
				double preco = sc.nextDouble();
				System.out.println("Quantidade Vendida:");
				int qtdVendida = sc.nextInt();
				sc.nextLine();
				

				listaProduto.add(new Produto(nomeProduto, listaProduto, preco, qtdVendida));

				for (Produto produto : listaProduto) {
					System.out.println(produto);
				}
				break;
			case 3:
				System.out.println("Informe qual produto deseja adicionar:");
				for (int j = 0; j < listaProduto.size(); j++) {
					System.out.println(j + " - " + listaProduto.get(j).getNomeProduto());
				}
				
				int indice = sc.nextInt();
				sc.nextLine();
				String produto = listaProduto.get(indice).getNomeProduto();
				System.out.println("Informe a quantidade:");
				int quantidade = sc.nextInt();
				sc.nextLine();

				ItemCompra itemComprado = new ItemCompra(produto, quantidade);
				listaCarrinho.add(itemComprado);

				for (ItemCompra itemCompra : listaCarrinho) {
					System.out.println(itemCompra);
				}

				break;
			case 4:
				System.out.println("Informe qual produto deseja remover do carrinho:");
				for (int j = 0; j < listaCarrinho.size(); j++) {
					System.out.println(j + " - " + listaCarrinho.get(j));
				}
				
				
				int index = sc.nextInt();
				listaCarrinho.remove(index);

				for (ItemCompra itemCompra : listaCarrinho) {
					System.out.println(itemCompra);
				}
				break;
			case 5:

				if (listaCarrinho.isEmpty()) {
					System.out.println("Carrinho vazio.");
				}

				double totalCompra = 0;
				for (ItemCompra itemCompra : listaCarrinho) {
					totalCompra += itemCompra.getValorTotal(listaProduto);
					
				}
				
				Cliente clienteAtual = listaCliente.get(listaCliente.size() - 1);
				
				double total = clienteAtual.aplicarDesconto(totalCompra);
				System.out.println(clienteAtual);
				System.out.println("TotalCompra: "+ totalCompra+ " |  total com desconto: "+total);
				

				Date dataCompra = new Date();
				SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
				String dataFormatada = formato.format(dataCompra);

				Compra compra = new Compra(clienteAtual, listaCarrinho, dataFormatada, total);

				historicoCompra.add(compra);

				System.out.println("Compra finalizada");
				System.out.println(compra);

				listaCarrinho.clear();
				break;
			case 6:
				System.out.println("Histórico de compras");
				for (Compra compras : historicoCompra) {
					System.out.println("-------------------------------");
					System.out.println(compras);
					System.out.println("-------------------------------");
				}
				break;
			case 7:
				if (listaProduto.isEmpty()) {
					System.out.println("Nenhum produto cadastrado.");
					break;
				}
				
				Collections.sort(listaProduto, new OrdenadorQuantidade());

				System.out.println("Produtos mais vendidos:");
				int i=0;
				for (Produto maisVendidos : listaProduto) {
					System.out.println("-----------------------------------");
					System.out.println(++i +"-"+ maisVendidos.getNomeProduto() + "\n"
							+ "Quantidade Vendida: " + maisVendidos.getQuantidadeVendida());
				}

				break;
			case 0:
				System.out.println("Saindo do sistema...");
				break;
			default:
				System.out.println("Opcao inválida, tente novamente.");
				break;
			}

		} while (opcao != 0);
	}

}
