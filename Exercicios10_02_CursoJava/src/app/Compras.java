package app;

import service.Boleto;
import service.Cartao;

public class Compras {

	public static void main(String[] args) {
		double valor1 = 100.00;
		String descricao1 = "Compra de livros acadêmicos";
		
		Cartao cartao = new Cartao(valor1, descricao1);
		
		double valor2 = 80.00;
		String descricao2 = "Pagamento de taxa de inscrição";
		
		Boleto boleto = new Boleto(valor2, descricao2);
		
		System.out.println("----------Pagamento via cartão-----------");
		System.out.println(cartao.descricaoPagamento()+"\n\n");
		
		System.out.println("----------Pagamento via Boleto------------");
		System.out.println(boleto.descricaoPagamento());
		

	}

}
