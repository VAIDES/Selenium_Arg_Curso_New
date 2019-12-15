package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
		private WebDriver driver;
		//private By category;
			
		public LoginPage(WebDriver driver) {
			this.driver = driver;
			//category = By.xpath("//span[@class='cat-name']");
			System.out.println ("LLEGUE A LA PAGINA DE LOGIN");
		}
		
					
}
