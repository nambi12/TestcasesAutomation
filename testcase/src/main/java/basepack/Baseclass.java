package basepack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
public class Baseclass {

	public static WebDriver driver;
	
	public static void  browserlaunch() {
		driver = new ChromeDriver();
	}
	public static void url() {
		
		driver.get("https://www.automationexercise.com/test_cases");
	}
	public static void max() {
		driver.manage().window().maximize();
		
	}
	public static void Shot(String element) throws IOException {
		TakesScreenshot Ts = (TakesScreenshot) driver;
		File image = Ts.getScreenshotAs(OutputType.FILE);
		String destination = "/Users/nambi/eclipse-workspace/testcase/WebPageScreenshot/" + element + ".png";
		File f = new File(destination);
		FileUtils.copyFile(image, f);
		
	}
	public static void Shot1(Boolean element) throws IOException {
		TakesScreenshot Ts = (TakesScreenshot) driver;
		File image = Ts.getScreenshotAs(OutputType.FILE);
		String destination = "/Users/nambi/eclipse-workspace/testcase/WebPageScreenshot/" + element + ".png";
		File f = new File(destination);
		FileUtils.copyFile(image, f);
	}
	public static void MouseHover(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	public static void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public static void scroll_bottom(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	public static void scroll_top(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,0)");
	}
	public static void implicitywait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public static void windowsHandel(int index) {
		Set<String> windowHandles = driver.getWindowHandles();
		implicitywait();
	List<String> list = new ArrayList<String>(windowHandles);
	driver.switchTo().window(list.get(index));
	}
	public static void quit() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}
}
