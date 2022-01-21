package sintaxe.variaveis.fluxos;

public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Bem vindo, ao teste de condicionais");

		int idade = 18;
		int quantidadePessoas = 3;
//		boolean acompanhado = quantidadePessoas >= 2;
		boolean acompanhado;
		
		if(quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Bem vindo, pode entrar.");
		} else {
			System.out.println("Infelizmente você não pode entrar porque não tem mais de 18 nem está acompanhado");
		}
	}
}
