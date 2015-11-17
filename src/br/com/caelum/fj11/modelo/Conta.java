package br.com.caelum.fj11.modelo;

import br.com.caelum.fj11.excecao.SaldoInsuficienteException;
import br.com.caelum.fj11.excecao.ValorInvalidoException;

public class Conta implements Comparable<Conta>{
	
	private double saldo;
    private String titular;
    private int agencia;
    private int numero;
	
    public Conta(double saldo){
    	this.saldo = saldo;
    }
    
	public synchronized void deposita(double valorASerDepositado) throws ValorInvalidoException {		
		if (valorASerDepositado < 0) {
	        throw new ValorInvalidoException(valorASerDepositado);
	    } else {
	    	this.saldo += valorASerDepositado - 0.1;      
	    } 
	}
	
	/**
	 * Realiza um saque na conta, dado o valor passado
	 * @param valorASerSacado valor a ser sacado
	 * @throws Exception caso o saldo seja insuficiente
	 */
	public void saca(double valorASerSacado) throws Exception{
		if(saldo >= valorASerSacado){
			this.saldo -= valorASerSacado;
		}else {
			throw new SaldoInsuficienteException(saldo);
		}
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void atualiza(double taxa) {
		
	}
	
	@Override
	public String toString() {
		return "Conta com Saldo " + saldo;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (Double.doubleToLongBits(saldo) != Double
				.doubleToLongBits(other.saldo))
			return false;
		return true;
	}

	@Override
	public int compareTo(Conta outraConta) {
		if(this.saldo < outraConta.getSaldo() || this.numero < outraConta.numero){
			return -1;
		}
		if(this.saldo > outraConta.getSaldo() || this.numero > outraConta.numero){
			return 1;
		}
		return 0;
	}
}
