package Windowbasedpopup;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadByAutoit {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/fileUpload?sublist=0");
		
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		
		driver.findElement(By.xpath("//a[text()='Custom Button']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Upload File']")).click();
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("./AutoIt/Fileupload.exe");
		


	}

}
