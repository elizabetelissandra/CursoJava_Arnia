package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> nomes = new ArrayList<String>();
		
		for (int i = 0; i < 7; i++) {
			System.out.println("Informe o "+(i+1)+"º nome");
			String nome = sc.nextLine();
			nomes.add(nome);
			
		}
		Collections.sort(nomes, new Comparator<String>() {
		    @Override
		    public int compare(String p1, String p2) {
		        return p1.compareToIgnoreCase(p2);
		    }
		});
		
		for (String string : nomes) {
			System.out.println(string);
		}

		nomes.remove(3);
		
		System.out.println("------------Depois da exclusao---------");
		for (String string : nomes) {
			System.out.println(string);
		}
	}

}
