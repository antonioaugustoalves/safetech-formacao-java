package funcoes;

public abstract class Conta {
	protected int numero;
	protected String titular;
	protected double saldo;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	protected abstract void imprimeSaldo(double limite);
	
	
	
}
