package MethodofWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithgetSize {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https:www.flipkart.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		
		Thread.sleep(2000);
		
		WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		Dimension size=submitButton.getSize();
		System.out.println(size);
	}

}
