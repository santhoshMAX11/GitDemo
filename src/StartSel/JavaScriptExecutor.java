package StartSel;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\testi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//by default selenium does not provide any scrolling technic so we are using javascript
        JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
	    java.util.List<WebElement> value =driver.findElements(By.cssSelector("div[class='tableFixHead'] td:nth-child(4)"));
		//inisate a variable as sum, to add the values
	    int sum =0;
		
		for(int i=0;i<value.size();i++) {
			//after inisate the sum // and  Integer.parseInt is used to convert the string into int 
		sum = sum +	Integer.parseInt(value.get(i).getText());
			 
			
		}
		System.out.println(sum);
		
		driver.findElement(By.xpath("//*[text()=' Total Amount Collected: 296 ']")).getText();
	
	    int total = Integer.parseInt(driver.findElement(By.xpath("//*[text()=' Total Amount Collected: 296 ']")).getText().split(" ")[3]);
		Assert.assertEquals(sum, total);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
