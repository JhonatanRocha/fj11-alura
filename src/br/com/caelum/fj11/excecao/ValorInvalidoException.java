package br.com.caelum.fj11.excecao;

public class ValorInvalidoException extends Exception {
	
	public ValorInvalidoException(double valorInvalido){
		super("Valor invalido: " + valorInvalido);
	}
}
