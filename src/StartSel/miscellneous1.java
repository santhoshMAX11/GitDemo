package StartSel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class miscellneous1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        
		
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\testi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//miscelleanous 
        driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("session key");
		
		 driver.get("https://www.google.com");
		 
         //take screenshot
	     File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     //save to desired location
	     FileUtils.copyFile(screenshot, new File("C:\\Users\\testi\\Documents\\google_ss.png"));
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
