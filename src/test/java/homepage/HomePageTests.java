package homepage;

import java.util.List;

import org.junit.jupiter.api.Test;

import base.BaseTests;
import pages.DadosProdutoPage;
import pages.DadosSeguroPage;
import pages.EnviadoComSucesso;
import pages.EnviarCotacaoPage;
import pages.OpcaoPrecoPage;

public class HomePageTests extends BaseTests {

	@Test
	public void testCarregarPaginaInicial() {
		carregarPaginaInicial();
	}

	@Test
	public void testInsira_Dados_veiculo() {

		homePage.clicarMake();

		List<String> listaOpcoesMake = homePage.obterOpcoesSelecionadasMake();

		homePage.selecionarOpcaoDropDownMake("Honda");

		listaOpcoesMake = homePage.obterOpcoesSelecionadasMake();

		////////
		homePage.clicarModel();

		List<String> listaOpcoesModel = homePage.obterOpcoesSelecionadasModel();

		homePage.selecionarOpcaoDropDownModel("Three-Wheeler");

		listaOpcoesModel = homePage.obterOpcoesSelecionadasModel();

		/////

		homePage.clicarCampoCylinder();
		homePage.preencherCylinder("90");

		homePage.clicarCampoPerformance();
		homePage.preencherPerformance("1000");

		homePage.clicarCampoDateManufacture();
		homePage.preencherDateManufacture("12/03/1999");

		////////
		homePage.clicarNumberSeats();

		List<String> listaOpcoesNumberSeats = homePage.obterOpcoesSelecionadasNumberSeats();

		homePage.selecionarOpcaoDropDownNumberSeats("3");

		listaOpcoesNumberSeats = homePage.obterOpcoesSelecionadasNumberSeats();

		/////

		homePage.clicarCheckRightDriveYes();

		////////
		homePage.clicarNumberSeatsMotorcycle();

		List<String> listaOpcoesNumberSeatsMotorcycle = homePage.obterOpcoesSelecionadasNumberSeatsMotorcycle();

		homePage.selecionarOpcaoDropDownNumberSeatsMotorcycle("2");

		listaOpcoesNumberSeatsMotorcycle = homePage.obterOpcoesSelecionadasNumberSeatsMotorcycle();

		/////

		homePage.clicarFuelType();

		List<String> listaOpcoesFuelType = homePage.obterOpcoesSelecionadasFuelType();

		homePage.selecionarOpcaoDropDownFuelType("Petrol");

		listaOpcoesFuelType = homePage.obterOpcoesSelecionadasFuelType();

		/////

		homePage.clicarCampoPayload();
		homePage.preencherPayload("800");

		homePage.clicarCampoTotalWeight();
		homePage.preencherTotalWeight("950");

		homePage.clicarCampoListPrice();
		homePage.preencherListPrice("50000");

		homePage.clicarCampoLicensePlateNumber();
		homePage.preencherLicensePlateNumber("12345");

		homePage.clicarCampoAnnualMileage();
		homePage.preencherAnnualMileage("10000");

	}

	DadosSeguroPage dadosSeguroPage;

	@Test
	public void testInsira_Dados_Seguro() {

		testInsira_Dados_veiculo();

		dadosSeguroPage = homePage.clicarBotaoNextEnterVdata();

		dadosSeguroPage.clicarCampoName();
		dadosSeguroPage.preencherName("Simone");

		dadosSeguroPage.clicarCampoLastName();
		dadosSeguroPage.preencherLastName("Basilio");

		dadosSeguroPage.clicarCampoBirthDate();
		dadosSeguroPage.preencherBirthDate("12/03/1978");

		dadosSeguroPage.clicarCheckFemale();

		dadosSeguroPage.clicarCampoStreetAddress();
		dadosSeguroPage.preencherStreetAddress("Rua Felicidade");

		///////
		dadosSeguroPage.clicarCountry();

		List<String> listaOpcoesCountry = dadosSeguroPage.obterOpcoesSelecionadasCountry();

		dadosSeguroPage.selecionarOpcaoDropDownCountry("Brazil");

		listaOpcoesCountry = dadosSeguroPage.obterOpcoesSelecionadasCountry();

		////////

		dadosSeguroPage.clicarCampoZipCode();
		dadosSeguroPage.preencherZipCode("34343434");

		dadosSeguroPage.clicarCampoCity();
		dadosSeguroPage.preencherCity("Sao Paulo");

		///////
		dadosSeguroPage.clicarOccupation();

		List<String> listaOpcoesOccupation = dadosSeguroPage.obterOpcoesSelecionadasOccupation();

		dadosSeguroPage.selecionarOpcaoDropDownOccupation("Employee");

		listaOpcoesOccupation = dadosSeguroPage.obterOpcoesSelecionadasOccupation();

		////////

		dadosSeguroPage.clicarCheckSkydiving();

		dadosSeguroPage.clicarCampoWebSite();
		dadosSeguroPage.preencherWebSite("www.sisi.com");

	}

