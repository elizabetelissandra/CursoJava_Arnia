package service;

import java.util.Random;

public abstract class Cliente{
	
	private String id;
	private String email;
	private String nome;


	public Cliente(String email, String nome) {
		super();
		this.id = Long.toHexString(new Random().nextLong());
		this.email = email;
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract double aplicarDesconto(double total);


	@Override
	public String toString() {
		return "Cliente: " + nome + " | Email: " + email + " | ID: " + id;

	}
	

}
