package  Apr27Keyboard_Mouse_Active;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import SeleniumUtility.SeleniumUtility;


public class KeyboardOps5 {
 static SeleniumUtility s2=new SeleniumUtility();
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=s2.setUp("chrome", "https://www.flipkart.com/");
	
		try {
			WebElement element = driver.findElement(By.xpath("//body"));
			element.sendKeys(Keys.ESCAPE);
		}catch(NoSuchElementException e) {
			
		}
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.F5);
		/**
		 * possible ways to refresh the browser:
		 * 1. driver.navigate().refresh();
		 * 2. sendKeys(Keys.F5)
		 * 3. by hitting same URL again
		 * 4. ctrl+R
		 */
	}

}
