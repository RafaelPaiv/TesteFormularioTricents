package projeto.teste.ui.tricents.steps;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projeto.teste.ui.tricents.browsers.Browsers;
import projeto.teste.ui.tricents.metodos.Metodos;
import projeto.teste.ui.tricents.pageObjects.VehiclePage;

public class Formulario_Seguro_Teste {

	Metodos metodo = new Metodos();
	VehiclePage vp = new VehiclePage();

	@Given("que acesso o site da Trincents")
	public void queAcessoOSiteDaTrincents() {

		Browsers.abrirNavegador("https://sampleapp.tricentis.com/101/app.php", "Chrome");

	}

	@Given("preencho todos os dados obrigatórios do formulário enterVehicleData")
	public void preenchoTodosOsDadosObrigatóriosDoFormulárioEnterVehicleData()
			throws InterruptedException, IOException {

		vp.enterVehicleData(3, 5, "250", "20", "05/10/2023", 3, 3, 2, "100", "300", "50000", "5000",
				"evidenciaFormularioEnterVehicleData");

	}

	@Given("preencho todos os dados obrigatórios do formulário enterInsurantData")
	public void preenchoTodosOsDadosObrigatóriosDoFormulárioEnterInsurantData()
			throws InterruptedException, IOException {

		vp.enterInsurantData("James", "Rodriguez", "04/10/1995", 32, "0518099", 2, 1,
				"evidenciaFormularioEnterInsurantData");

	}

	@Given("preencho todos os dados obrigatórios do formulário enterProductData")
	public void preenchoTodosOsDadosObrigatóriosDoFormulárioEnterProductData()
			throws InterruptedException, IOException {

		vp.enterProductData("05/17/2024", 5, 5, 3, 1, 2, "evidenciaFormularioEnterProductData");

	}

	@Given("seleciono uma modalidade de seguro na página selectPriceOption")
	public void selecionoUmaModalidadeDeSeguroNaPáginaSelectPriceOption() {

		vp.selectPriceOption("Gold", "evidenciaSelectPriceOption");

	}

	@When("envio email para cotação na página sendQuote")
	public void envioEmailParaCotaçãoNaPáginaSendQuote() throws InterruptedException, IOException {

		vp.sendQuote("rafa.paiva@gmail.com", "11961243340", "jamesRodri", "Jr1234", "Jr1234");

	}

	@Then("valido mensagem de sucesso")
	public void validoMensagemDeSucesso() throws InterruptedException, IOException {

		vp.validarMsgCotacao("evidenciaSendQuote");

	}

}
