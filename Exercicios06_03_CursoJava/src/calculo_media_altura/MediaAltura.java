package calculo_media_altura;

public class MediaAltura {

	public double Media(double[] alturaPessoas) {

		double totalAlturas = 0;
		for (int i = 0; i < alturaPessoas.length; i++) {
			double n = alturaPessoas[i];
			totalAlturas += n;
		}
		double media = totalAlturas / alturaPessoas.length;
		return media;
	}

	public double MediaIdade(int[] idadePessoas) {

		int idadeMenos16 = 0;
		int somaIdades = 0;

		for (int j = 0; j < idadePessoas.length; j++) {
			int idade = idadePessoas[j];
			if (idade < 16) {
				somaIdades += idade;
				idadeMenos16++;
			}
		}
		double mediaIdade = (somaIdades / (double) idadeMenos16) *100;
		return mediaIdade;
	}
}
