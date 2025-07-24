package app;

import java.text.DecimalFormat;

import service.Coordenador;
import service.FuncionarioEscolar;
import service.Professor;

public class Escola {

	 FuncionarioEscolar funcionario1;
	 FuncionarioEscolar funcionario2;
	 FuncionarioEscolar funcionario3;

	public Escola(FuncionarioEscolar funcionario1, FuncionarioEscolar funcionario2, FuncionarioEscolar funcionario3) {
		super();
		this.funcionario1 = funcionario1;
		this.funcionario2 = funcionario2;
		this.funcionario3 = funcionario3;
	}

	public FuncionarioEscolar getFuncionario1() {
		return funcionario1;
	}

	public void setFuncionario1(FuncionarioEscolar funcionario1) {
		this.funcionario1 = funcionario1;
	}

	public FuncionarioEscolar getFuncionario2() {
		return funcionario2;
	}

	public void setFuncionario2(FuncionarioEscolar funcionario2) {
		this.funcionario2 = funcionario2;
	}

	public FuncionarioEscolar getFuncionario3() {
		return funcionario3;
	}

	public void setFuncionario3(FuncionarioEscolar funcionario3) {
		this.funcionario3 = funcionario3;
	}
	
	public String toString() {
		return "Dados dos funcionários: \n"
				+ "\nFuncionário 1: " + funcionario1.toString()
				+ "\n\nFuncionario 2: " + funcionario2.toString()
				+ "\n\nFuncionário 3: " + funcionario3.toString();
	}
	
	public double calcularMediaSalario() {
		FuncionarioEscolar[] funcionario= {funcionario1,funcionario2,funcionario3};
		double soma = 0;
		for (int i = 0; i < funcionario.length; i++) {
			if(funcionario[i] instanceof Professor) {
				soma += ((Professor) funcionario[i]).calcularSalarioTotal();
			}else if(funcionario[i] instanceof Coordenador) {
				soma += ((Coordenador) funcionario[i]).bonusSalarial();
			}
		}
		return soma / funcionario.length;
	}
	
	public void calcularRecebeMais() {
		FuncionarioEscolar[] funcionario= {funcionario1,funcionario2,funcionario3};
		double maiorSalario = 0;
		double salarioAtual = 0;
		String nomeMaiorSalario = "";
		
		for (int i = 0; i < funcionario.length; i++) {
			if(funcionario[i] instanceof Professor) {
				salarioAtual = ((Professor) funcionario[i]).calcularSalarioTotal();
			}else if(funcionario[i] instanceof Coordenador){
				salarioAtual = ((Coordenador) funcionario[i]).bonusSalarial();
			}
			if(salarioAtual > maiorSalario) {
				maiorSalario = salarioAtual;
				nomeMaiorSalario = funcionario[i].getNome();
			}
		}
		System.out.println("O maior salário atual é do funcionário: "+ nomeMaiorSalario + 
				"\ne recebe o valor de R$ "+maiorSalario);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Informacoes dos funcionarios
		
		String nome1 = "Marcos Oliveira";
		String id1 = "P001";
		double salarioBase1 = 3000.00;
		String disciplina1 = "Matemática";
		double valorHoraAula1 = 50.00;
		int horasMinistradas1 = 20;
		
		Professor funcionario1 = new Professor(nome1, id1, salarioBase1, disciplina1, valorHoraAula1, horasMinistradas1);
		
		String nome2 = "Renata Vieira";
		String id2 = "P002";
		double salarioBase2 = 3200.00;
		String disciplina2 = "História";
		double valorHoraAula2 = 40.00;
		int horasMinistradas2 = 25;
		
		Professor funcionario2 = new Professor(nome2, id2, salarioBase2, disciplina2, valorHoraAula2, horasMinistradas2);
		
		String nome3 = "João Batista";
		String id3 = "C001";
		double salarioBase3 = 4000.00;
		String area = "Coordenação Pedagógica";
		double bonusCoordenacao = 1500.00;
		
		Coordenador funcionario3 = new Coordenador(nome3, id3, salarioBase3, area, bonusCoordenacao);
		
		Escola funcionario = new Escola(funcionario1, funcionario2, funcionario3);
		
		//Informacoes dos funcionarios
		
		System.out.println(funcionario);
		
		//Calculando a media dos salarios
		
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("\nA média dos salários é de: R$ "+df.format(funcionario.calcularMediaSalario())+"\n");
		
		//Mostrando quem recebe mais
		
		funcionario.calcularRecebeMais();
		
	}

}
