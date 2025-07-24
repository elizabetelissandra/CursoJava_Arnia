package service;

public class SmartTV extends Dispositivo implements Controlavel  {

	public SmartTV(String nome, String fabricante) {
		super(nome, fabricante);
	}

	public void ligar() {
		System.out.println("Ligando o SmartTv");
		
	}

	public void desligar() {
		System.out.println("Desligando o SmartTv");
		
	}

	public void realizarDiagnostico() {
		System.out.println("Realizando diagnostico no SmartTv");
		
	}

	
}
