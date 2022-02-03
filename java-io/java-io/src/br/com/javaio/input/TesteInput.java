package br.com.javaio.input;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteInput {
	public static void main(String[] args) throws IOException {
		
		InputStream fis = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader bf = new BufferedReader(isr);
		
		String linha = bf.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = bf.readLine();
		}
		
		bf.close();
		
		
		
	}
}
