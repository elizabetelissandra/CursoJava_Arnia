package service;

import java.text.DecimalFormat;

public class Vendedor extends Empregado {

	private float percentualComissao;

	public Vendedor(String nome, double salario, float percentualComisao) {
		super(nome, salario);
		this.percentualComissao = percentualComisao;
	}

	public float getPercentualComissao() {
		return percentualComissao;
	}

	public void setPercentualComissao(float percentualComissao) {
		this.percentualComissao = percentualComissao;
	}

	public double calcularSalario() {
		return salario + (salario * (percentualComissao / 100));
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("#.00");
		return "O Vendedor " + getNome() + " tem o salário R$ " + df.format(salario) + " e agora recebe R$"
				+ df.format(calcularSalario()) + " devido ao percentual " + percentualComissao + "% de Comissão";
	}

}
