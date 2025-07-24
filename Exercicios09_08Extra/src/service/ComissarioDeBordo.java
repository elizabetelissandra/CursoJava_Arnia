package service;

import java.text.DecimalFormat;
import java.util.Arrays;

public class ComissarioDeBordo extends FuncionarioAerea {

	private String[] idiomas;
	private double adicionalInternacional;
	
	public ComissarioDeBordo(String nome, String registroFuncional, double salarioBase, String[] idiomas,
			double adicionalInternacional) {
		super(nome, registroFuncional, salarioBase);
		this.idiomas = idiomas;
		this.adicionalInternacional = adicionalInternacional;
	}

	public String[] getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(String[] idiomas) {
		this.idiomas = idiomas;
	}

	public double getAdicionalInternacional() {
		return adicionalInternacional;
	}

	public void setAdicionalInternacional(double adicionalInternacional) {
		this.adicionalInternacional = adicionalInternacional;
	}
	
	public double salarioTotal() {
		return salarioBase + adicionalInternacional;
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("#,000.00");
		return "Comissario De Bordo:\n\nnome = " + nome + "\nregistro Funcional = " + registroFuncional + "\nsalario Base = R$"
				+ df.format(salarioBase) + "\nidiomas = " + (idiomas != null ? Arrays.asList(idiomas) : null)
				+ "\nadicional Internacional = R$" + df.format(adicionalInternacional) + "\nsalario Total = R$" + df.format(salarioTotal());
	}

	
	
	
	
}
