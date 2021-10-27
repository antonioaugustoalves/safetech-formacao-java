package funcoes;


public class Funcao {
	private static void exibirMensagem() {
		System.out.println("Mensagem");
	}
	
	public static void exibirMensagem(String nome) {
		System.out.println("Bom dia, "+ nome);
	}
	
	public static String exibirNomeCompleto(String nome, String sobreNome) {
		return nome+" "+sobreNome;
	}
	
	public static void main(String[] args) {
		exibirMensagem();
		exibirMensagem("Antonio");
		String fullName = exibirNomeCompleto("Alex", "Dias");
		System.out.println(fullName);		
	}

}
