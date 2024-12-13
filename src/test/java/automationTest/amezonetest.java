package automationTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class amezonetest {
	
	@Test
	public void learnLocator()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='75%'");
		List<WebElement> text=driver.findElements(By.xpath("//div[@id='gw-card-layout']/child::div//div/h2"));
		for(WebElement ele:text)
		{
			System.out.println(ele.getDomAttribute("div"));
		}
		
		driver.quit();
	
	}

}
