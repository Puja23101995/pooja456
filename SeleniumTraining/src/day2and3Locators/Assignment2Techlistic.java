package day2and3Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import okio.Timeout;

public class Assignment2Techlistic {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver",".\\Executable\\geckodriver.exe ");
  FirefoxDriver d2= new FirefoxDriver();
  d2.get("https://www.techlistic.com/");
  //Maximize page
  d2.manage().window().maximize();
  //timing setup
  d2.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//click on java link
d2.findElement(By.linkText("Java")).click();
d2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
// after click java title page 
d2.getTitle();
// Nevigate Back Home Page
d2.navigate().back();
//click on sellenium 
d2.findElement(By.cssSelector("overflowable-item")).click();
		
 
	}

}
