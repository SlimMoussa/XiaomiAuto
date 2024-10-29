package TestSuiteXiaomi;

import Helper.Config;
import Helper.Utils;
import Page.HomePageXiaomi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomePageTestSuiteMI {
	
	@Given("Utilisateur  sur la Page dacceuil")
	public void utilisateur_sur_la_page_dacceuil() throws Exception {
		Config.ConfChrome();
        Config.maximiseWindow();
        Config.driver.get(Utils.getproprety("Web_portal_link"));
        
	}
	
	
	@When("je survole le MenuHaut {string} et Cliquer Sur {string}")
	public void je_survole_le_menu_haut_et_cliquer_sur(String x, String y) {
		HomePageXiaomi page = new HomePageXiaomi();
		Config.Attente(10);
        page.mouseHoverMenu (x);
        page.ClickOnMenu(y);
       
	}

	@Then("La page est affiché {string}")
	public void la_page_est_affiché(String expectedTitle) throws Exception {
		Config.Attente(10);
		HomePageXiaomi page = new HomePageXiaomi();
		page.VerifMenu(expectedTitle); 
		Thread.sleep(2000);
        Config.CloseBrowser();
	}


}
