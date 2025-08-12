package service;

public class PessoaFisica extends TipoDePessoa {

	private double gastosSaude;

	public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double calcularImposto() {
		double imposto = rendaAnual < 20000.0 ? rendaAnual * 0.15 : rendaAnual * 0.25;
		imposto -= gastosSaude * 0.5;
		return Math.max(imposto, 0.0);
	}

}
