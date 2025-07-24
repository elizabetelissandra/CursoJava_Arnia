package service;

public class AssistenteAdministrativo extends Funcionario{

	private String departamento;
	private double adicionalNoturno;
	
	public AssistenteAdministrativo(String nome, String cpf, double salarioBase, String departamento, double adicionalNoturno) {
		super(nome, cpf, salarioBase);
		this.departamento =  departamento;
		this.adicionalNoturno = adicionalNoturno;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getAdicionalNoturno() {
		return adicionalNoturno;
	}

	public void setAdicionalNoturno(double adicionalNoturno) {
		this.adicionalNoturno = adicionalNoturno;
	}
	
	public double calcularSalarioTotal() {
		return salarioBase + adicionalNoturno;
	}
	
	public String toString() {
		return "O assistente administrativo "+nome+" com o cpf "+cpf+" tem as seguintes informacoes:\n"
	+"\nSalário Base: "+salarioBase+ "\nDepartamento: "+departamento+"\nAdicional Noturno: "+adicionalNoturno+
	"\nSalário Total: "+calcularSalarioTotal()+"\n";
	}
}
