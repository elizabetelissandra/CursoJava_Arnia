package service;

public class Vendedor extends Funcionario {

	public Vendedor(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}
	

	public double calcularBonus() {
		return salario + (salario*0.90);
	}

	public String toString() {
		return "Vendedor [nome=" + nome + ", salario=" + salario + ", calcularBonus()=" + calcularBonus() + "]";
	}

}
