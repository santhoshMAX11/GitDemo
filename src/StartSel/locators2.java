package StartSel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import net.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName;

public class locators2 {

	public static void main(String[] args) throws InterruptedException {

		String name = "santhoshsantok@gmail.com";
		//System.setProperty("Webdriver.chrome.driver", "C:\\Users\\testi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//System.setProperty("Webdriver.gecko.driver", "C:\\Users\\testi\\Downloads\\geckodriver-v0.36.0-win-aarch64\\geckodriver.exe");
		//WebDriver driver= new FirefoxDriver();
		System.setProperty("Webdriver.edge.driver", "C:\\Users\\testi\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    String password = getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
	    Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+ name +",");
	    driver.findElement(By.xpath("//*[text()='Log Out']")).click();
	    driver.close();

	
	}
    public static String getpassword(WebDriver driver) throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	driver.get("https://rahulshettyacademy.com/locatorspractice/");
    	driver.findElement(By.linkText("Forgot your password?")).click();
    	Thread.sleep(2000);
    	 driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
    	String password = driver.findElement(By.cssSelector("form p")).getText();
    	//Please use temporary password 'rahulshettyacademy' to Login.
    	String[] trail = password.split("'");
    	//0th index is Please use temporary password 
    	//1th index is rahulshettyacademy' to Login
    	String[] og = trail[1].split("'");
    	//0th index rahulshettyacademy
    	//1th index to Login.
    	String passwordOG = og[0];	
    	return passwordOG; 
	}
	
	
}
