package br.com.caelum.fj11.modelo;

public class Developer extends Funcionario {
	
	public double getBonus(){
		return this.salario * 0.25;
	}
}
