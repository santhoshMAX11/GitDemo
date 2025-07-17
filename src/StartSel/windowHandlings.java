package StartSel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandlings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\testi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles(); //parentId,childId
		Iterator<String> it= windows.iterator();
		
		//first next will be in parentID[0th index]
		String parentId=  it.next();
		String childId= it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		//debug here and select the above code and right the code and click the watch and enter the split, trim to get the extact email
		String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split(" ")[4];
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(emailId);
		
		
		
		
	}

}
