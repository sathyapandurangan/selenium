package WebDriverMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WidowHandles2 {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	//find mobiles element
	 driver.findElement(By.linkText("Mobiles")).click();
	 String windowHandle = driver.getWindowHandle();
	 System.out.println("1st tab id is:"+windowHandle);
	
	//find perticular mobile
	driver.findElement(By.xpath("//img [@alt='OP12R']")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//find vedio
	driver.findElement(By.id("videoCount")).click();
	
	//robot class
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	//add to cart
	WebElement element = driver.findElement(By.id("add-to-cart-button"));
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",element);
	
	
	
	
	
}

}
