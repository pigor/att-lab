package br.com.adaptworks.triangulo.aceitacao.po;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CenarioTriangulo {

	WebDriver driver;
	
	@Before
	public void preCondicao() {
		System.setProperty("webdriver.gecko.driver","/home/pigor/developer/drivers/geckodriver");
		
		driver = new FirefoxDriver();
		driver.get("https://triangulos.fly.dev");
	}
	
	@After
	public void posCondicao() {
		driver.quit();
	}
	
	/*
	 * Todos os metodos de teste abaixo usam o metodo encapsulado do page objects
	 */
	@Test
	public void testeTrianguloEquilatero() {
		TrianguloPagina pagina = new TrianguloPagina(driver);
		pagina.calculaTriangulo("1","1","1");
		assertEquals("Triângulo Equilátero", pagina.pegarResultado());
	}
	
	@Test
	public void testeTrianguloIsósceles() {
		TrianguloPagina pagina = new TrianguloPagina(driver);
		pagina.calculaTriangulo("2","2","1");
		assertEquals("Triângulo Isósceles", pagina.pegarResultado());
	}
	
	/*
	 * O teste abaixo utiliza a forma descritiva do page objects
	 */
	@Test
	public void testeTrianguloIsoscelesDescritivo() {
		TrianguloPagina pagina = new TrianguloPagina(driver);
		pagina.preencherLado1("3");
		pagina.preencherLado2("3");
		pagina.preencherLado3("3");
		pagina.clicarNoBotaoCalcular();
		assertEquals("Triângulo Equilátero", pagina.pegarResultado());
	}
}
