package Homework;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ActitimeUserDeletingTestScript {

	public static void main(String[] args) throws InterruptedException, IOException {

		 WebDriver driver = new ChromeDriver();

		 driver.manage().window().maximize();

		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		 driver.get("http://laptop-78siec6i/login.do");

		 driver.findElement(By.name("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.TAB,Keys.ENTER);


		 driver.findElement(By.xpath("//a[@class='content users']")).click();

		 driver.findElement(By.xpath("//input[@value='Create New User']")).click();

		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Test Eng");

		 driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("TE");

		 driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("TE");


		 driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Dore");

		 driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Mon");

		 driver.findElement(By.xpath("//input[contains(@value,'Create User')]")).click();

		 Thread.sleep(2000);
		// driver.findElement(By.xpath("(//th[text()='User']/../..//td[@class='listtblcell'])[2]")).click();

		 driver.findElement(By.xpath("//a[text()='Mon, Dore (Test Eng)']")).click();
		 Thread.sleep(2000);
		 

		 driver.findElement(By.xpath("//input[@value='Delete This User']")).click();
		 Thread.sleep(2000);
		 
		 Alert alt=driver.switchTo().alert();
			
			Thread.sleep(2000);
			//alt.sendKeys("yes");
			//to get the text
			System.out.println(alt.getText());
			//click on ok
			alt.accept();

		 
		 TakesScreenshot ts= (TakesScreenshot) driver;
			
			//to use getScreenshotAs Method
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			//CREATE A NEW file and pass the path where you want to store you screenshot
			File dest = new File("./screenshot/alert.png");
			
			//copy from src to dest
			Files.copy(src, dest);
			
			







	}

}