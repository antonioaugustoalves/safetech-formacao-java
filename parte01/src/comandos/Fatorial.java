package comandos;

public class Fatorial {

	public static void main(String[] args) {
		int num = 5;
		int fat = 1;
		
		for(int i = 1; i <= num; i++) {
			fat = fat * i;
			System.out.println("Parcial : "+ fat);
			
		}
		System.out.println("Fatorial de " + num +" é igual a "+ fat);

	}

}
