package day2and3Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManRedBus {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d1 = new ChromeDriver();
	
		d1.get("https://www.redbus.in/");
		d1.manage().window().maximize();
		d1.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

		d1.findElement(By.cssSelector("#src")).sendKeys("pune");
        d1.findElement(By.cssSelector(".autoFill *:nth-child(2)")).click();
        d1.findElement(By.cssSelector("#dest")).sendKeys("Goa");
		d1.findElement(By.cssSelector(".homeSearch>*:nth-child(5)")).click();
	    d1.findElement(By.cssSelector(".next>button")).click();
	    d1.findElement(By.cssSelector(".rb-monthTable>tbody>*:nth-child(4)>*:nth-child(5)")).click();
	    d1.findElement(By.cssSelector("#search_btn")).click();
	    Thread.sleep(2000);
	  
	    d1.findElement(By.cssSelector("li>input[id='bt_AC']")).click();
	    d1.findElement(By.cssSelector(".icon-close")).click();
}}
