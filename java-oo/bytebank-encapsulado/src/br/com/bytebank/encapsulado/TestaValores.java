package br.com.bytebank.encapsulado;

public class TestaValores {
	public static void main(String[] args) {
		
		Conta conta = new Conta(611, 24225);
		Conta conta2 = new Conta(611, 24616);
				
		System.out.println(conta.getAgencia());
		System.out.println(Conta.getTotal());
		System.out.println(conta2.getTotal());
	}
}
