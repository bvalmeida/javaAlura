package br.com.funcionario;

public class Administrador extends Funcionario implements Autenticavel {
	
	private AutenticavelImpl autenticador;
	
	@Override
	public double getBonificacao() {
		return 50;
	}

	public Administrador() {
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
