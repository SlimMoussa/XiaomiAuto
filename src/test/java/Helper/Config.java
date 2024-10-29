package Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Config {
	
	public static WebDriver driver ;
	public static Actions actions2;
	
	
	
	public static void ConfChrome () {
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	public static void maximiseWindow() {
		driver.manage().window().maximize();
	}
	
	public static void Attente (int s) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
	}

	public static void CloseBrowser () {
		driver.quit();
	}
	 

}
