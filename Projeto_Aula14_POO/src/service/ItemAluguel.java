package service;

import java.util.List;
import java.util.Scanner;

public class ItemAluguel {

	private Cliente cliente;
	private Equipamentos equipamento;
	private Integer quantidadeAlugada;

	public ItemAluguel(Cliente cliente, Equipamentos equipamento, int quantidadeAlugada) {
		super();
		this.cliente = cliente;
		this.equipamento = equipamento;
		this.quantidadeAlugada = quantidadeAlugada;
	}

	public Equipamentos getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamentos equipamento) {
		this.equipamento = equipamento;
	}

	public int getQuantidadeAlugada() {
		return quantidadeAlugada;
	}

	public void setQuantidadeAlugada(int quantidadeAlugada) {
		this.quantidadeAlugada = quantidadeAlugada;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setQuantidadeAlugada(Integer quantidadeAlugada) {
		this.quantidadeAlugada = quantidadeAlugada;
	}

	public static void adicionarItem(Cliente cliente, List<Equipamentos> listaEquip, List<ItemAluguel> carrinho) {
		Scanner sc = new Scanner(System.in);
		System.out.println("informe o item que será alugado?");
		int index = sc.nextInt();
		sc.nextLine();

		if (index < 0 || index >= listaEquip.size()) {
			System.out.println("Equipamento inválido");
		}

		Equipamentos equipamentoSelecionado = listaEquip.get(index);

		System.out.println("Informe a quantidade do item selecionado");
		int qtdItem = sc.nextInt();

		if (equipamentoSelecionado.getQuantidadeEstoque() < qtdItem) {
			System.out.println("Estoque indisponível.");

		} else {

			equipamentoSelecionado.setQuantidadeEstoque(equipamentoSelecionado.getQuantidadeEstoque() - qtdItem);
			ItemAluguel item = new ItemAluguel(cliente, equipamentoSelecionado, qtdItem);
			
			carrinho.add(item);

			System.out.println(item);
		}
	}

	public static void removerItem(List<Equipamentos> listaEquip , List<ItemAluguel> carrinho) {
		Scanner sc = new Scanner(System.in);
		System.out.println("informe o item que será removido do carrinho?");
		int index = sc.nextInt();
		sc.nextLine();
		
		Equipamentos equipamento = carrinho.get(index).getEquipamento();
		int qtdAlugada = carrinho.get(index).getQuantidadeAlugada();
		
		equipamento.setQuantidadeEstoque(equipamento.getQuantidadeEstoque() + qtdAlugada);
				

		carrinho.remove(index);

	}

	public double calcularSubTotal() {
		return equipamento.getValor() * quantidadeAlugada;
	}

	@Override
	public String toString() {
	    StringBuilder builder = new StringBuilder();
	    builder.append("\n==============================\n");
	    builder.append("📄 Item de Aluguel\n");
	    builder.append("👤 Cliente: ").append(cliente.getNome()).append(" (ID: ").append(cliente.getId()).append(")\n");
	    builder.append("🔧 Equipamento: ").append(equipamento.getNome()).append(" (ID: ").append(equipamento.getId()).append(")\n");
	    builder.append("💰 Valor unitário: R$ ").append(String.format("%.2f", equipamento.getValor())).append("\n");
	    builder.append("🔢 Quantidade alugada: ").append(quantidadeAlugada).append("\n");
	    builder.append("🧾 Sub-total: R$ ").append(String.format("%.2f", calcularSubTotal()).append("\n");
	    builder.append("==============================");
	    return builder.toString();
	}


}
