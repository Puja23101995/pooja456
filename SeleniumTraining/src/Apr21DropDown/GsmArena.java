package Apr21DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GsmArena {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		WebDriver d2= new ChromeDriver();
		d2.get("https://www.gsmarena.com/");
		d2.manage().window().maximize();
		//d2.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	List<WebElement>AllPhone=d2.findElements(By.cssSelector(".brandmenu-v2 ul li "));
	System.out.println("phone all "+ AllPhone.size());
	for(int i = 0;i<AllPhone.size();i++) {
		System.out.println("All phone name" +AllPhone.get(i).getText());
		
//	System.out.println("**************** 4th Assignment Realme Link  **************");
//	WebDriver d3= new ChromeDriver();
//	List<WebElement> Realme= d3.findElements(By.id(".makers>ul>li>a>strong "));
//	System.out.println("Real me all phones name"  +Realme.size());
	//for(int i1=0;i1<Realme.size();i1++) {
	//	System.out.println("Real me all phones name2"+Realme.get(i1).getText());
		
	}
	}

	}
