package main;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basket {

	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		driver.manage().window().maximize();
		driver.get("http://10.15.1.204:3000/menu");
		
		driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[2]/div[2]/button")).click();
		
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,450)");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[9]/div[2]/button")).click();
        Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[8]/div[2]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[9]/div[2]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[8]/div[2]/button")).click();
        
		//driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[8]/div[2]/button")).click();
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.UP);
		
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,450)");
		
		driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[2]/div[2]/div[2]/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.DOWN);
		
		driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[3]/div[1]/h3")).equals("Cart");
		
		System.out.println("Vas racun iznosi 76$");
		
		driver.quit();
	}

}
