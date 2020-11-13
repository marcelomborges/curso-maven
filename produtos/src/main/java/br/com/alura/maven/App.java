package br.com.alura.maven;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main( String[] args ) {
        Produto produto = new Produto("Cyberpunk 2077", 149.90);
        
        System.out.println("GOTY: " + produto.getNome() + ", Valor: " + produto.getPreco());
    }
}
