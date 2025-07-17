package service;

import java.text.DecimalFormat;

public class Retangulo {

	public double altura;
	public double largura;

	public double areaRetangulo() {
		return altura * largura;
	}

	public double perimetroRetangulo() {
		return 2 * (altura + largura);
	}

	public double diagonalRetangulo() {
		return Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		return "Largura: " + df.format(largura) + "\nAltura: " + df.format(altura) + "\nÁrea: "
				+ df.format(areaRetangulo()) + "\nPerímetro " + df.format(perimetroRetangulo()) + "\nDiagonal "
				+ df.format(diagonalRetangulo());
	}
}
