package br.com.funcionario;

//Gerente é um funcionário, Gerente herda da classe Funcionário
public class Gerente extends Funcionario {

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do gerente");
		return super.getBonificacao() + super.getSalario();
	}
	
	
	
}
