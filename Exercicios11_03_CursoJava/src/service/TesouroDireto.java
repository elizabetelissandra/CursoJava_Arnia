package service;

import interf.Aplicavel;
import interf.Resgatavel;

public class TesouroDireto extends ProdutoFinanceiro implements Aplicavel, Resgatavel{

	public TesouroDireto(String nomeInvestidor, double saldoInvestido) {
		super(nomeInvestidor, saldoInvestido);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double resgatar() {
		double resgatado = saldoInvestido * 1.05;
		System.out.println(nomeInvestidor + " resgatou o valor R$ "+resgatado);
		return resgatado;
	}

	@Override
	public void aplicar(double valor) {
		saldoInvestido += valor;
		exibirSaldoInvestido();
		
	}

	
}
