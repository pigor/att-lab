package br.com.adaptworks.triangulo.unidade;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.adaptworks.triangulo.Triangulo;

public class TrianguloTest {

	@Test
	public void testTrianguloEquilatero() {
		String mensagem = new Triangulo().classificar(3, 3, 3);
		
		assertEquals("Triângulo Equilátero", mensagem);
	}
	
	@Test
	public void testTrianguloIsosceles() {
		String mensagem = new Triangulo().classificar(3, 3, 2);
		
		assertEquals("Triângulo Isósceles", mensagem);
	}
	
	@Test
	public void testTrianguloIsosceles2() {
		String mensagem = new Triangulo().classificar(2, 3, 3);
		
		assertEquals("Triângulo Isósceles", mensagem);
	}
	
	@Test
	public void testTrianguloIsosceles3() {
		String mensagem = new Triangulo().classificar(2, 3, 2);
		
		assertEquals("Triângulo Isósceles", mensagem);
	}
	
	@Test
	public void testTrianguloEscaleno() {
		String mensagem = new Triangulo().classificar(3, 4, 2);
		
		assertEquals("Triângulo Escaleno", mensagem);
	}
	
	@Test
	public void testTrianguloEscalenoDoisDigitos() {
		String mensagem = new Triangulo().classificar(30, 40, 20);
		
		assertEquals("Triângulo Escaleno", mensagem);
	}
	
	@Test
	public void testTrianguloNegativos() {
		String mensagem = new Triangulo().classificar(-30, 40, 20);
		
		assertEquals("", mensagem);
	}
	
	@Test
	public void testTrianguloComValoresZerados() {
		String mensagem = new Triangulo().classificar(0, 0, 0);
		
		assertEquals("", mensagem);
	}
	
	@Test
	public void testTrianguloComValoresZerados2() {
		String mensagem = new Triangulo().classificar(0, 10, 10);
		
		assertEquals("", mensagem);
	}
	
	@Test
	public void testTrianguloInvalido() {
		String mensagem = new Triangulo().classificar("", "4", "2");
		
		assertEquals("", mensagem);
	}
	
	// a < b + c (formar um triangulo)
	@Test
	public void testTrianguloComValoresInvalidos() {
		String mensagem = new Triangulo().classificar("1", "2", "3");
		
		assertEquals("", mensagem);
	}
}
