package sintaxe.variaveis.fluxos.exercicios;

public class AliquotaComIfs {
	/*
	 * O Jo?o gostaria de criar um programa sobre Imposto de Renda (IR) e verificou
	 * as regras de al?quota. Ele descobriu no site da receita:
	 * 
	 * De 1900.0 at? 2800.0, o IR ? de 7.5% e pode deduzir na declara??o o valor de
	 * R$ 142 De 2800.01 at? 3751.0, o IR ? de 15% e pode deduzir R$ 350 De 3751.01
	 * at? 4664.00, o IR ? de 22.5% e pode deduzir R$ 636
	 */
	
	public static void main(String[] args) {
		
		double salario = 3300.0;
		double primeiraDeducao = (7.5/100) * salario;
		double segundaDeducao = (15/100) * salario;
		double terceiraDeducao = (22.5/100) * salario;
		
		boolean primeiroDesconto = salario >= 1900.0 || salario <= 2800.0;
		boolean segundoDesconto = salario >=2800.01 || salario <= 3751.0;
		boolean terceiroDesconto = salario >=3751.01 || salario <= 4664.0;
		
		if(primeiroDesconto) {
			System.out.println("Poder? deduzir: " + primeiraDeducao);
		} else if(segundoDesconto) {
			System.out.println("Poder? deduzir: " + segundaDeducao);
		} else if(terceiroDesconto) {
			System.out.println("Poder? deduzir: " + terceiraDeducao);
		}
		
		
		
	}
}
