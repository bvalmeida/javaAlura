package br.com.funcionario;

public class EditorVideo extends Funcionario {
	
	
	
	public double getBonificacao() {
		System.out.println("Bonificação do Editor de Vídeo");
		return super.getBonificacao() + 100;
	}
	
	
	
}
