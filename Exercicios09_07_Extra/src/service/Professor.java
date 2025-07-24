package service;

public class Professor extends FuncionarioEscolar{
	private String disciplina;
	private double valorHoraAula;
	private int horasMinistradas;
	
	public Professor(String nome, String id, double salarioBase, String disciplina, double valorHoraAula, int horasMinistradas) {
		super(nome, id, salarioBase);
		this.disciplina = disciplina;
		this.valorHoraAula = valorHoraAula;
		this.horasMinistradas = horasMinistradas;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public double getValorHoraAula() {
		return valorHoraAula;
	}

	public void setValorHoraAula(double valorHoraAula) {
		this.valorHoraAula = valorHoraAula;
	}
	
	public int getHorasMinistradas() {
		return horasMinistradas;
	}

	public void setHorasMinistradas(int horasMinistradas) {
		this.horasMinistradas = horasMinistradas;
	}

	public double calcularSalarioTotal() {
		return salarioBase + (horasMinistradas * valorHoraAula);
	}

	public String toString() {
		return "Informações do Professor: \n"
				+"\nDisciplina=" + disciplina 
				+ "\nValor Hora  Aula=" + valorHoraAula 
				+ "\nHoras Ministradas="+ horasMinistradas 
				+ "\nNome=" + nome 
				+ "\nId=" + id 
				+ "\nSalario Base=" + salarioBase
				+ "\nSalario Total" + calcularSalarioTotal();
	}

	
	
	

}
