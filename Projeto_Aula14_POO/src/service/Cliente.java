package service;

import java.util.List;
import java.util.Scanner;

public abstract class Cliente {

	private int id;
	private String nome;
	private List<Aluguel> historicoAluguel;

	public Cliente(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
		this.historicoAluguel = historicoAluguel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aluguel> getHistoricoAluguel() {
		return historicoAluguel;
	}

	public void setHistoricoAluguel(List<Aluguel> historicoAluguel) {
		this.historicoAluguel = historicoAluguel;
	}

	public abstract double aplicarDesconto(double valor);

	public static Cliente registrarCliente() {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int ContadorID = i++;

		System.out.println("Infome o nome do cliente:");
		String nome = sc.nextLine();

		System.out.println("Você é um cliente Frequente? (s / n)");
		char resposta = sc.nextLine().charAt(0);

		if (resposta == 's') {
			Cliente cliente = new ClienteFrequente(ContadorID, nome);
			return cliente;
		} else if (resposta == 'n') {
			Cliente cliente = new ClienteComum(ContadorID, nome);
			return cliente;
		} else {
			System.out.println("Opcao inválida, informe com s ou n");
			return null;
		}

	}

	public static Cliente quemCompra(List<Cliente> listaClientes) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome do comprador cadastrado:");
		String nomeComprador = sc.nextLine();

		for (Cliente cliente : listaClientes) {
			if (cliente.getNome().equalsIgnoreCase(nomeComprador)) {
				return cliente;
			}
		}

		return null;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n==============================\n");
		builder.append("👤 Cliente\n");
		builder.append("🆔 ID: ").append(id).append("\n");
		builder.append("📛 Nome: ").append(nome).append("\n");
		builder.append("📚 Histórico de Aluguel: ")
				.append(historicoAluguel != null ? historicoAluguel : "Nenhum registro").append("\n");
		builder.append("==============================");
		return builder.toString();

	}
}
