package WebDriverMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.switchTo().frame("firstFr");
		WebElement element = driver.findElement(By.xpath("//input[@ name='fname']"));
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		element.sendKeys("Sathya");
		Thread.sleep(2000);
		driver.findElement(By.name("lname")).sendKeys("Pandurangan");
		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.xpath("//iframe[@ class='has-background-white']"));
		driver.switchTo().frame(element2);
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("sathyapandurangan92@gmail.com");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Watch tutorial")).click();
		
	}

}
