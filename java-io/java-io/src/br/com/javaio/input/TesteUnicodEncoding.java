package br.com.javaio.input;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodEncoding {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s = "ç";
		
		System.out.println(s.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		byte[] bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.println(bytes.length);
		
		String sNovo = new String("US-ASCII");
		System.out.println(sNovo);
		
	}
}
