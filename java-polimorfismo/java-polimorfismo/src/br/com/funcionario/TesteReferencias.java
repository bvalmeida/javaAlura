package br.com.funcionario;

public class TesteReferencias {
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		
		g1.setNome("João");
		String nome = g1.getNome();
		
		g1.autentica(2222);
		
		System.out.println(nome);
		
		//Gerente g1 = new Gerente();
		//Funcionario f1 = new Funcionario();
		EditorVideo e1 = new EditorVideo();
		Designer d1 = new Designer();
		
		g1.setNome("Marquinhos");
		g1.setSalario(2938);
		
//		f1.setNome("Pedim");
//		f1.setSalario(1233);
		
		e1.setNome("Paulo");
		e1.setSalario(9874);
		
		d1.setNome("Carlos");
		d1.setSalario(6111);
		
		ControleBonificacao controleBonificacao = new ControleBonificacao();
		
		controleBonificacao.registra(g1);
		//controleBonificacao.registra(f1);
		controleBonificacao.registra(e1);
		controleBonificacao.registra(d1);
		
		System.out.println(controleBonificacao.getSomaBonificacao());
		
	}
}
