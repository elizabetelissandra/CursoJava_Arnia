package service;

import java.text.DecimalFormat;

public class Cartao extends Pagamento {
	
	public Cartao(double valor, String descricao) {
		super(valor, descricao);
	}
	
	public double valorTotal() {
		return valor + (valor* 0.05);
	}

	public String descricaoPagamento() {
		DecimalFormat df = new DecimalFormat("#,###.00");
		return descricao+" no valor total de R$ "+df.format(valorTotal());
	}
	
	

}
