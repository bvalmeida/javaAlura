package br.com.javaio.input;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteScanner {
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"));
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			//System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			
			linhaScanner.useDelimiter(",");
			
			String tipoDaConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String nomeTitular = linhaScanner.next();
			Double saldo = linhaScanner.nextDouble();
			
			System.out.format("%s - %04d-%04d - %20s, saldo: %08.2f %n", tipoDaConta, agencia, numero, nomeTitular, saldo);
			
			linhaScanner.close();
			
//			String[] valores = linha.split(",");
//			System.out.println(Arrays.toString(valores));
			
		}
		
		scanner.close();
	}
}
