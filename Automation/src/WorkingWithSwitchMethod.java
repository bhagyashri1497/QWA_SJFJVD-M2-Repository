import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSwitchMethod {

	public static void main(String[] args) {
		
		//to launch the browser
		WebDriver driver= new ChromeDriver();
		
		//to maximize the browser
		
		//optimized code to maximize the window
		driver.manage().window().maximize();
		
		
		//to open the web application
	//	driver.get("https://www.amazon.com/");
		
		//to open the application
		driver.get("https://www.flipkart.com/");
		

		driver.switchTo().activeElement().sendKeys("poha",Keys.ENTER);
		
		
		
		
		
	}

}







