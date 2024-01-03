package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizedBrowser {
	public static void main(String[] args) {
		
		//to launch the browser
		WebDriver driver= new ChromeDriver();
		
		//to maximize the browser
	//	Options opt= d
		
		driver.manage();
		//Window win= opt.window();
	//	win.maximize();
		
		//optimized code to maximize the window
		driver.manage().window().maximize();
		
		
		//to open the web application
		driver.get("https://www.flipkart.com/");
		
		
		
		
	}

}

