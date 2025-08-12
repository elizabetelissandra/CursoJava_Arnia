package app;

import interf.Aplicavel;
import interf.Resgatavel;
import service.CDB;
import service.ProdutoFinanceiro;
import service.TesouroDireto;

public class SimuladorInvestimento {

	public static void main(String[] args) {
		Aplicavel[] aplicacoes = new Aplicavel[2];
		Resgatavel[] resgates = new Resgatavel[2];
		
		System.out.println("------------Investimento----------\n\n");
		ProdutoFinanceiro investimentoCDB = new CDB("Elizabete", 1000);
		System.out.println("Cliente "+investimentoCDB.getNomeInvestidor() +" tem salto atual: R$ "+investimentoCDB.getSaldoInvestido());
		ProdutoFinanceiro investimentoTesouro = new TesouroDireto("Eneide", 3000);
		System.out.println("Cliente "+investimentoTesouro.getNomeInvestidor() +" tem salto atual: R$ "+investimentoTesouro.getSaldoInvestido());
		aplicacoes[0] = investimentoCDB;
		aplicacoes[1] = investimentoTesouro;
		
		System.out.println("\n\n----------Aplicacoes--------------\n\n");
		for (Aplicavel aplicavel : aplicacoes) {
			aplicavel.aplicar(1000);
		}
		
		resgates[0] = investimentoCDB;
		resgates[1] = investimentoTesouro;
		
		System.out.println("\n\n-------------Resgates--------------\n\n");
		for (Resgatavel resgatavel : resgates) {
			double valorResgatado = resgatavel.resgatar();
			
			
		}
		
	
	}

}
