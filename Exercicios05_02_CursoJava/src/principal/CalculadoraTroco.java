package principal;

import java.util.Scanner;

import metodos.metodoCalculadora;

public class CalculadoraTroco {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		metodoCalculadora calculadora = new metodoCalculadora();
		double valor;
		do {
			System.out.println("Digite os valores das compras");
			System.out.println("Para encerrar digite 0");
			valor = sc.nextDouble();
			calculadora.soma(valor);

		} while (valor != 0);

		// Valor pago pelo cliente

		System.out.println("Informe o valor pago pelo cliente:");
		double valorPago = sc.nextDouble();

		calculadora.calculoTroco(valorPago);
		
		System.out.println("Obrigado! Compra finalizada com sucesso.");
		
		sc.close();
	}

}
