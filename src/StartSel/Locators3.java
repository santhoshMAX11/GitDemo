package StartSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        String name ="santhosh k";
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\testi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/practice-project");
		driver.findElement(By.cssSelector("a[href='practice-project']"));
		driver.findElement(By.cssSelector("#name")).sendKeys(name);
		driver.findElement(By.cssSelector("#email")).sendKeys("santosanto1220@gmail.com");
		driver.findElement(By.cssSelector("#form-submit")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='https://rahulshettyacademy.com/AutomationPractice/']")).click();
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		
		
	}

}
