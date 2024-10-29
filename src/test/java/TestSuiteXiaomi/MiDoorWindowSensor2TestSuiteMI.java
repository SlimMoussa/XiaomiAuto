package TestSuiteXiaomi;

import Helper.Config;
import Page.MiDoorWindowSensor2Page;
import io.cucumber.java.en.*;


public class MiDoorWindowSensor2TestSuiteMI {
	
	@Given("Utilisateur est connécté sur la page Mi Door Window Sensor II")
	public void utilisateur_est_connécté_sur_la_page_mi_door_window_sensor_ii() {
		Config.ConfChrome();
        Config.maximiseWindow();
        String url = "https://mistore.com.tn/product/mi-door-window-sensor-2/";
        Config.driver.get(url);
	}

	@When("Utilisateur clique sur Ajouter Au Panier")
	public void utilisateur_clique_sur_ajouter_au_panier() throws Exception {
		MiDoorWindowSensor2Page page = new MiDoorWindowSensor2Page();
		Config.Attente(10); 
        page.ClickOnAjoutPanier();
	}

	@When("Utilisateur clique sur Bouton Panier")
	public void utilisateur_clique_sur_bouton_panier() throws Exception {
		MiDoorWindowSensor2Page page = new MiDoorWindowSensor2Page();
		Config.Attente(10); 
        page.ClickOnBoutonPanier();
	}

	@Then("Vérifier si le produit est dans le panier {string}")
	public void vérifier_si_le_produit_est_dans_le_panier(String expectedTitle) throws Exception {
		Config.Attente(10);
		MiDoorWindowSensor2Page page = new MiDoorWindowSensor2Page();
		page.VerifMenu(expectedTitle);
		Thread.sleep(2000);
        Config.CloseBrowser();
	}

}
