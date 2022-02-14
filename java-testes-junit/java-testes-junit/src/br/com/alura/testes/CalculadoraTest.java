package br.com.alura.testes;

import org.junit.jupiter.api.Test;

import br.com.alura.domain.Calculadora;
import junit.framework.Assert;

public class CalculadoraTest {
	
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 7);
		
		Assert.assertEquals(10, soma);
	}

}
