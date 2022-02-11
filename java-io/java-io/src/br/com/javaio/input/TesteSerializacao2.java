package br.com.javaio.input;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.herdado.conta.modelo.ContaCorrente;
import br.com.javaio.domain.Cliente;

public class TesteSerializacao2 {
	public static void main(String[] args) throws Exception, IOException {
		
		Cliente cliente = new Cliente();
		cliente.setNome("João Pedro");
		cliente.setProfissao("Dev");
		cliente.setCpf("58764552163");
		
		ContaCorrente cc = new ContaCorrente(222,333);
		//cc.setTitular(cliente);
		cc.deposita(222.3);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente2.bin"));
		oos.writeObject(cc);
		oos.close();
		
	}

}
