package MiniProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[text()=' Electronics ']")).click();
		driver.findElement(By.xpath("//img[@alt='Dell 15 Laptop']")).click();
		driver.findElement(By.xpath("(//input[@class='a-button-input'])[17]")).click();
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_SPACE);
		Thread.sleep(2000);
		WebElement qnty= driver.findElement(By.xpath("(//select[@autocomplete='off'])[4]"));
		Select s = new Select(qnty);
		s.selectByValue("3");
		WebElement cart = driver.findElement(By.name("submit.add-to-cart"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", cart);
		
		
		
	}

}
