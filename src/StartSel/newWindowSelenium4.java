package StartSel;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newWindowSelenium4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\testi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//we can use newWindow(TAB) OR (WINDOW) 
		driver.switchTo().newWindow(WindowType.TAB);
		
		//window handles (select the set<String> tab became it can store the more numbers of windows
	    Set<String> handles=	driver.getWindowHandles();
	    Iterator<String> it=	handles.iterator();
		
	    String parentId= it.next();		//from non to 0th page
	    String childId= it.next();//from 0th to 1th
	    //travel to child
	    driver.switchTo().window(childId);
	    driver.get("https://rahulshettyacademy.com/");
	    //getting the item from parent
	    String courseName=  driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))
	    .get(1).getText();
	    //return to parent
	    driver.switchTo().window(parentId);
	    WebElement name= driver.findElement(By.cssSelector("[name='name']"));
        
	    name.sendKeys(courseName);
         
         //screenshort a particular page using this
         File output= name.getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(output, new File ("logo.png"));
		
		
		
		//get height and width
       System.out.println(name.getRect().getDimension().getHeight());
       System.out.println(name.getRect().getDimension().getWidth());
		
		
		
		
		
		
		
		
	}

}
