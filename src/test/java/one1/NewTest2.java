

package one1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//Class initialization

public class NewTest2 extends STRINGS {

	// Making driver global to access in all methods
	WebDriver driver;

	// Calling constructor , constructor got called before class and will initiate
	// the driver , else we have to declare within method and can't be used globally
	// , can't declare outside of the method
	WebDriverWait wait;

	NewTest2() {

		System.setProperty("webdriver.chrome.driver", "/home/anshumann/Downloads/chromedriver");
		driver = new ChromeDriver();

	}

	@Test(priority = 0)
	public void Login() {

		driver.findElement(By.xpath("//*[@id=\'login_email\']")).sendKeys("anshumann.singh@venturepact.com");
		driver.findElement(By.xpath("//*[@id='login_password']")).sendKeys("Pass@123");
		driver.findElement(By.xpath("//*[@id='btnLoginSubmit']")).click();

		Assert.assertEquals("http://venturepact657.outgrow.in/dashboard", logcheck);

	}

	@Test(priority = 1)
	public void Calciopen() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(30000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'numerical\']")));
		driver.findElement(By.xpath("//*[@id=\'numerical\']")).click();
		Assert.assertEquals("http://venturepact657.outgrow.in/templates", NumCal);

	}

	@Test(priority = 2)
	public void oneColumn() throws InterruptedException {

		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.navigate().to("https://venturepact864.outgrow.co/build/");
		Assert.assertEquals("https://venturepact864.outgrow.co/build/", Content1);

	}

	@Test(priority = 3)
	public void Formulabuild() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofMillis(30000));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\'sitemap_setting\']/div[2]/div[2]/div[2]/label")));
		driver.findElement(By.xpath("//*[@id=\'sitemap_setting\']/div[2]/div[2]/div[2]/label")).click();
	}

	@Test(priority = 4)
	public void Formulacreate() throws InterruptedException {

		wait = new WebDriverWait(driver, Duration.ofMillis(30000));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\'result_setting_result_tab\']/div[2]/div[2]/a")));
		WebElement formulabox = driver.findElement(By.xpath("//*[@id=\'result_setting_result_tab\']/div[2]/div[2]/a"));
		formulabox.click();
		Thread.sleep(5000);
		WebElement formula = driver.findElement(By.xpath("//*[@id=\'formula-area\']"));
		formula.sendKeys("Q1+Q2-Q3*Q4/Q1+Q2");
		driver.findElement(By.xpath("//*[@id=\'formula-modal-new\']/div/div/div[3]/div[2]/button")).click();

	}

	@Test(priority = 5)
	public void Builderconfig() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='Build']/aside/div[1]/ul[1]/li[1]")).click();		
	Thread.sleep(5000);				
	driver.findElement(By.linkText("Q1. In this article, I’m going to demonstrate an approach to this kind of editorial design, which builds on a few techniques some of which are discussed in the following articles:")).click();
			
	
	}

//	@Test(priority = 6)
	//public void Previewopen() throws InterruptedException, AWTException {

		//Thread.sleep(5000);
		//driver.findElement(
			//	By.xpath("//*[@id=\'main-div\']/app-root/og-builder/app-builder/section/header/div[4]/ul/li[3]/a"))
				//.click();
		//Thread.sleep(10000);
		//Robot robot = new Robot();
		//robot.keyPress(KeyEvent.VK_TAB);
		//robot.keyRelease(KeyEvent.VK_TAB);
		//robot.keyPress(KeyEvent.VK_TAB);
		//robot.keyRelease(KeyEvent.VK_TAB);
		//robot.keyPress(KeyEvent.VK_TAB);
		//robot.keyRelease(KeyEvent.VK_TAB);
		//robot.keyPress(KeyEvent.VK_TAB);
		//robot.keyRelease(KeyEvent.VK_TAB);
		//robot.keyPress(KeyEvent.VK_TAB);
		//robot.keyRelease(KeyEvent.VK_TAB);
		//robot.keyPress(KeyEvent.VK_TAB);
		//robot.keyRelease(KeyEvent.VK_TAB);
		//robot.keyPress(KeyEvent.VK_ENTER);
		//robot.keyRelease(KeyEvent.VK_ENTER);fdolvkdvfobvmkds;lb

	//}

	//@Test(priority = 7)
	//public void Solvecalci() throws InterruptedException, AWTException {
		//Thread.sleep(5000);

		//Robot robot = new Robot();
		//robot.keyPress(KeyEvent.VK_ENTER);
		//robot.keyRelease(KeyEvent.VK_ENTER);
		//Thread.sleep(5000);
		//robot.keyPress(KeyEvent.VK_ENTER);
		//robot.keyRelease(KeyEvent.VK_ENTER);
	//}

	@BeforeTest
	public void OpenBrowserPage() {
		String url = "https://app.outgrow.co/login";
		driver.get(url);
	}

	@AfterTest
	public void afterTest() {
		// driver.close();

	}

}
///suno bhai kya chal rha hai idher 