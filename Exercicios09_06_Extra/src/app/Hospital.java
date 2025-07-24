package app;

import java.text.DecimalFormat;

import service.Enfermeiro;
import service.FuncionarioHospitalar;
import service.Medico;

public class Hospital {

	FuncionarioHospitalar funcionario1;
	FuncionarioHospitalar funcionario2;
	FuncionarioHospitalar funcionario3;

	public Hospital(FuncionarioHospitalar funcionario1, FuncionarioHospitalar funcionario2,
			FuncionarioHospitalar funcionario3) {
		super();
		this.funcionario1 = funcionario1;
		this.funcionario2 = funcionario2;
		this.funcionario3 = funcionario3;
	}

	public FuncionarioHospitalar getFuncionario1() {
		return funcionario1;
	}

	public void setFuncionario1(FuncionarioHospitalar funcionario1) {
		this.funcionario1 = funcionario1;
	}

	public FuncionarioHospitalar getFuncionario2() {
		return funcionario2;
	}

	public void setFuncionario2(FuncionarioHospitalar funcionario2) {
		this.funcionario2 = funcionario2;
	}

	public FuncionarioHospitalar getFuncionario3() {
		return funcionario3;
	}

	public void setFuncionario3(FuncionarioHospitalar funcionario3) {
		this.funcionario3 = funcionario3;
	}
	
	public double mediaSalarios() {
		double soma = 0;
		FuncionarioHospitalar[] funcionarios = {funcionario1, funcionario2, funcionario3};
		
		for (int i = 0; i < funcionarios.length; i++) {
			if(funcionarios[i] instanceof Medico) {
				soma += ((Medico) funcionarios[i]).calcularSalarioTotal();			
			}else if(funcionarios[i] instanceof Enfermeiro) {
				soma += ((Enfermeiro) funcionarios[i]).calcularSalarioTotal();
				
			}
		}
		return soma/funcionarios.length;
	}
	
	public String salarioMaisAlto() {
		FuncionarioHospitalar[] funcionarios = {funcionario1, funcionario2, funcionario3};
		double maiorSalario = 0;
		double salarioAtual = 0;
		String nomeSalarioAlto = "";
		
		for (int i = 0; i < funcionarios.length; i++) {
			if(funcionarios[i] instanceof Medico) {
				salarioAtual = ((Medico)funcionarios[i]).calcularSalarioTotal();				
			}else if(funcionarios[i] instanceof Enfermeiro) {
				salarioAtual = ((Enfermeiro) funcionarios[i]).calcularSalarioTotal();
			}
			
			if(salarioAtual > maiorSalario) {
				maiorSalario = salarioAtual;
				nomeSalarioAlto = funcionarios[i].getNome();
			}
		}
		return "O funcionário "+nomeSalarioAlto+", recebe o maior salário no valor de R$ "+maiorSalario;
	}
	
	public String toString() {
		return "Funcionário 1: \n\n"+funcionario1.toString()+"\n\nFuncionário 2: \n\n"+funcionario2.toString()+"\n\nFuncionario 3: \n\n"+funcionario3.toString();
	}

	public static void main(String[] args) {

		//Dados dos funcionarios
		
		String nome1 = "Dr. Lucas Andrade";
		String matricula1 = "H00123";
		double salarioBase1 = 9500;
		String crm1 = "MG-345678";
		double valorPlantao1 = 2000;
		
		Medico funcionario1 = new Medico(nome1, matricula1, salarioBase1, crm1,valorPlantao1);
		
		String nome2 = "Dra. Fernanda Teixeira";
		String matricula2 = "H00456";
		double salarioBase2 = 10200;
		String crm2 = "SP-892734";
		double valorPlantao2 = 1800;
		
		Medico funcionario2 = new Medico(nome2, matricula2, salarioBase2, crm2, valorPlantao2);
		
		String nome3 = "Carlos Medeiros";
		String matricula3 = "H00789";
		double salarioBase3 = 5800;
		String coren = "RJ-556912";
		double valorHoraExtra = 950;
		
		Enfermeiro funcionario3 = new Enfermeiro(nome3, matricula3, salarioBase3, coren, valorHoraExtra);
		
		Hospital hospital = new Hospital(funcionario1, funcionario2, funcionario3);
		
		System.out.println(hospital.toString());
		
		DecimalFormat df = new DecimalFormat("#,000.00");
		System.out.println("\nA média dos salários é R$ "+df.format(hospital.mediaSalarios()));
		System.out.println("\n"+hospital.salarioMaisAlto());
	}

}
