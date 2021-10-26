package operacoes;

public class Operacoes {

	public static void main(String[] args) {
		int v1 = 7;
		int v2 = 5;
		int v3 = 35;
		int v4 = 3;
		int res = v1+v2;
		System.out.println("Soma = "+res);
		
		res = v1 * v2;
		System.out.println("Multiplicação = "+res);
		
		res = v1 - v2;
		System.out.println("Subtração = "+res);
		
		res = v3 / v2;
		System.out.println("Divisão = "+res);
		
		res  = v3 % v4;
		System.out.println("Módulo = "+res);
		
		double resultado  = Math.pow(5.0, 2.0);
		System.out.println("Potência = "+resultado);
		
		resultado = Math.sqrt(36);
		System.out.println("Raiz Quadrada = "+resultado);
		
		

	}

}
