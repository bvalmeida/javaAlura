package br.com.bytebank.encapsulado;

public class TestaGetESet {
	public static void main(String[] args) {
		
		Conta conta = new Conta(163,336);
		// conta.numero = 1314;
			
		System.out.println(conta.getNumero());
		System.out.println(conta.getAgencia());
		
		Cliente paulo = new Cliente();
		// conta.titular = paulo;
		
		conta.setTitular(paulo);
		paulo.setNome("Paulo Silveira");
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
	}
}
