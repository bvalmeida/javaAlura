package br.com.funcionario;

public class TesteGerente {
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Paulo Barbosa");
		g1.setCpf("565.464.999-52");
		g1.setSalario(4000);
		
		System.out.println("Nome: " + g1.getNome());
		System.out.println("Cpf: " + g1.getCpf());
		System.out.println("Salário: " + g1.getSalario());
		
		g1.setSenha(4978);
		boolean autenticou = g1.autentica(4978);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
	
	}
}
