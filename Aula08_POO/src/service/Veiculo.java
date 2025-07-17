package service;

public class Veiculo {
	
	public String marca;
	public String modelo;
	public int ano;
	
	public String montaInformacoes() {
		return "Marca: "+marca+"  Modelo: "+modelo+"  Ano: "+ano;
	}
}
