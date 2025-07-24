package service;

public class Gerente extends Funcionario {

	public Gerente(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularBonus() {
		return salario + (salario * 0.80);
	}

	public String toString() {
		return "Gerente [nome=" + nome + ", salario=" + salario + ", calcularBonus()=" + calcularBonus() + "]";
	}

}
