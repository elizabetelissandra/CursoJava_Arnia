package service;

import java.util.Comparator;

public class Livro implements Comparable<Livro>{

	protected String livro;
	protected String autor;
	protected int anoPublicacao;
	
	public Livro(String livro, String autor, int anoPublicacao) {
		super();
		this.livro = livro;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}

	public String getLivro() {
		return livro;
	}

	public void setLivro(String livro) {
		this.livro = livro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	@Override
	public String toString() {
	    return livro + " - " + autor + " (" + anoPublicacao + ")";
	}

	@Override
	public int compareTo(Livro outro) {
		if(this.anoPublicacao < outro.anoPublicacao) {
			return -1;
		}
		if(this.anoPublicacao > outro.anoPublicacao) {
			return 1;
		}
		return 0;
	}
}
