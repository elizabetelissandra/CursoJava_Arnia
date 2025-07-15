package service;

public class GerenciadorBuffet {
	public double[] custoTotal(int[] qtd, double[] prc) {
		double[] total = new double[prc.length];
		for (int i = 0; i < prc.length; i++) {
			total[i] = prc[i] * qtd[i];
		}
		return total;
	}
	
	public double custoGeral(double[] total) {
		double soma = 0;
		for (int i = 0; i < total.length; i++) {
			soma += total[i];
		}
		return soma;
	}
}
