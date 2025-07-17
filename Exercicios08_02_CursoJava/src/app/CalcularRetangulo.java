package app;

import java.util.Scanner;

import service.Retangulo;

public class CalcularRetangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a largura do retângulo");
		double largura = sc.nextDouble();
		
		System.out.println("Agora informe a altura:");
		double altura = sc.nextDouble();
		
		Retangulo retangulo = new Retangulo();
		retangulo.altura = altura;
		retangulo.largura = largura;
		
		System.out.println("Informações do Retangulo:");
		System.out.println(retangulo);

	}

}
