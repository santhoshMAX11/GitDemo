package StartSel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\testi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait =new  WebDriverWait(driver, Duration.ofSeconds(5));
		//driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		String name = "santoman";
		driver.findElement(By.className("form-control")).sendKeys(name);
		String email ="rahulshettyacademy@gmail.com";
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
		WebElement dropdown= driver.findElement(By.id("exampleFormControlSelect1"));
	
		Select listout = new Select(dropdown);
		listout.selectByContainsVisibleText("Female");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inlineRadio1")));
		//driver.findElement(By.xpath("//*[text()='Female']")).click();
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("09/12/2001");
		driver.findElement(By.className("btn")).click();
		System.out.println(driver.findElement(By.className("alert")).getText());
		
		//new (practice)
		//Select name1 = new //Select(dropdown);
		//WebDriverWait name2 = new WebDriverWait(driver,Duration.ofSeconds(5));
		//name2.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		
		
		
	}

}
