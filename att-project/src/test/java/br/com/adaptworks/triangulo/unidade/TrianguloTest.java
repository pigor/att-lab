package br.com.adaptworks.triangulo.unidade;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.adaptworks.triangulo.Triangulo;

public class TrianguloTest {

	@Test
	public void trianguloEquilatero() {
		String mensagem = new Triangulo().classificar(1, 1, 1);
		
		assertEquals("Triângulo Equilátero", mensagem);
	}
	
	@Test
	public void trianguloEscaleno() {
		String mensagem = new Triangulo().classificar(5, 4, 3);
		
		assertEquals("Triângulo Escaleno", mensagem);
	}
	
	@Test
	public void trianguloIsosceles() {
		String mensagem = new Triangulo().classificar(5, 5, 4);
		
		assertEquals("Triângulo Isósceles", mensagem);
	}
	
	@Test
	public void trianguloInvalido() {
		String mensagem = new Triangulo().classificar(1, 2, 3);
		
		assertEquals("", mensagem);
	}
	
	@Test
	public void trianguloNegativo() {
		String mensagem = new Triangulo().classificar(-1, 2, 3);
		
		assertEquals("", mensagem);
	}
	
	@Test
	public void trianguloZero() {
		String mensagem = new Triangulo().classificar(0, 2, 3);
		
		assertEquals("", mensagem);
	}
	
	@Test
	public void trianguloTudoZero() {
		String mensagem = new Triangulo().classificar(0, 0, 0);
		
		assertEquals("", mensagem);
	}
}
