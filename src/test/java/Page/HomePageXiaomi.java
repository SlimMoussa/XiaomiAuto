package Page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Helper.Config;

public class HomePageXiaomi {
	
	@FindBy (xpath = "/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li/a")
	List <WebElement> MenuHaut ;

	@FindBy (xpath = "/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li[3]/div/div/div/div/section/div/div/div/div/div/a/div/div[1]/div")
	List <WebElement> SousMenuHaut ;
	
	@FindBy (xpath = "/html/body/div[1]/div[5]/div/div/div[1]/div/header/h1")
	WebElement VerifTitre ;
	
	public HomePageXiaomi () {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void mouseHoverMenu (String menuTitle) {
	    try {
	        Actions actions2 = new Actions(Config.driver);
	        Config.Attente(5); 
	        for (WebElement menu : MenuHaut) {
	            if (menu.getText().contains(menuTitle)) {
	                actions2.moveToElement(menu).perform(); 
	            }
	        }   
	    } catch (Exception e) {
	        
	    }   
	}

	public void ClickOnMenu(String submenutitle) {
	    try {
	    	 for (WebElement SubMenu: SousMenuHaut)	{
	    			if (SubMenu.getText().contains(submenutitle))
	    				Config.Attente(10);
	    				SubMenu.click();
	            }  
	    } catch (Exception e) { 
	    }
	}
	
	public void VerifMenu (String TitraPage) {
		Config.Attente(10);
	    Assert.assertEquals(TitraPage, VerifTitre.getText());
	}
	
	}	

