package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to launch the browser
		WebDriver driver=new ChromeDriver();
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		//to launch the web application
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.name("Email")).sendKeys("parkalebg96@gmail.com"); 
		
		driver.findElement(By.name("Password")).sendKeys("Shree@123");
		
		//driver.findElement(By.className("button-1 login-button")).click();
		
		
		//driver.findElement(By.id("Log in")).click();
		 
		
		
		
		

	}

}
