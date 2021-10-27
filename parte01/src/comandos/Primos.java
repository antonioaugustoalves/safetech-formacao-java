package comandos;

public class Primos {

	public static void main(String[] args) {
		int n = 100;
		int i = 2;
		int x = 2;
		System.out.println("Numeros primos de 1 a " +n);
		for(i=2, x=2; i<=n; i++) {
			for(x=2; x<i;x++) {
				if(i%x == 0) {
					break;
				}
			}
			if(x == i) {
				System.out.print(x+" - ");
			}
		}

	}

}
