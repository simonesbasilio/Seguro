package steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.DadosProdutoPage;
import pages.DadosSeguroPage;
import pages.EnviadoComSucesso;
import pages.EnviarCotacaoPage;
import pages.HomePage;
import pages.OpcaoPrecoPage;

public class Dados_cotar_seguro_steps {

	private static WebDriver driver;
	private HomePage homePage = new HomePage(driver);
	private DadosSeguroPage dadosSeguroPage = new DadosSeguroPage(driver);
	private DadosProdutoPage dadosProdutoPage = new DadosProdutoPage(driver);
	private OpcaoPrecoPage opcaoPrecoPage = new OpcaoPrecoPage(driver);
	private EnviarCotacaoPage enviarCotacaoPage = new EnviarCotacaoPage(driver);
	private EnviadoComSucesso enviadoComSucesso = new EnviadoComSucesso(driver);

	@Before
	public static void inicializar() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\86\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Dado("Que estou na tela inicial Vehice Data")
	public void que_estou_na_tela_inicial_vehice_data() {
		homePage.carregarPaginaInicial();
		assertThat(homePage.obterTituloPaginaInicial(), is("Enter Vehicle Data"));
	}

	@Quando("Seleciono a marca do veiculo no campo Make")
	public void seleciono_a_marca_do_veiculo_no_campo_make() {

		homePage.clicarMake();

		List<String> listaOpcoesMake = homePage.obterOpcoesSelecionadasMake();

		homePage.selecionarOpcaoDropDownMake("Honda");

		listaOpcoesMake = homePage.obterOpcoesSelecionadasMake();
	}

	@Quando("Seleciono o campo Model")
	public void seleciono_o_campo_model() {

		homePage.clicarModel();

		List<String> listaOpcoesModel = homePage.obterOpcoesSelecionadasModel();

		homePage.selecionarOpcaoDropDownModel("Three-Wheeler");

		listaOpcoesModel = homePage.obterOpcoesSelecionadasModel();
	}

	@Quando("Preencho o campo Cylinder Capacity")
	public void preencho_o_campo_cylinder_capacity() {

		homePage.clicarCampoCylinder();
		homePage.preencherCylinder("90");
	}

	@Quando("Preencho o campo opcaoEnginePerformance")
	public void preencho_o_campo_opcao_engine_performance() {

		homePage.clicarCampoPerformance();
		homePage.preencherPerformance("1000");
	}

	@Quando("Preencho o campo Date of Manufacture")
	public void preencho_o_campo_date_of_manufacture() {

		homePage.clicarCampoDateManufacture();
		homePage.preencherDateManufacture("12/03/1999");
	}

	@Quando("Seleciono o campo Number of Seats")
	public void seleciono_o_campo_number_of_seats() {

		homePage.clicarNumberSeats();

		List<String> listaOpcoesNumberSeats = homePage.obterOpcoesSelecionadasNumberSeats();

		homePage.selecionarOpcaoDropDownNumberSeats("3");

		listaOpcoesNumberSeats = homePage.obterOpcoesSelecionadasNumberSeats();
	}

	@Quando("Informo qual opcao no campo Right Hand Drive")
	public void informo_qual_opcao_no_campo_right_hand_drive() {

		homePage.clicarCheckRightDriveYes();
	}

	@Quando("Seleciono novamente o campo Number of Seats")
	public void seleciono_novamente_o_campo_number_of_seats() {

		homePage.clicarNumberSeatsMotorcycle();

		List<String> listaOpcoesNumberSeatsMotorcycle = homePage.obterOpcoesSelecionadasNumberSeatsMotorcycle();

		homePage.selecionarOpcaoDropDownNumberSeatsMotorcycle("2");

		listaOpcoesNumberSeatsMotorcycle = homePage.obterOpcoesSelecionadasNumberSeatsMotorcycle();

	}

	@Quando("Seleciono o campo Fuel Type")
	public void seleciono_o_campo_fuel_type() {

		homePage.clicarFuelType();

		List<String> listaOpcoesFuelType = homePage.obterOpcoesSelecionadasFuelType();

		homePage.selecionarOpcaoDropDownFuelType("Petrol");

		listaOpcoesFuelType = homePage.obterOpcoesSelecionadasFuelType();

	}

	@Quando("Preencho o campo Payload")
	public void preencho_o_campo_payload() {

		homePage.clicarCampoPayload();
		homePage.preencherPayload("800");

	}

	@Quando("Preencho o campo Total Weight")
	public void preencho_o_campo_total_weight() {

		homePage.clicarCampoTotalWeight();
		homePage.preencherTotalWeight("950");
	}

