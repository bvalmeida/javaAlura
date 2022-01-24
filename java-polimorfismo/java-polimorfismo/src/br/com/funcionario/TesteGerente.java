package br.com.funcionario;

public class TesteGerente {
	public static void main(String[] args) {
		
		FuncionarioTeste funcionarioTeste = new FuncionarioTeste();
		funcionarioTeste.setTipo(0);
		funcionarioTeste.setSalario(3000);
		
		System.out.println(funcionarioTeste.getBonificacao());
		
		FuncionarioTeste gerente2 = new FuncionarioTeste();
		gerente2.setTipo(1);
		gerente2.setSalario(5000);
		
		System.out.println(gerente2.getBonificacao());
		
		FuncionarioTeste gerente3 = new FuncionarioTeste();
		gerente3.setTipo(2);
		gerente3.setSalario(10000);
		
		System.out.println(gerente3.getBonificacao());
	}
}
