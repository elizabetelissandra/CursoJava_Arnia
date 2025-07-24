package service;

import java.util.Iterator;

public class ValidarSenha implements ValidadorSenha {

	public boolean senhaValida(String senha) {
		if(senha.length() < 8) return false;
		
		boolean maiuscula = false;
		boolean numero = false;
		
		 for (int i = 0; i < senha.length(); i++) {
	            char c = senha.charAt(i);
	            if (Character.isUpperCase(c)) maiuscula = true;
	            if (Character.isDigit(c)) numero = true;
	        }

		return maiuscula && numero;
	}

}
