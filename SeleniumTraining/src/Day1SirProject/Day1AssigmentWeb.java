package Day1SirProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1AssigmentWeb {

public static void main(String[] args) {
  System.setProperty("webdriver.chrome.driver",".\\\\Executable\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.actitime.com/");
  String sourcecode=driver.getPageSource();
  System.out.println("Application Source Code"+sourcecode);
  System.out.println("Application Source Codelength"+sourcecode.length());
  System.out.println("Applicatio Url"+driver.getCurrentUrl());
  System.out.println("Application Title"  +driver.getTitle());
  System.out.println("Application Title length"+driver.getTitle().length());
if(driver.getTitle().equals("actiTIME - Time Tracking Software")){
{ 
	System.out.println("application open");

}}
else{
	System.out.println("Application not ok");
}

}
}