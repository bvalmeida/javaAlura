package br.com.funcionario;

public class ControleBonificacao {
	
	private double somaBonificacao;
	
	public void registra(Funcionario funcionario) {
		double boni = funcionario.getBonificacao();
		this.somaBonificacao = this.somaBonificacao + boni;
	}
	
	public double getSomaBonificacao() {
		return somaBonificacao;
	}
	
}
