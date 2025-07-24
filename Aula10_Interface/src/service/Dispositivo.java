package service;

public abstract class Dispositivo implements Controlavel {
	
	private String nome;
	private String fabricante;
	
	public Dispositivo(String nome, String fabricante) {
		super();
		this.nome = nome;
		this.fabricante = fabricante;
	}
	
	public String exibirInformacoes() {
		return "Nome = "+  nome + " e o fabricante é: " +fabricante;
	}
	
	public abstract void realizarDiagnostico();
	
	

}
