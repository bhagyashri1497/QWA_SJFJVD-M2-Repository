package shoppersstack;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class shoporder {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://shoppersstack.com/");
		
			Thread.sleep(4000);
			driver.findElement(By.xpath("//button[text()='Login']")).click();
		// driver.findElement(By.name("loginBtn")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("Email")).sendKeys("parkalebg96@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Sharvi@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Mobile");	
		Thread.sleep(2000);
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(3000);
		
		
		 WebElement button=driver.findElement(By.xpath("//button[text()='add to cart']"));
		 Actions act=new Actions(driver);
		 
		 act.moveToElement(button).perform();
		 Thread.sleep(2000);
		 WebElement cart =driver.findElement(By.xpath("//a[@id='cart']"));
		 Actions act1 = new Actions(driver);
		 act1.moveToElement(cart).perform();
		
		
		
		
		
		

	}

}



