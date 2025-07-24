package service;

public class FuncionarioAerea {
	
	protected String nome;
	protected String registroFuncional;
	protected double salarioBase;
	
	public FuncionarioAerea(String nome, String registroFuncional, double salarioBase) {
		super();
		this.nome = nome;
		this.registroFuncional = registroFuncional;
		this.salarioBase = salarioBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRegistroFuncional() {
		return registroFuncional;
	}

	public void setRegistroFuncional(String registroFuncional) {
		this.registroFuncional = registroFuncional;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	

}
