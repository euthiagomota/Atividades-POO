package Questao1;

public class Hipotenusa {
double co, ca, hp, hp2;
	

			protected void resul() {
				double hp2 = Math.pow(ca, 2) + Math.pow(co, 2);
				double hp = Math.sqrt(hp2);    
					System.out.println("O valor da hipotenusa é: " + hp);
}
			
}