package comandos;

public class OperadorTernario {
	public static void main(String[] args) {
		double preco = 100.90;
		String tipo = "AP";
		
		preco = tipo.equals("AV")? preco -=15.20 : preco;
		System.out.println("Preço final :" + preco);
		 
	}

	
}
