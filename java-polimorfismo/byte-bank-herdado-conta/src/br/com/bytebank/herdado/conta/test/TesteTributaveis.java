package br.com.bytebank.herdado.conta.test;

import br.com.bytebank.herdado.conta.modelo.CalculadorDeImposto;
import br.com.bytebank.herdado.conta.modelo.ContaCorrente;
import br.com.bytebank.herdado.conta.modelo.SeguroDeVida;

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
