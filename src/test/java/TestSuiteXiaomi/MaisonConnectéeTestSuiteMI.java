package TestSuiteXiaomi;

import Helper.Config;
import Page.MaisonConnectéePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MaisonConnectéeTestSuiteMI {
	
	@Given("Utilisateur est connécté sur la page maison connectée")
	public void utilisateur_est_connécté_sur_la_page_maison_connectée() {
		Config.ConfChrome();
        Config.maximiseWindow();
        String url = "https://mistore.com.tn/product-category/maison-connectee/";
        Config.driver.get(url);
	}

	@When("Utilisateur effectue le tri {string} et clique sur le produit {string}")
	public void utilisateur_effectue_le_tri_et_clique_sur_le_produit(String sortTri, String nameProduct) {
		MaisonConnectéePage page = new MaisonConnectéePage();
		Config.Attente(10); 
	
        page.TriAndClickOnMenuMC(sortTri, nameProduct);
	}

	@Then("Redirection vers la page du produit {string}")
	public void redirection_vers_la_page_du_produit(String expectedTitle) throws Exception {
		Config.Attente(10);
		MaisonConnectéePage page = new MaisonConnectéePage();
		page.VerifMenu(expectedTitle);
		Thread.sleep(2000);
        Config.CloseBrowser();
	}
}
