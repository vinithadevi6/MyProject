package project1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KagithaKappal {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://alagurajabar.github.io/jeme/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='holder']")).click();
		Thread.sleep(3000);
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-9000)");
		
		driver.findElement(By.xpath("(//li/a[text()='QUOTES'])[2]")).click();
		
		Thread.sleep(5000);
		Set<String> handles=driver.getWindowHandles();
//		Iterator<String> it=handles.iterator();
//		String parentid = it.next();
//		String childid = it.next();
//		driver.switchTo().window(childid);
		List<String> quotesWindow = new ArrayList<String>(handles);
		driver.switchTo().window(quotesWindow.get(1));
		
		WebElement cursor = driver.findElement(By.xpath("(//div[@class='carousel-item'])[8]"));
		
		jse.executeScript("arguments[0].scrollIntoView();",cursor);
		
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//a/img[@itemprop='image']")).click();
	//	driver.switchTo().window(parentid);
		driver.switchTo().window(quotesWindow.get(0));
		
		driver.findElement(By.xpath("(//li/a[text()='BLOGS'])[2]")).click();
		Set<String> handles1=driver.getWindowHandles();
//		Iterator<String> it1=handles1.iterator();
//		//String parentid = it1.next();
//		String childid1=it1.next();
//		driver.switchTo().window(childid1);
		List<String> blogsWindow = new ArrayList<String>(handles1);
		driver.switchTo().window(blogsWindow.get(2));
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//div[@class='holder']")).click();
		
		Thread.sleep(10000);
	//	driver.switchTo().window(parentid);
		driver.switchTo().window(blogsWindow.get(0));
		
		driver.findElement(By.xpath("(//li/a[text()='PODCAST'])[2]")).click();
		Thread.sleep(3000);
		Set<String> handles2=driver.getWindowHandles();
//		Iterator<String> it2=handles2.iterator();
//		//String parentid2 = it2.next();
//		String childid2=it2.next();
//		driver.switchTo().window(childid2);
		List<String> podcastWindow = new ArrayList<String>(handles2);
		driver.switchTo().window(podcastWindow.get(3));
		Thread.sleep(10000);
		
		Thread.sleep(3000);
		JavascriptExecutor jse1= (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,400)");
		
		driver.findElement(By.xpath("//div/button[@title='Play']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div/button[@title='Pause']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/button[@title='Jump forward 10 seconds']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/button[@title='Skip back 10 seconds']")).click();
		Thread.sleep(3000);
		Actions action=new Actions(driver);
	    WebElement element = driver.findElement(By.xpath("//div/button[@title='Mute']"));
		action.moveToElement(element).perform();
		 
		 driver.findElement(By.xpath("//div/button[@title='Mute']")).click();
		// WebElement element1 = driver.findElement(By.xpath("//div/button[@title='Unmute']"));
		// action.moveToElement(element1).perform();
		 Thread.sleep(3000);
		 jse1.executeScript("window.scrollBy(0,-400)");
		 
		 Thread.sleep(3000);
		// driver.switchTo().window(parentid);
		 driver.switchTo().window(podcastWindow.get(0));
	}

}
