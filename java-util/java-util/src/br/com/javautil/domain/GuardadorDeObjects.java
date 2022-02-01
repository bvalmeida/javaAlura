package br.com.javautil.domain;

import br.com.bytebank.herdado.conta.modelo.Conta;

public class GuardadorDeObjects {
	
	private Object[] referenciasObject;
	private int posicaoLivreObject;
	
	public GuardadorDeObjects() {
		this.referenciasObject = new Object[10];
		this.posicaoLivreObject = 0;
	}
	
	public void adiciona(Conta cc) {
		this.referenciasObject[posicaoLivreObject] = cc;
		this.posicaoLivreObject++;
	}

	public int getQuantidade() {
		return this.posicaoLivreObject;
	}

	public Object getReferencia(int pos) {
		return this.referenciasObject[pos];
	}
	
	
	
	
	
	
}
