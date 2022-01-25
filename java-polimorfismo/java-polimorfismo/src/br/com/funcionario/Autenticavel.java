package br.com.funcionario;


public abstract interface Autenticavel{
		
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
		
}
