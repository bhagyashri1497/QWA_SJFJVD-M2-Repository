package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetCurrentUrl {
	public static void main(String[] args) {
		
		//to launch the browser
		WebDriver driver= new ChromeDriver();
		
		//to maximize the browser
		
		//optimized code to maximize the window
		driver.manage().window().maximize();
		
		
		//to open the web application
		driver.get("https://www.amazon.com/");
		
		//tpo fetch the current url
		String url=driver.getCurrentUrl();
		
		
		if(url.equals("https://www.amazon.com/"))
				{
					System.out.println("test case is pass");
				}
				else
				{
					System.out.println("test case is fail");
				}
		
		
		
		
	}

}

