package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropDown1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\.eclipse\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//select [@class='form-control']"));
		Thread.sleep(3000);
		Select s = new Select(element);
		s.selectByIndex(0);
		Thread.sleep(3000);
		s.selectByValue("canada");
		Thread.sleep(3000);
		s.selectByValue("uk");
		Thread.sleep(3000);
		s.selectByValue("germany");
		Thread.sleep(3000);
		s.selectByValue("france");
		Thread.sleep(3000);
		s.selectByValue("india");
		Thread.sleep(3000);
		s.selectByVisibleText("Brazil");
		Thread.sleep(3000);
		s.selectByVisibleText("China");
	}

}
