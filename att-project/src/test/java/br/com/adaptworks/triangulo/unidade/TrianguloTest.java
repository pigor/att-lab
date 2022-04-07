package br.com.adaptworks.triangulo.unidade;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.adaptworks.triangulo.Triangulo;

public class TrianguloTest {

	@Test
	public void testValoresNegativos() {
		String msg = new Triangulo().calcular("-2", "-3", "-5");
		
		assertEquals("", msg);
	}
	
	@Test
	public void testTrianguloInvalido() {
		String msg = new Triangulo().calcular("1", "2", "3");
		
		assertEquals("", msg);
	}
	
	@Test
	public void testTrianguloEquilatero() {
		String msg = new Triangulo().calcular("2", "2", "2");
		
		assertEquals("Triângulo Equilátero", msg);
	}
	
	@Test
	public void testValoresComCaracteres() {
		String msg = new Triangulo().calcular("A", "B", "C");
		
		assertEquals("", msg);
	}
	
	@Test
	public void testValoresComCaracteres2() {
		String msg = new Triangulo().calcular("%", "", "#");
		
		assertEquals("", msg);
	}
	
	@Test
	public void testValoresIsosceles() {
		String msg = new Triangulo().calcular("2", "2", "1");
		
		assertEquals("Triângulo Isósceles", msg);
	}
	
	@Test
	public void testValoresIsosceles2() {
		String msg = new Triangulo().calcular("1", "2", "2");
		
		assertEquals("Triângulo Isósceles", msg);
	}
	
	@Test
	public void testValoresEscaleno() {
		String msg = new Triangulo().calcular("11", "12", "13");
		
		assertEquals("Triângulo Escaleno", msg);
	}
}
