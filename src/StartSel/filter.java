package StartSel;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\testi\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Rice");

	    List<WebElement> Elements=	driver.findElements(By.xpath("//tr/td[1]"));
		//results1
	    List<WebElement> selectedEle =	Elements.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		//results1
		Assert.assertEquals(Elements.size(),selectedEle.size() );
		
		System.out.println(Elements.size() + selectedEle.size() );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
