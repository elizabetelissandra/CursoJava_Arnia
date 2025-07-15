package principal;

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;


import metodo.CalculoVetorMedia;

public class VetorMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CalculoVetorMedia calculo = new CalculoVetorMedia();
		
		System.out.println("Informe um número:");
		int N = sc.nextInt();
		
		double[] vetor = calculo.recebendoVetores(sc, N);
		
		double media = calculo.mediaVetor(vetor);
		
		
		NumberFormat nf = NumberFormat.getInstance(Locale.getDefault());
		nf.setMaximumFractionDigits(3);
		nf.setMinimumFractionDigits(3);
		System.out.println("MEDIA = " + nf.format(media));
		
		System.out.println("Números abaixo da media:");
		nf.setMaximumFractionDigits(3);
		nf.setMinimumFractionDigits(3);
		calculo.abaixoMedia(vetor, media);


		
	}

}
