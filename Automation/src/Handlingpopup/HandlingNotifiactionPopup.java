package Handlingpopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingNotifiactionPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.yatra.com/");
		
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='demo-icon icon-hotels']")).click();
		
		//driver.findElement(By.xpath("//input[@name='BE_hotel_destination']")).click();
		WebElement dest=driver.findElement(By.xpath("//input[@class='required_field ac_input hotel_destInput origin_ac']"));
		Thread.sleep(2000);
		dest.click();
		
		Thread.sleep(2000);
		dest.sendKeys("Pune");
		Thread.sleep(2000);
		dest.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='icon icon-angle-right arrowpassengerBox pax-active']")).click();
		
		

	}

}
