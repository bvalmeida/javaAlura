package br.com.bytebank.herdado.conta.modelo;

public class CalculadorDeImposto {
	
	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valorImposto = t.getValorImposto();
		this.totalImposto += valorImposto;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
	
}
