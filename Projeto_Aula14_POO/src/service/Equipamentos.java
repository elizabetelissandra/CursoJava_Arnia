package service;

import java.util.Scanner;

public class Equipamentos {

	private int id;
	private String nome;
	private double valor;
	private Integer quantidadeEstoque;
	private int vezesAlugado;

	public Equipamentos(int id, String nome, double valor, Integer quantidadeEstoque, int vezesAlugado) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.quantidadeEstoque = quantidadeEstoque;
		this.vezesAlugado = vezesAlugado;
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

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(Integer quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public int getVezesAlugado() {
		return vezesAlugado;
	}

	public void setVezesAlugado(int vezesAlugado) {
		this.vezesAlugado = vezesAlugado;
	}

	public static Equipamentos registrarEquipamento() {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int ContadorID = i++;

		System.out.println("Qual o nome do equipamento?");
		String nome = sc.nextLine();

		System.out.println("Qual valor do produto?");
		double valor = sc.nextDouble();

		System.out.println("Quantidade de produto em estoque:");
		Integer produtoEstoque = Integer.valueOf(sc.nextInt());

		System.out.println("Quantas vezes ele foi alugado?");
		int vezesAlugado = sc.nextInt();

		Equipamentos equipamentos = new Equipamentos(ContadorID, nome, valor, produtoEstoque, vezesAlugado);

		return equipamentos;

	}

	@Override
	public String toString() {
	    StringBuilder builder = new StringBuilder();
	    builder.append("\n==============================\n");
	    builder.append("🔧 Equipamento\n");
	    builder.append("🆔 ID: ").append(id).append("\n");
	    builder.append("📦 Nome: ").append(nome).append("\n");
	    builder.append("💰 Valor: R$ ").append(String.format("%.2f", valor)).append("\n");
	    builder.append("📊 Estoque disponível: ").append(quantidadeEstoque).append("\n");
	    builder.append("📈 Alugado: ").append(vezesAlugado).append(" vez(es)\n");
	    builder.append("==============================");
	    return builder.toString();
	}


}
