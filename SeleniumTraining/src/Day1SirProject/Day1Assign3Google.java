package Day1SirProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day1Assign3Google {

	public static void main(String[] args) {
 System.setProperty("webdriver.chrome.driver",".\\\\Executable\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 WebDriver D1= new ChromeDriver();
 D1.get("https://www.google.com/");
 String sourcecode=D1.getPageSource();
 System.out.println("Application URl"+D1.getCurrentUrl());
 System.out.println("Current Web Source"+D1.getPageSource());
 System.out.println("Tilte of Application"   +D1.getTitle());
 System.out.println("Title Length"+D1.getTitle());
 D1.close();
	}

}
