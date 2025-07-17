package StartSel;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selintroduction {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\testi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://verandarace.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
		
		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\testi\\Downloads\\geckodriver-v0.36.0-win-aarch64\\geckodriver.exe");
		WebDriver driver2 = new FirefoxDriver();
		driver2.get("https://verandarace.com/");
		System.out.println(driver2.getTitle());
		System.out.println(driver2.getCurrentUrl());
		driver2.close();
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\testi\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver3 = new EdgeDriver();
		driver3.get("https://verandarace.com/");
		System.out.println(driver3.getTitle());
		System.out.println(driver3.getCurrentUrl());
		driver3.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
