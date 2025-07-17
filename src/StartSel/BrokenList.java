package StartSel;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenList {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
//110
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\testi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Brokern URL
		//Step1 - is to get all urls tied up to the links using selenium
		//java methord will call url's and gets uou the staus code 
		//if status code>400 then that url is not working-> link which tied to url is broken
		//a[href*="soapui"]
        //soft asseration is important in automation
	    
		
	    List<WebElement>	footer =driver.findElements(By.cssSelector("#gf-BIG li a"));
	    //soft
	    SoftAssert a= new SoftAssert();
	    for(WebElement link: footer) {
	    	//using this , get the url of the pages
	    	String url=	link.getAttribute("href");
	    	//url is class,in this class has a method caleed openConnection()
		    HttpURLConnection	connect = (HttpURLConnection)new URL(url).openConnection();
			connect.setRequestMethod("HEAD");
			connect.connect();
			int rescode= connect.getResponseCode();
			System.out.println(rescode);
			
			//a. is respresent the soft assertion in this case , test will be exact the failed one in the end of the test
			a.assertTrue(rescode<400, "the link with text" + link.getText() +"is brken with code"+rescode);
			//a.assertTrue(this should be fail so only rescode<400 so it is fail , when it is failed text should be presented here)
		
			//hard code assertion
			//if(rescode>400)
			//{
				//System.out.println("the link with text" + link.getText() +"is brken with code"+rescode);
				//Assert.assertTrue(false);
			//}
	    }
	    
	//write this after the for loop
	  // this will report the error in the end and it is main in this method
		a.assertAll();
		
		
		
		
		
		
		
		
		
		
		
	}

}
