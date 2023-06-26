package project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whms {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://alagurajabar.github.io/whms/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(3000);
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,600)");
		
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,600)");
		
		//Thread.sleep(3000);
		//jse.executeScript("window.scrollBy(0,-8000)");
		driver.findElement(By.xpath("//span/a[@class='bt_back_to_top_button']")).click();
		
		driver.findElement(By.xpath("//li/a[text()='Services']")).click();
		
		Thread.sleep(3000);
		
		jse.executeScript("window.scrollBy(0,600)");
	
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,600)");
		
		driver.findElement(By.xpath("//span/a[@class='bt_back_to_top_button']")).click();
		
		driver.findElement(By.xpath("(//div/a[@target='_self'])[2]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li/a[text()='Pharma Industry']")).click();
		
		//driver.findElement(By.xpath("//span/a[@class='bt_back_to_top_button']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li/a[text()='Contact']")).click();
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//span/input[@name='your-name']")).sendKeys("vinitha");
		driver.findElement(By.xpath("//span/input[@name='your-email']")).sendKeys("vinithadevi31@gmail.com");
		driver.findElement(By.xpath("//span/input[@placeholder='Contact phone']")).sendKeys("9698719789");
		driver.findElement(By.xpath("//div[text()='Engineering Design']")).click();
		driver.findElement(By.xpath("//li[text()='Fabrication']")).click();
		driver.findElement(By.xpath("//span/textarea[@name='your-message']")).sendKeys("aaaaaaaa");
		
		driver.findElement(By.xpath("//p/input[@type='submit']")).click();
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,600)");
		
		driver.findElement(By.xpath("//span/a[@class='bt_back_to_top_button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div/a[@target='_self'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li/a[text()='Home']")).click();
		
		//driver.close();

	}

}