	@Quando("Preencho o campo List Price")
	public void preencho_o_campo_list_price() {

		homePage.clicarCampoListPrice();
		homePage.preencherListPrice("50000");
	}

	@Quando("Preencho o campo License Plate Number")
	public void preencho_o_campo_license_plate_number() {

		homePage.clicarCampoLicensePlateNumber();
		homePage.preencherLicensePlateNumber("12345");

	}

	@Quando("Preencho o campo Annual Mileage")
	public void preencho_o_campo_annual_mileage() {

		homePage.clicarCampoAnnualMileage();
		homePage.preencherAnnualMileage("10000");
	}

	@Quando("Clico no botao Next para ir para a tela Insurant Data")
	public void clico_no_botao_next_para_ir_para_a_tela_insurant_data() {
		homePage.clicarBotaoNextEnterVdata();
	}

	/////////////////////// Tela Insurant Data

	@Quando("Preencho o primeiro nome do segurado")
	public void preencho_o_primeiro_nome_do_segurado() {
		dadosSeguroPage.clicarCampoName();
		dadosSeguroPage.preencherName("Simone");
	}

	@Quando("Preencho o sobrenome do segurado")
	public void preencho_o_sobrenome_do_segurado() {

		dadosSeguroPage.clicarCampoLastName();
		dadosSeguroPage.preencherLastName("Basilio");

	}

	@Quando("Preencho o Date of Birth")
	public void preencho_o_date_of_birth() {

		dadosSeguroPage.clicarCampoBirthDate();
		dadosSeguroPage.preencherBirthDate("12/03/1978");
	}

	@Quando("Clico na opcao Gender Female")
	public void clico_na_opcao_gender_female() {

		dadosSeguroPage.clicarCheckFemale();
	}

	@Quando("Preencho o campo Street Address")
	public void preencho_o_campo_street_address() {

		dadosSeguroPage.clicarCampoStreetAddress();
		dadosSeguroPage.preencherStreetAddress("Rua Felicidade");
	}

	@Quando("Seleciono o campo Country")
	public void seleciono_o_campo_country() {

		dadosSeguroPage.clicarCountry();

		List<String> listaOpcoesCountry = dadosSeguroPage.obterOpcoesSelecionadasCountry();

		dadosSeguroPage.selecionarOpcaoDropDownCountry("Brazil");

		listaOpcoesCountry = dadosSeguroPage.obterOpcoesSelecionadasCountry();
	}

	@Quando("Preencho o campo Zip Code")
	public void preencho_o_campo_zip_code() {

		dadosSeguroPage.clicarCampoZipCode();
		dadosSeguroPage.preencherZipCode("34343434");

	}

	@Quando("Preencho o campo City")
	public void preencho_o_campo_city() {

		dadosSeguroPage.clicarCampoCity();
		dadosSeguroPage.preencherCity("Sao Paulo");
	}

	@Quando("Seleciono o campo Occupation")
	public void seleciono_o_campo_occupation() {

		dadosSeguroPage.clicarOccupation();

		List<String> listaOpcoesOccupation = dadosSeguroPage.obterOpcoesSelecionadasOccupation();

		dadosSeguroPage.selecionarOpcaoDropDownOccupation("Employee");

		listaOpcoesOccupation = dadosSeguroPage.obterOpcoesSelecionadasOccupation();
	}

	@Quando("Clico na opcao Sky diving no Hobbies")
	public void clico_na_opcao_sky_diving_no_hobbies() {

		dadosSeguroPage.clicarCheckSkydiving();

	}

	@Quando("Preencho o campo Website")
	public void preencho_o_campo_website() {

		dadosSeguroPage.clicarCampoWebSite();
		dadosSeguroPage.preencherWebSite("www.sisi.com");
	}

	@Quando("Clico no botao Next para ir para a tela Product Data")
	public void clico_no_botao_next_para_ir_para_a_tela_product_data() {

		dadosSeguroPage.clicarBotaoNextInsurantData();

	}

	////////////////////// Tela Product Data

	@Quando("Preencho o campo Start Date")
	public void preencho_o_campo_start_date() {
		dadosProdutoPage.clicarCampoStartDate();
		dadosProdutoPage.preencherStartDate("11/30/2021");

	}

	@Quando("Seleciono o campo Insurance Sum")
	public void seleciono_o_campo_insurance_sum() {

		dadosProdutoPage.clicarInsuranceSum();

		List<String> listaOpcoesInsuranceSum = dadosProdutoPage.obterOpcoesSelecionadasInsuranceSum();

		dadosProdutoPage.selecionarOpcaoDropDownInsuranceSum("5.000.000,00");

		listaOpcoesInsuranceSum = dadosProdutoPage.obterOpcoesSelecionadasInsuranceSum();
	}

