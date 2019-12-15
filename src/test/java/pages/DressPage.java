package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DressPage {
	
	private WebDriver driver;
	private By category;
	
	public DressPage(WebDriver driver) {
		this.driver = driver;
		category = By.xpath("//span[@class='cat-name']");
	}
	
	
	public String getCategoryText() {
		
		System.out.println("en get category text" + driver.findElement(category).getText());
		return driver.findElement(category).getText();
	}
	
}
