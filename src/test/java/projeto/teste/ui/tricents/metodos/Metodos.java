package projeto.teste.ui.tricents.metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import projeto.teste.ui.tricents.drivers.Drivers;

public class Metodos extends Drivers {
	
	public void clicar(By elemento) {

		driver.findElement(elemento).click();

	}

	public void digitar(By elemento, String texto) {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void submit(By elemento) {

		driver.findElement(elemento).submit();

	}

	public void limparCampo(By elemento) {

		driver.findElement(elemento).clear();

	}

	
	public void mouseOver(By elemento) {

		Actions action = new Actions(driver);
		WebElement element = driver.findElement(elemento);
		action.moveToElement(element).perform();

	}


	public void doubleClick(By elemento) {

		// WebElement element = driver.findElement(elemento);
		// action.doubleClick(element).perform();

	}

	public void validarTexto(By elemento, String textoEsperado) {

		String textoSite = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, textoSite);

		System.out.println("O texto validado foi: " + textoSite);

	}

	public void pausar() throws InterruptedException {

		Thread.sleep(3000);

	}

	public void screenshot(String nomeEvidencia) throws InterruptedException, IOException {

		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File scrDest = new File("./evidencias/" + nomeEvidencia + ".png");
		FileUtils.copyFile(scrFile, scrDest);

	}

	public void validarElementos(By elemento1, By elemento2) {

		String textoSite = driver.findElement(elemento1).getText();
		String textoEsperado = driver.findElement(elemento2).getText();
		assertEquals(textoEsperado, textoSite);

		System.out.println("O texto validado foi: " + textoSite);

	}

	public void validarTitulo(String tituloEsperado) {

		String tituloSite = driver.getTitle();
		assertEquals(tituloEsperado, tituloSite);

	}

	public void mudarPagina(String tituloEsperado) {

		String paginaPrincipal = driver.getWindowHandle();
		Set<String> paginasAbertas = driver.getWindowHandles();
		for (String janela : paginasAbertas) {

			if (!janela.equals(paginaPrincipal)) {

				driver.switchTo().window(janela);
				String tituloSite = driver.getTitle();
				assertEquals(tituloEsperado, tituloSite);

			}

		}

		driver.close();

		driver.switchTo().window(paginaPrincipal);

	}

	

	public void esperarClicar(By elemento, int tempo) {

		WebDriverWait wait = new WebDriverWait(driver, tempo);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elemento));
		element.click();

	}

}
