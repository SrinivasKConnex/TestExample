package automationTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class frame {

	@Test
	public void testIframe() {
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");

		driver.findElement(By.linkText("Droppable")).click();

		driver.switchTo().frame(0);
		String ss = driver.findElement(By.xpath("//div[@id='draggable']")).getText();

		WebElement el = driver.findElement(By.xpath("//div[@id='draggable']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(el, driver.findElement(By.xpath("//div[@id='droppable']"))).build().perform();
		System.out.println(ss);

		driver.switchTo().defaultContent();

		driver.findElement(By.linkText("Draggable")).click();

		driver.switchTo().frame(0);

		System.out.println(driver.findElement(By.id("draggable")).getText());

	}

}
