package br.com.bytebank.testes;

public class TesteString {
	public static void main(String[] args) {

		String nome = "Alura";// Object Literal
		//String outro = new String("Alura");
		String vazio = " ";
		
		
		//System.out.println(outro);
		
		String trim = vazio.trim();
		String outra = nome.replace("A", "a");
		char c = nome.charAt(2);		
		int pos = nome.indexOf("ur");
		String outralow = nome.toUpperCase();
		String sub = nome.substring(1);
		int leng = nome.length();
		
		
		for(int i = 0; i<nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		
		System.out.println(vazio.isEmpty());
		System.out.println(nome);
		System.out.println(outra);
		System.out.println(outralow);
		System.out.println(c);
		System.out.println(pos);
		System.out.println(sub);
		System.out.println(leng);
		System.out.println(trim);
		System.out.println(vazio.contains("Alu"));
		
	}
}
