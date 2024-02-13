package WebdriverMethods;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCloseMethod {
	public static void main(String[] args) {
		
		//to launch the browser
		WebDriver driver= new ChromeDriver();
		
		//to maximize the browser
		
		//optimized code to maximize the window
		driver.manage().window().maximize();
		
		
		//to open the web application
	//	driver.get("https://www.amazon.com/");
		
		//to open the application
		driver.get("https://omayo.blogspot.com/");
		
		//to click on new popup window
		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		
	
		//to close the browser
		//driver.close();
		
		driver.quit();
		
		
		
		
		
		
		
	}

}




