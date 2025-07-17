package StartSel;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {

	public static void main(String[] args) throws InterruptedException {
		//special care needed
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\testi\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String[] itemsNeeded= {"Brocolli","Cucumber","Beetroot","Carrot"};
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		//implicit wait- pros -readable code, cons -performance cause issues are not identify
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//explicit wait- pros -wait is applied only at targetted elements.so no perfrmance issues.cons -more code
		WebDriverWait wait = new  WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		//without creating a object of the class, using static can we use this method
		//Calls a method named addItems() and passes the driver and items to add.
		addItems(driver, itemsNeeded);
		
		//without static it should be used
		//base B =new base();
		//B.addItems(driver, itemsNeeded);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		//
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promocode")));
		driver.findElement(By.cssSelector(".promocode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		//
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
		System.out.println(driver.findElement(By.className("promoInfo")).getText());
	
		
		
		
		
		
		
		

	
	
	}
	public static void addItems(WebDriver driver,String[] itemsNeeded) {
		
		int j=0;
		//j is a counter to keep track of how many items have been added.
		
	List<WebElement> products =driver.findElements(By.xpath("//div[@class='product']"));
	for(int i=0;i<products.size();i++) {
		String[] name = products.get(i).getText().split("-");
		//Onion - 1 Kg
        //Using split"-" zeroth index will be onion, 1 kg will be first index;
		
		String formattedName= name[0].trim();
		//to trim the extra white space, trim() is used here("onion " > "onion")
		
		List itemsNeededList = Arrays.asList(itemsNeeded);
		//convert array into array list for easy search
		//check whether name you extracted is present in arraylist or not-
		
		if(itemsNeededList.contains(formattedName)) {
			j++; 
			//click add to cart
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			
			if(j==itemsNeeded.length) {
				break;
			}
		}	
	}
	}
}
