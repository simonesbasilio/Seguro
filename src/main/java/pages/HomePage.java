package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	private WebDriver driver;

	private By make = By.id("make");

	private By model = By.id("model");

	private By cylinder = By.id("cylindercapacity");

	private By performance = By.id("engineperformance");

	private By dateManufacture = By.id("dateofmanufacture");

	private By numberSeats = By.id("numberofseats");
	
	private By checkRightDriveYes = By.cssSelector("#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(1) > span");
	
	private By numberSeatsMotorcycle = By.id("numberofseatsmotorcycle");
	
	private By fuelType = By.id("fuel");	

	private By payload = By.id("payload");

	private By totalWeight = By.id("totalweight");

	private By listPrice = By.id("listprice");

	private By licensePlateNumber = By.id("licenseplatenumber");

	private By annualMileage = By.id("annualmileage");
	
	private By botaoNextEnterVdata = By.id("nextenterinsurantdata");
	
	
	

	public HomePage(WebDriver driver) {
		this.driver = driver;

	}

	////////////// Ininio Select Marca
	public void clicarMake() {
		driver.findElement(make).click();
	}

	public Select encontrarDropdowSizeMake() {
		return new Select(driver.findElement(make));
	}

	public List<String> obterOpcoesSelecionadasMake() {
		List<WebElement> elementosSelecionadosMake = encontrarDropdowSizeMake().getAllSelectedOptions();

		List<String> listaOpcoesSelecionadasMake = new ArrayList();
		for (WebElement elementoMake : elementosSelecionadosMake) {
			listaOpcoesSelecionadasMake.add(elementoMake.getText());
		}
		return listaOpcoesSelecionadasMake;
	}

	public void selecionarOpcaoDropDownMake(String opcaoMake) {
		encontrarDropdowSizeMake().selectByVisibleText(opcaoMake);
	}
	////////////////// Fim Select Marca

//////////////Ininio Select Modelo
	public void clicarModel() {
		driver.findElement(model).click();
	}

	public Select encontrarDropdowSizeModel() {
		return new Select(driver.findElement(model));
	}

	public List<String> obterOpcoesSelecionadasModel() {
		List<WebElement> elementosSelecionadosModel = encontrarDropdowSizeModel().getAllSelectedOptions();

		List<String> listaOpcoesSelecionadasModel = new ArrayList();
		for (WebElement elementoModel : elementosSelecionadosModel) {
			listaOpcoesSelecionadasModel.add(elementoModel.getText());
		}
		return listaOpcoesSelecionadasModel;
	}

	public void selecionarOpcaoDropDownModel(String opcaoModel) {
		encontrarDropdowSizeModel().selectByVisibleText(opcaoModel);
	}
//////////////////Fim Select Modelo

	public void clicarCampoCylinder() {
		driver.findElement(cylinder).click();
	}

	public void preencherCylinder(String texto) {
		driver.findElement(cylinder).sendKeys(texto);
	}

	public void clicarCampoPerformance() {
		driver.findElement(performance).click();
	}

	public void preencherPerformance(String texto) {
		driver.findElement(performance).sendKeys(texto);
	}

	public void clicarCampoDateManufacture() {
		driver.findElement(dateManufacture).click();
	}

	public void preencherDateManufacture(String texto) {
		driver.findElement(dateManufacture).sendKeys(texto);
	}

//////////////Ininio Select Numero de assentos
	public void clicarNumberSeats() {
		driver.findElement(numberSeats).click();
	}

	public Select encontrarDropdowSizeNumberSeats() {
		return new Select(driver.findElement(numberSeats));
	}

	public List<String> obterOpcoesSelecionadasNumberSeats() {
		List<WebElement> elementosSelecionadosNumberSeats = encontrarDropdowSizeNumberSeats().getAllSelectedOptions();

		List<String> listaOpcoesSelecionadasNumberSeats = new ArrayList();
		for (WebElement elementoNumberSeats : elementosSelecionadosNumberSeats) {
			listaOpcoesSelecionadasNumberSeats.add(elementoNumberSeats.getText());
		}
		return listaOpcoesSelecionadasNumberSeats;
	}

	public void selecionarOpcaoDropDownNumberSeats(String opcaoNumberSeats) {
		encontrarDropdowSizeNumberSeats().selectByVisibleText(opcaoNumberSeats);
	}
