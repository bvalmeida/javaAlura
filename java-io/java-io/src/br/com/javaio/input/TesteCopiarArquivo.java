package br.com.javaio.input;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {
	public static void main(String[] args) throws IOException {
		
		InputStream fis = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader bf = new BufferedReader(isr);
		
		OutputStream fos = new FileOutputStream("loremReescrito.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = bf.readLine();
		
		while(linha != null) {
			bw.write(linha);
			bw.newLine();
			linha = bf.readLine();
		}
		
		bf.close();
		bw.close();
		
		
		
	}
}
