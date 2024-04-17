package WebDriverMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.switchTo().frame("frame-one796456169");
		driver.findElement(By.name("RESULT_TextField-0")).sendKeys("Sathya");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@ for='RESULT_RadioButton-1_1']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("RESULT_TextField-2")).sendKeys("13.7.1992");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("RESULT_RadioButton-3"));
		Select s = new Select(element);
		s.selectByValue("Radio-1");
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		
	}

}
