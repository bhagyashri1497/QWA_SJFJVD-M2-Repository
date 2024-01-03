package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirVistara {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.airvistara.com/in/en");
		
		driver.findElement(By.xpath("//span[text()='One Way']")).click();
		
		
		driver.findElement(By.name("flightSearchFrom")).sendKeys("pune"); 
		
		driver.findElement(By.name("flightSearchTo")).sendKeys("goa");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("departCalendar")).click();
		
		
		
		
		

	}

}
