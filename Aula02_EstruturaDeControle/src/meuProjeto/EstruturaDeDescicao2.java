package meuProjeto;

import java.util.Scanner;

public class EstruturaDeDescicao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Informe três números:");
		Scanner sc  = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if(n1 >  n2 && n1> n3) {
			System.out.println(n1+ " é o maior número.");
		}else if(n2> n1 && n2>n3) {
			System.out.println(n2+ " é o maior número");
		}else {
			System.out.println(n3+" é o meior número.");
		}
	}

}
