package projeto.teste.ui.tricents.elements;

import java.io.IOException;

import org.openqa.selenium.By;

import projeto.teste.ui.tricents.browsers.Browsers;
import projeto.teste.ui.tricents.drivers.Drivers;
import projeto.teste.ui.tricents.metodos.Metodos;

public class VehiclePage extends Drivers {
	
	
	Metodos metodo = new Metodos();
	
	
	public void enterVehicleData (int optionMake, int optionModel, String capacidadeCilindro, String motor, String dataFabricacao, int optionNumberOfSeats, int optionNumberOfSeatsMotorcycle, int optionFuel, String cargaUtil, String pesoTotal, String precoTabelado, String milhasAno, String nomeEvidencia) throws InterruptedException, IOException {
		
		//Web Elements:
		
		By make = By.xpath("//select[@id='make']/option["+optionMake+"]");
		By model = By.xpath("//select[@id='model']/option["+optionModel+"]");
		By cylindercapacity = By.id("cylindercapacity");
		By engineperformance = By.id("engineperformance");
		By dateofmanufacture = By.id("dateofmanufacture");
		By numberofseats = By.xpath("//select[@id='numberofseats']/option["+optionNumberOfSeats+"]");
		By numberofseatsmotorcycle = By.xpath("//select[@id='numberofseatsmotorcycle']/option["+optionNumberOfSeatsMotorcycle+"]");
		By fuel = By.xpath("//select[@id='fuel']/option["+optionFuel+"]");
		By payload = By.id("payload");
		By totalweight = By.id("totalweight");
		By listprice = By.id("listprice");
		By annualmileage = By.id("annualmileage");
		By btnnext1 = By.id("nextenterinsurantdata");
		
		//////////////////////////////////////////////////////////////////////////
		
		metodo.clicar(make);//3
		metodo.clicar(model);//5
		metodo.digitar(cylindercapacity, capacidadeCilindro);//250
		metodo.digitar(engineperformance, motor);//20
		metodo.digitar(dateofmanufacture, dataFabricacao);//05/10/2023
		metodo.clicar(numberofseats);//3
		metodo.clicar(numberofseatsmotorcycle);//3
		metodo.clicar(fuel);//2
		metodo.digitar(payload, cargaUtil);//100
		metodo.digitar(totalweight, pesoTotal);//300
		metodo.digitar(listprice, precoTabelado);//50000
		metodo.digitar(annualmileage, milhasAno);//5000
		metodo.screenshot(nomeEvidencia);
		metodo.clicar(btnnext1);
		
	}
	
	
public void enterInsurantData (String nome, String sobrenome, String dataNascimento, int optionPais, String cep, int optionProfissao, int optionHobbies, String nomeEvidencia ) throws InterruptedException, IOException {
		
		//Web Elements:
		
		By firstName = By.id("firstname");
		By lastName = By.id("lastname");
		By birthdate = By.id("birthdate");
		By country = By.xpath("//select[@id='country']/option["+optionPais+"]");
		By zipcode = By.id("zipcode");
		By occupation = By.xpath("//select[@id='occupation']/option["+optionProfissao+"]");
		By hobbies = By.xpath("//div[10]/p[1]/label["+optionHobbies+"]");
		By btnnext2 = By.id("nextenterproductdata");
		
		
		//////////////////////////////////////////////////////////////////////////
		
		metodo.digitar(firstName, nome);//James
		metodo.digitar(lastName, sobrenome);//Rodriguez
		metodo.digitar(birthdate, dataNascimento);//04/10/1995
		metodo.clicar(country);//32
		metodo.digitar(zipcode, cep);
		metodo.clicar(occupation);//2
		metodo.clicar(hobbies);//2
		metodo.screenshot(nomeEvidencia);
		metodo.clicar(btnnext2);
		
		
	}
	
public void enterProductData (String dataInicio, int optionValorSeguro, int optionIndiceMerit, int optionDamageInsurance, int opitionOptionalProducts, int optionCarroCortesia, String nomeEvidencia ) throws InterruptedException, IOException {
	
	//Web Elements:
	
	By startdate = By.id("startdate");
	By insurancesum = By.xpath("//select[@id='insurancesum']/option["+optionValorSeguro+"]");
	By meritrating = By.xpath("//select[@id='meritrating']/option["+optionIndiceMerit+"]");
	By damageinsurance = By.xpath("//select[@id='damageinsurance']/option["+optionDamageInsurance+"]");
	By optionalproducts = By.xpath("//div[5]/p[1]/label["+opitionOptionalProducts+"]");
	By courtesycar = By.xpath("//select[@id='courtesycar']/option["+optionCarroCortesia+"]");
	By btnnext3 = By.id("nextselectpriceoption");
	
	
	//////////////////////////////////////////////////////////////////////////
	
	metodo.digitar(startdate, dataInicio);//05/17/2024
	metodo.clicar(insurancesum);//5
	metodo.clicar(meritrating);//5
	metodo.clicar(damageinsurance);//3
	metodo.clicar(optionalproducts);//1
	metodo.clicar(courtesycar);//2
	metodo.screenshot(nomeEvidencia);
	metodo.clicar(btnnext3);
	
}


/**
 * Metodo para seleção da modalidade de seguro selecionado, para selcionar basta preenceher uma das opcoes de modelos
 * disponiveis: Silver (Silver), Gold (Gold), Platinum (Platinum) e Ultimate(Ultimate)
 */

public void selectPriceOption (String modeloSeguro, String nomeEvidencia) {
	
	//Web Elements:
	By btnnext4 = By.id("nextsendquote");
	
	
	try {

		switch (modeloSeguro) {
	
		case "Silver":
		
			By seguroSilver = By.xpath("//tfoot[1]/tr[1]/th[2]/label[1]");
			metodo.clicar(seguroSilver);
			metodo.screenshot(nomeEvidencia);
			
			break;

		case "Gold":

			By seguroGold = By.xpath("//tfoot[1]/tr[1]/th[2]/label[2]");
			metodo.clicar(seguroGold);
			metodo.screenshot(nomeEvidencia);

			break;

		case "Platinum":

			By seguroPlatinum = By.xpath("//tfoot[1]/tr[1]/th[2]/label[3]");
			metodo.clicar(seguroPlatinum);
			metodo.screenshot(nomeEvidencia);

			break;
			
		case "Ultimate":

			By seguroUltimate = By.xpath("//tfoot[1]/tr[1]/th[2]/label[4]");
			metodo.clicar(seguroUltimate);
			metodo.screenshot(nomeEvidencia);

			break;

		default:

			break;

		}
		
	} catch (Exception e) {

		System.out.println("Opção de navegador " + modeloSeguro
				+ " inválida. Inserir uma das opções disponiveis: Silver, Gold, Platinum e Ultimate");
	}
	
	metodo.clicar(btnnext4);

}


public void sendQuote (String enderecoEmail, String telefone, String usuario, String senha, String confirmacaoSenha ) throws InterruptedException, IOException {
	
	//Web Elements:
	
	By email = By.id("email");
	By phone = By.id("phone");
	By username = By.id("username");
	By password = By.id("password");
	By confirmpassword = By.id("confirmpassword");
	By btnsend = By.id("sendemail");
	
	
	//////////////////////////////////////////////////////////////////////////
	
	metodo.digitar(email, enderecoEmail);//rafa.paiva@gmail.com
	metodo.digitar(phone, telefone);//11961243340
	metodo.digitar(username, usuario);//jamesRodri
	metodo.digitar(password, senha);//Jr1234
	metodo.digitar(confirmpassword, confirmacaoSenha);//Jr1234
	metodo.clicar(btnsend);
	
	
	
}


public void validarMsgCotacao( String nomeEvidencia) throws InterruptedException, IOException {
	
	By msgValidacao = By.xpath("//h2[text()='Sending e-mail success!']");
	By btnconfirm = By.xpath("//button[@class='confirm']");
	
	Thread.sleep(10000);
	metodo.validarTexto(msgValidacao, "Sending e-mail success!");
	metodo.screenshot(nomeEvidencia);
	metodo.clicar(btnconfirm);
	Browsers.fecharNavegador();
	
}









}


