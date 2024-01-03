package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithName {
	public static void main(String[] args) throws InterruptedException {
		//to launch the browser
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 //to launch the application
		 driver.get("http://laptop-78siec6i/login.do");
		 Thread.sleep(5000);
		 //identify username
		 driver.findElement(By.name("username")).sendKeys("admin");
		 Thread.sleep(5000);
		 //identidy password textfield
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 Thread.sleep(5000);
		 //identify the login button
		 driver.findElement(By.id("loginButton")).click();
		 
		 Thread.sleep(5000);
		 driver.close();
		 
	}

}
