package MiniProject;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrmDemo {
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
		//lanch url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//xpath for admin
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String text = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p'][1]")).getText();
		String substring = text.substring(11, 16);
		//xpath for username
		driver.findElement(By.name("username")).sendKeys(substring);
		//xpath for admin123
		String text2 = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p'][2]")).getText();
		String substring2 = text2.substring(11, 19);
		//xpath for passward
		driver.findElement(By.name("password")).sendKeys(substring2);
		//xpth for login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//xpath for admin
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item'][1]")).click();
		//xpath for add button
		Actions s=new Actions(driver);
       WebElement Add = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
		s.click(Add).perform();
       //xpath for user role
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'][1]")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//xpath for employee name
		String employee = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).getText();
		WebElement name = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		name.sendKeys(employee);
        Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);	
		//xpath for status
		driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[2]")).click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
         //xpath for user name
		WebElement user = driver.findElement(By.xpath("//input[@autocomplete='off']"));
		user.click();
		user.sendKeys("Sathya");
		//xpath for password
		WebElement password = driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
		password.click();
		password.sendKeys("Sathya@123");
		//xpath for conform password
		WebElement conform = driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]"));
		conform.click();
		conform.sendKeys("Sathya@123");
		//xpath for save button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		//xpath for system users
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Sathya");
		WebElement element = driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'][1]"));
		Thread.sleep(2000);
		element.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement element2 = driver.findElement(By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']"));
		s.click(element2).perform();
		WebElement element4 = driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]"));
		s.click(element4).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//xpath for delete button
		WebElement element3 = driver.findElement(By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[1]"));
		element3.click();
		driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
		driver.close();
		
}


}

