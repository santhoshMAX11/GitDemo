package StartSel;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//96
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\testi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //to count the links which are present in the page
        System.out.println(driver.findElements(By.tagName("a")).size());
		//count the footer page links
		WebElement footerdriver= driver.findElement(By.id("gf-BIG"));
		footerdriver.findElements(By.tagName("a")).size();
	    System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//count the particular column link
		WebElement columndriver =  footerdriver.findElement(By.xpath("//table/tbody/tr/td/ul[1]"));		//[class='gf-t'] td:nth-child(1)
		List<WebElement> list = columndriver.findElements(By.tagName("a"));
		System.out.println(list.size());
		
	   //click on each link in the column
		
		for(int i=1;i<list.size();i++) {
			//In most browsers, pressing Ctrl + Enter on a link opens it in a new tab.
			//Keys.chord helps you press multiple keys at once.
            String clickonlink =Keys.chord(Keys.CONTROL,Keys.ENTER);
		    list.get(i).sendKeys(clickonlink);
		    Thread.sleep(5000);
		}
		//this is a achievement for an intereview
		//We store all those IDs in a Set called abc.
		Set<String> abc= driver.getWindowHandles();
		//Since Set doesn't support indexing (like abc[0]), we use an Iterator to go through each window ID one by one.
		Iterator<String> it= abc.iterator();
		
		//it.hasNext() checks if there’s another window ID available.
            while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
			
			
			
		}
		
		
		
		
		
			}

}
