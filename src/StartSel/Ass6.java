package StartSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Ass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\testi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement checkbox = driver.findElement(By.id("checkBoxOption2"));
		//ihave add the .isselected method in this
		Boolean check1=  checkbox.isSelected();
		System.out.println("after"+check1);
		checkbox.click();
		//here also
		Boolean check2=checkbox.isSelected();
		System.out.println("after"+check2);
		Assert.assertTrue(check2);
		
	    String selected = driver.findElement(By.cssSelector("label[for='benz']")).getText();
		
	    WebElement list = driver.findElement(By.id("dropdown-class-example"));
		Select chosen  = new  Select(list);
		chosen.selectByContainsVisibleText(selected);
		
		driver.findElement(By.id("name")).sendKeys(selected);
		driver.findElement(By.id("alertbtn")).click();
	    String text =driver.switchTo().alert().getText();
	    if(text.contains(selected)) {
	    	System.out.println("success");
	    }
	    else {
	    	System.out.println("try again");
	    }
	    System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
