package service;

public class PessoaJuridica extends TipoDePessoa{

	private int numeroFuncionarios;

	public PessoaJuridica(String nome, double rendaAnual, int numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public double calcularImposto() {
		double imposto = numeroFuncionarios > 10 ? 0.14 : 0.16; 
		return rendaAnual * imposto;
	}
	
	
}
