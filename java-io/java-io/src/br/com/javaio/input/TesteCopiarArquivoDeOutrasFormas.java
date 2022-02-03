package br.com.javaio.input;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteCopiarArquivoDeOutrasFormas {
	public static void main(String[] args) throws IOException {
		
		Socket s = new Socket();
		
		InputStream fis = s.getInputStream();  //System.in;
		Reader isr = new InputStreamReader(fis);
		BufferedReader bf = new BufferedReader(isr);
		
		OutputStream fos =  s.getOutputStream(); //System.out;
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = bf.readLine();
		
		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = bf.readLine();
		}
		
		bf.close();
		bw.close();
		
		
		
	}
}
