package service;

import interf.Aplicavel;
import interf.Resgatavel;

public class CDB extends ProdutoFinanceiro implements Aplicavel, Resgatavel{

	
	public CDB(String nomeInvestidor, double saldoInvestido) {
		super(nomeInvestidor, saldoInvestido);
	}

	@Override
	public void aplicar(double valor) {
		saldoInvestido += valor;
		exibirSaldoInvestido();
		
	}

	@Override
	public double resgatar() {
		double resgatado = saldoInvestido * 1.10;
		System.out.println(nomeInvestidor + " resgatou o valor R$ "+resgatado);
		return resgatado;
				
		
	}

}
