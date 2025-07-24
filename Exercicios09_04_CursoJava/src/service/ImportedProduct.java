package service;

import java.text.DecimalFormat;

public class ImportedProduct extends Product {
	
	private double customFee;
	
	public ImportedProduct(String name, double price,double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(double customFee) {
		this.customFee = customFee;
	}
	
	private double calculoImportacao() {
		return price + customFee;
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.00");
		return getName() + " R$"+df.format(calculoImportacao()) + " (Customs fee: R$ "+customFee;
	}
	
}
