package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnviadoComSucesso {

	private WebDriver driver;

	private By botaoOk = By.xpath("/html/body/div[4]/div[7]/div/button");

	public EnviadoComSucesso(WebDriver driver) {
		this.driver = driver;

	}

	public void clicarOk() {
		driver.findElement(botaoOk).click();
	}

	public String obterTituloPaginaEnviadoComSucesso() {
		return driver.getTitle();
	}
	
	
	
}
