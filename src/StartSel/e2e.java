package StartSel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\testi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://spicejet.com");
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79'])[23]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe']//div[contains(text(),'Chennai')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).click();
		//
		WebElement ele =driver.findElement(By.xpath("//*[@data-testid='return-date-dropdown-label-test-id']"));
		 if(ele.getDomAttribute("style").contains("background-color: rgb(238, 238, 238);")){
	        	System.out.println("it is not enable");
	        	Assert.assertTrue(true);
	        }
	        else {
	        	Assert.assertFalse(false);
	        }
		 //
		driver.findElement(By.xpath("(//div[@dir='auto'])[63]")).click();
		Thread.sleep(2000);
        for(int i=1;i<5;i++) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		}
		
        driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
        Thread.sleep(2000);
       System.out.println( driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).getText(), "5 Adults");
        
        //
        driver.findElement(By.xpath("(//*[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e'])[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@style='height: 200px; width: 140px;']/div/div/div[3]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("(//*[@class='css-1dbjc4n r-7o8qx1'])[1]")).click();
        driver.findElement(By.xpath("(//*[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73'])")).click();
        
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
