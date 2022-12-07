package usePOMscripts;

import org.testng.annotations.Test;

import POMscripts.Pom_5ele;
import generics.BM_AM;

public class practiceTC1 extends BM_AM {
	
	/* open bewakoof...............
	 * click on login
	 * click on continue
	 * refresh
	 * click on cont emmail
	 * enter mail 
	 * enter pass 
	 * click on submit
	 */
	
	@Test
	public void run() throws InterruptedException {
		
		Pom_5ele start=new Pom_5ele(driver);
		Thread.sleep(2000);
		
		start.login();
		Thread.sleep(2000);
		
		start.contbtn();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);

		start.mailbtn();
		Thread.sleep(2000);

		start.mailtxt();
		Thread.sleep(2000);
		
		start.pwd();
		Thread.sleep(2000);

		
		start.enterbtn();
		Thread.sleep(2000);

	}

}
