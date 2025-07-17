package service;

import java.text.DecimalFormat;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;

	public double salarioLiquido() {
		return salarioBruto - imposto;
	}

	public double aumentoDeSalario(double porcentagem) {
		return salarioBruto += salarioBruto * (porcentagem / 100);
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("#,000.00");
		return nome + ", recebe o valor líquido R$ " + df.format(salarioLiquido());
	}
}
