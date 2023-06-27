package project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robinlee {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://alagurajabar.github.io/robinlee/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(3000);
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,700)");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul/li[text()='Design']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul/li[text()='Digital']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul/li[text()='Branding']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul/li[text()='Print']")).click();
		
		Thread.sleep(3000);
		
		jse.executeScript("window.scrollBy(0,1500)");
		
		driver.findElement(By.xpath("//div/input[@placeholder='Your Name*']")).sendKeys("vinitha");
		driver.findElement(By.xpath("//div/input[@placeholder='Your Email*']")).sendKeys("vinithadevi31@gmail.com");
		driver.findElement(By.xpath("//div/input[@placeholder='Your Subject*']")).sendKeys("aaaaaa");
		driver.findElement(By.xpath("//div/textarea[@placeholder='Your Message*']")).sendKeys("hi hello");
		driver.findElement(By.xpath("//div/button[text()='Send Message']")).click();
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,1500)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-3000)");
		
		

		
		
	}

}
