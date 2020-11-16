package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DadosSeguroPage {
	
	private WebDriver driver;
	
	
	private By name = By.id("firstname");
	private By lastName = By.id("lastname");
	private By birthDate = By.id("birthdate");	
	private By checkFemale = By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(2) > span");
	private By streetAddress = By.id("streetaddress");
	private By country = By.id("country");
	private By zipCode = By.id("zipcode");
	private By city = By.id("city");
	private By occupation = By.id("occupation");
	private By checkSkydiving = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]");
	private By webSite = By.id("website");
		
	private By botaoNextInsurantData = By.id("nextenterproductdata");
	
	
		
	
	public DadosSeguroPage(WebDriver driver) {
		this.driver = driver;		
	}
		
	
	public void clicarCampoName() {
		driver.findElement(name).click();
	}
	public void preencherName(String texto) {
		driver.findElement(name).sendKeys(texto);
	}
	
	
	public void clicarCampoLastName() {
		driver.findElement(lastName).click();
	}
	public void preencherLastName(String texto) {
		driver.findElement(lastName).sendKeys(texto);
	}
	
	
	public void clicarCampoBirthDate() {
		driver.findElement(birthDate).click();
	}
	public void preencherBirthDate(String texto) {
		driver.findElement(birthDate).sendKeys(texto);
	}
	
		
	public void clicarCheckFemale() {
		driver.findElement(checkFemale).click();		
	}
	
	
	public void clicarCampoStreetAddress() {
		driver.findElement(streetAddress).click();
	}
	public void preencherStreetAddress(String texto) {
		driver.findElement(streetAddress).sendKeys(texto);
	}
	
//////////////Ininio Select País
public void clicarCountry() {
driver.findElement(country).click();
}

public Select encontrarDropdowSizeCountry() {
return new Select(driver.findElement(country));
}

public List<String> obterOpcoesSelecionadasCountry() {
List<WebElement> elementosSelecionadosCountry = encontrarDropdowSizeCountry()
		.getAllSelectedOptions();

List<String> listaOpcoesSelecionadasCountry = new ArrayList();
for (WebElement elementoCountry : elementosSelecionadosCountry) {
	listaOpcoesSelecionadasCountry.add(elementoCountry.getText());
}
return listaOpcoesSelecionadasCountry;
}

public void selecionarOpcaoDropDownCountry(String opcaoCountry) {
encontrarDropdowSizeCountry().selectByVisibleText(opcaoCountry);
}
//////////////////Fim Select País
	
	
	public void clicarCampoZipCode() {
		driver.findElement(zipCode).click();
	}
	public void preencherZipCode(String texto) {
		driver.findElement(zipCode).sendKeys(texto);
	}
	
	
	public void clicarCampoCity() {
		driver.findElement(city).click();
	}
	public void preencherCity(String texto) {
		driver.findElement(city).sendKeys(texto);
	}
	
//////////////Ininio Select Ocupação
public void clicarOccupation() {
driver.findElement(occupation).click();
}

public Select encontrarDropdowSizeOccupation() {
return new Select(driver.findElement(occupation));
}

public List<String> obterOpcoesSelecionadasOccupation() {
List<WebElement> elementosSelecionadosOccupation = encontrarDropdowSizeOccupation()
.getAllSelectedOptions();

List<String> listaOpcoesSelecionadasOccupation = new ArrayList();
for (WebElement elementoOccupation : elementosSelecionadosOccupation) {
listaOpcoesSelecionadasOccupation.add(elementoOccupation.getText());
}
return listaOpcoesSelecionadasOccupation;
}

public void selecionarOpcaoDropDownOccupation(String opcaoOccupation) {
encontrarDropdowSizeOccupation().selectByVisibleText(opcaoOccupation);
}
//////////////////Fim Select Ocupação
		
	public void clicarCheckSkydiving() {
		driver.findElement(checkSkydiving).click();		
	}
		
	
	public void clicarCampoWebSite() {
		driver.findElement(webSite).click();
	}
	public void preencherWebSite(String texto) {
		driver.findElement(webSite).sendKeys(texto);
	}
	
	
	
	
	
	public DadosProdutoPage clicarBotaoNextInsurantData()	{
		driver.findElement(botaoNextInsurantData).click();
		return new DadosProdutoPage(driver);
	}
	

}
