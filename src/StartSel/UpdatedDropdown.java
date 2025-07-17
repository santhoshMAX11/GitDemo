package StartSel;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\testi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://spicejet.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@dir='auto'])[63]")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		// for loop
		// for(int i=1;i<5;i++) {

		// driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		// }

		// while loop
		int i = 1;
		while (i < 5) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
			i++;
		}

		Assert.assertEquals(
				driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[2]")).getText(),
				"5 Adults");

		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();

		System.out.println(
				driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[2]")).getText());

		// check boxes??????????????????????????????????????????????
		// Assert.assertFalse((driver.findElement(By.xpath("(//*[@class='css-1dbjc4n
		// r-7o8qx1'])[2]")).isSelected()));
		// System.out.println(driver.findElement(By.xpath("(//*[@class='css-1dbjc4n
		// r-7o8qx1'])[2]")).isSelected());
		// Thread.sleep(2000);
		WebElement checkbox = driver.findElement(By.xpath("(//*[@style='cursor: pointer;'])[2]"));
		checkbox.click();
		Thread.sleep(5000);

		// to check whther the checkbox is selected after clicking
		if (checkbox.isSelected()) {
			System.out.println("checkbox is selected");
		} else {
			System.out.println("checkbox is not selected");
		}

		// Assert.assertTrue((driver.findElement(By.xpath("(//*[@class='css-1dbjc4n
		// r-7o8qx1'])[2]")).isSelected()));
		// System.out.println(driver.findElement(By.xpath("(//*[@class='css-1dbjc4n
		// r-7o8qx1'])[2]")).isSelected());

		// to count the check boxes{driver.findElements IS
		// IMPORTANT}%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		System.out.println(driver.findElements(By.xpath("//*[@class='css-1dbjc4n r-7o8qx1']")).size());

		// try this methord for everything from now
		WebElement ele = driver.findElement(By.xpath("//*[@data-testid='return-date-dropdown-label-test-id']"));
		System.out.println("before clicking" + ele.getDomAttribute("style"));
		driver.findElement(By.cssSelector("div[data-testid='round-trip-radio-button']")).click();
		System.out.println("after clicking" + ele.getDomAttribute("style"));

		if (ele.getDomAttribute("style").contains("border-bottom-left-radius: 0px; border-top-left-radius: 0px;")) {
			System.out.println("true");
			Assert.assertTrue(true);

		} else {
			System.out.println("false");
			Assert.assertFalse(false);
		}

	}

}
