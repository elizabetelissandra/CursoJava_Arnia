package service;

import java.text.DecimalFormat;

public class Boleto extends Pagamento{

	public Boleto(double valor, String descricao) {
		super(valor, descricao);
	}

	public double valorTotal() {
		return valor + 2.50;
	}

	public String descricaoPagamento() {
		DecimalFormat df = new DecimalFormat("#,###.00");
		return descricao+" no valor total de R$ "+df.format(valorTotal());
	}

}
