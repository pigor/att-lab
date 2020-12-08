package br.com.adaptworks.triangulo.aceitacao.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrianguloPagina {
	
	// necessario criar o objeto do webdriver privado para a utilizacao da classe
	private WebDriver driver;
	
	/**
	 * Necessario criar um construtor, que recebera a instancia do driver (browser)
	 */
	public TrianguloPagina(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * Metodo encapsulando as acoes de calculo do triangulo.
	 * Utilizamos esta pratica quando nao precisamos preencher muitos campos
	 */
	public void calculaTriangulo(String lado1, String lado2, String lado3) {
		driver.findElement(By.id("triangulo_lado1")).sendKeys(lado1);
		driver.findElement(By.id("triangulo_lado2")).sendKeys(lado2);
		driver.findElement(By.id("triangulo_lado3")).sendKeys(lado3);
		driver.findElement(By.name("commit")).click();
	}

	
	public String pegarResultado() {
		return driver.findElement(By.cssSelector(".mensagem")).getText();
	}

	
	/*
	 * Os metodos abaixo fazem a mesma coisa que o encapsulado acima, podem com
	 * um metodo para o preenchimento de cada campo. Utilizamos esta forma, por
	 * exemplo, em um formulario de dados quando temos diversos campos para o
	 * preenchimento onde nem todos sao obrigatorios
	 */
	
	public void preencherLado1(String lado1) {
		driver.findElement(By.id("triangulo_lado1")).sendKeys(lado1);
	}

	public void preencherLado2(String lado2) {
		driver.findElement(By.id("triangulo_lado2")).sendKeys(lado2);
	}
	
	public void preencherLado3(String lado3) {
		driver.findElement(By.id("triangulo_lado3")).sendKeys(lado3);
	}
	
	public void clicarNoBotaoCalcular() {
		driver.findElement(By.name("commit")).click();
	}
}
