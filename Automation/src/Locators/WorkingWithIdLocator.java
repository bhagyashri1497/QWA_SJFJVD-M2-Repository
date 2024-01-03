package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIdLocator {
	public static void main(String[] args) {
		//to launch the browser
		WebDriver driver=new ChromeDriver();
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		//to launch the web application
		driver.get("https://www.facebook.com/");
		
		//identify the username textfield and perform any location
		driver.findElement(By.id("email")).sendKeys("parkalebg96@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Shree@123");
		
		driver.findElement(By.id("loginForm")).click();
	}

}
