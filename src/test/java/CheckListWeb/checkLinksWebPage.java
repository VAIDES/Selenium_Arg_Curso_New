package CheckListWeb;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class checkLinksWebPage {
	
	// Programa que va a testesar todos los  links activos y fallidos de una pagina web 
	
			private WebDriver driver;
			
			public  checkLinksWebPage (WebDriver driver ) {
				this.driver = driver ;
			}
			
			
			public boolean checklinks ()
			{
				List<WebElement> links = driver.findElements(By.tagName("a"));
				String url = "";
				List<String> brokenlist = new ArrayList<String>();
				List<String> oklist = new ArrayList<String>();
						
				HttpURLConnection httpconnection = null;
				int response_code = 200;
				
				Iterator<WebElement> it = links.iterator();
				
						
				while (it.hasNext()) {
				
										
					url = it.next().getAttribute("href");
					
					System.out.println ("CLASE :" + it.next().getText());
					
												
					if (url == null || url.isEmpty()) {
						System.out.println (url + "La url esta vacia ");
						
					}
					
					else {
					
					try {
						// abre una coneccion, basado en el valor que tiene el string Url por eso lo castea
						httpconnection = (HttpURLConnection) (new URL (url).openConnection());
						// pide lo que esta en el HEAD
						httpconnection.setRequestMethod ("HEAD");
						//SE CONECTA
						httpconnection.connect();
						// Pide el codigo de respuesta
						response_code = httpconnection.getResponseCode();
						
						if (response_code >= 400) {
							System.out.println ("Link ROTO:" + url);
							brokenlist.add(url);
						}	
						else {
							System.out.println ("Link VALIDO:" + url);
							oklist.add(url);
					}
				} catch (Exception e) {
						// error
						e.printStackTrace();
						
					}
					
				}
				}
				
				System.out.println("NO Valid link: " + brokenlist.size());
				System.out.println("Valid!! link" + oklist.size());
				
				
				if (brokenlist.size()> 0) {
					System.out.println ("-------------ERROR ------------------------");
				
					for (int i=0; i < brokenlist.size();i++) {
						System.out.println("Link Invalido: " + brokenlist.get(i));
					}
					return false;
				}
				
				return true ; 
			}
		  
}

