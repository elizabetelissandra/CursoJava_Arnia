package app;

import java.util.Scanner;

import service.Ingresso;
import service.IngressoVip;

public class CompraIngresso {

	public static void main(String[] args) {
		Ingresso ingresso;
		IngressoVip ingressoVip;
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Informe o valor do ingresso");
		double valorIngresso = sc.nextDouble();
		ingresso = new Ingresso(valorIngresso);
		
		System.out.println("Informe o valor adicional do preco VIP");
		double valorIngressoVIP = sc.nextDouble();
		ingressoVip = new IngressoVip(valorIngresso, valorIngressoVIP);
		
		System.out.println(ingresso);
		System.out.println(ingressoVip);
	}

}
