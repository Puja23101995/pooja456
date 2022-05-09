package Apr27Keyboard_Mouse_Active;

import org.openqa.selenium.By;
import SeleniumUtility.SeleniumUtility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;



public class KeyboardOps2 {

	public static void main(String[] args) {
		SeleniumUtility s1=new 	SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com/login.do");
		//login in actitime application using Enter key
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB);
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
	}
}
