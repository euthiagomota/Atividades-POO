package Questao3;

public class SistemaNotas {
static double n1, n2, media;

protected static void resul() {
	media = (n1 + n2)/2;
	
	if (media < 7) {
		System.out.println("Sua média é: " + media + " você foi reprovado(a)");
	} else if (media >= 7) {
		System.out.println("Sua médoa é: "+ media +" você foi aprovado(a)");	
	} else if (n1 > 10 || n2 > 10) {
					System.out.println("Favor, digite uma nota válida: ");
				}

	}

}