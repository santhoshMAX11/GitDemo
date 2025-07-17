package StartSel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class mockup {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\testi\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		System.out.println(driver.findElements(By.xpath("//*[@type='checkbox']")).size());
		
		
		
		
		
		
		
		
		
		
		String[] hot = {"bad","sad","hard"};
		for(String order: hot) {
			System.out.println(order);
		}
	
	    for(int i=hot.length-1; i>=0;i--) {
	    	System.out.println(hot[i]);
	    }
	    List<String> mat= Arrays.asList(hot);
	    if(mat.contains("sad1")) {
	    	System.out.println("it is available");
	    	
	    	 }
	   
	    else {
	    	System.out.println("not available");
	    }
	String hate = "i the one";
	String[] broken = hate.split(" ");
	System.out.println(broken[0]);
	for(String top: broken) {
		System.out.println(top);	}
	
     ArrayList<String> gaint = new  ArrayList<String>();
     gaint.add("she is mine");
     gaint.add("here");
     if(gaint.contains("here1")) {
    	 System.out.println("true");
    	 
     }
     else {
    	 System.out.println("false");
     }
	
	for(String king: gaint) {
		System.out.println(king);
	}
	
	//System.setProperty("Webdriver.chrome.driver", "");
   // WebDriver driver = new ChromeDriver();
   // driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    //WebElement statics =driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
   // Select drop = new Select(statics);
   // drop.selectByIndex(1);
    //System.out.println(drop.getFirstSelectedOption().getText());
   // drop.selectByVisibleText("USD");
   // System.out.println(drop.getFirstSelectedOption().getText());
    
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
	
	}

}
