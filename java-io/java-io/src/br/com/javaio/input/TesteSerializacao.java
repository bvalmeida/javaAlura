package br.com.javaio.input;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.javaio.domain.Cliente;

public class TesteSerializacao {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
//		
//		Cliente cliente = new Cliente();
//		cliente.setNome("Jo?ozim");
//		cliente.setProfissao("Dev");
//		cliente.setCpf("654563132135");
//		
//		String nome = "Estavan Pablo";
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente) ois.readObject();
		ois.close();
		
		System.out.println(cliente.getNomeCpfProfissao());
	}
}
