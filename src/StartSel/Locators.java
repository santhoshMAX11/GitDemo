package StartSel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\testi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implicit wait, this will take care of synchronization issues.this wait is for objects to show on the page
		//techinically for something to show
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("santhoshsantok@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("iwillpass");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		//when the application in the changing state from one view to another you might run into that interception error. at that time, you have to wait until that view gets stable
	    //but here something to get in a stable state.
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input [@placeholder='Name']")).sendKeys("santhosh");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("dad@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("santhoshsantok@gmail.com");
	    driver.findElement(By.xpath("//form/input[3]")).sendKeys("987456123");
	    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	    System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	    //all in onea
	    driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("#inputUsername")).sendKeys("santhoshsantok@gmail.com");
	    driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	    driver.findElement(By.id("chkboxOne")).click();
	    driver.findElement(By.xpath("//button[contains(@Class,'submit')]")).click();
	}

}
