package Questao3;


import java.util.Scanner;

public class SistemaNotasP {
static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
	
		jav();
	}

	public static void jav() {
		SistemaNotas sm = new SistemaNotas();
		
				System.out.println("Digite sua priemira nota: ");
				sm.n1 = leia.nextDouble();
				
				System.out.println("Digite sua segunda nota: ");
				sm.n2 = leia.nextDouble();
				
				
		sm.resul();
	}
		
}

