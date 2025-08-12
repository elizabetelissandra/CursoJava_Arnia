package app;

import java.util.Scanner;

import service.Carros;
import service.Motos;

public class AutoGestao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Infome o tipo de veiculo. (c / m)");
		char tipo = sc.nextLine().charAt(0);
		
		System.out.println("informe a marca:");
		String marca = sc.nextLine();
		
		System.out.println("Informe o modelo: ");
		String modelo = sc.nextLine();
		
		System.out.println("Infome o ano");
		int ano = sc.nextInt();
		sc.nextLine();
		
		System.out.println("informe o valor do carro: ");
		double valor = sc.nextDouble();
		
		if(tipo == 'c') {
			Carros carro = new Carros(marca, modelo, ano, valor);
			System.out.println("O veículo "+ marca + " e modelo "+modelo+" deve pagar o valor do IPVA: R$ "+ carro.valorIPVA());
		}else if(tipo == 'm') {
			Motos moto = new Motos(marca, modelo, ano, valor);
			System.out.println("O veículo "+ marca + " e modelo "+modelo+" deve pagar o valor do IPVA: R$ "+ moto.valorIPVA());
		}
		
		
		

	}

}
