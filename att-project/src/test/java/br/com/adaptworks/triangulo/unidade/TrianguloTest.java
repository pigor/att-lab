package br.com.adaptworks.triangulo.unidade;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.adaptworks.triangulo.Triangulo;

public class TrianguloTest {

	@Test
	public void testTrianguloEscaleno() {
		Triangulo t = new Triangulo();
		
		String mensagem = t.classificar(3, 5, 7);
		
		assertEquals("Triângulo Escaleno", mensagem);
	}
	
	@Test
	public void testTrianguloEquilátero() {
		Triangulo t = new Triangulo();
		
		String mensagem = t.classificar(3, 3, 3);
		
		assertEquals("Triângulo Equilátero", mensagem);
	}
	
	@Test
	public void testTrianguloIsosceles() {
		Triangulo t = new Triangulo();
		
		String mensagem = t.classificar(3, 3, 5);
		
		assertEquals("Triângulo Isósceles", mensagem);
	}
	
	@Test
	public void testValorZero() {
		Triangulo t = new Triangulo();
		
		String mensagem = t.classificar(3, 3, 0);
		
		assertEquals("", mensagem);
	}
	
	@Test
	public void testValorZero2() {
		Triangulo t = new Triangulo();
		
		String mensagem = t.classificar(0, 0, 0);
		
		assertEquals("", mensagem);
	}
	
	@Test
	public void testValorNegativo() {
		Triangulo t = new Triangulo();
		
		String mensagem = t.classificar(3, -3, 1);
		
		assertEquals("", mensagem);
	}
	
	@Test
	public void testComCaracteres() {
		Triangulo t = new Triangulo();
		
		String mensagem = t.classificar("a", "a", "a");
		
		assertEquals("", mensagem);
	}
	
	@Test
	public void testComCampoVazio() {
		Triangulo t = new Triangulo();
		
		String mensagem = t.classificar("a", "a", "");
		
		assertEquals("", mensagem);
	}
	
	@Test
	public void testTrianguloInvalido() {
		Triangulo t = new Triangulo();
		
		// a < b + c
		String mensagem = t.classificar(1, 2, 3);
		
		assertEquals("", mensagem);
	}
}
