package StartSel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\testi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //td means column , (,tr means row)
       // [class='table-display'] td:nth-child(2)
        //[class='table-display'] td:nth-child(2)
        List<WebElement> list =  driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
        int sum =0;
        
        //for(int i=0;i<list.size();i++) {
         //sum = sum + Integer.parseInt(list.get(i).getText()); 
        //}
        // System.out.println(sum);
        
        for(WebElement item: list ) {
        	sum += Integer.parseInt(item.getText());
        }
        System.out.println(sum);
        
        
        
        driver.findElement(By.id("autocomplete")).sendKeys("unit");
        Thread.sleep(3000);
        List<WebElement> options= driver.findElements(By.cssSelector("#ui-id-1 li"));
        for(int i=0;i<options.size();i++) {
        	 String selected =options.get(i).getText();
        	 if(selected.equalsIgnoreCase("United Kingdom (UK)"))
        	 {Thread.sleep(2000);
        		 options.get(i).click();
        		 break;
        		 }
        	
        }
        
       // for(WebElement option:options) {
        //String word =option.getText();   //determine int the name
        	//if(word.equalsIgnoreCase("india")) {
        		//option.click();
        	//}
       // }
        
        List<WebElement> AMOUNT= driver.findElements(By.xpath("//*[@class='tableFixHead']/table/tbody/tr/td[4]"));
		int sum1 =0;
		for(WebElement zoho: AMOUNT) {
			sum1 += Integer.parseInt(zoho.getText());
		}
		
        System.out.println(sum1);
        
        
        
        
        
        
        
        
        
        
        
        //special project on table 
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        
        
		List<WebElement> rows= driver.findElements(By.cssSelector(".table-display tr"));
		System.out.println(rows.size());
		//th is for column, tr is for row
		List<WebElement> column =driver.findElements(By.cssSelector(".table-display tr:nth-child(1) th"));
		System.out.println(column.size());
		WebElement words = driver.findElement(By.cssSelector(".table-display tr:nth-child(3)"));
		System.out.println(words.getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static JavascriptExecutor JavaScriptExecutor(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

}
