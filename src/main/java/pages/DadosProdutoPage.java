package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DadosProdutoPage {
	
	
private WebDriver driver;
	
	
	private By startDate = By.id("startdate");	
	private By insuranceSum = By.id("insurancesum");	
	private By meritRating = By.id("meritrating");	
	private By damageInsurance = By.id("damageinsurance");	
	private By checkEuroProtection = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]");
	private By courtesyCar = By.id("courtesycar");
		
	private By botaoNextProductData = By.id("nextselectpriceoption");
	
		
	public DadosProdutoPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	
	
	public void clicarCampoStartDate() {
		driver.findElement(startDate).click();
	}
	public void preencherStartDate(String texto) {
		driver.findElement(startDate).sendKeys(texto);
	}
	
//////////////Ininio Select Soma do Seguro
public void clicarInsuranceSum() {
driver.findElement(insuranceSum).click();
}

public Select encontrarDropdowSizeInsuranceSum() {
return new Select(driver.findElement(insuranceSum));
}

public List<String> obterOpcoesSelecionadasInsuranceSum() {
List<WebElement> elementosSelecionadosInsuranceSum = encontrarDropdowSizeInsuranceSum()
		.getAllSelectedOptions();

List<String> listaOpcoesSelecionadasInsuranceSum = new ArrayList();
for (WebElement elementoInsuranceSum : elementosSelecionadosInsuranceSum) {
	listaOpcoesSelecionadasInsuranceSum.add(elementoInsuranceSum.getText());
}
return listaOpcoesSelecionadasInsuranceSum;
}

public void selecionarOpcaoDropDownInsuranceSum(String opcaoInsuranceSum) {
encontrarDropdowSizeInsuranceSum().selectByVisibleText(opcaoInsuranceSum);
}
//////////////////Fim Select Soma do Seguro

//////////////Ininio Select Classificação de Merito
public void clicarMeritRating() {
driver.findElement(meritRating).click();
}

public Select encontrarDropdowSizeMeritRating() {
return new Select(driver.findElement(meritRating));
}

public List<String> obterOpcoesSelecionadasMeritRating() {
List<WebElement> elementosSelecionadosMeritRating = encontrarDropdowSizeMeritRating()
.getAllSelectedOptions();

List<String> listaOpcoesSelecionadasMeritRating = new ArrayList();
for (WebElement elementoMeritRating : elementosSelecionadosMeritRating) {
listaOpcoesSelecionadasMeritRating.add(elementoMeritRating.getText());
}
return listaOpcoesSelecionadasMeritRating;
}

public void selecionarOpcaoDropDownMeritRating(String opcaoMeritRating) {
encontrarDropdowSizeMeritRating().selectByVisibleText(opcaoMeritRating);
}
//////////////////Fim Select Classificação de Merito
	
//////////////Ininio Select Seguro de Danos
public void clicarDamageInsurance() {
driver.findElement(damageInsurance).click();
}

public Select encontrarDropdowSizeDamageInsurance() {
return new Select(driver.findElement(damageInsurance));
}

public List<String> obterOpcoesSelecionadasDamageInsurance() {
List<WebElement> elementosSelecionadosDamageInsurance = encontrarDropdowSizeDamageInsurance()
.getAllSelectedOptions();

List<String> listaOpcoesSelecionadasDamageInsurance = new ArrayList();
for (WebElement elementoDamageInsurance : elementosSelecionadosDamageInsurance) {
listaOpcoesSelecionadasDamageInsurance.add(elementoDamageInsurance.getText());
}
return listaOpcoesSelecionadasDamageInsurance;
}

public void selecionarOpcaoDropDownDamageInsurance(String opcaoDamageInsurance) {
encontrarDropdowSizeDamageInsurance().selectByVisibleText(opcaoDamageInsurance);
}
//////////////////Fim Select Seguro de Danos


public void clicarCheckEuroProtection() {
	driver.findElement(checkEuroProtection).click();
	
}


//////////////Ininio Select Carro de Cortesia
public void clicarCourtesyCar() {
driver.findElement(courtesyCar).click();
}

public Select encontrarDropdowSizeCourtesyCar() {
return new Select(driver.findElement(courtesyCar));
}

public List<String> obterOpcoesSelecionadasCourtesyCar() {
List<WebElement> elementosSelecionadosCourtesyCar = encontrarDropdowSizeCourtesyCar()
.getAllSelectedOptions();

List<String> listaOpcoesSelecionadasCourtesyCar = new ArrayList();
for (WebElement elementoCourtesyCar : elementosSelecionadosCourtesyCar) {
listaOpcoesSelecionadasCourtesyCar.add(elementoCourtesyCar.getText());
}
return listaOpcoesSelecionadasCourtesyCar;
}

public void selecionarOpcaoDropDownCourtesyCar(String opcaoCourtesyCar) {
encontrarDropdowSizeCourtesyCar().selectByVisibleText(opcaoCourtesyCar);
}
//////////////////Fim Select Carro de Cortesia	
	
	
	public OpcaoPrecoPage clicarBotaoNextProductData()	{
		driver.findElement(botaoNextProductData).click();
		return new OpcaoPrecoPage(driver);
	}
	
	
	

}
