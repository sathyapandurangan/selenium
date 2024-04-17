package MiniProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SaravanaStrore {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saravanastores.in/");
		driver.manage().window().maximize();
		 WebElement jewel = driver.findElement(By.xpath("//span[text()='Jewellery']"));
		 Actions s = new Actions(driver);
		 s.moveToElement(jewel);
		WebElement gold = driver.findElement(By.xpath("(//li[@class='level-2 parent '])[1]"));
		s.moveToElement(gold);
		WebElement pendents = driver.findElement(By.xpath("(//span[text()='Pendants'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",pendents);
		driver.findElement(By.xpath("//div[@class='thumbnail-container reviews-loading']")).click();
		//driver.findElement(By.xpath("//i[@class='material-icons touchspin-up']")).click();	
		WebElement qty = driver.findElement(By.name("qty"));
		qty.clear();
		Thread.sleep(2000);
		WebElement qnty = driver.findElement(By.name("qty"));
		js.executeScript("arguments[0].value='5';", qnty);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("contact_products")).click();
		driver.findElement(By.id("first_name")).sendKeys("Sathya");
		driver.findElement(By.id("last_name")).sendKeys("Pandurangan");
		driver.findElement(By.id("email")).sendKeys("SathyaPandurangan92@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("7418038397");
		WebElement reqst = driver.findElement(By.xpath("//select[@class='form-control text']"));
		Select S = new Select(reqst);
		S.selectByIndex(1);
		driver.findElement(By.id("comment")).sendKeys("The Product is delivered at correct time");
		Thread.sleep(2000);
		driver.findElement(By.id("Gcaptcha")).click();
		Thread.sleep(4000);
		WebElement sub = driver.findElement(By.id("submit_cont"));
		js.executeScript("arguments[0].click();",sub);
		
	}

}
