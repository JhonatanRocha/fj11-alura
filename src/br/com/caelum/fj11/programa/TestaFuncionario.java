package br.com.caelum.fj11.programa;

import br.com.caelum.fj11.modelo.Gerente;
import br.com.caelum.fj11.modelo.TotalizadorDeBonus;

public class TestaFuncionario{
	public static void main(String[] args){

		Gerente joao = new Gerente();
		joao.setSalario(2000.0);
		joao.cobraEntrega();
		System.out.println("Bonus: " + joao.getBonus());
		
		TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
		totalizador.adiciona(joao);
		
		System.out.println("Total de Bonus: " + totalizador.getTotal());
	}
}
