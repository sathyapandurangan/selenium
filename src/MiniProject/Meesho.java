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
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Meesho {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		Thread.sleep(2000);
		WebElement ethic = driver.findElement(By.xpath("(//span[@font-weight='book'])[6]"));
		Actions s = new Actions(driver);
		s.moveToElement(ethic);
		WebElement silk = driver.findElement(By.xpath("//p[text()='Silk Sarees']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", silk);
		Thread.sleep(2000);
		WebElement box = driver.findElement(By.xpath("//iframe[@title='Widget containing a Cloudflare security challenge']"));
		driver.switchTo().frame(box);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			driver.switchTo().defaultContent();
		
		
		
	}

}
