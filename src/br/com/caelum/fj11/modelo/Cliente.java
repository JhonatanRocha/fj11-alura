package br.com.caelum.fj11.modelo;

public class Cliente implements Autenticavel{
	private String nome;
	private String endereço;
	
	@Override
	public boolean autentica(int senha) {
		return false;
	}
}
