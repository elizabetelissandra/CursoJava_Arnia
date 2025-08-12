package service;

import interf.Aplicavel;
import interf.Resgatavel;

public abstract class ProdutoFinanceiro implements Aplicavel, Resgatavel {

	protected String nomeInvestidor;
	protected double saldoInvestido;
	
	public ProdutoFinanceiro(String nomeInvestidor, double saldoInvestido) {
		super();
		this.nomeInvestidor = nomeInvestidor;
		this.saldoInvestido = saldoInvestido;
	}

	public String getNomeInvestidor() {
		return nomeInvestidor;
	}

	public void setNomeInvestidor(String nomeInvestidor) {
		this.nomeInvestidor = nomeInvestidor;
	}

	public double getSaldoInvestido() {
		return saldoInvestido;
	}

	public void setSaldoInvestido(double saldoInvestido) {
		this.saldoInvestido = saldoInvestido;
	}

	public void exibirSaldoInvestido() {
		System.out.println(nomeInvestidor + " tem o saldo atual R$ "+saldoInvestido);
	}
	
	public void adicionarInvestimento(double valor) {
		saldoInvestido += valor;
	}
}
