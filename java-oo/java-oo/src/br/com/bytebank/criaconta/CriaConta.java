package br.com.bytebank.criaconta;

public class CriaConta {
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.titular = "Joãozim";
		primeiraConta.agencia = 221345;
		primeiraConta.numero = 13451;
		primeiraConta.saldo = 500;
		
		primeiraConta.saldo +=100;
		
		Conta segundaConta = new Conta();
		segundaConta.titular = "Maria";
		segundaConta.agencia = 341234;
		segundaConta.numero = 134561;
		segundaConta.saldo = 13412;
		
		// Valores default
		Conta terceiraConta = new Conta();
		
		System.out.println("Titular da conta: " + primeiraConta.titular);
		System.out.println("Agência: " + primeiraConta.agencia);
		System.out.println("Número: " + primeiraConta.numero);
		System.out.println("Saldo: " + primeiraConta.saldo + " reais");
		System.out.println(" ");
		System.out.println("Titular da conta: " + segundaConta.titular);
		System.out.println("Agência: " + segundaConta.agencia);
		System.out.println("Número: " + segundaConta.numero);
		System.out.println("Saldo: " + segundaConta.saldo + " reais");
		System.out.println(" ");
		System.out.println("Titular da conta: " + terceiraConta.titular);
		System.out.println("Agência: " + terceiraConta.agencia);
		System.out.println("Número: " + terceiraConta.numero);
		System.out.println("Saldo: " + terceiraConta.saldo + " reais");
		
		if(primeiraConta == segundaConta) {
			System.out.println("mesma conta");
		}else {
			System.out.println("contas diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
