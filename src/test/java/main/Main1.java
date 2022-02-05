package main;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Main1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		driver.manage().window().maximize();
		driver.get("http://10.15.1.204:3000/reserve");
		
		
		        //Name
				
		        driver.findElement(By.id("name")).sendKeys("Marlin");
				
				//Email
				
		        driver.findElement(By.id("email")).sendKeys("marlin@gmail.com");
				
				//Phone
				
		        driver.findElement(By.id("phone")).sendKeys("0605588842");
				
				//Date 
				driver.findElement(By.id("date")).sendKeys("04/16/2022");
				
				
				//Time
				
				driver.findElement(By.id("time")).sendKeys("0750AM");
				
				
				//Person
				Select person=new Select(driver.findElement(By.id("persons")));
				person.selectByVisibleText("2");
				
				//Parking
				driver.findElement(By.cssSelector(".switch-label")).click();
				
				WebElement element=driver.findElement(By.xpath("//*[@id=\"submitForm\"]"));
				element.click();
				
				driver.quit();
				
				
				
				

	}

}
