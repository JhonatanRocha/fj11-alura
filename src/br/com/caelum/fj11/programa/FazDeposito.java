package br.com.caelum.fj11.programa;

import br.com.caelum.fj11.excecao.ValorInvalidoException;
import br.com.caelum.fj11.modelo.Conta;

public class FazDeposito implements Runnable {

	private final Conta conta;
	
	public FazDeposito(Conta conta){
		this.conta = conta;
	}
	
	@Override
	public void run() {
		try {
			conta.deposita(100.0);
		} catch (ValorInvalidoException e) {
			e.getMessage();
		}
	}

}
