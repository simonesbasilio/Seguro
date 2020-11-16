package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpcaoPrecoPage {
	
private WebDriver driver;
	
	
	private By checkSelecionarOpcao1 = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(1) > span");
	
	private By botaoNextOpcaoPreco = By.id("nextsendquote");
	
	
	
		
	public OpcaoPrecoPage(WebDriver driver) {
		this.driver = driver;
		
		
	}
	
	public void clicarCheckSelecionarOpcao1() {
		driver.findElement(checkSelecionarOpcao1).click();
		
	}
	
	
	public EnviarCotacaoPage clicarBotaoNextOpcaoPreco()	{
		driver.findElement(botaoNextOpcaoPreco).click();
		return new EnviarCotacaoPage(driver);
	}

}
