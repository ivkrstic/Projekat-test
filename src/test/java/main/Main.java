package main;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Main {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		driver.manage().window().maximize();
		driver.get("http://10.15.1.204:3000/reserve");
		
		//driver.get("google");
		//Name
				//driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Marlin");
		driver.findElement(By.id("name")).sendKeys("Marlin");
				
				//Email
				//driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("marlin@gmail.com");
		driver.findElement(By.id("email")).sendKeys("marlin@gmail.com");
				
				//Phone
				//driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("0605588842");
		driver.findElement(By.id("phone")).sendKeys("0605588842");
				
				//Date
				//driver.findElement(By.xpath("//*[@id=\"date\"]")).sendKeys("04/16/2022");
				//driver.findElement(By.id("date")).click();
				//driver.findElement(By.id("date")).clear();
				driver.findElement(By.id("date")).sendKeys("04/16/2022");
				//try {
					//Thread.sleep(3000);
				//} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				//}
				
				//webelements in list 
				//List<WebElement>dates=driver.findElements(By.xpath("//*[@id=\"date\"]"));
				
				//int total=dates.size();
				
				//for(int i=0;i<total;i++)
				//{
					//String date=dates.get(i).getText();
					//if(date.equals("31"))
					//{
						//dates.get(i).click();
						//break;
					//}
				//}
		
		//Thread.sleep(2000);
		//WebElement priorityDate = driver.findElement(By.xpath("//*[@id=\"date\"]")).findElement(By.tagName("input"));
		//priorityDate.click();
		//priorityDate.sendKeys("04/11/2022");
				
				//WebElement priorityDate = driver.findElement(By.id("mark.edit.priorities.priority.edit.dtpPriorityDate")).findElement(By.tagName("input"));
				//priorityDate.click();
				//priorityDate.sendKeys("16.11.2020");
				
				//Time
				//driver.findElement(By.id("time")).clear();
				//driver.findElement(By.id("time")).click();
				//Thread.sleep(2000);
				driver.findElement(By.id("time")).sendKeys("0750AM");
				//driver.findElement(By.id("time")).sendKeys("07");
				//driver.findElement(By.id("time")).sendKeys("50");
				//driver.findElement(By.id("time")).sendKeys("A");
				
				//Person
				Select person=new Select(driver.findElement(By.id("persons")));
				person.selectByVisibleText("2");
				//Thread.sleep(2000);
				//Parking
				driver.findElement(By.cssSelector(".switch-label")).click();
				//WebElement listView = driver.findElements(By.xpath("//div/[@class='view-icon fadeIn']/i"));
				//Reservation
				WebElement element=driver.findElement(By.xpath("//*[@id=\"submitForm\"]"));
				element.click();
				
				//String btnText=element.getText();
				
				

	}

}
	


