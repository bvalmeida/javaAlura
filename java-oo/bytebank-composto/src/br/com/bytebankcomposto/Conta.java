package br.com.bytebankcomposto;

public class Conta {
	
	
	int agencia;
	int numero;
	private double saldo;
	Cliente titular;
	
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
	
	public double getSaldo(){
		return this.saldo;
	}
	
}
