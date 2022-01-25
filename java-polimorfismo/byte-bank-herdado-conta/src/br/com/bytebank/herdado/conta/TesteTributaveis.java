package br.com.bytebank.herdado.conta;

public class TesteTributaveis {
	public static void main(String[] args) {
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		ContaCorrente cc = new ContaCorrente(222, 333);
		SeguroDeVida seguro = new SeguroDeVida();
		
		cc.deposita(100.0);
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
				
	}
}
