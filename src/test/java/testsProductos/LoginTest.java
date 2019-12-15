package testsProductos;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonSteps.CommonSteps;


public class LoginTest extends CommonSteps{ 
	
@Test(description="creacion de cuenta de login", priority=1)
	
	public void womenForwardAndBack() {
		
		indexPage.clickLoginLink();
		System.out.println("HICE CLICK EN LOGIN ");
	
	}
}
