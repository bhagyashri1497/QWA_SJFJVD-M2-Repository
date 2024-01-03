package Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTitleZomato {
	public static void main(String[] args) {
		
		//to launch the browser
		WebDriver driver= new ChromeDriver();
		
		//to maximize the browser
		
		//optimized code
		driver.manage().window().maximize();
		
		
		//to open the web application
		driver.get("https://www.zomato.com/");
		
		//to fetch the title
		String title=driver.getTitle();
		System.out.println(title);
		//System.out.println("The title of current webpage is:"+title);
		//to fetch the current url
		String url=driver.getCurrentUrl();
		
		
		/*if(actual_title.equals("Zomato"))
				{
					System.out.println("test case is pass");
				}
				else
				{
					System.out.println("test case is fail");
				}*/
		driver.close();
		
		
		
		
	}

}

