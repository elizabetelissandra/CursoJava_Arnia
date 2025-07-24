package service;

public class Coordenador extends FuncionarioEscolar{
	
	private String area;
	private double bonusCoordenacao;
	
	public Coordenador(String nome, String id, double salarioBase, String area, double bonusCoordenacao) {
		super(nome, id, salarioBase);
		this.area = area;
		this.bonusCoordenacao = bonusCoordenacao;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double getBonusCoordenacao() {
		return bonusCoordenacao;
	}

	public void setBonusCoordenacao(double bonusCoordenacao) {
		this.bonusCoordenacao = bonusCoordenacao;
	}
	
	public double bonusSalarial() {
		return salarioBase + bonusCoordenacao;
	}

	public String toString() {
		return "Informações do Coordenador:"+"\n\nArea=" + area 
				+ "\nBonus Coordenacao=" + bonusCoordenacao 
				+ "\nNome=" + nome + "\nId=" + id
				+ "\nSalario Base=" + salarioBase 
				+ "\nBonus Salarial=" + bonusSalarial();
	}
	
	
	
}
