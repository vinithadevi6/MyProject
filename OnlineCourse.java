package project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlineCourse {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://alagurajabar.github.io/lms/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form/input[@placeholder='Write Your Email']")).sendKeys("vinithadevi31@gmail.com");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li/a[text()='Categories']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li/a[text()='Courses']")).click();
		
		Thread.sleep(3000);
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,700)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,700)");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li/a[text()='About Us']")).click();
		

		Thread.sleep(3000);
		driver.findElement(By.xpath("//li/a[text()='Contact']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li/a[text()='Home'])[2]")).click();
	}

}
