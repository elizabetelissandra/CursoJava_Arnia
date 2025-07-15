package metodos;

public class CalculoPares {
	

	public static int calcularPares(int[] numeros) {
		int qtdPares = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				qtdPares++;
			}
		}
		return qtdPares;

	}

	public static void nPares(int[] numeros) {
		int qtdPares = calcularPares(numeros);
		int[] pares = new int[qtdPares];
		int index = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				pares[index] = numeros[i];
				System.out.println(pares[index]);
				index++;
			}
			
		}

	}
}
