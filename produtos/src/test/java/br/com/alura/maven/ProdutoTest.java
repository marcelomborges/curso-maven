package br.com.alura.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProdutoTest {
	
	@Test
	public void verificaPrecoComImposto() {
		Produto jogo = new Produto("Cyberpunk 2077", 100.00);
		assertEquals(125.00, jogo.getPrecoComImposto(), 0.00001);
	}

}
