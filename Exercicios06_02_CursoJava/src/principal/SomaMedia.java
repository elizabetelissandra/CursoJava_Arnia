package principal;

import java.text.DecimalFormat;
import java.util.Scanner;
import calculos.CalculosSomaMedia;

public class SomaMedia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CalculosSomaMedia calculo = new CalculosSomaMedia();
        System.out.println("Digite uma quantidade de números:");
        int qtd = sc.nextInt();

        int[] numeros = new int[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite o valor do número " + (i + 1));
            numeros[i] = sc.nextInt();
        }

        int soma = calculo.calcularSoma(numeros);
        double media = calculo.calcularMedia(numeros);

        System.out.println("A soma dos elementos é: " + soma);
        DecimalFormat formato = new DecimalFormat("#,##0.00");
        System.out.println("A média dos elementos é: "+formato.format(media));

        sc.close();
    }

   
}