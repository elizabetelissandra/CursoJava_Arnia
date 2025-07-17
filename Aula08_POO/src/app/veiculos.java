package app;

import java.util.Scanner;

import service.Veiculo;

public class veiculos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a marca");
		
		String marca = sc.nextLine();
		
		System.out.println("Digite o modelo");
		String modelo = sc.nextLine();
		
		System.out.println("Digite o ano");
		int ano = sc.nextInt();
		
		Veiculo veiculo = new Veiculo();
		
		veiculo.marca = marca;
		veiculo.modelo = modelo;
		veiculo.ano = ano;
		
		String informacoesMontadas = veiculo.montaInformacoes();

		System.out.println("Informações do veículo: "+informacoesMontadas);
	}

}
