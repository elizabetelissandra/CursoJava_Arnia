package service;

public class Enfermeiro extends FuncionarioHospitalar{

	private String coren;
	private double valorHoraExtra;
	
	public Enfermeiro(String nome, String matricula, double salarioBase, String coren, double valorHoraExtra) {
		super(nome, matricula, salarioBase);
		this.coren = coren;
		this.valorHoraExtra = valorHoraExtra;
	}

	public String getCoren() {
		return coren;
	}

	public void setCoren(String coren) {
		this.coren = coren;
	}

	public double getValorHoraExtra() {
		return valorHoraExtra;
	}

	public void setValorHoraExtra(double valorHoraExtra) {
		this.valorHoraExtra = valorHoraExtra;
	}
	
	public double calcularSalarioTotal() {
		return getSalarioBase() + valorHoraExtra;
	}
	public String toString() {
	    return "Enfermeiro: " + nome +
	           "\nMatrícula: " + matricula +
	           "\nCoren: " + coren +
	           "\nSalário Base: R$ " + salarioBase +
	           "\nValor Hora Extra: R$ " + valorHoraExtra +
	           "\nSalário Total: R$ " + calcularSalarioTotal();
	}
	
}
