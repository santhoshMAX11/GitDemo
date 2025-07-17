package StartSel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		//special care needed
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\testi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));	
		for(int i=0;i<options.size();i++) {
		String country = options.get(i).getText();
			if(country.equalsIgnoreCase("India")) {
				Thread.sleep(5000);
				options.get(i).click();
				break;
			
		///for(WebElement oneoption : options) {
			//if(oneoption.getText().equalsIgnoreCase("india")) {
				//oneoption.click();
		
				//break;
			}
			
				
				
			}
			}

	}



