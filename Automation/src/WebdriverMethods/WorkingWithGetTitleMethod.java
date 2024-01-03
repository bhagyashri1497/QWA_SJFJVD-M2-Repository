package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetTitleMethod {
	public static void main(String[] args) {
		
		//to launch the browser
		WebDriver driver= new ChromeDriver();
		
		//to maximize the browser
		
		//optimized code
		driver.manage().window().maximize();
		
		
		//to open the web application
		driver.get("https://www.flipkart.com/");
		
		//tpo fetch the title
		String title=driver.getTitle();
		
		System.out.println("The title of current webpage is:"+title);
		
		/*if(actual_title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
				{
					System.out.println("test case is pass");
				}
				else
				{
					System.out.println("test case is fail");
				}
		*/
		
		
		
	}

}

