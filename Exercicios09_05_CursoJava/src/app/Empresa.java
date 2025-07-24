package app;

import java.text.DecimalFormat;

import service.AssistenteAdministrativo;
import service.Engenheiro;
import service.Funcionario;

public class Empresa {

	private Funcionario funcionario1;
	private Funcionario funcionario2;
	private Funcionario funcionario3;

	public Empresa(Funcionario funcionario1, Funcionario funcionario2, Funcionario funcionario3) {
		super();
		this.funcionario1 = funcionario1;
		this.funcionario2 = funcionario2;
		this.funcionario3 = funcionario3;
	}

	public Funcionario getFuncionario1() {
		return funcionario1;
	}

	public void setFuncionario1(Funcionario funcionario1) {
		this.funcionario1 = funcionario1;
	}

	public Funcionario getFuncionario2() {
		return funcionario2;
	}

	public void setFuncionario2(Funcionario funcionario2) {
		this.funcionario2 = funcionario2;
	}

	public Funcionario getFuncionario3() {
		return funcionario3;
	}

	public void setFuncionario3(Funcionario funcionario3) {
		this.funcionario3 = funcionario3;
	}

	public double mediaSalario() {
		Funcionario[] funcionarios = { funcionario1, funcionario2, funcionario3 };
		double soma = 0;

		for (int i = 0; i < funcionarios.length; i++) {
			if (funcionarios[i] instanceof Engenheiro) {
				soma += ((Engenheiro) funcionarios[i]).calcularSalarioTotal();
			} else if (funcionarios[i] instanceof AssistenteAdministrativo) {
				soma += ((AssistenteAdministrativo) funcionarios[i]).calcularSalarioTotal();
			}
		}
		return soma / funcionarios.length;
	}
	
	public String maiorSalarioFinal() {
		Funcionario[] funcionarios = { funcionario1, funcionario2, funcionario3 };
		double maiorSalario = 0;
		double salarioAtual = 0;
		String nomeMaiorSalario = "";
		
		for (int i = 0; i < funcionarios.length; i++) {
			if(funcionarios[i] instanceof Engenheiro) {
				salarioAtual = ((Engenheiro) funcionarios[i]).calcularSalarioTotal();
			}else {
				salarioAtual = ((AssistenteAdministrativo) funcionarios[i]).calcularSalarioTotal();
			}
			
			if(salarioAtual > maiorSalario) {
				maiorSalario = salarioAtual;
				nomeMaiorSalario = funcionarios[i].getNome();
				System.out.println("nome do funcionario teste"+ funcionarios[i].getNome());
			}
		}
		return "O funcionário "+nomeMaiorSalario+", recebe o maior salário no valor de R$ "+maiorSalario;
	}

	public String toString() {
		return "Funcionário 1: " + funcionario1.toString() + "\nFuncionario 2: " + funcionario2.toString()
				+ "\nFuncionario 3: " + funcionario3.toString();
	}

	public static void main(String[] args) {
		// Dados do primeiro funcionario

		String nome = "Rafael Monteiro";
		String cpf = "123.456.789-00";
		double salarioBase = 7800;
		String crea = "RJ-859632";
		double bonusProjeto = 1500;

		Funcionario funcionario1 = new Engenheiro(nome, cpf, salarioBase, crea, bonusProjeto);

		String nome2 = "Camila Sampaio";
		String cpf2 = "987.654.321-00";
		double salarioBase2 = 8200;
		String crea2 = "SP-478215";
		double bonusProjeto2 = 2000;

		Funcionario funcionario2 = new Engenheiro(nome2, cpf2, salarioBase2, crea2, bonusProjeto2);

		String nome3 = "Bruno Silva";
		String cpf3 = "321.654.987-00";
		double salarioBase3 = 4000;
		String departamento = "Recursos Humanos";
		double adicionalNoturno = 600;

		Funcionario funcionario3 = new AssistenteAdministrativo(nome3, cpf3, salarioBase3, departamento,
				adicionalNoturno);

		Empresa empresa = new Empresa(funcionario1, funcionario2, funcionario3);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println(empresa);
		System.out.println("A média dos salários é R$ "+df.format(empresa.mediaSalario()));
		System.out.println(empresa.maiorSalarioFinal());
	}

}
