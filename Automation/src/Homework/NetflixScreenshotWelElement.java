package Homework;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class NetflixScreenshotWelElement {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.netflix.com/in/");
		
		driver.findElement(By.xpath("//a[@id='signIn']")).click();
		
		driver.findElement(By.xpath("//input[@name='userLoginId']")).sendKeys("sharvi22@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sharvi@123");
		
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		Thread.sleep(2000);
		
		//explicit type casting
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//to use getscreenshotAs method
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshot/error1.png");
		
		Files.copy(src, dest);
		
		

	}

}
