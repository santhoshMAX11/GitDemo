package StartSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class relativeLoc {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\testi\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement nameEditBox= driver.findElement(By.cssSelector("[name='name']"));
        //to write the label name we are using the realtive locators
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		
		//below locator
		WebElement dob = driver.findElement(By.cssSelector("[for='dateofBirth']"));
	    driver.findElement(with(By.tagName("input")).below(dob)).click();
		
		WebElement checkbox11 = driver.findElement(By.xpath("//*[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(checkbox11)).click();
		
		WebElement radio =driver.findElement(By.xpath("//*[text()='Employment Status: ']"));
		System.out.println( driver.findElement(with(By.tagName("label")).toRightOf(radio)).getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
