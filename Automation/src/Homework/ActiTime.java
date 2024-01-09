package Homework;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActiTime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
Random r=new Random();
		
		int no = r.nextInt(1000);
		
		WebDriver driver=new ChromeDriver();
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//to launch the web application
		driver.get("http://laptop-78siec6i/login.do");
		
		//identify username
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		//identify the login button
		//Thread.sleep(2000);
		
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		
		 //to perform double click
		 Actions act= new Actions(driver);
		 
		 act.doubleClick(driver.findElement(By.xpath("//div[text()='Users']"))).perform();
		 
		 driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		 
		 WebElement username = driver.findElement(By.name("username"));
		 
		 username.sendKeys("Developer");
		 
		 //to perform dropdown
		 WebElement dropdown= driver.findElement(By.name("active"));
			
			Select s= new Select(dropdown);
			
			s.selectByIndex(0);
			
			WebElement password = driver.findElement(By.name("passwordText"));
			 
			 password.sendKeys("Sharvi@123");
			 
			 WebElement repass = driver.findElement(By.name("passwordTextRetype"));
			 
			 repass.sendKeys("Sharvi@123");
			 
			 WebElement fname = driver.findElement(By.name("firstName"));
			 
			 fname.sendKeys("Sharvi");
			 
			 WebElement lname = driver.findElement(By.name("lastName"));
			 
			 lname.sendKeys("Jadhav");
			 
			 WebElement wd = driver.findElement(By.name("workdayDurationStr"));
			 wd.clear();
			 Thread.sleep(2000);
			 
			 wd.sendKeys("9:00");
			 
			 WebElement checkbox = driver.findElement(By.xpath("//input[@name='overtimeTracking']"));
			 
			 checkbox.click();
			 
			 driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();
			 
			
			
		 
		 
		 
		

	}

}
