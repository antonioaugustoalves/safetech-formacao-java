package textos;

public class Textos {
	public static void main(String [] args) {
		String str = "Hello world Java";
		System.out.println(str.toUpperCase());
		System.out.println(str.substring(5,9));
		System.out.println(str.length());
		System.out.println(str.replace('l', 'r'));
		System.out.println(str.charAt(7));
		System.out.println(str.indexOf("ld"));
		System.out.println(str.contains("ava"));
		System.out.println(str.compareTo("Hello world"));
	}
}
