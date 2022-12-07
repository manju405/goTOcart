package usePOMscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import POMscripts.pomSCRIPT;
import generics.BM_AM;

public class login_pom extends BM_AM{
	
	@Test
	
	private void log() throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver.get("https://www.bewakoof.com/login?ref=/top-wear-for-men");
		
		

		pomSCRIPT pm=new pomSCRIPT(driver);
		
		pm.phoneno("123");
		Thread.sleep(2000);

		pm.btn();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();

		Thread.sleep(2000);

		pm.phoneno("890");
		Thread.sleep(2000);

		pm.btn();
		
		System.out.println("done");
		

		
		

	}

}