//////////////////Fim Select Numero de assentos
	
	
	public void clicarCheckRightDriveYes() {
		driver.findElement(checkRightDriveYes).click();
		
	}

	
	

//////////////Ininio Select Numero de assentos Moto
	public void clicarNumberSeatsMotorcycle() {
		driver.findElement(numberSeatsMotorcycle).click();
	}

	public Select encontrarDropdowSizeNumberSeatsMotorcycle() {
		return new Select(driver.findElement(numberSeatsMotorcycle));
	}

	public List<String> obterOpcoesSelecionadasNumberSeatsMotorcycle() {
		List<WebElement> elementosSelecionadosNumberSeatsMotorcycle = encontrarDropdowSizeNumberSeatsMotorcycle()
				.getAllSelectedOptions();

		List<String> listaOpcoesSelecionadasNumberSeatsMotorcycle = new ArrayList();
		for (WebElement elementoNumberSeatsMotorcycles : elementosSelecionadosNumberSeatsMotorcycle) {
			listaOpcoesSelecionadasNumberSeatsMotorcycle.add(elementoNumberSeatsMotorcycles.getText());
		}
		return listaOpcoesSelecionadasNumberSeatsMotorcycle;
	}

	public void selecionarOpcaoDropDownNumberSeatsMotorcycle(String opcaoNumberSeatsMotorcycle) {
		encontrarDropdowSizeNumberSeatsMotorcycle().selectByVisibleText(opcaoNumberSeatsMotorcycle);
	}
//////////////////Fim Select Numero de assentos Moto
	
	
//////////////Ininio Select Tipo de Combust�vel
public void clicarFuelType() {
driver.findElement(fuelType).click();
}

public Select encontrarDropdowSizeFuelType() {
return new Select(driver.findElement(fuelType));
}

public List<String> obterOpcoesSelecionadasFuelType() {
List<WebElement> elementosSelecionadosFuelType = encontrarDropdowSizeFuelType()
		.getAllSelectedOptions();

List<String> listaOpcoesSelecionadasFuelType = new ArrayList();
for (WebElement elementoFuelType : elementosSelecionadosFuelType) {
	listaOpcoesSelecionadasFuelType.add(elementoFuelType.getText());
}
return listaOpcoesSelecionadasFuelType;
}

public void selecionarOpcaoDropDownFuelType(String opcaoFuelType) {
encontrarDropdowSizeFuelType().selectByVisibleText(opcaoFuelType);
}
//////////////////Fim Select Tipo de Combust�vel
	
	

	public void clicarCampoPayload() {
		driver.findElement(payload).click();
	}

	public void preencherPayload(String texto) {
		driver.findElement(payload).sendKeys(texto);
	}

	public void clicarCampoTotalWeight() {
		driver.findElement(totalWeight).click();
	}

	public void preencherTotalWeight(String texto) {
		driver.findElement(totalWeight).sendKeys(texto);
	}

	public void clicarCampoListPrice() {
		driver.findElement(listPrice).click();
	}

	public void preencherListPrice(String texto) {
		driver.findElement(listPrice).sendKeys(texto);
	}

	public void clicarCampoLicensePlateNumber() {
		driver.findElement(licensePlateNumber).click();
	}

	public void preencherLicensePlateNumber(String texto) {
		driver.findElement(licensePlateNumber).sendKeys(texto);
	}

	public void clicarCampoAnnualMileage() {
		driver.findElement(annualMileage).click();
	}

	public void preencherAnnualMileage(String texto) {
		driver.findElement(annualMileage).sendKeys(texto);
	}
	
	
	public DadosSeguroPage clicarBotaoNextEnterVdata()	{
		driver.findElement(botaoNextEnterVdata).click();
		return new DadosSeguroPage(driver);
	}

	public void carregarPaginaInicial() {
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		
	}

	public String obterTituloPaginaInicial() {
		return driver.getTitle();
	}
	
	
	
	

}
