package Homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformMyntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.myntra.com/");
		
		WebElement men = driver.findElement(By.xpath("//a[@data-group='men']"));
		
		//create the object of Actions class
		Actions act=new Actions(driver);
		
		//use move to element method
		act.moveToElement(men).perform();
		
		Thread.sleep(2000);
		//close the browser
		driver.quit();
		

	}

}
