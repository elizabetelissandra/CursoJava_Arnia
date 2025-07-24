package service;

import java.text.DecimalFormat;

public class Gerente extends Empregado {

	private String departamento;

	public Gerente(String nome, double salario, String departamento) {
		super(nome, salario);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("#.00");
		return "O gerente " + getNome() + " do departamento " + departamento + ", recebe R$" + df.format(salario) + ".";
	}

}
