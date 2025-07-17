package app;

import java.util.Scanner;

public class FormatarNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um numero com ddd");
		String numero = sc.nextLine();
		
		if(numero.length() != 10 ) {
			System.out.println("Número inválido, ele precisa ter 10 números.");
		}else {
			String ddd = numero.substring(0,2);
			String parte1 = numero.substring(2,6);
			String parte2 = numero.substring(6,10);
			
			String numeroFormatado = "("+ddd+")"+parte1+"-"+parte2;
			System.out.println("Número formatado: "+numeroFormatado);
		}

	}

}
