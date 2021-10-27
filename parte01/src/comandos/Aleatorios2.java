package comandos;

import java.util.Random;

public class Aleatorios2 {

	public static void main(String[] args) {
		int cartao[] = new int[6];
		int numero = 0;
		Random seed = new Random();
		
		for(int i=1; i<=10; i++) {
		System.out.println("\nCartão "+ i);
			for(int p=0; p<6; p++) {
				numero = seed.nextInt(60) +1;
				if(numero == cartao[p] && i !=p) {
					numero = seed.nextInt(60) +1;
				}else {
					cartao[p] = numero;
				}
				
				System.out.print(cartao[p] +" - ");
			}
		}

	}

}
