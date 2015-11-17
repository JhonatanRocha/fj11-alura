package br.com.caelum.fj11.programa;

import br.com.caelum.fj11.modelo.Cliente;
import br.com.caelum.fj11.modelo.Conta;
import br.com.caelum.fj11.modelo.GuardadorDeObjetos;

public class TestaJavaLang {
	public static void main(String[] args) {
		
		double pi = 3.14;
		
		long numeroArredondado = Math.round(pi);
		
		System.out.println(numeroArredondado);
		
		/*String curso = "fj11";
		curso = curso.replace("j", "k");
		curso = curso.toUpperCase();
		
		System.out.println(curso);*/
		
		/*Conta c1 = new Conta(500);
		Conta c2 = new Conta(500);
		
		GuardadorDeObjetos guardador = new GuardadorDeObjetos();
		guardador.adiciona(c1);
		guardador.adiciona(c2);
		
		Cliente jhol = new Cliente();
		guardador.adiciona(jhol);
		
		
		Conta c1NoGuardador = (Conta) guardador.pega(0);
		Conta c2NoGuardador = (Conta) guardador.pega(1);
		
		Cliente jholNoGuardador = (Cliente) guardador.pega(2);
		
		System.out.println(c1);
		
		if(c1.equals(c2)){
			System.out.println("São iguais");
		}else {
			System.out.println("São diferentes");
		}*/
	}
}
