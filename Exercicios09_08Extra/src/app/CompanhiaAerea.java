package app;

import java.text.DecimalFormat;
import java.util.Iterator;

import service.ComissarioDeBordo;
import service.FuncionarioAerea;
import service.Piloto;

public class CompanhiaAerea {
	
	FuncionarioAerea funcionario1;
	FuncionarioAerea funcionario2;
	FuncionarioAerea funcionario3;
	
	public CompanhiaAerea(FuncionarioAerea funcionario1, FuncionarioAerea funcionario2, FuncionarioAerea funcionario3) {
		super();
		this.funcionario1 = funcionario1;
		this.funcionario2 = funcionario2;
		this.funcionario3 = funcionario3;
	}

	public String toString() {
		return "Funcionario 1: \n\n"
				+ funcionario1.toString() 
				+ "\n\nFuncionario 2: \n\n" + funcionario2.toString()
				+ "\n\nFuncionario 3: \n\n" + funcionario3.toString();
	}

	public double calcularMediaSalarios() {
		FuncionarioAerea[] funcionarios = {funcionario1, funcionario2, funcionario3};
		double soma = 0;
		for (int i = 0; i < funcionarios.length; i++) {
			if(funcionarios[i] instanceof Piloto) {
				soma += ((Piloto) funcionarios[i]).salarioTotal();
			}else if(funcionarios[i] instanceof ComissarioDeBordo) {
				soma += ((ComissarioDeBordo) funcionarios[i]).salarioTotal();
			}
		}
		
		return soma / funcionarios.length;
	}
	
	public void calcularRecebeMais() {
		FuncionarioAerea[] funcionarios = {funcionario1, funcionario2, funcionario3};
		double salarioAtual = 0;
		double maiorSalario =0;
		String nomeMaiorSalario = "";
		
		
		for (int i = 0; i < funcionarios.length; i++) {
			if(funcionarios[i] instanceof Piloto) {
				salarioAtual = ((Piloto)  funcionarios[i]).salarioTotal();
			}else if (funcionarios[i] instanceof ComissarioDeBordo) {
				salarioAtual = ((ComissarioDeBordo) funcionarios[i]).salarioTotal();
			}
			if(salarioAtual > maiorSalario) {
				maiorSalario = salarioAtual;
				nomeMaiorSalario = funcionarios[i].getNome();
			}
		}
		DecimalFormat df = new DecimalFormat("#,000.00");
		System.out.println("O funcionário "+ nomeMaiorSalario+ "recebe o maior salario no valor de R$ " +df.format(maiorSalario));
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//informacoes dos funcionarios
		
		String nome1 = "Daniel Rocha";
		String registroFuncional1 = "CA001";
		double salarioBase1 = 12000.00;
		String breve1 = "BRV-657489";
		double bonusVoo1 = 2500.00;
		
		Piloto funcionario1 = new Piloto(nome1, registroFuncional1,salarioBase1,breve1, bonusVoo1);

		String nome2 = "Patrícia Lemos";
		String registroFuncional2 = "CA002";
		double salarioBase2 = 11500.00;
		String breve2 = "BRV-482931";
		double bonusVoo2 = 3000.00;
		
		Piloto funcionario2 = new Piloto(nome2, registroFuncional2, salarioBase2, breve2, bonusVoo2);
		
		
		String nome3 = "Eduardo Nascimento";
		String registroFuncional3 = "CA003";
		double salarioBase3 = 5500.00;
		String[] idiomasFalados = {"Português", "Inglês", "Espanhol"};
		double adicionalInternacional = 1000.00;
		
		ComissarioDeBordo funcionario3 = new ComissarioDeBordo(nome3, registroFuncional3, salarioBase3, idiomasFalados, adicionalInternacional);
		
		CompanhiaAerea companhia = new CompanhiaAerea(funcionario1, funcionario2, funcionario3);
		
		
		//Mostrando os dados e o salario total
		System.out.println(companhia);
		
		//Media de salarios
		DecimalFormat df = new DecimalFormat("#,000.00");
		System.out.println("\n\nA média de salarios é de R$ " +df.format(companhia.calcularMediaSalarios()));
		
		//quem ganha mais
		
		companhia.calcularRecebeMais();
	}

}
