package comandos;

public class Comandos {

	public static void main(String[] args) {
		int idade = 26;
		String pais = "BRA";
				
		System.out.println("Caso 01:");
		if(idade >= 18) {
			System.out.println("Você é maior de idade");
		}else {
			System.out.println("Você é menor de idade");
		}
		
		System.out.println("Caso 02:");
		if(idade >= 21 && pais.equals("USA")) {
			System.out.println("Você é maior de idade");
		}else {
			System.out.println("Você é menor de idade");
		}
		
		System.out.println("IFs aninhados - Caso 03:");
		if(pais.equals("BRA")) {
			if(idade >= 18) {
				System.out.println("Você é maior de idade");
			}else {
				System.out.println("Você é menor de idade");
			}
		}else if(pais.equals("EUA")) {
			if(idade >= 21) {
				System.out.println("Você é maior de idade");
			}else {
				System.out.println("Você é menor de idade");
			}
		}

	}

}
