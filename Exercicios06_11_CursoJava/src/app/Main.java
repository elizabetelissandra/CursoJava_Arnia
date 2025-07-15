package app;

import java.text.DecimalFormat;
import java.util.Scanner;

import service.AnaliseGrupo;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AnaliseGrupo logica = new AnaliseGrupo();
		
		System.out.println("Quantas pessoas serão adicionadas?");
		int n = sc.nextInt();
		
		System.out.println("Vamos adicionar os dados do genero Masculino:");
		double[] alturaM = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Informe a "+(i+1)+"ª altura." );
			double h = sc.nextDouble();
			alturaM[i] = h;
		}

		System.out.println("Vamos adicionar os dados do genero Feminino:");
		double[] alturaF = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Informe a "+(i+1)+"ª altura." );
			double h = sc.nextDouble();
			alturaF[i] = h;
		}
		
		System.out.println("Aqui estão o maior e o menor altura de cada grupo.");
		System.out.println("Do grupo masculino o maior é "+logica.maiorAltura(alturaM)+" e o menor é "+logica.menorAltura(alturaM, n));
		
		System.out.println("Do grupo feminino o maior é "+logica.maiorAltura(alturaF)+" e o menor é "+logica.menorAltura(alturaF, n));
		
		DecimalFormat df = new DecimalFormat("#.00");
        String resultadoFormatado = df.format(logica.mediaAltura(alturaF));

		System.out.println("A média de alturas das múlheres: "+resultadoFormatado);
		System.out.println("O número de homens: "+logica.numeroHomens(alturaF));
	}

}
