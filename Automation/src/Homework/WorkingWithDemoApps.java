package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDemoApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//section[text()='FormValidation']")).click();
		 
		driver.findElement(By.xpath("//input[@name='requiredfield']")).sendKeys("abc");
		
		driver.findElement(By.xpath("//input[@name='minLength']")).sendKeys("Sharvi");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sharvi@123");
		
		driver.findElement(By.xpath("//input[@name='confirmpass']")).sendKeys("Sharvi@123");
		
		driver.findElement(By.xpath("//input[@name='maxLength']")).sendKeys("Shiva");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("parkalebg96@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='rangeLength']")).sendKeys("Devendra");
		
		driver.findElement(By.xpath("//input[@name='url']")).sendKeys("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@name='minValue']")).sendKeys("40000");
		
		driver.findElement(By.xpath("//input[@name='maxValue']")).sendKeys("5");
		
		driver.findElement(By.xpath("//input[@name='digits']")).sendKeys("678");
		
		driver.findElement(By.xpath("//input[@name='rangeValue']")).sendKeys("98");
		
		driver.findElement(By.xpath("//input[@name='number']")).sendKeys("767");
		
		driver.findElement(By.xpath("//input[@name='alphanum']")).sendKeys("cb767");
		
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
		
	}

}
