package WebDriverMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindHidingElementTrick1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//xpath for fashion
		WebElement fashion = driver.findElement(By.xpath("(//div[@class='YBLJE4'])[3]"));
		Actions s = new Actions(driver);
		s.moveToElement(fashion).perform();
		Thread.sleep(4000);
		WebElement ethics = driver.findElement(By.xpath("//a[@class='_1BJVlg _11MZbx']"));
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    s.moveToElement(ethics).perform();
	    driver.findElement(By.xpath("//a[text()='Women Sarees']")).click();
	    
	}

}
