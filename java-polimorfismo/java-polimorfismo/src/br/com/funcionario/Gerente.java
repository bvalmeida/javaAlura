package br.com.funcionario;

public class Gerente extends Funcionario implements Autenticavel {

	private AutenticavelImpl autenticador;
	
	public double getBonificacao() {
		System.out.println("Chamando o m?todo de bonifica??o do gerente");
		return super.getSalario();
	}
	
	public Gerente() {
		this.autenticador = new AutenticavelImpl();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
