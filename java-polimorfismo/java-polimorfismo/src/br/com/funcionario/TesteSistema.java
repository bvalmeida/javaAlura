package br.com.funcionario;

public class TesteSistema {
	public static void main(String[] args) {
		
		SistemaInterno sistemaInterno = new SistemaInterno();
		Gerente gerente = new Gerente();
		Administrador administrador = new Administrador();
		//Designer designer = new Designer();
		Cliente cliente = new Cliente();
		cliente.setSenha(2222);
		
		//designer.setSenha(2222);
		administrador.setSenha(3333);
		gerente.setSenha(2222);
		sistemaInterno.autentica(gerente);
		sistemaInterno.autentica(administrador);
		//sistemaInterno.autentica(designer);
		sistemaInterno.autentica(cliente);
		
	}
}
