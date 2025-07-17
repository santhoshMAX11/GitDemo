package StartSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("Webdriver.edge.driver", "C:\\Users\\testi\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://spicejet.com");
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79'])[19]")).click();
		Thread.sleep(2000);
	   // driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79'])[9]")).click();
	    //some cilent will ask without index, that the time PARENT-CHILD RELATIONSHIP will help us
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe']//div[contains(text(),'Bengaluru')]")).click();

		driver.findElement(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-19m6qjp.r-156aje7.r-y47klf.r-1phboty.r-1d6rzhh.r-1pi2tsx.r-1777fci.r-13qz1uu")).click();
		
	
	
	
	
	}

}
