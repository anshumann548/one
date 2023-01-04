package one1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Class initialization

public class preprodin extends STRINGS {

	// Making driver global to access in all methods
	WebDriver driver;

	// Calling constructor , constructor got called before class and will initiate
	// the driver , else we have to declare within method and can't be used globally
	// , can't declare outside of the method
	WebDriverWait wait;

	preprodin() {

		System.setProperty("webdriver.chrome.driver", "/home/anshumann/Downloads/chromedriver");
		driver = new ChromeDriver();

	}

	@Test(priority = 0)
	public void Login() {

		driver.navigate().to("http:app.outgrow.in/login");
		driver.manage().window().maximize();
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
	public void oneColumn() throws InterruptedException, AWTException {

		Thread.sleep(5000);

		driver.navigate().to("http://venturepact657.outgrow.in/build/");
		Assert.assertEquals("http://venturepact657.outgrow.in/build/", Content1);
		Thread.sleep(2000);

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

		wait = new WebDriverWait(driver, Duration.ofMillis(60000));
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
		driver.findElement(By.xpath("//*[@id=\'Build\']/aside/div[1]/ul[1]")).click();
		wait = new WebDriverWait(driver, Duration.ofMillis(30000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'Build\']/aside/div[1]/ul[1]")));
		driver.findElement(By.xpath("//*[@id=\'Build\']/aside/div[1]/ul[1]/li[3]")).click();
		Thread.sleep(3000);

	}

	@Test(priority = 6)
	public void Scrollby() throws InterruptedException {
		WebElement ele = driver.findElement(By.xpath("//*[@id=\'Build\']/main/div[2]"));
		WebElement ele1 = driver.findElement(By.xpath("//*[@id=\'display_setting\']/div[2]"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollTo(0, 900)", ele);
		jse.executeScript("arguments[0].scrollTo(0, 900)", ele1);
	}

	@Test(priority = 7)
	public void Searchfont() throws InterruptedException {
	List<WebElement> list =driver.findElements(By.xpath("//*[@id=\'display_setting_display_tab\']/div[4]/div[2]/div[1]/div[2]/app-global-fonts/div/input"));	
	for(int i = 0; i<=list.size()-1; i++)
	{
        if(list.get(i).getText().contains("Zilla"))
        {
            list.get(i).click();
            break ;
	}	
	
	}
	
	}

//	@Test(priority = 6)
//	public void LiveCalciopen() throws InterruptedException, AWTException {
//		Actions act = new Actions(driver);
//		Thread.sleep(5000);
//		driver.findElement(
//				By.xpath("//*[@id=\'main-div\']/app-root/og-builder/app-builder/section/header/div[4]/ul/li[4]/div/a"))
//				.click();
//		driver.findElement(By.xpath("//*[@id=\'live-btn\']")).click();
//
//		Thread.sleep(3000);
//		driver.findElement(
//				By.xpath("//*[@id=\'main-div\']/app-root/og-builder/app-builder/section/header/div[4]/ul/li[2]/a"))
//				.click();
//		Thread.sleep(3000);
//		driver.switchTo().newWindow(WindowType.TAB);
//		Robot chitti = new Robot();
//		chitti.keyPress(KeyEvent.VK_BACK_SPACE);
//		chitti.keyRelease(KeyEvent.VK_BACK_SPACE);
//		chitti.keyPress(KeyEvent.VK_BACK_SPACE);
//		chitti.keyRelease(KeyEvent.VK_BACK_SPACE);
//		chitti.keyPress(KeyEvent.VK_BACK_SPACE);
//		chitti.keyRelease(KeyEvent.VK_BACK_SPACE);
//		chitti.keyPress(KeyEvent.VK_BACK_SPACE);
//		chitti.keyRelease(KeyEvent.VK_BACK_SPACE);
//		chitti.keyPress(KeyEvent.VK_BACK_SPACE);
//		chitti.keyRelease(KeyEvent.VK_BACK_SPACE);
//		chitti.keyPress(KeyEvent.VK_BACK_SPACE);
//		chitti.keyRelease(KeyEvent.VK_BACK_SPACE);
//		chitti.keyPress(KeyEvent.VK_BACK_SPACE);
//		chitti.keyRelease(KeyEvent.VK_BACK_SPACE);
//		chitti.keyPress(KeyEvent.VK_BACK_SPACE);
//		chitti.keyRelease(KeyEvent.VK_BACK_SPACE);
//		chitti.keyPress(KeyEvent.VK_BACK_SPACE);
//		chitti.keyRelease(KeyEvent.VK_BACK_SPACE);
//		chitti.keyPress(KeyEvent.VK_BACK_SPACE);
//		chitti.keyRelease(KeyEvent.VK_BACK_SPACE);
//		chitti.keyPress(KeyEvent.VK_BACK_SPACE);
//		chitti.keyRelease(KeyEvent.VK_BACK_SPACE);
//		chitti.keyPress(KeyEvent.VK_CONTROL);
//		chitti.keyPress(KeyEvent.VK_SHIFT);
//		chitti.keyPress(KeyEvent.VK_V);
//		chitti.keyRelease(KeyEvent.VK_CONTROL);
//		chitti.keyRelease(KeyEvent.VK_V);
//		chitti.keyRelease(KeyEvent.VK_SHIFT);
//		chitti.keyPress(KeyEvent.VK_ENTER);
//		chitti.keyRelease(KeyEvent.VK_ENTER);
//
//	}
//
//	@Test(priority = 7)
//
//	public void solve() throws InterruptedException, AWTException {
//		Thread.sleep(2000);
//		Robot chitti2 = new Robot();
//		chitti2.keyPress(KeyEvent.VK_TAB);
//		chitti2.keyRelease(KeyEvent.VK_TAB);
//		chitti2.keyPress(KeyEvent.VK_TAB);
//		chitti2.keyRelease(KeyEvent.VK_TAB);
//		chitti2.keyPress(KeyEvent.VK_TAB);
//		chitti2.keyRelease(KeyEvent.VK_TAB);
//		chitti2.keyPress(KeyEvent.VK_TAB);
//		chitti2.keyRelease(KeyEvent.VK_TAB);
//		chitti2.keyPress(KeyEvent.VK_TAB);
//		chitti2.keyRelease(KeyEvent.VK_TAB);
//		chitti2.keyPress(KeyEvent.VK_TAB);
//		chitti2.keyRelease(KeyEvent.VK_TAB);
//		chitti2.keyPress(KeyEvent.VK_TAB);
//		chitti2.keyRelease(KeyEvent.VK_TAB);
//		chitti2.keyPress(KeyEvent.VK_TAB);
//		chitti2.keyRelease(KeyEvent.VK_TAB);
//		chitti2.keyPress(KeyEvent.VK_TAB);
//		chitti2.keyRelease(KeyEvent.VK_TAB);
//		chitti2.keyPress(KeyEvent.VK_TAB);
//		chitti2.keyRelease(KeyEvent.VK_TAB);
//		chitti2.keyPress(KeyEvent.VK_TAB);
//		chitti2.keyRelease(KeyEvent.VK_TAB);
//		chitti2.keyPress(KeyEvent.VK_TAB);
//		chitti2.keyRelease(KeyEvent.VK_TAB);
//		chitti2.keyPress(KeyEvent.VK_ENTER);
//		chitti2.keyRelease(KeyEvent.VK_ENTER);
//	}
//
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
