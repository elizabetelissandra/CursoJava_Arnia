package service;

import java.text.DecimalFormat;

public class Notas {

	public String nome;
	public double[] notas;
	
	public double notaFinal() {
		double soma = 0;
		for (int i = 0; i < notas.length; i++) {
			soma+= notas[i];
		}
		
		return soma;
	}
	
	public String resultadoFinal(double notaFinal) {
		if(notaFinal >=60) {
			return "Aprovado";
		}else {
			DecimalFormat df = new DecimalFormat("0.00");
			double notaRestante = notaFinal - 60;
			return "falta "+df.format(notaRestante)+" pontos para ser aprovado.";
		}
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		return "O aluno "+nome+", teve a média final "+df.format(notaFinal())+
				"\ne tem o resultado "+resultadoFinal(notaFinal());
	}
}
