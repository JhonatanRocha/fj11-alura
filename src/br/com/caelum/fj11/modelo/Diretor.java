package br.com.caelum.fj11.modelo;

public class Diretor extends Funcionario implements Autenticavel{
	
	public double getBonus(){
		return this.salario * 0.35;
	}
	
	public void cobraRelatorios(){
		System.out.println("Preciso dos Relatorios.");
	}
	
	@Override
	public boolean autentica(int senha) {
		return false;
	}
}
