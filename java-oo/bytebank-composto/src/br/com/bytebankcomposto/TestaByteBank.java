package br.com.bytebankcomposto;

public class TestaByteBank {
	
	public static void main(String[] args) {
		
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "654.623.658-65";
		paulo.profissao = "Programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		contaDoPaulo.titular = paulo;
		
		System.out.println(contaDoPaulo.titular.nome);
		System.out.println(contaDoPaulo.titular);
		System.out.println(paulo);
		
	}

}
