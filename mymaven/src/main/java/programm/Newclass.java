package programm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newclass {
public static void main(String args[])
{
	
	System.setProperty("webdriver.chrome.driver","\"C:\\Users\\91854\\Downloads\\chromedriver_win32\\");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
String a=driver.getTitle();
System.out.println(a);
}
}
