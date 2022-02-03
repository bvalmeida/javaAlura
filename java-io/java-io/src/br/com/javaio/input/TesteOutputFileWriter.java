package br.com.javaio.input;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteOutputFileWriter {
	public static void main(String[] args) throws IOException {
		
//		OutputStream fos = new FileOutputStream("loremReescrito.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("loremReescrito.txt"));
				
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.newLine();
		bw.write("asdasdasdasdasdasdsadasdasdasdas");
		
		
		bw.close();
		
		
		
	}
}
