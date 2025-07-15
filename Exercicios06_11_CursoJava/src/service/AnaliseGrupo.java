package service;

public class AnaliseGrupo {

	public double maiorAltura(double[] alturas) {
		double maiorAltura = 0;
		for (int j = 0; j < alturas.length; j++) {
			if (alturas[j] > maiorAltura) {
				maiorAltura = alturas[j];
			}
		}
		return maiorAltura;
	}

	public double menorAltura(double[] alturas, double maiorAltura) {
		double menorAltura = maiorAltura;
		for (int i = 0; i < alturas.length; i++) {
			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}
		}
		return menorAltura;
	}

	public double mediaAltura(double[] alturas) {

		double somaAlturas = 0;
		for (int i = 0; i < alturas.length; i++) {
			somaAlturas += alturas[i];
		}

		double mediaAltura = somaAlturas / alturas.length;
		return mediaAltura;
	}
	
	public int numeroHomens(double[] alturas) {
		int nHomens = alturas.length;
		return nHomens;
	}
}
