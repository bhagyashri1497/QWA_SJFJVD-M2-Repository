package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//to launch the browser
		WebDriver driver=new ChromeDriver();
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		//to launch the web application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		Thread.sleep(2000);
				
				//identify username with css selector
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
		
		

	}

}
