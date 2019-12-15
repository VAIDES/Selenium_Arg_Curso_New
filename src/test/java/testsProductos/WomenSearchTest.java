package testsProductos;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import CheckListWeb.checkLinksWebPage;
import commonSteps.CommonSteps;
import helpers.Helpers;

public class WomenSearchTest extends CommonSteps{
	
	private Helpers helper = new Helpers();
	
	/*
	@Test(description = "verificar links")
	public void WomanVerifLinks () {
		checkLinksWebPage page = new checkLinksWebPage (driver);
		Assert.assertTrue(page.checklinks()," Hay errores en los links");
	}
	*/

	
	@Test(description = "woman search by stock", enabled = false)
	public void womanSearchByStock() {
		indexPage.clickWomenLink();
		Reporter.log("Looking for stock articles");
		womenPage.selectOrderByText("In stock");
		Reporter.log("Voy a intentar que true sea false");
		Assert.assertTrue(false,"El test fallo");
		
	}
	
	@Test(description = "woman search by reference", priority = 1, enabled = false)
	public void womanSearchByReference() {
		indexPage.clickWomenLink();
		System.out.println("Algo............................................");
		womenPage.selectOrderByValue("reference:asc");
	}
	
	@Test(description = "woman search by price lower first", priority = 5, enabled = false)
	public void womanSearchByPriceLowerFirst() {
		indexPage.clickWomenLink();
		womenPage.selectOrderByIndex(1);
	}
	
	@Test(description = "see if elements are located", priority = 2, enabled = false)
	public void seeColorChecksLocated() {
		indexPage.clickWomenLink();
		Reporter.log("Voy a seleccionar el color 3");
		womenPage.selectColor(3);
		Reporter.log("Ya seleccione el color 3");
	}
	
	
}