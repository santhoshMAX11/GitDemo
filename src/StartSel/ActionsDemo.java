package StartSel;

import java.security.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\testi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        Actions act =new Actions(driver);
        
       
        //multi element
        WebElement multi =driver.findElement(By.id("twotabsearchtextbox"));
       act.moveToElement(multi).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
        
        
        //mouser hover and contextclick(is right click)
        WebElement element =driver.findElement(By.xpath("//*[@aria-controls='nav-flyout-accountList']"));
        act.moveToElement(element).contextClick().build().perform();
        Thread.sleep(5000);
		
        //not work self example for drag and drop
      //  WebElement draggable= driver.findElement(By.id("nav_cs_2"));
        //WebElement dropable = driver.findElement(By.id("twotabsearchtextbox"));
        //act.dragAndDrop(draggable,dropable ).perform();
        
	}

}
