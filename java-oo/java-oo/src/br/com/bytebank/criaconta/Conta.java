package br.com.bytebank.criaconta;

public class Conta {
	
	String titular;
	int agencia;
	int numero;
	double saldo;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor){
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		this.saca(valor);
		destino.deposita(valor);
		return true;
	}
	
}
