package br.com.caelum.fj11.programa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import br.com.caelum.fj11.modelo.Conta;

public class TestaColecoes {
	public static void main(String[] args) {
		//ArrayList<String> nomes = new ArrayList<String>();
		//List<String> nomes = new LinkedList<String>();
		Set<String> nomes = new HashSet<String>();
		nomes.add("Mauricio");
		nomes.add("Guilherme");
		nomes.add("Guilherme");
		
		System.out.println(nomes.size());
		
		/*System.out.println(nomes.get(0));
		System.out.println(nomes.contains("Guilherme"));*/
		
		/*for(int i = 0; i < nomes.size(); i++){
			System.out.println(nomes.get(i));
		}*/
	/*	
		for(String nome : nomes){
			System.out.println(nome);
		}
		
		//Collections.sort(nomes);
		
		System.out.println("Ordenado: ");
		
		for(String nome : nomes){
			System.out.println(nome);
		}
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		Conta c1 = new Conta(1500.0);
		Conta c2 = new Conta(700.0);
		contas.add(c1);
		contas.add(c2);
		
		Collections.sort(contas);
		
		for(Conta c : contas){
			System.out.println(c);
		}
		
		//System.out.println(contas.get(1));
		*/
		
		/*Set<Conta> contas = new HashSet<Conta>();
		Conta c1 = new Conta(200.0);
		Conta c2 = new Conta(200.0);
		contas.add(c1);
		contas.add(c1);
		contas.add(c2);
		
		System.out.println(contas.size());*/
		
		Map<String, Conta> contas = new HashMap<String, Conta>();
		Conta c1 = new Conta(200.0);
		Conta c2 = new Conta(500.0);
		contas.put("Diretor", c1);
		contas.put("Gerente", c2);
		
		System.out.println(contas.get("Diretor").getSaldo());
		System.out.println(contas.get("Gerente").getSaldo());
		System.out.println(contas.size());
		
	}
}
