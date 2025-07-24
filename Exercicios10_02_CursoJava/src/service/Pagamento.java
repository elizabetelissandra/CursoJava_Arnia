package service;

public abstract class Pagamento {

	protected double valor;
	protected String descricao;
	
	
	
	public Pagamento(double valor, String descricao) {
		super();
		this.valor = valor;
		this.descricao = descricao;
	}

	public abstract double valorTotal();
	
	public abstract String descricaoPagamento();
	
}
