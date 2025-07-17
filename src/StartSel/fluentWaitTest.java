package StartSel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentWaitTest {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\testi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("#start button")).click();
		
        Wait<WebDriver> wait =new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
        		.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchMethodException.class);
        
	
		//see the first video for interview
		
		
		
		
		
		
		
		
		
		

	}

}
