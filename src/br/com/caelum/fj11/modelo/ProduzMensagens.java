package br.com.caelum.fj11.modelo;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

public class ProduzMensagens implements Runnable {

	private int comeco;
    private int fim;
    //private Collection<String> mensagens;
    //private Vector<String> mensagens;
    //private HashSet<String> mensagens;
    private LinkedList<String> mensagens;
    
    public ProduzMensagens(int comeco, int fim, LinkedList<String> mensagens) {
        this.comeco = comeco;
        this.fim = fim;
        this.mensagens = mensagens;
    }
    
    /*
    public ProduzMensagens(int comeco, int fim, HashSet<String> mensagens) {
        this.comeco = comeco;
        this.fim = fim;
        this.mensagens = mensagens;
    }*/
    
   /* 
    public ProduzMensagens(int comeco, int fim, HashSet<String> mensagens) {
        this.comeco = comeco;
        this.fim = fim;
        this.mensagens = mensagens;
    }
    
    public ProduzMensagens(int comeco, int fim, Collection<String> mensagens) {
        this.comeco = comeco;
        this.fim = fim;
        this.mensagens = mensagens;
    }
    
    public ProduzMensagens(int comeco, int fim, Vector<String> mensagens) {
        this.comeco = comeco;
        this.fim = fim;
        this.mensagens = mensagens;
    }*/
/*
    public void run() {
        for (int i = comeco; i < fim; i++) {
            syncronized(mensagens) {
                mensagens.add("Mensagem " + i);
            }
        }
    }
*/
    public void run() {
        for (int i = comeco; i < fim; i++) {
            mensagens.add("Mensagem " + i);
        }
    }
}
