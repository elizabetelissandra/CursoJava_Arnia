package app;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import service.PessoaFisica;
import service.PessoaJuridica;
import service.TipoDePessoa;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<TipoDePessoa> Lista = new ArrayList<TipoDePessoa>();

		
		System.out.println("Informe quantos contribuintes serão adicionadas");
		int qtd = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= qtd; i++) {
            System.out.println("\nContribuinte #" + i);
            System.out.println("Pessoa Física ou Jurídica (f/j)? ");
            char tipo = sc.next().charAt(0);
            sc.nextLine();
            
            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Renda anual: ");
            double renda = sc.nextDouble();

            if(tipo == 'f') {
            	System.out.println("O valor do gasto com saúde: ");
            	double gastoSaude = sc.nextDouble();
            	Lista.add(new PessoaFisica(nome, renda, gastoSaude));
            }else if(tipo == 'j') {
            	System.out.println("Qual número de funcionários");
            	int qtdFuncionarios = sc.nextInt();
            	Lista.add(new PessoaJuridica(nome, renda, qtdFuncionarios));
            }

		}
		
		System.out.println("\nImpostos Pagos:");
        double total = 0.0;
        for (TipoDePessoa c : Lista) {
            double imposto = c.calcularImposto();
            System.out.println(c.getNome()+", R$" +imposto);
            total += imposto;
        }

        System.out.printf("\nTotal De Impostos: R$ ", total);


	}

}
