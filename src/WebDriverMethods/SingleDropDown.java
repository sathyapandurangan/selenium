package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\.eclipse\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("fruits"));
		Select s = new Select(element);
		Thread.sleep(3000);
		s.selectByIndex(1);
		Thread.sleep(3000);
		s.selectByValue("2");
		Thread.sleep(3000);
		s.selectByValue("3");
		Thread.sleep(3000);
		s.selectByValue("4");
		Thread.sleep(3000);
		s.selectByVisibleText("Pine Apple");
		driver.close();
	}

}
