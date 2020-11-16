package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnviarCotacaoPage {
	
	
private WebDriver driver;
	
	
	private By email = By.id("email");	
	private By phone = By.id("phone");
	private By username = By.id("username");
	private By password = By.id("password");
	private By confirmPassword = By.id("confirmpassword");
	private By comments = By.id("Comments");
	
	private By botaoSend = By.id("sendemail");
	
		
		
	public EnviarCotacaoPage(WebDriver driver) {
		this.driver = driver;
			
	}
	
	public void clicarCampoEmail() {
		driver.findElement(email).click();
	}
	public void preencherEmail(String texto) {
		driver.findElement(email).sendKeys(texto);
	}
	
	
	public void clicarCampoPhone() {
		driver.findElement(phone).click();
	}
	public void preencherPhone(String texto) {
		driver.findElement(phone).sendKeys(texto);
	}
	
		
	public void clicarCampoUsername() {
		driver.findElement(username).click();
	}
	public void preencherUsername(String texto) {
		driver.findElement(username).sendKeys(texto);
	}
	
	
	public void clicarCampoPassword() {
		driver.findElement(password).click();
	}
	public void preencherPassword(String texto) {
		driver.findElement(password).sendKeys(texto);
	}
		
	
	public void clicarCampoConfirmPassword() {
		driver.findElement(confirmPassword).click();
	}
	public void preencherConfirmPassword(String texto) {
		driver.findElement(confirmPassword).sendKeys(texto);
	}
	
	
	
	public void clicarCampoComments() {
		driver.findElement(comments).click();
	}
	public void preencherComments(String texto) {
		driver.findElement(comments).sendKeys(texto);
	}
	
	
	public EnviadoComSucesso clicarBotaoSend() {
		driver.findElement(botaoSend).click();
		return new EnviadoComSucesso(driver);
		
	}
	
	
	
	

}
