package Page;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Helper.Config;

public class MiDoorWindowSensor2Page {
	
	 @FindBy (xpath = "/html/body/div[1]/div[4]/div/div/div/div/div[3]/div[1]/div/div[3]/div/form/div/button")
	WebElement AjouterAuPanier ;
	
	@FindBy (xpath = "/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/section[1]/div[1]/div[4]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/i[1]")  
	WebElement BoutonPanier ;
	
	@FindBy (xpath = "/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/section[1]/div[1]/div[4]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[2]/a[1]/span[1]")
	WebElement VerifProduitPanier ;
	
	
	public MiDoorWindowSensor2Page () {
		PageFactory.initElements(Config.driver, this);
		Config.Attente(10);
	}
	
	public void ClickOnAjoutPanier() throws Exception {
		AjouterAuPanier.click();
		Thread.sleep(2000);
                }
	
	public void ClickOnBoutonPanier() throws InterruptedException  {
		BoutonPanier.click();
		Thread.sleep(2000);
                }
	
	public void VerifMenu (String TitraPage) {
	    Assert.assertEquals(TitraPage, VerifProduitPanier.getText());
	}
	
    } 

