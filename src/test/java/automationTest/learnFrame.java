package automationTest;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class learnFrame {

	@Test
	public void lerniframe() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		List<WebElement> el = driver.findElements(By.xpath("//a[@class='blinkingText']"));
		el.get(0).click();

		Set<String> ss = driver.getWindowHandles();
		Iterator<String> i = ss.iterator();
		String parentWindow1 = i.next();
		String chaildWindow = i.next();
		driver.switchTo().window(chaildWindow);
		System.out.println(ss);
		String email = driver.findElement(By.xpath("//p[@class='im-para red']//a")).getText();
		driver.close();
		driver.switchTo().window(parentWindow1);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("username")).sendKeys(email);
		Thread.sleep(5000);
		driver.quit();

	}

}
