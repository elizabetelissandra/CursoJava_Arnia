package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import service.OrdenadorDecrescente;
import service.Participante;

public class ListarConvidados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Participante> lista = new ArrayList<Participante>();
		char resposta;
		do {
			
			System.out.println("Digite o nome do participante");
			String nome = sc.nextLine();

			System.out.println("Digite a idade:");
			int idade = sc.nextInt();
			sc.nextLine();

			lista.add(new Participante(nome, idade));

			System.out.println("Deseja adicionar mais participantes? (s/n)");
			resposta = sc.nextLine().charAt(0);

		} while (resposta == 's');

		System.out.println("Como quer que seja a ordenacao, crescente ou decrescente? (c/d)");
		char tipoDeOrdenacao = sc.nextLine().charAt(0);
		if (tipoDeOrdenacao == 'c') {
			Collections.sort(lista);
			for (Participante participante : lista) {
				System.out.println(participante);
			}
		}else if(tipoDeOrdenacao == 'd') {
			Collections.sort(lista, new OrdenadorDecrescente());
			for (Participante participante : lista) {
				System.out.println(participante);
			}
		}
	}

}
