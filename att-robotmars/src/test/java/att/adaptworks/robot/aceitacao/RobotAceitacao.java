package att.adaptworks.robot.aceitacao;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RobotAceitacao {
	
	@Before
	public void setup(){
		// C:\\Users\\...
		System.setProperty("webdriver.gecko.driver","/home/pigor/developer/drivers/geckodriver");
	}

	@Test
	public void testDeMovimentacao() {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://robotmars.herokuapp.com/");
		
		driver.findElement(By.id("size_x")).sendKeys("10");
		driver.findElement(By.id("size_y")).sendKeys("10");
		driver.findElement(By.id("start_x")).sendKeys("2");
		driver.findElement(By.id("start_y")).sendKeys("2");
		driver.findElement(By.id("moves")).sendKeys("2N 4l");
		
		driver.findElement(By.name("commit")).click();
		
		WebElement mensagemElement = new WebDriverWait(driver, 5L).until(d -> d.findElement(By.className("mensagem")));
		
		String mensagem = mensagemElement.getText();
		
		driver.quit();
		
		assertEquals("Inicio (2, 2) / Movimento [2N 4L] / Posição Final: (6,4)", mensagem);
	}
}