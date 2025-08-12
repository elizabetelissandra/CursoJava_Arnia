package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroProdutos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> produtos = new ArrayList<String>();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o nome do "+(i+1)+"º produto: ");
			String nome = sc.nextLine();
			produtos.add(nome);
			
		}
		
		for (String string : produtos) {
			System.out.println(string);
		}

	}

}
