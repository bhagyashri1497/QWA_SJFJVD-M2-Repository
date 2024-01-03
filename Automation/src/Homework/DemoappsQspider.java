package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoappsQspider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		
		driver.findElement(By.id("name")).sendKeys("Bhagyashri Parkale"); 
		
	//	driver.findElement(By.name("email")).sendKeys("parkalebg96@gmail.com"); 
		
		//driver.findElement(By.name("password")).sendKeys("Sharvi@123"); 
		
		//driver.findElement(By.className("Register")).click();
		
		
		

	}

}
