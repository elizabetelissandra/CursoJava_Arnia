package service;

public class Tarefas implements Comparable<Tarefas>{

	protected String descricao;
	protected boolean concluida;
	
	public Tarefas(String descricao, boolean concluida) {
		super();
		this.descricao = descricao;
		this.concluida = concluida;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isConcluida() {
		return concluida;
	}

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}
	
	@Override
	public int compareTo(Tarefas o) {
		return o.descricao.compareToIgnoreCase(o.getDescricao());
	}

	@Override
	public String toString() {
		return "Tarefas [descricao = " + descricao + ", concluida = " + concluida + "]";
	}

	
	
	
	
}
