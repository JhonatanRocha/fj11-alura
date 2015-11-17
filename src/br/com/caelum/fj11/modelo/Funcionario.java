package br.com.caelum.fj11.modelo;

public abstract class Funcionario {
	private String nome;
	protected double salario;
	private int senha;
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}

	public abstract double getBonus();

	public boolean autentica(int senha) {
		return this.senha == senha;
	}
}