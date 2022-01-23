package br.com.bytebank.encapsulado;

public class Conta {
	
	
	private int agencia;
	private int numero;
	private double saldo;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		if(agencia <=0 || numero <=0 ) {
			System.out.println("Agencia ou numero não pode ser negativo");
			return;
		}
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta" + this.numero);
	}
	
	public void deposita(double valor) {
		if(valor >= 0) {
			this.saldo += valor;			
		}else {
			System.out.println("Valor negativo, impossível depositar");
		}
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
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Não pode menor igual a 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não pode menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
}
