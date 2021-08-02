package br.com.adaptworks.triangulo.integracao.ui;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.com.adaptworks.triangulo.aceitacao.po.TrianguloPagina;
import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class TrianguloUIStepsDefinition {

	TrianguloPagina pagina;
	WebDriver driver;
	
	
	@Dado("os tres campos de entrada")
	public void os_tres_campos_de_entrada() throws Throwable {
		System.setProperty("webdriver.gecko.driver","/home/pigor/developer/drivers/geckodriver");
		driver = new FirefoxDriver();
		driver.get("http://triangulo-1.herokuapp.com");
	}
	
	@Quando("eu informo o lado1 com valor {}")
	public void eu_informo_o_lado1_com_valor(String l1) throws Throwable {
	    driver.findElement(By.id("triangulo_lado1")).sendKeys(l1);
	}

	@Quando("eu informo o lado2 com valor {}")
	public void eu_informo_o_lado2_com_valor(String l2) throws Throwable {
		driver.findElement(By.id("triangulo_lado2")).sendKeys(l2);
	}	

	@Quando("eu informo o lado3 com valor {}")
	public void eu_informo_o_lado3_com_valor(String l3) throws Throwable {
	    driver.findElement(By.id("triangulo_lado3")).sendKeys(l3);
	    driver.findElement(By.name("commit")).click();
	}
	
	@Entao("exibe a mensagem {string}")
	public void exibe_a_mensagem(String mensagem) throws Throwable {
		assertEquals(mensagem, driver.findElement(By.cssSelector(".mensagem")).getText());
	}
	
	@After
	public void bfechaBrowser() throws InterruptedException {
		driver.quit();
	}
}
