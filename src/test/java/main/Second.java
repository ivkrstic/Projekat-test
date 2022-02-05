package main;

import java.awt.AWTException;
//import java.awt.Desktop.Action;
import java.awt.Robot;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Second {
	
	public static WebDriver driver;
	
	//public void scroll(int horizontal, int vertical) throws InterruptedException {
        //jsExec.executeScript("javascript:window.scrollBy(" + horizontal + "," + vertical + ")");
    //}
	public static void scrollBrowserByRobot(int numberOfDownClicks){
        try {
            Robot robot = new Robot();
            for(int i = 0; i < numberOfDownClicks; i++){
                robot.mouseWheel(1);
                //try{ Thread.sleep(50); }catch(InterruptedException e){}
            }
        }catch (AWTException error){
            error.printStackTrace();
        }
    }
	
	public static void scrollToBottom(){
        Actions actions = new Actions(driver);
        Action series = actions
                .keyDown(Keys.CONTROL)
                .sendKeys(Keys.END)
                .build();
        series.perform();
    }

	public static void main(String[] args) {
		
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
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,650)");
		
		
		WebElement btn=wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".btn.btn-primary")));
		
		WebElement chb1=wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[value='Sarma']")));
		
		new Actions(driver).moveToElement(btn).perform();
		//WebElement chb1 = driver.findElement(By.cssSelector("input[value='Sarma']"));
		//WebElement chb2=driver.findElement(By.id("cb5"))
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", chb1);
		//scrollBrowserByRobot(10);
		//scrollToBottom();
		chb1.click();
		//chb2.click();
		
		
		//List<MobileElement> itemOption = element.findElements(By.xpath(el1));
        //for (MobileElement choseItem: itemOption) {
            //MobileElement item = choseItem.findElement(By.xpath(el2));
            //if (item.getText().equalsIgnoreCase(itemName)){
               // item.click();
            //}
        //}
    //}
	
	
		
		//List<WebElement> radio = driver.findElements(By.xpath("//input[@name='wdycform' and @type='radio']"));
		//for(int i=0;i<radio.size();i++)
		//{
			//WebElement local_radio=radio.get(i);
			//String value=local_radio.getAttribute("value");
			//System.out.println("Values from radio buttons are======>>>>>>"+value);
			
			//if(value.equalsIgnoreCase("For both"))
			//{
				//local_radio.click();
				
			//}
			
		//}
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//get the height of the webpage and scroll to the end
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		//je.executeScript("arguments[0].scrollIntoView(true);",element);
		
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,250)");
		
		
		
		//Robot robot = new Robot();
		//robot.keyPress(KeyEvent.VK_CONTROL);
		//robot.keyPress(KeyEvent.VK_END);
		//robot.keyRelease(KeyEvent.VK_END);
		//robot.keyRelease(KeyEvent.VK_CONTROL);
		
		//WebElement chk2=(WebElement) driver.findElements(By.xpath("//input[@type='checkbox'][2]"));
		//System.out.println(chk2.isSelected());
		//chk2.click();
	//List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	//for (int i=0;i<checkbox.size();i++) {
		//WebElement ele = checkbox.get(i);
		
		//String id = ele.getAttribute("id");
		
		//if (id.equalsIgnoreCase("Sarma")) {
			//ele.click();
			//break;
		//}
	//}
	
	

		
		
		driver.quit();

	}

}
