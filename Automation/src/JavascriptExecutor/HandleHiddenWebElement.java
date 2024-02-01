package JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleHiddenWebElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	//	WebElement hidden=driver.findElement(By.xpath("//input[@name='custom_gender']"));
		
	//	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.elementToBeClickable(	driver.findElement(By.xpath("//input[@name='sex']/ancestor::span[@data-name='gender_wrapper']/descendant::label[text()='Custom']")))).click();
		
		 new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@name='sex']/ancestor::span[@data-name='gender_wrapper']/descendant::label[text()='Custom']")))).click();
		
	
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		Thread.sleep(2000);
//		js.executeScript("arguments[0].value='Transgender'", hidden);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//lable[text()='Custom']")).click();
//		
	}

}
