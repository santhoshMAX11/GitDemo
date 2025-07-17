package StartSel;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class stream1 {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\testi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//click on the column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//capture all the webelements into list
	    List<WebElement> element =	driver.findElements(By.xpath("//tr/td[1]"));
	   //capture text of all webelements into new(original)List
	    List<String> originalelement = element.stream().map(s->s.getText()).collect(Collectors.toList());
		 
	   ////sort on the original list 
	    List<String> sorted= originalelement.stream().sorted().collect(Collectors.toList());
		//compare original list vs sorted list
		Assert.assertTrue(originalelement.equals(sorted));
		
		
		
		//to get the price of the beans 
	    List<WebElement> rows=	driver.findElements(By.xpath("//tr/td[1]"));
	    List<String> price = rows.stream().filter(s->s.getText().contains("Beans"))
		.map(s->getPriceValue(s)).collect(Collectors.toList());
		
		//to print all the element are available in the list
		//in this , we have to use this for price tag
		price.forEach(a->System.out.println(a));
		
		
		
		
		
		//this is for to print the all the element present in the string
		//List<Object> price = element.stream() .map(s -> getPriceValue(s)).collect(Collectors.toList());
        
	}

	private static String getPriceValue(WebElement s) {
	String priceValue = s.findElement(By.xpath("./following-sibling::td[1]")).getText();
		return priceValue;
	}}