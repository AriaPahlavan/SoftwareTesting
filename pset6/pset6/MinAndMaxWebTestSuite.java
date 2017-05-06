package pset6;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MinAndMaxWebTestSuite {
	private String output;
	private WebElement we;
	private static WebDriver wd;
	private static WebElement result;

	@BeforeClass
	public static void setUpClass() {
		System.setProperty("webdriver.gecko.driver", "/home/aria/webdriver/firefox/geckodriver");
		wd = new FirefoxDriver();
		String classPath = MinWebTest.class.getResource("minandmax.html").toString();
		wd.get(classPath);
	}

	@Before
	public void setUp() {
		result = wd.findElement(By.id("result"));
	}

	@After
	public void tearDown() {
		wd.navigate().refresh();
	}

	@AfterClass
	public static void tearDownClass(){
		wd.quit();
	}

	@Test public void t0() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t1() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("max(-3, -3, -3) = -3", output);
	}

	@Test public void t2() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t3() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("min(-3, -3, -3) = -3", output);
	}

	@Test public void t4() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t5() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("max(-3, -3, 0) = 0", output);
	}

	@Test public void t6() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t7() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("min(-3, -3, 0) = -3", output);
	}

	@Test public void t8() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t9() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("max(-3, -3, 7) = 7", output);
	}

	@Test public void t10() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t11() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("min(-3, -3, 7) = -3", output);
	}

	@Test public void t12() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t13() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t14() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t15() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t16() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t17() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("max(-3, 0, -3) = 0", output);
	}

	@Test public void t18() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t19() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("min(-3, 0, -3) = -3", output);
	}

	@Test public void t20() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t21() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("max(-3, 0, 0) = 0", output);
	}

	@Test public void t22() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t23() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("min(-3, 0, 0) = -3", output);
	}

	@Test public void t24() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t25() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("max(-3, 0, 7) = 7", output);
	}

	@Test public void t26() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t27() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("min(-3, 0, 7) = -3", output);
	}

	@Test public void t28() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t29() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t30() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t31() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t32() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t33() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("max(-3, 7, -3) = 7", output);
	}

	@Test public void t34() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t35() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("min(-3, 7, -3) = -3", output);
	}

	@Test public void t36() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t37() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("max(-3, 7, 0) = 7", output);
	}

	@Test public void t38() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t39() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("min(-3, 7, 0) = -3", output);
	}

	@Test public void t40() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t41() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("max(-3, 7, 7) = 7", output);
	}

	@Test public void t42() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t43() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("min(-3, 7, 7) = -3", output);
	}

	@Test public void t44() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t45() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t46() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t47() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t48() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t49() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t50() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t51() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t52() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t53() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t54() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t55() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t56() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t57() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t58() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t59() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t60() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t61() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t62() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t63() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t64() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t65() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("max(0, -3, -3) = 0", output);
	}

	@Test public void t66() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t67() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("min(0, -3, -3) = -3", output);
	}

	@Test public void t68() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t69() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("max(0, -3, 0) = 0", output);
	}

	@Test public void t70() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t71() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("min(0, -3, 0) = -3", output);
	}

	@Test public void t72() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t73() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("max(0, -3, 7) = 7", output);
	}

	@Test public void t74() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t75() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("min(0, -3, 7) = -3", output);
	}

	@Test public void t76() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t77() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t78() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t79() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t80() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t81() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("max(0, 0, -3) = 0", output);
	}

	@Test public void t82() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t83() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("min(0, 0, -3) = -3", output);
	}

	@Test public void t84() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t85() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("max(0, 0, 0) = 0", output);
	}

	@Test public void t86() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t87() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("min(0, 0, 0) = 0", output);
	}

	@Test public void t88() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t89() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("max(0, 0, 7) = 7", output);
	}

	@Test public void t90() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t91() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("min(0, 0, 7) = 0", output);
	}

	@Test public void t92() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t93() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t94() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t95() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t96() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t97() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("max(0, 7, -3) = 7", output);
	}

	@Test public void t98() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t99() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("min(0, 7, -3) = -3", output);
	}

	@Test public void t100() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t101() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("max(0, 7, 0) = 7", output);
	}

	@Test public void t102() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t103() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("min(0, 7, 0) = 0", output);
	}

	@Test public void t104() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t105() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("max(0, 7, 7) = 7", output);
	}

	@Test public void t106() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t107() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("min(0, 7, 7) = 0", output);
	}

	@Test public void t108() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t109() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t110() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t111() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t112() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t113() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t114() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t115() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t116() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t117() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t118() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t119() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t120() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t121() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t122() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t123() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t124() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t125() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t126() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t127() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t128() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t129() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("max(7, -3, -3) = 7", output);
	}

	@Test public void t130() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t131() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("min(7, -3, -3) = -3", output);
	}

	@Test public void t132() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t133() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("max(7, -3, 0) = 7", output);
	}

	@Test public void t134() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t135() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("min(7, -3, 0) = -3", output);
	}

	@Test public void t136() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t137() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("max(7, -3, 7) = 7", output);
	}

	@Test public void t138() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t139() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("min(7, -3, 7) = -3", output);
	}

	@Test public void t140() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t141() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t142() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t143() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t144() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t145() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("max(7, 0, -3) = 7", output);
	}

	@Test public void t146() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t147() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("min(7, 0, -3) = -3", output);
	}

	@Test public void t148() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t149() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("max(7, 0, 0) = 7", output);
	}

	@Test public void t150() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t151() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("min(7, 0, 0) = 0", output);
	}

	@Test public void t152() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t153() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("max(7, 0, 7) = 7", output);
	}

	@Test public void t154() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t155() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("min(7, 0, 7) = 0", output);
	}

	@Test public void t156() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t157() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t158() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t159() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t160() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t161() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("max(7, 7, -3) = 7", output);
	}

	@Test public void t162() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t163() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("min(7, 7, -3) = -3", output);
	}

	@Test public void t164() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t165() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("max(7, 7, 0) = 7", output);
	}

	@Test public void t166() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t167() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("min(7, 7, 0) = 0", output);
	}

	@Test public void t168() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t169() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("max(7, 7, 7) = 7", output);
	}

	@Test public void t170() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t171() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("min(7, 7, 7) = 7", output);
	}

	@Test public void t172() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t173() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t174() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t175() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t176() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t177() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t178() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t179() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t180() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t181() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t182() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t183() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t184() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t185() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t186() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t187() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t188() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t189() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t190() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t191() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t192() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t193() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t194() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t195() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t196() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t197() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t198() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t199() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t200() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t201() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t202() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t203() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t204() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t205() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t206() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t207() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t208() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t209() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t210() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t211() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t212() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t213() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t214() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t215() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t216() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t217() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t218() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t219() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t220() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t221() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t222() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t223() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t224() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t225() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t226() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t227() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t228() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t229() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t230() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t231() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t232() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t233() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t234() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t235() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t236() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t237() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t238() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t239() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t240() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t241() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t242() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t243() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t244() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t245() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t246() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t247() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t248() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t249() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t250() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t251() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t252() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t253() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("max"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

	@Test public void t254() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		output = result.getText();
		assertEquals("", output);
	}

	@Test public void t255() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("min"));
		we.click();
		we = wd.findElement(By.id("computeButton"));
		we.click();
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}

}

