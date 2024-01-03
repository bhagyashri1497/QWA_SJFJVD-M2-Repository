package Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAmazon {
	public static void main(String[] args) {
		
		//to launch the browser
		WebDriver driver= new ChromeDriver();
		
		//to maximize the browser
		
		//optimized code
		driver.manage().window().maximize();
		
		
		//to open the web application
		driver.get("https://www.amazon.com/");
		
		//to fetch the title
		String title=driver.getTitle();
		
		
		System.out.println("The title of current webpage is:"+title);
		
	/*if(actual_title.equals("Amazon | Deals"))
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

