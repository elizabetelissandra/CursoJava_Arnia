package service;

public class FuncionarioEscolar {
	protected String nome;
	protected String id;
	protected double salarioBase;
	
	public FuncionarioEscolar(String nome, String id, double salarioBase) {
		super();
		this.nome = nome;
		this.id = id;
		this.salarioBase = salarioBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	

}
