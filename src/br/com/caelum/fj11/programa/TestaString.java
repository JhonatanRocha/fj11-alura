package br.com.caelum.fj11.programa;

public class TestaString {
	public static void main(String[] args) {
		String s = "fj11";
		String frase = "Socorram-me, subi no ônibus em Marrocos";
		String string = s.replaceAll("1", "2");
        System.out.println("Texto Original: " + s);
        System.out.println("Texto com Replace: " + string);
        imprimeLetraPorLetra(s);
        inverte(s);
        invertePalavrasDaFrase(frase);
        inverteComStringBuilder(frase);
        
	}
	
	public static void imprimeLetraPorLetra(String texto) {
		System.out.println("Imprimindo letra por letra:");
		for (int i = 0; i < texto.length(); i++) {
            System.out.println(texto.charAt(i));
        }
    }
	
	public static void inverte(String texto) {
		System.out.println("Imprimindo String invertida:");
		for (int i = texto.length() - 1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }
    }
	
	public static void invertePalavrasDaFrase(String texto) {
        String[] palavras = texto.split(" ");
        System.out.println("\nInvertando a Frase: ");
        for (int i = palavras.length - 1; i >= 0; i--) {
            System.out.print(palavras[i] + " ");
        }
        System.out.println("");
    }
	
	public static void inverteComStringBuilder(String texto) {
        System.out.print("\t");
        StringBuilder invertido = new StringBuilder(texto).reverse();
        System.out.println(invertido);
    }
}
