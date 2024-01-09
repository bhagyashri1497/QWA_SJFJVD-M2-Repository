package MouseHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithDragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/dragDrop/dragToCorrect?sublist=1");
		
		//drag webelement
		WebElement drag = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		
		//drop webelement
		WebElement drop = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		
		Actions act= new Actions(driver);
		
		act.dragAndDrop(drag,  drop).perform();
		
		WebElement drag1 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		
		WebElement drop1 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		
		Actions act1= new Actions(driver);
		
		act1.dragAndDrop(drag1,  drop1).perform();
		
		WebElement drag2 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		
		WebElement drop2 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		
		Actions act2= new Actions(driver);
		
		act2.dragAndDrop(drag2,  drop2).perform();
		
		WebElement drag3 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
		WebElement drop3 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		
		Actions act3= new Actions(driver);
		
		act3.dragAndDrop(drag3,  drop3).perform();
		
		driver.quit();
		
		
		
		
		

	}

}
