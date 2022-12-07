package ft;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoToCart_Product_size {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
//OPEN PAGE		
		driver.get("https://www.bewakoof.com/p/king-of-curses-sukuna-full-sleeve-t-shirt");
		Thread.sleep(2000);
//STORE ALL SIZES		
		 List<WebElement> size = driver.findElements(By.xpath("//div[@class='selectSize']/div")); 
//SELECT SIZES		
		for(WebElement sel:size) {
			if(sel.isEnabled()) {                        //HOW TO SOLVE OUT OF STOCK PRODUCTS
				 sel.click();
				   Thread.sleep(2000);
				   
				   System.out.println("selected size is :"+sel.getText());
			}
			else {
				System.out.println(sel.getText()+" is out of stock");
			}
		}
		
		
		   


	}

}
