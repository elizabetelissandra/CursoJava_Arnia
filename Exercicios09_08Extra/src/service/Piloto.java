package service;

import java.text.DecimalFormat;

public class Piloto extends FuncionarioAerea {

	private String breve;
	private double bonusVoo;

	public Piloto(String nome, String registroFuncional, double salarioBase, String breve, double bonusVoo) {
		super(nome, registroFuncional, salarioBase);
		this.breve = breve;
		this.bonusVoo = bonusVoo;
	}

	public String getBreve() {
		return breve;
	}

	public void setBreve(String breve) {
		this.breve = breve;
	}

	public double getBonusVoo() {
		return bonusVoo;
	}

	public void setBonusVoo(double bonusVoo) {
		this.bonusVoo = bonusVoo;
	}

	public double salarioTotal() {
		return salarioBase + bonusVoo;

	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("#,000.00");
		return "Piloto :\n\nnome = " + nome + "\nregistro Funcional = " + registroFuncional + "\nsalario Base = R$"
				+ df.format(salarioBase) + "\nbreve = " + breve + "\nbonus Voo = R$" + df.format(bonusVoo) + "\nsalario Total = R$" + df.format(salarioTotal());
	}

}
