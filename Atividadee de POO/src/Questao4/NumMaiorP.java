package Questao4;

import java.util.Scanner;

public class NumMaiorP {
	static double maiornum;
	static Scanner ler = new Scanner(System.in);
	public static void main(String[] args) {

		cal();
	}
	
	public static void cal() {
		
	NumMaior n = new NumMaior();
	
		System.out.print("Digite o primeiro número: ");
		double n1 = ler.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double n2 = ler.nextDouble();
		
		System.out.println("Digite o terceiro número: ");
		double n3 = ler.nextDouble();
			
		
		 if (n1 >= n2 && n1 >= n3) {
	            maiornum = n1;
		 	} else if (n2 >= n1 && n2 >= n3) {
		 		maiornum = n2;
		 	} else {
		 		maiornum = n3; }
		 
		 n.resul();
	}
	
}

