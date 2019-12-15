package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import helpers.Waiters;

public class IndexPage {
	private By womanLink;
	private By dressLink;
	private By tshirtLink;
	private WebDriver driver;
	private By loginLink;
	private Waiters waiter;
	
	public IndexPage(WebDriver driver) {
		this.driver = driver;
		womanLink = By.linkText("Women");
		dressLink = By.linkText("Dresses");
		tshirtLink = By.linkText("T-shirts");
		loginLink = By.linkText("Log in to your customer account");
		
		waiter = new Waiters(this.driver,10);
	}
	
	public void clickWomenLink() {
		/*WebDriverWait wait = new WebDriverWait(driver,5);
		WebElement womanButton = wait.until(ExpectedConditions.elementToBeClickable(womanLink));*/
		//Waiters waiter = new Waiters(driver,5);
		
		WebElement womanButton = waiter.waitForClickable(womanLink);
		
		womanButton.click(); //TODO: why this if you can do something else
	}
	
	public void clickDressLink() {
				
		WebElement dressButton = waiter.waitForClickable(dressLink);
		dressButton.click(); //TODO: why this if you can do something else
	}
	
	public void clickTShirtLink() {
			WebElement TShirtButton = waiter.waitForClickable(tshirtLink);
			TShirtButton.click(); //TODO: why this if you can do something else
	}
	
	public void clickLoginLink() {
		WebElement Loginlink = waiter.waitForClickable(loginLink);
		Loginlink.click();
}
	
}
