package br.com.javautil.testes;

public class TestesObject {
	public static void main(String[] args) {
		
		int[] idades = new int[5];
		
		idades[0] = 29;
		idades[1] = 13;
		idades[2] = 63;
		idades[3] = 12;
		idades[4] = 75;
		
		
		for (int i : idades) {
			System.out.println(i);
		}
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
		System.out.println(idades.length);
				
		for (int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
			System.out.println(idades[i]);
		}
		
				
	}
}
