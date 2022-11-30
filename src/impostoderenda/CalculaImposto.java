package impostoderenda;

import java.text.DecimalFormat;

public class CalculaImposto {
	
	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		
		double salario = 10155.70;
		double aliquota;
		double valorImposto;
		
		if(salario <= 1903.98) {
			System.out.println("Isento de Imposto de Renda!");
		} else if(salario >= 1903.99 && salario <= 2826.65) {
			aliquota = 0.075;
			valorImposto = (salario * aliquota) - 142.80;
			System.out.printf("O valor do Imposto de Renda é: " + df.format(valorImposto));
		} else if( salario >= 2826.66 && salario <= 3751.06) {
			aliquota = 0.15;
			valorImposto = (salario * aliquota) - 354.80;
			System.out.printf("O valor do Imposto de Renda é: " + df.format(valorImposto));
		} else if(salario >= 3751.07 && salario <= 4664.68){
			aliquota = 0.225;
			valorImposto = (salario * aliquota) - 636.13;
			System.out.printf("O valor do Imposto de Renda é: " + df.format(valorImposto));
		} else if(salario >= 4664.69) {
			aliquota = 0.275;
			valorImposto = (salario * aliquota) - 869.36;
			System.out.printf("O valor do Imposto de Renda é: " + df.format(valorImposto));
		} else {
			System.out.println("Erro!");
		}
	}
}
