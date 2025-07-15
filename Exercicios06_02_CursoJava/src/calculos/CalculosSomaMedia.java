package calculos;

public class CalculosSomaMedia {
	
	 public int calcularSoma(int[] vetor) {
	        int total = 0;
	        for (int i = 0; i < vetor.length; i++) {
	        	int n = vetor[i];
	            total += n;
	        }
	        return total;
	    }
	 
	 public double calcularMedia(int[] vetor) {
	        if (vetor.length == 0) return 0.0;
	        int soma = calcularSoma(vetor);
	        return (double) soma / vetor.length;
	    }

}
