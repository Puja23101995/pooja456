package day2and3Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String args[]) {
System.setProperty("webdriver.chrome.driver",".\\Executable\\chromedriver.exe");
WebDriver D1 =new ChromeDriver();
//Get URL 
D1.get("https://www.amazon.in/");
D1.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//Window Maxmimize
D1.manage().window().maximize();
D1.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//Set Size Window 
//D1.manage().window().setSize(new Dimension(500,700));
//get page title
System.out.println("Get Page Title"+D1.getTitle());

 D1.findElement(By.linkText("Mobiles")).click();
 System.out.println("Get Title Page current Web"+D1.getTitle());
 D1.navigate().back();
 System.out.println("Get Page Title After nevigate back"+D1.getTitle());
 if(D1.getTitle().equals(D1.getTitle())){
	 System.out.println("URLcoreect");
 }else
 {System.out.println("False");
 D1.close();
 



}
}}
