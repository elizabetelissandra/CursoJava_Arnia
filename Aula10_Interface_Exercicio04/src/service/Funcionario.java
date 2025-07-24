package service;

public abstract class Funcionario {

	protected String nome;
	protected double salario;
	
	
	
	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}



	public abstract double calcularBonus();
}
