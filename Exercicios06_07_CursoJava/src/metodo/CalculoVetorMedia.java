package metodo;

import java.util.Scanner;

public class CalculoVetorMedia {

	public double[] recebendoVetores(Scanner sc,int N ) {
		double[] vetor = new double[N];
		for (int i = 0; i < N; i++) {
			System.out.println("Insira o "+(i+1)+"º número:");
			double n = sc.nextDouble();
			vetor[i] = n;
			
		}
		
		return vetor;
	}
	
	public double mediaVetor(double[] vetor) {
		int somaVetor = 0;
		for (int i = 0; i < vetor.length; i++) {
			somaVetor += vetor[i];
		}
		double media = somaVetor/vetor.length;
		return media;
	}
	
	public void abaixoMedia(double[] vetor, double media) {
		
		
		for (int i = 0; i < vetor.length; i++) {
			if(media > vetor[i]) {
				System.out.println(vetor[i]);
			}
		}
		
	}

}
