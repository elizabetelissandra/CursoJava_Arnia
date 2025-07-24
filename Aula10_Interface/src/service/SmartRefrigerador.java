package service;

public class SmartRefrigerador extends Dispositivo implements Controlavel{

	public SmartRefrigerador(String nome, String fabricante) {
		super(nome, fabricante);
		// TODO Auto-generated constructor stub
	}

	public void ligar() {
		System.out.println("Ligando o SmartRefrigerador");
		
	}

	public void desligar() {
		System.out.println("Desligando o SmartRefrigerador");
		
	}

	public void realizarDiagnostico() {
		System.out.println("Realizando diagnostico no SmartRefrigerador");
		
	}

	
}
