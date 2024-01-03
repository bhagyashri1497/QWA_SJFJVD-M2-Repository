package Homework;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		//To launch the browser
		WebDriver driver=new ChromeDriver();
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//to open the application
		driver.get("https://www.instagram.com/");
		
		 //to fetch the title
		String title=driver.getTitle();
		
		Thread.sleep(2000);
		//to identify the username
		driver.findElement(By.name("username")).sendKeys("devshree005");
		//to identify the password
		driver.findElement(By.name("password")).sendKeys("Devshree@123");
		
		//driver.findElement(By.id("loginForm")).click();
		driver.findElement(By.className("_acap")).click();
		Thread.sleep(2000);
		//driver.close();
		driver.quit();
		 
		
		
	}
	
	
	

}
