package StartSel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.reporters.Files;

public class SSLCheck {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options =new ChromeOptions();
		options.setAcceptInsecureCerts(true);
        System.setProperty("WebDriver.Chrome.driver", "C:\\\\Users\\\\testi\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe" );
        
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		
		
		//study before interview
	   // driver.get("https://developer.chrome.com/docs/chromedriver/capabilities");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