	@Quando("Seleciono o campo Merit Rating")
	public void seleciono_o_campo_merit_rating() {

		dadosProdutoPage.clicarMeritRating();

		List<String> listaOpcoesMeritRating = dadosProdutoPage.obterOpcoesSelecionadasMeritRating();

		dadosProdutoPage.selecionarOpcaoDropDownMeritRating("Bonus 3");

		listaOpcoesMeritRating = dadosProdutoPage.obterOpcoesSelecionadasMeritRating();
	}

	@Quando("Seleciono o campo Damage Insurance")
	public void seleciono_o_campo_damage_insurance() {

		dadosProdutoPage.clicarDamageInsurance();

		List<String> listaOpcoesDamageInsurance = dadosProdutoPage.obterOpcoesSelecionadasDamageInsurance();

		dadosProdutoPage.selecionarOpcaoDropDownDamageInsurance("Full Coverage");

		listaOpcoesDamageInsurance = dadosProdutoPage.obterOpcoesSelecionadasDamageInsurance();
	}

	@Quando("Clico na opcao euro Protection no Optional")
	public void clico_na_opcao_euro_protection_no_optional() {

		dadosProdutoPage.clicarCheckEuroProtection();
	}

	@Quando("Seleciono o campo Courtesy Car")
	public void seleciono_o_campo_courtesy_car() {

		dadosProdutoPage.clicarCourtesyCar();

		List<String> listaOpcoesCourtesyCar = dadosProdutoPage.obterOpcoesSelecionadasCourtesyCar();

		dadosProdutoPage.selecionarOpcaoDropDownCourtesyCar("Yes");

		listaOpcoesCourtesyCar = dadosProdutoPage.obterOpcoesSelecionadasCourtesyCar();
	}

	@Quando("Clico no botao Next para ir para a tela Price Option")
	public void clico_no_botao_next_para_ir_para_a_tela_price_option() {

		dadosProdutoPage.clicarBotaoNextProductData();
	}

	///////////////// Tela Price Option

	@Quando("Clico para escolher uma opcao")
	public void clico_para_escolher_uma_opcao() {

		opcaoPrecoPage.clicarCheckSelecionarOpcao1();
	}

	@Entao("Clico no botao Next para ir para a tela Send Qhote")
	public void clico_no_botao_next_para_ir_para_a_tela_send_qhote() {

		opcaoPrecoPage.clicarBotaoNextOpcaoPreco();
	}

	////////////////////// Tela Send Qhote

	@Quando("Preencho o campo email")
	public void preencho_o_campo_email() {

		enviarCotacaoPage.clicarCampoEmail();
		enviarCotacaoPage.preencherEmail("sisi@gmail.com");

	}

	@Quando("Preencho o campo Phone")
	public void preencho_o_campo_phone() {

		enviarCotacaoPage.clicarCampoPhone();
		enviarCotacaoPage.preencherPhone("343433434");
	}

	@Quando("Preencho o campo Username")
	public void preencho_o_campo_username() {

		enviarCotacaoPage.clicarCampoUsername();
		enviarCotacaoPage.preencherUsername("Deus");
	}

	@Quando("Preencho o campo Password")
	public void preencho_o_campo_password() {

		enviarCotacaoPage.clicarCampoPassword();
		enviarCotacaoPage.preencherPassword("JesusEh10");

	}

	@Quando("Preencho o campo ConfirmPassword")
	public void preencho_o_campo_confirm_password() {

		enviarCotacaoPage.clicarCampoConfirmPassword();
		enviarCotacaoPage.preencherConfirmPassword("JesusEh10");
	}

	@Quando("Preencho o campo Comments")
	public void preencho_o_campo_comments() {

		enviarCotacaoPage.clicarCampoComments();
		enviarCotacaoPage.preencherComments("Nunca foi sorte. Sempre foi Deus.");
	}

	@Quando("Clico no botao Send para enviar a cotacao")
	public void clico_no_botao_send_para_enviar_a_cotacao() {

		enviarCotacaoPage.clicarBotaoSend();
	}
	
	//////////////////////////Tela confirmacao de envio de email

	@Entao("Clico no botao Ok na tela de confirmacao de envio de email")
	public void clico_no_botao_ok_na_tela_de_confirmacao_de_envio_de_email() {
		
		assertThat(enviadoComSucesso.obterTituloPaginaEnviadoComSucesso(), is("Send Quote"));

		enviadoComSucesso.clicarOk();
	}

	@After
	public static void finalizar() {
		driver.quit();

	}

}
