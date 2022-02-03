package br.com.javaio.input;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteOutputFileWriter2 {
	public static void main(String[] args) throws IOException {
		
//		OutputStream fos = new FileOutputStream("loremReescrito.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("loremReescrito.txt"));
		
		PrintStream ps = new PrintStream("loremReescrito.txt");
		
		PrintWriter pw = new PrintWriter("loremReescrito2.txt");
		
		pw.println();
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println("asdaffabafaf dgasd gggegd ");
		
		ps.close();
		
//		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
//		bw.newLine();
//		bw.newLine();
//		bw.write("asdasdasdasdasdasdsadasdasdasdas");
//		
//		
//		bw.close();
		
		
		
	}
}
