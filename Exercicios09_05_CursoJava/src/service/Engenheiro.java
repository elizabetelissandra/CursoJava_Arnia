package service;

public class Engenheiro extends Funcionario{

	private String crea;
	private double bonusProjeto;
	
	
	public Engenheiro(String nome, String cpf, double salarioBase, String crea, double bonusProjeto) {
		super(nome, cpf, salarioBase);
		this.crea = crea;
		this.bonusProjeto = bonusProjeto;
	}


	public String getCrea() {
		return crea;
	}


	public void setCrea(String crea) {
		this.crea = crea;
	}


	public double getBonusProjeto() {
		return bonusProjeto;
	}


	public void setBonusProjeto(double bonusProjeto) {
		this.bonusProjeto = bonusProjeto;
	}


	public double calcularSalarioTotal() {
		return salarioBase + bonusProjeto;
	}
	
	public String toString() {
		return "O engenheiro "+nome+" com o cpf "+cpf+" tem as seguintes informacoes:\n"
	+"\nSalário Base: "+salarioBase+ "\nCrea: "+crea+"\nBonus de Projeto: "+bonusProjeto+
	"\nSalário Total: "+calcularSalarioTotal()+"\n"; 
		
	}
}
