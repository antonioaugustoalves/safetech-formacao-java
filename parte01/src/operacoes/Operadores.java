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
		System.out.println("A � maior do que B? "+ teste);
		
		teste = a < b;
		System.out.println("A � menor do que B? "+ teste);
		
		teste = (a == b);
		System.out.println("A � igual a B? "+ teste);
		
		teste = (a != b);
		System.out.println("A � diferente de B? "+ teste);
		
		//operadores l�gicos
		teste = (a != b) && (a != c);
		System.out.println("A � diferente de B e de C? "+ teste);
		
		teste = (a == b) && (a != c);
		System.out.println("A � igual B e diferente de C? "+ teste);
		
		teste = (a == b) || (a != c);
		System.out.println("A � igual B ou diferente de C? "+ teste);
		
		

	}

}
