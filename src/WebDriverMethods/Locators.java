package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\.eclipse\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	    driver.get("https://www.firstcry.com/");
	    WebElement element = driver.findElement(By.id("search_box"));
	    element.click();
	    element.sendKeys("girls dress",Keys.ENTER);
	    WebElement element2 = driver.findElement(By.name("googlefcPresent"));
	    JavascriptExecutor js =(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();",element2);
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@ class='top fw lft']")).click();
	    driver.close();
	}

}
