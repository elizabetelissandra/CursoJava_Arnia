package service;

public class FuncionarioHospitalar {
	
	protected String nome;
	protected String matricula;
	protected double salarioBase;
    
	public FuncionarioHospitalar(String nome, String matricula, double salarioBase) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.salarioBase = salarioBase;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
    
}
