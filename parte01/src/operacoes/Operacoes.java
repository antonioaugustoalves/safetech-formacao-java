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
		System.out.println("Multiplica��o = "+res);
		
		res = v1 - v2;
		System.out.println("Subtra��o = "+res);
		
		res = v3 / v2;
		System.out.println("Divis�o = "+res);
		
		res  = v3 % v4;
		System.out.println("M�dulo = "+res);
		
		double resultado  = Math.pow(5.0, 2.0);
		System.out.println("Pot�ncia = "+resultado);
		
		resultado = Math.sqrt(36);
		System.out.println("Raiz Quadrada = "+resultado);
		
		

	}

}
