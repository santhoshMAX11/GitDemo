package StartSel;

import java.awt.List;
import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class section9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\Users\\testi\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();		
		WebDriverWait take = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//*[@class='customradio'])[2]")).click();
		take.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();
        
        WebElement lists =driver.findElement(By.xpath("//*[@data-style='btn-info']"));
		Select dropdown = new Select(lists);
		dropdown.selectByValue("consult");
		take.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".text-info")));
		//driver.findElement(By.cssSelector(".text-info")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		take.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".card-title")));
		
		int j=0;
		//mobile is the shopping list you intend to add to the cart.
		String[] mobile = {"iphone X","Samsung Note 8","Nokia Edge","Blackberry"};
        java.util.List<String> takenthings =Arrays.asList(mobile);
        
        java.util.List<WebElement> product= driver.findElements(By.cssSelector(".card-title"));
        for(int i=0;i<product.size();i++) {
        	String productName= product.get(i).getText().trim();
        	//combined both route 
        if(takenthings.contains(productName)) {
        	  j++;
        	driver.findElements(By.xpath("//*[@class='btn btn-info']")).get(i).click();
        	 if(j==mobile.length) {
        		break;
              }}}
        
		take.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".nav-link.btn.btn-primary")));
        driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
        take.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-success")));
	    driver.findElement(By.cssSelector(".btn.btn-success")).click();
	
	
	
	
	
	
	
	
	
	
	}}
        	
        	
        	
	
