package app;

import java.text.DecimalFormat;

import service.Circulo;
import service.Quadrado;

public class FormasGeometrica {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado("quadrado", 15);
		Circulo circulo = new Circulo("circulo", 6);
		
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("O "+ quadrado.exibirNome()+ " tem a área de "+df.format(quadrado.calcularArea()) + " m²." );
		System.out.println("O "+ circulo.exibirNome()+ " tem a área de "+ df.format(circulo.calcularArea())+ " m².");
	}

}
