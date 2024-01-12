package Homework;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class BlueStone {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bluestone.com/");
				
		Thread.sleep(2000);
		//click on not now
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement coins = driver.findElement(By.xpath("//a[@title='Coins']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(coins).perform();
		
		//act.doubleClick(driver.findElement(By.xpath("//span[text()='Coins by Design']")));
		driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
	
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/gold1.png");
		
		Files.copy(src, dest);
		driver.quit();
		
		
		
		
		
		

	}

}
