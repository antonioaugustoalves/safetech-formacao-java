package funcoes;

public class ContaCorrente extends Conta{
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public  void imprimeConta() {
		System.out.println("Numero:"+this.numero);
		System.out.println("Titular:"+this.titular);
		
	}
	
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.setNumero(1234);
		cc.setSaldo(500);
		cc.setTitular("Paulo Silva");
		cc.setTipo("Pessoa Física");
		
		cc.imprimeConta();
		cc.imprimeSaldo(1500);
	}

	@Override
	protected void imprimeSaldo(double limite) {
		double total = this.getSaldo() + limite;
		System.out.println("Saldo com limite: "+ total);
		
	}

}
