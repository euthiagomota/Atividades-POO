package Questao1;

import java.util.Scanner;

public class HipotenusaP {
		static Scanner leia = new Scanner(System.in);
			public static void main(String[] args) {

			calculo();
}
		
 private static void calculo() {
	Hipotenusa h = new Hipotenusa();
	
		
	
	System.out.println("Digite o cateto oposto: ");
		h.co = leia.nextDouble();		
	System.out.println("Digite o cateto adjacente: ");
		h.ca = leia.nextDouble();	
		
		h.resul();	
}	

}