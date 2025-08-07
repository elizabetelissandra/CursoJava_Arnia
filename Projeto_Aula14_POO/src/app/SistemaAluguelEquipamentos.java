package app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import service.Aluguel;
import service.Cliente;
import service.ClienteComum;
import service.ClienteFrequente;
import service.Equipamentos;
import service.ItemAluguel;

public class SistemaAluguelEquipamentos {

	public static void main(String[] args) {
		List<Equipamentos> listaEquip = new ArrayList<Equipamentos>();
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		List<Aluguel> historicoAlugueis = new LinkedList<Aluguel>();
		List<ItemAluguel> carrinho = new LinkedList<ItemAluguel>();

		Scanner sc = new Scanner(System.in);
		int opcao;

		listaClientes.add(new ClienteComum(1, "Ana"));
		listaClientes.add(new ClienteFrequente(2, "Bruno"));
		listaClientes.add(new ClienteFrequente(3, "Carlos"));

		listaEquip.add(new Equipamentos(101, "Projetor", 150.0, 5, 0));
		listaEquip.add(new Equipamentos(102, "Caixa de som", 80.0, 3, 0));
		listaEquip.add(new Equipamentos(103, "Microfone", 40.0, 10, 0));

		do {
			System.out.println("1 - Cadastrar Cliente");
			System.out.println("2 - Cadastrar Equipamento");
			System.out.println("3 - Realizar aluguel");
			System.out.println("4 - Remover equipamento do aluguel");
			System.out.println("5 - Exibir histórico de aluguéis");
			System.out.println("6 - Relatório de equipamentos mais alugados");
			System.out.println("7 - Sair");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				listaClientes.add(Cliente.registrarCliente());

				for (Cliente cliente : listaClientes) {
					System.out.println(cliente);
				}
				break;
			case 2:
				listaEquip.add(Equipamentos.registrarEquipamento());
				break;
			case 3:
				int i = 0;
				Cliente cliente = Cliente.quemCompra(listaClientes);
				if(cliente != null) {
					for (Equipamentos equipamentos : listaEquip) {
						System.out.println(i++ + " - " + equipamentos);
					}
					ItemAluguel.adicionarItem(cliente, listaEquip, carrinho);
				}else {
					System.out.println("Cliente não encontrado.");
					break;
				}

				
				break;
			case 4:
				int j = 0;
				if(Cliente.quemCompra(listaClientes) != null) {
				
				for (ItemAluguel itemAluguel : carrinho) {
					System.out.println(j++ + " - " + itemAluguel);
				}
				ItemAluguel.removerItem(listaEquip, carrinho);
				}
				break;
			default:
				break;
			}

		} while (opcao != 7);
	}

}
