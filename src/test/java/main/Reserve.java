package main;

import java.awt.Desktop.Action;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reserve {
	public static WebDriver driver;
	
	//public void scroll(int horizontal, int vertical) throws InterruptedException {
		
		//jsExec.executeScript("javascript:window.scrollBy(" + horizontal + "," + vertical + ")");
    //}
	
	//protected void applyEventsOnElement(By locator, Event... events) {
        //WebElement element = driver.findElement(locator);
       // if(element != null) {
           // for (Event event : events) {
               // ((JavascriptExecutor)driver).executeScript("var event = new Event('"+event.getEvent()+"', { 'bubbles': true, 'cancelable': true });"+
                       // " document.getElementsByClassName('"+driver.findElement(locator).getAttribute("class")+"')[0].dispatchEvent(event)");
           // }
      
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
				
				 driver=new ChromeDriver();
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
				
				driver.manage().window().maximize();
				driver.get("http://10.15.1.204:3000/questionaire");
				
				
				WebElement radio = driver.findElement(By.id("radioExample3"));
				radio.click();
				//Actions actions = new Actions(driver);
			    //actions.moveToElement(radio);
				//actions.perform();
				
				Actions action = new Actions(driver);
               
				
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,650)");
				
				Thread.sleep(2000);
				//driver.switchTo().activeElement().click();  
				//driver.findElement(By.xpath("//*[@id=\"cb1\"]")).click();
				//Thread.sleep(2000);
				
				//WebElement chb1=driver.findElement(By.id("first"));
				//chb1.click();
				
				//WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"cb2\"]"));
				//boolean state = driver.findElement(By.id("cb1")).isSelected();
			//WebElement checkbox5 = driver.findElement(By.id("cb5"));
				//checkbox1.click();
				//Thread.sleep(2000);
				//WebElement checkbox5 = driver.findElement(By.xpath("//*[@id=\"cb5\"]"));
				//checkbox5.click();
				 //checkbox1= driver.find_element_by_id("cb1");
				
				//WebElement chb1=driver.findElement(By.cssSelector("input[value='Sarma']"));
				//chb1.click();
				//WebElement btn=wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".btn.btn-primary")));
				 
				 //action.moveToElement(btn)
                 //.build()
                 //.perform();
        //btn.click();
				//WebElement btn=driver.findElement(By.cssSelector(".btn.btn-primary"));
				
				//btn.click();
				driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/button[1]")).click();
				((JavascriptExecutor) driver).executeScript("window.focus();");
				WebElement good=wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("label[for='radio4Example2']")));
				//good.click();
				jse.executeScript("arguments[0].click();", good);
				
				driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button/span")).click();
				WebElement txt=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='modal-body']//textarea[@class='form-control']")));
				//WebElement txt =driver.findElement(By.xpath("//div[@class='modal-body']//textarea[@class='form-control']"));
				jse.executeScript("arguments[0].click();", txt);
				//txt.click();
				txt.sendKeys("Ali");
				//String nameText = driver.findElement(By.id("hwofTA")).getText();
				
				//jse.executeScript("window.scrollBy(0,300)");
				
				
				
				driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div[6]/div/div[2]/div/div/button[8]")).click();
				//new Actions(driver).moveToElement(driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div[6]/div/div[2]/div/div/button[8]"))).perform();
                jse.executeScript("window.scrollBy(0,500)");
                
                //driver.findElement(By.id("frta")).sendKeys("Tutorialspoint");
                //String nameText = driver.findElement(By.id("frta")).getText();
                driver.findElement(By.id("frta")).sendKeys("jeee");
                driver.findElement(By.id("frta")).sendKeys("Keys.RETURN");
                driver.findElement(By.id("submitQuestionaire")).click();
		        
				//driver.findElement(By.id("rng")).click();
				WebElement slider = driver.findElement(By.id("rng"));
				slider.click();
		        Actions move = new Actions(driver);
		        //Action action = (Action) move.dragAndDropBy(slider, 30, 0).build();
		        //action.perform();
		        
		       
				
				
				
				
				
				
				String parentHandle = driver.getWindowHandle();
				System.out.println("parent window - "+parentHandle);
				driver.findElement(By.id("radio4Example2")).click();
				
				Set<String> handles = driver.getWindowHandles();
				for (String handle : handles) {
					System.out.println(handle);
					if(!handle.equals(parentHandle)) {
						driver.switchTo().window(handle);
						jse.executeScript("window.scrollBy(0,100)");
						driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button")).click();
						Thread.sleep(5000);
						
						
						
						 //WebElement slider = driver.findElement(By.xpath("//*[@id=\"rng\"]"));
					        //Actions move = new Actions(driver);
					        //Action action = (Action) move.dragAndDropBy(slider, 30, 0).build();
					        //action.perform();
					        
					       Actions dragger = new Actions(driver);
					        WebElement draggablePartOfScrollbar = driver.findElement(By.xpath("//*[@id=\\\"rng\\"));
					        int numberOfPixelsToDragTheScrollbarDown = 5000;
					        dragger.moveToElement(draggablePartOfScrollbar).clickAndHold().moveByOffset(0,numberOfPixelsToDragTheScrollbarDown).release().perform();
					        
					        JavascriptExecutor jsb = (JavascriptExecutor)driver;
							jsb.executeScript("window.scrollBy(0,1100)");
					        
						driver.quit();
						
						
					}
				}

				
				//WebElement radio1 = driver.findElement(By.id("radio4Example2"));
				//radio1.click();
				//WebElement btn=wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".btn.btn-primary")));
				
				//WebElement chb1=wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[value='Sarma']")));
				
				//new Actions(driver).moveToElement(btn).perform();
				
				
				
				
}
}
	

