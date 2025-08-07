package service;

public class ClienteFrequente extends Cliente {

	public ClienteFrequente(int id, String nome) {
		super(id, nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double aplicarDesconto(double valor) {
		return valor * 0.85;
	}

	@Override
	public String toString() {
		return "ClienteFrequente :\nId() = " + getId() + ",\nNome() = " + getNome() + ",\nLista d∈ alugueis() = "
				+ getHistoricoAluguel() + ",\nTipo de Cliente = Frequente ";

	}

}
