package action;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class automacaoInmetricsAction {

	public WebDriver driver;

	public void acessaSite(WebDriver driver) {
		System.setProperty("webdriver.chrome.driver", "src/main/java/util.chromeDriver/chromedriver.exe");
		driver.get("https://www.inmetrics.com.br/");
		if (driver.getTitle().contains("Home - Inmetrics")) {
			System.out.println("Usu�rio no site correto");

		} else {
			System.out.println("Usu�rio em site incorreto");
		}

	}

	public void acessaMenuCarreira(WebDriver driver) {
		driver.findElement(By.id("linkcarreiras")).click();

	}

	public void acessaVagas(WebDriver driver) throws Exception {
		Thread.sleep(5000);
		try {
			driver.findElement(By.xpath("//*[contains(text(),'confira nossas vagas')]")).click();
		} catch (Exception e) {
			throw new Exception("Erro ao abrir a p�gina de carreiras");
		}

	}

	public void validaVagas(WebDriver driver) {

		if (driver.getTitle().equals("Inmetrics")) {
			System.out.println("Usu�rio na pagina de vagas");

		} else {
			System.out.println("Usu�rio em pagina incorreto");
		}
	}

}
