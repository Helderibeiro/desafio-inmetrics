package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import action.automacaoInmetricsAction;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class automacaoInmetricsStep {
	
	public WebDriver driver;
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src/main/java/util.chromeDriver/chromedriver.exe");
	}
	automacaoInmetricsAction action = new automacaoInmetricsAction();
	
	@Dado("^que o usuario queira acessar site da inmetrics$")
	public void que_o_usuario_queira_acessar_site_da_inmetrics() throws Throwable {
		driver = new ChromeDriver();
		
	}

	@Quando("^digitar na url o endereco desejado$")
	public void digitar_na_url_o_endereco_desejado() throws Throwable {
		action.acessaSite(driver);
	    
	}

	@Quando("^clicar no menu Carreiras$")
	public void clicar_no_menu_Carreiras() throws Throwable {
	    action.acessaMenuCarreira(driver);
	}

	@Quando("^clicar no botao confirmar nossas vagas$")
	public void cliclar_no_botao_confirmar_nossas_vagas() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    action.acessaVagas(driver);
	}

	@Entao("^o sistema apresentara a relacao de vagas em aberto$")
	public void o_sistema_apresentara_a_relacao_de_vagas_em_aberto() throws Throwable {
	    action.validaVagas(driver);
	}



}
