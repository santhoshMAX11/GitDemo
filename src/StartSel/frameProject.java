package StartSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		//92 next
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\testi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.switchTo().frame(driver.findElement(By.cssSelector("[name='frame-top']")));
		//first wear the mask(top) then go out(middle)because chrome cannot identify the middle in selectors hub
	    driver.switchTo().frame("frame-middle");//this is called nested frames
	    System.out.println(driver.findElement(By.id("content")).getText());
	}


}
