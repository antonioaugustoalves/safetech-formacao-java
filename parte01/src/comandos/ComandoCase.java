package comandos;

public class ComandoCase {

	public static void main(String[] args) {
		int opcao = 12;

		switch (opcao) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Ter�a-Feira");
			break;
		case 4:
			System.out.println("Quarta-Feira");
			break;
		case 5:
			System.out.println("Quinta-Feira");
			break;
		case 6:
			System.out.println("Sexta-Feira");
			break;
		case 7:
			System.out.println("S�bado");
			break;
		default:
			System.out.println("Op��o inv�lida.");
			break;
		}

	}

}
