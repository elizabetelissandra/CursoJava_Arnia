package app;

import java.util.Scanner;

import service.Funcionario;

public class DadosFuncionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		
		
		System.out.println("Informe os dados do funcionário");
		System.out.println("Digite o nome:");
		String nome = sc.nextLine();
		
		System.out.println("Digite o salário bruto:");
		double salarioBruto = sc.nextDouble();
		
		System.out.println("Digite o imposto");
		double imposto = sc.nextDouble();
		
		funcionario.nome = nome;
		funcionario.salarioBruto = salarioBruto;
		funcionario.imposto = imposto;
		
		System.out.println("Funcionário: "+funcionario);
		
		System.out.println("Porcentagem para aumentar o salario:");
		double porcentagem = sc.nextDouble();
		funcionario.aumentoDeSalario(porcentagem);
		
		System.out.println("Informações atualizadas: "+funcionario);
		
		

	}

}
