package Page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Helper.Config;

public class MaisonConnectéePage {
	
	@FindBy (name = "orderby")
	WebElement Tri ;

	@FindBy (xpath = "/html/body/div[1]/div[5]/div/div/div[1]/div/div[3]/div/div/div/div[2]/div[2]/h3/a")
	List <WebElement> MenuMC ;
	
	@FindBy (xpath = "/html/body/div[1]/div[4]/div/div/div/div/div[3]/div[1]/div/div[1]/div/div[1]/h1")
	WebElement VerifTitre ;
	
	
	public MaisonConnectéePage () {
		PageFactory.initElements(Config.driver, this);
	}
	

	public void TriAndClickOnMenuMC(String SortTri, String nameProduct) {
       
		    Select select = new Select (Tri);
		    select.selectByVisibleText(SortTri);
		    
        try {
           
            for (WebElement menu : MenuMC) {
                if (menu.getText().contains(nameProduct)) {
                    Config.Attente(10); 
                    menu.click(); 
                    break; // Arrête la boucle une fois le produit trouvé
                }
            }
       
            
        } catch (Exception e) {
           
        }
    }
	
	
	public void VerifMenu (String TitraPage) {
		Config.Attente(10);
	    Assert.assertEquals(TitraPage, VerifTitre.getText());
	}
}	

	

