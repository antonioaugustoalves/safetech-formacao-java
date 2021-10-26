package operacoes;

public class Operadores {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int c = 4;
		int resultado = 0;
		
		resultado = a+b*c;
		System.out.println("Resultado=> "+ resultado);
		
		resultado = (a+b)*c;
		System.out.println("Resultado=> "+ resultado);
		
		resultado =  a++ + b++;
		System.out.println("Resultado=> "+ resultado);
		
		//Operadores relacionais
		
		boolean teste = a > b;
		System.out.println("A é maior do que B? "+ teste);
		
		teste = a < b;
		System.out.println("A é menor do que B? "+ teste);
		
		teste = (a == b);
		System.out.println("A é igual a B? "+ teste);
		
		teste = (a != b);
		System.out.println("A é diferente de B? "+ teste);
		
		//operadores lógicos
		teste = (a != b) && (a != c);
		System.out.println("A é diferente de B e de C? "+ teste);
		
		teste = (a == b) && (a != c);
		System.out.println("A é igual B e diferente de C? "+ teste);
		
		teste = (a == b) || (a != c);
		System.out.println("A é igual B ou diferente de C? "+ teste);
		
		

	}

}
