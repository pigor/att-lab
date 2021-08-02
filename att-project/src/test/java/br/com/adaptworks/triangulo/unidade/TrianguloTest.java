package br.com.adaptworks.triangulo.unidade;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.adaptworks.triangulo.Triangulo;

public class TrianguloTest {

	@Test
	public void testTrianguloEquilatero() {
		String mensagem = new Triangulo().classificar("3", "3", "3");
		
		assertEquals("Triângulo Equilátero", mensagem);
	}
	
	@Test
	public void testTrianguloIsosceles() {
		String mensagem = new Triangulo().classificar("3", "3", "2");
		
		assertEquals("Triângulo Isósceles", mensagem);
	}
	
	@Test
	public void testTrianguloEscaleno() {
		String mensagem = new Triangulo().classificar("3", "4", "5");
		
		assertEquals("Triângulo Escaleno", mensagem);
	}
	
	@Test
	public void testTrianguloInvalido() {
		String mensagem = new Triangulo().classificar("10", "2", "3");
		
		assertEquals("", mensagem);
	}
	
	@Test
	public void testTrianguloInvalidoValoresNaoNumericos() {
		String mensagem = new Triangulo().classificar("a", "b", "c");
		
		assertEquals("", mensagem);
	}
	
	@Test
	public void testTrianguloInvalidoCaracteresEspeciais() {
		String mensagem = new Triangulo().classificar("%", "%", "%");
		
		assertEquals("", mensagem);
	}
	
	@Test
	public void testTrianguloInvalidoValoresNulos() {
		String mensagem = new Triangulo().classificar("", "", "");
		
		assertEquals("", mensagem);
	}
	
	@Test
	public void testTrianguloInvalidoValoresNegativos() {
		String mensagem = new Triangulo().classificar("-10", "10", "10");
		
		assertEquals("", mensagem);
	}
	
	@Test
	public void testTrianguloInvalidoValoresDecimais() {
		String mensagem = new Triangulo().classificar("5.1", "5.1", "5.1");
		
		assertEquals("", mensagem);
	}
	
	@Test
	public void testTrianguloInvalidoValoresZerados() {
		String mensagem = new Triangulo().classificar("0", "0", "0");
		
		assertEquals("", mensagem);
	}
	
	@Test
	public void testTrianguloInvalidoOutroIdioma() {
		String mensagem = new Triangulo().classificar("夫", "夫", "夫");
		
		assertEquals("", mensagem);
	}
}
