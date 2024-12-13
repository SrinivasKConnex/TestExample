package Test.Example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestAmezon {

	@Test
	public void testFrame() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		WebElement ele = driver.findElement(By.id("nav-link-accountList"));

		Actions action = new Actions(driver);

		action.moveToElement(ele).build().perform();
		
		action.moveToElement(ele).click().build().perform();
		
		action.keyDown(Keys.CONTROL).click(ele).build().perform();

		Thread.sleep(5000);

	}

}
