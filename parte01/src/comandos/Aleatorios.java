package comandos;

public class Aleatorios {

	public static void main(String[] args) {
		int numero = 0;
		for(int x=1; x <=10; x++) {
			System.out.println("");
			for(int i=1; i <= 6; i++) {
				numero = (int)Math.round(Math.random() * 60)+1;
				System.out.print(numero+" - ");
			}
		}

	}

}
