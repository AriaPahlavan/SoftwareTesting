package pset6;

import static org.junit.Assert.*;

import com.google.common.annotations.Beta;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MinWebTest {

	@Test
	public void t0() {
		// execute the test <x = 0, y = 0, z = 0, submitButton = click> and check the output message is correct


		System.setProperty("webdriver.gecko.driver", "/home/aria/webdriver/firefox/geckodriver");
		WebDriver wd = new FirefoxDriver(); // launch the browser

		String classPath = MinWebTest.class.getResource("min.html").toString();
		System.out.println(classPath);
		// edit the next line to enter the location of "min.html" on your file system
		wd.get(classPath);
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		we.click();
		WebElement result = wd.findElement(By.id("result"));
		String     output = result.getText(); // read the output text
		assertEquals("min(0, 0, 0) = 0", output);



		we = wd.findElement(By.id("x"));
		we.clear();
		we.sendKeys("3"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.clear();
		we.sendKeys("30"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.clear();
		we.sendKeys("d-13"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText(); // read the output text
		assertEquals("Please enter integer values only!", output);

		wd.quit(); // close the browser window
	}
}
