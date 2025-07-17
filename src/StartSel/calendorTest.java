package StartSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class calendorTest {

	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\testi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String month ="04";
		String date ="11";
		String year="2030";
        
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        //select calendor tab
        driver.findElement(By.cssSelector(".react-date-picker__calendar-button__icon.react-date-picker__button__icon")).click();
        //select the year
        driver.findElement(By.className("react-calendar__navigation__label__labelText")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("react-calendar__navigation__label__labelText")).click();
        
        driver.findElement(By.xpath("//*[text()='"+year+"']")).click();
        driver.findElement(By.xpath("//*[text()='April']")).click();
        //driver.findElement(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[text()='"+date+"']")).click();
        
        String inputmonth = driver.findElement(By.cssSelector(".react-date-picker__inputGroup__month")).getAttribute("value");
        String inputdate = driver.findElement(By.cssSelector(".react-date-picker__inputGroup__day")).getAttribute("value");
        String inputyear = driver.findElement(By.cssSelector(".react-date-picker__inputGroup__year")).getAttribute("value");
        
        String deliveryDate = inputmonth + "/" + inputdate + "/" + inputyear;     
        
        System.out.println("selected date:" +  deliveryDate);
        Assert.assertEquals(deliveryDate, "4/11/2030");
     
     
     
     
	}}
        
        
        