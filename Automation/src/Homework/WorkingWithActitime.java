package Homework;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithActitime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//to launch the browser
		
		Random r=new Random();
		
		int no = r.nextInt(1000);
		
		WebDriver driver=new ChromeDriver();
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		//to launch the web application
		driver.get("http://laptop-78siec6i/login.do");
		
		//identify username
		//driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		
		Thread.sleep(2000);
		//driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		//identify the login button
		Thread.sleep(2000);
		//driver.findElement(By.className("initial")).click();
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		
		//click on task
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		Thread.sleep(2000);
		//click on project & customer
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		Thread.sleep(2000);
		//click on create new customer
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		
		//pass the customer name
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Sai prasad"+no);
		
		driver.findElement(By.name("createCustomerSubmit")).click();
		
		
	}

}



