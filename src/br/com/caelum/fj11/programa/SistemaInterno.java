package br.com.caelum.fj11.programa;

import br.com.caelum.fj11.modelo.Autenticavel;

public class SistemaInterno {
	public void autentica(Autenticavel f) {
		int senha = 123;
		
		if(f.autentica(senha) == true){
			System.out.println("Bem vindo ao Sistema");
		}else {
			System.out.println("senha incorreta");
		}
	}
}
