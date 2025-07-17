package StartSel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsHandlingProject {

	public static void main(String[] args) {
		// T
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\testi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("(//*[@target='_blank'])[1]")).click();
	    Set<String> windows= driver.getWindowHandles();
	    Iterator<String> lists= windows.iterator();
	    
	   String parentId = lists.next();
	   String childId = lists.next();
	   //travel to child page
	   driver.switchTo().window(childId);
	   
	   String text1=  driver.findElement(By.xpath("//div/h3")).getText();
	   System.out.println("childId's text"+text1);
	   //travel to parent
	   driver.switchTo().window(parentId);
	   
	   String text2 =driver.findElement(By.xpath("//div/h3")).getText();
	   System.out.println("parentId's text"+text2);
	
	
	
	}

}
