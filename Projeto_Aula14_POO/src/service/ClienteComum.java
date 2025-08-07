package service;

public class ClienteComum extends Cliente {

	public ClienteComum(int id, String nome) {
		super(id, nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double aplicarDesconto(double valor) {
		return valor;
	}

	@Override
	public String toString() {
		return "ClienteComum :\nId() = " + getId() + ",\nNome() = " + getNome() + ",\nHistorico de aluguel = "
				+ getHistoricoAluguel() + ",\nTipo de Cliente = Comum";
	}

}
