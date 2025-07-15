package principal;

import java.util.Scanner;

import metodos.LogicaCadastroPessoas;

public class Cadastro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LogicaCadastroPessoas logica = new LogicaCadastroPessoas();
		
		System.out.println("Informe a quantidade de pessoas que sera resgistrada:");
		int qtdPessoas = sc.nextInt();
		
		String[] nomesCadastro = logica.cadastroNomes(qtdPessoas, sc);
		int[] idadesCadastro = logica.idadesCadastro(qtdPessoas, sc);
		
		System.out.println("A pessoa mais velha cadastrada é: "+nomesCadastro[logica.pessoaMaisVelha(idadesCadastro)]);
		System.out.println("Com "+idadesCadastro[logica.pessoaMaisVelha(idadesCadastro)]+" anos;");
	}

}
