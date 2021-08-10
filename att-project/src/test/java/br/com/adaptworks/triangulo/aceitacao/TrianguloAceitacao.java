package br.com.adaptworks.triangulo.aceitacao;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TrianguloAceitacao {
	
	@Before
	public void setup(){
		// C:\\Users\\...
		System.setProperty("webdriver.gecko.driver","/home/pigor/developer/drivers/geckodriver");
	}

	@Test
	public void trianguloEquilatero() {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://triangulo-1.herokuapp.com");
		
		driver.findElement(By.id("triangulo_lado1")).sendKeys("5");
		driver.findElement(By.id("triangulo_lado2")).sendKeys("5");
		driver.findElement(By.id("triangulo_lado3")).sendKeys("5");
		
		driver.findElement(By.name("commit")).click();
		
		String mensagem = driver.findElement(By.className("mensagem")).getText();
		
		driver.quit();
		
		assertEquals("Triângulo Equilatero", mensagem);
		
	}
	
	@Test
	public void trianguloIsosceles() {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://triangulo-1.herokuapp.com");
		
		driver.findElement(By.id("triangulo_lado1")).sendKeys("3");
		driver.findElement(By.id("triangulo_lado2")).sendKeys("5");
		driver.findElement(By.id("triangulo_lado3")).sendKeys("5");
		
		driver.findElement(By.name("commit")).click();
		
		String mensagem = driver.findElement(By.className("mensagem")).getText();
		
		driver.quit();
		
		assertEquals("Triângulo Isósceles", mensagem);
		
	}
	
	@Test
	public void trianguloEscaleno() {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://triangulo-1.herokuapp.com");
		
		driver.findElement(By.id("triangulo_lado1")).sendKeys("3");
		driver.findElement(By.id("triangulo_lado2")).sendKeys("5");
		driver.findElement(By.id("triangulo_lado3")).sendKeys("6");
		
		driver.findElement(By.name("commit")).click();
		
		String mensagem = driver.findElement(By.className("mensagem")).getText();
		
		driver.quit();
		
		assertEquals("Triângulo Escaleno", mensagem);
		
	}
}
