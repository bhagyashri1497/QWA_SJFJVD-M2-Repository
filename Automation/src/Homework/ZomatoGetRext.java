package Homework;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class ZomatoGetRext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.zomato.com/");
		
		 WebElement scrollTill=driver.findElement(By.xpath("//p[text()='Work With Us']"));
		 
		 Rectangle rect = scrollTill.getRect();
		 
		 int x = rect.getX();
		 
		 int y = rect.getY();
		 
		 //System.out.println(x);
		 //System.out.println(y);
		 
		 JavascriptExecutor js =(JavascriptExecutor) driver;
		 Thread.sleep(2000);
		 js.executeScript("window.scrollBy("+x+","+y+")");
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		

	}

}
