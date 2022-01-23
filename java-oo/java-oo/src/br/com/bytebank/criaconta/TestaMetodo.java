package br.com.bytebank.criaconta;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.saldo = 100;
		conta.deposita(50);
		
		System.out.println(conta.saldo);
		
		boolean conseguiRetirar = conta.saca(20);
		
		System.out.println(conta.saldo);
		System.out.println(conseguiRetirar);
		
		Conta conta1 = new Conta();
		conta1.deposita(1000);
		
		boolean sucessoTransferencia = conta1.transfere(300, conta);
		
		if(sucessoTransferencia) {
			System.out.println("Transferência com sucesso");
		}else {
			System.out.println("Faltou dinheiro");
		}
		
		System.out.println(conta1.saldo);
		System.out.println(conta.saldo);
		
	}

}