	DadosProdutoPage dadosProdutoPage;

	@Test
	public void testInsira_Dados_Produto() {

		testInsira_Dados_Seguro();

		dadosProdutoPage = dadosSeguroPage.clicarBotaoNextInsurantData();

		dadosProdutoPage.clicarCampoStartDate();
		dadosProdutoPage.preencherStartDate("11/30/2021");

		///////
		dadosProdutoPage.clicarInsuranceSum();

		List<String> listaOpcoesInsuranceSum = dadosProdutoPage.obterOpcoesSelecionadasInsuranceSum();

		dadosProdutoPage.selecionarOpcaoDropDownInsuranceSum("5.000.000,00");

		listaOpcoesInsuranceSum = dadosProdutoPage.obterOpcoesSelecionadasInsuranceSum();

		////////

		///////
		dadosProdutoPage.clicarMeritRating();

		List<String> listaOpcoesMeritRating = dadosProdutoPage.obterOpcoesSelecionadasMeritRating();

		dadosProdutoPage.selecionarOpcaoDropDownMeritRating("Bonus 3");

		listaOpcoesMeritRating = dadosProdutoPage.obterOpcoesSelecionadasMeritRating();

		////////

		///////
		dadosProdutoPage.clicarDamageInsurance();

		List<String> listaOpcoesDamageInsurance = dadosProdutoPage.obterOpcoesSelecionadasDamageInsurance();

		dadosProdutoPage.selecionarOpcaoDropDownDamageInsurance("Full Coverage");

		listaOpcoesDamageInsurance = dadosProdutoPage.obterOpcoesSelecionadasDamageInsurance();

		////////

		dadosProdutoPage.clicarCheckEuroProtection();

		///////
		dadosProdutoPage.clicarCourtesyCar();

		List<String> listaOpcoesCourtesyCar = dadosProdutoPage.obterOpcoesSelecionadasCourtesyCar();

		dadosProdutoPage.selecionarOpcaoDropDownCourtesyCar("Yes");

		listaOpcoesCourtesyCar = dadosProdutoPage.obterOpcoesSelecionadasCourtesyCar();

		////////

	}

	OpcaoPrecoPage opcaoPrecoPage;

	@Test
	public void testInsira_Opcao_Preco() {

		testInsira_Dados_Produto();

		opcaoPrecoPage = dadosProdutoPage.clicarBotaoNextProductData();

		opcaoPrecoPage.clicarCheckSelecionarOpcao1();

	}

	EnviarCotacaoPage enviarCotacaoPage;

	@Test
	public void testEnviar_Cotacao() {

		testInsira_Opcao_Preco();

		enviarCotacaoPage = opcaoPrecoPage.clicarBotaoNextOpcaoPreco();

		enviarCotacaoPage.clicarCampoEmail();
		enviarCotacaoPage.preencherEmail("sisi@gmail.com");

		enviarCotacaoPage.clicarCampoPhone();
		enviarCotacaoPage.preencherPhone("343433434");

		enviarCotacaoPage.clicarCampoUsername();
		enviarCotacaoPage.preencherUsername("Deus");

		enviarCotacaoPage.clicarCampoPassword();
		enviarCotacaoPage.preencherPassword("JesusEh10");

		enviarCotacaoPage.clicarCampoConfirmPassword();
		enviarCotacaoPage.preencherConfirmPassword("JesusEh10");

		enviarCotacaoPage.clicarCampoComments();
		enviarCotacaoPage.preencherComments("Nunca foi sorte. Sempre foi Deus.");

		

	}

	EnviadoComSucesso enviadoComSucesso;

	@Test
	public void testEnviado_Com_Sucesso() {

		testEnviar_Cotacao();

		enviadoComSucesso = enviarCotacaoPage.clicarBotaoSend();

		enviadoComSucesso.clicarOk();
	}

}
