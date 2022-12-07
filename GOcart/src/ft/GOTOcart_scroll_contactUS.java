package ft;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.service.DriverCommandExecutor;

public class GOTOcart_scroll_contactUS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.bewakoof.com/");
		Thread.sleep(2000);
		
        Actions act=new Actions(driver);
		
		WebElement Men = driver.findElement(By.xpath("(//span[@class='menuSelect'])[1]"));
		act.moveToElement(Men).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[.='Kurtas'])[1]")).click();
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//a[.='Contact Us']"));
		
		Point loc = ele.getLocation();
		System.out.println(loc);
		int x = loc.getX();
		int y = loc.getY();
		y=y-100;
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy("+0+","+y+")");
		Thread.sleep(10000);

		ele.click();

		
		

	}

}
