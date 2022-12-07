package ft;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import generics.BM_AM;

public class changeTab extends BM_AM {
	
    @Test
	public  void change() throws InterruptedException, AWTException {
				
		//MAJOR TAB		
		Actions act=new Actions(driver);
		
		WebElement Men = driver.findElement(By.xpath("(//span[@class='menuSelect'])[1]"));
		act.moveToElement(Men).perform();
	//	Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[.='Printed T-Shirts'])[1]")).click();
		//Thread.sleep(2000);
		
		//open new tab
	   WebElement ele = driver.findElement(By.xpath("(//img[@class='productImgTag'])[1]"));
	   
	   Thread.sleep(2000);
	   act.moveToElement(ele).contextClick().perform();
	  Thread.sleep(2000);
	   
	   Robot r=new Robot();
	   r.keyPress(KeyEvent.VK_T);
	   r.keyRelease(KeyEvent.VK_T);
	   Thread.sleep(5000);
	   
  WebElement el = driver.findElement(By.xpath("(//img[@class='productImgTag'])[2]"));
	   
	   Thread.sleep(2000);
	   act.moveToElement(ele).contextClick().perform();
	  Thread.sleep(2000);
	   
	 
	   r.keyPress(KeyEvent.VK_T);
	   r.keyRelease(KeyEvent.VK_T);
	   Thread.sleep(5000);

	   
	   //move control to new tab driver.switchto().window();
	   
	   Set<String> Atab = driver.getWindowHandles();          // two tabs opened
	   
	   ArrayList<String>arr=new ArrayList<String>();
	   
	   arr.addAll(Atab);
	   
	   String newTab = arr.get(2);
	   
	   driver.switchTo().window(newTab);
	   Thread.sleep(2000);

	   //check 
	   
	   WebElement sel = driver.findElement(By.xpath("//div[@id='testSizes_S']"));
	   sel.click();
	//   Thread.sleep(2000);

	   if(sel.isSelected()) {
		   System.out.println("control is switched");
	   }
	   else {
		   System.out.println("control is not switched");
	   }

	}

}
