package project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class FirstProject {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://alagurajabar.github.io/portfolio/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//div/span[contains(@class,'menu-icon__line-left')]")).click();
        Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Gallery']")).click();
		
		Thread.sleep(3000);
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-2400)");
		
		driver.findElement(By.xpath("//a/img[@alt='Home']")).click();
		
		driver.findElement(By.xpath("//div/span[contains(@class,'menu-icon__line-left')]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//li/a[text()='about']")).click();
        
        Thread.sleep(3000);
        jse.executeScript("window.scrollBy(0,400)");
		
        Thread.sleep(3000);
        jse.executeScript("window.scrollBy(0,400)");
        
        Thread.sleep(3000);
        jse.executeScript("window.scrollBy(0,400)");
        
        Thread.sleep(3000);
        jse.executeScript("window.scrollBy(0,400)");
		
        Thread.sleep(3000);
        jse.executeScript("window.scrollBy(0,-1600)");
        
        driver.findElement(By.xpath("//a/img[@alt='Home']")).click();
        
        driver.findElement(By.xpath("//div/span[contains(@class,'menu-icon__line-left')]")).click();
        Thread.sleep(2000);
        
       driver.findElement(By.xpath("//li/a[text()='Interact with me']")).click();
       Thread.sleep(3000);
       
       jse.executeScript("window.scrollBy(0,400)");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//span/input[@name='Name']")).sendKeys("VINITHA");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//span/input[@placeholder='E-Mail: *']")).sendKeys("vinithadevi31@gmail.com");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//span/input[@name='your-phone']")).sendKeys("9698719789");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//span/input[@name='your-location']")).sendKeys("karaikudi,india");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//span/textarea[@name='message']")).sendKeys("hi,hello");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//button/span[text()='Submit']")).click();
       Thread.sleep(3000);
       driver.navigate().back();
      
       jse.executeScript("window.scrollBy(0,-400)");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//a/img[@alt='Home']")).click();
       
		driver.findElement(By.xpath("//a/h1[text()='Hola']")).click();
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,1200)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-1500)");
		
		
		
		driver.findElement(By.xpath("//a/img[@alt='Home']")).click();
		
		Actions action=new Actions(driver);
	    WebElement element = driver.findElement(By.xpath("//a/h1[text()='Initiatives']"));
		action.moveToElement(element).perform();
		
		driver.findElement(By.xpath("//a/h1[text()='Initiatives']")).click();
		
		Thread.sleep(3000);
		
		jse.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,1000)");
		
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-2200)");
		
						
		driver.findElement(By.xpath("//a/img[@alt='Home']")).click();
		
		
	    WebElement element1 = driver.findElement(By.xpath("//a/h1[text()='Involved']"));
		action.moveToElement(element1).perform();
		
		driver.findElement(By.xpath("//a/h1[text()='Involved']")).click();
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-2000)");
		
		
		
		driver.findElement(By.xpath("//a/img[@alt='Home']")).click();
		
	    driver.findElement(By.xpath("(//a[@class='hover-target animsition-link']/h1)[4]")).click();
	
	    Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-1800)");
		
		driver.findElement(By.xpath("//a/img[@alt='Home']")).click();
		
		
		Thread.sleep(5000);
		 
		WebElement expert = driver.findElement(By.xpath("//a/h1[text()='Expertise']"));
		
		jse.executeScript("arguments[0].scrollIntoView();",expert);
		
		driver.findElement(By.xpath("//a/h1[text()='Expertise']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a/img[@alt='Home']")).click();
		
		Thread.sleep(10000);
		 
		WebElement ability = driver.findElement(By.xpath("//a/h1[text()='Ability']"));
		
		jse.executeScript("arguments[0].scrollIntoView();",ability);
	    
		driver.findElement(By.xpath("//a/h1[text()='Ability']")).click();
		
		 Thread.sleep(3000);
		
		jse.executeScript("window.scrollBy(0,600)");
		
	     Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,600)");
		
		 Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-2000)");
		
		driver.findElement(By.xpath("//a/img[@alt='Home']")).click();
		
		Thread.sleep(10000);	
		 WebElement goals = driver.findElement(By.xpath("//a/h1[text()='Goals']"));
		
		 jse.executeScript("arguments[0].scrollIntoView();",goals);
		 driver.findElement(By.xpath("//a/h1[text()='Goals']")).click();
		
		 Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,600)");
		 
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,600)"); 
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-2000)");
		 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a/img[@alt='Home']")).click();
			
		
		
		
		
	}

}
