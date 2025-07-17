package StartSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//92
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\testi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable");
		//this is using webelement
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='demo-frame']")));
		
		//this is using index
		System.out.println(driver.findElements(By.tagName("iframe")).size());//this step is for index method
		//driver.switchTo().frame(0);
		
		Actions act = new Actions(driver);
	    WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		act.dragAndDrop(source, target).build().perform();
		
		//this code is to switch to default window because we cannot perform any actions in windows 
		driver.switchTo().defaultContent();
		driver.findElement(By.className("active")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}