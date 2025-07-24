package service;

public class Medico extends FuncionarioHospitalar {

	private String crm;
	private double valorPlantao;

	public Medico(String nome, String matricula, double salarioBase, String crm, double valorPlantao) {
		super(nome, matricula, salarioBase);
		this.crm = crm;
		this.valorPlantao = valorPlantao;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public double getValorPlantao() {
		return valorPlantao;
	}

	public void setValorPlantao(double valorPlantao) {
		this.valorPlantao = valorPlantao;
	}

	public double calcularSalarioTotal() {
		return getSalarioBase() + valorPlantao;
	}
	

	public String toString() {
	    return "Médico: " + nome +
	           "\nMatrícula: " + matricula +
	           "\nCRM: " + crm +
	           "\nSalário Base: R$ " + salarioBase +
	           "\nValor Plantão: R$ " + valorPlantao +
	           "\nSalário Total: R$ " + calcularSalarioTotal();
	}

}
