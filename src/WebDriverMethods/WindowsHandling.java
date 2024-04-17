package WebDriverMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/"); 
		//xpath for search element
        driver.findElement(By.xpath("//input[@ class='Pke_EE']")).sendKeys("Realme12",Keys.ENTER);
        String windowHandle = driver.getWindowHandle();
        System.out.println("1st tab id is:"+windowHandle );
        //xpath for realme mobile
        WebElement element3 = driver.findElement(By.xpath("//div[text()='realme 12 Pro 5G (Navigator Beige, 256 GB)']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", element3);
        
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> convert = new ArrayList<String>(windowHandles);
        System.out.println("1st and 2nd tab id is:"+convert);
        driver.switchTo().window(convert.get(1)); //go for second tab meaning
        Actions s = new Actions(driver);
        //xpath for vedio
        WebElement vedio = driver.findElement(By.xpath("//div[@ class='_2usHgU']"));
        s.moveToElement(vedio).perform();
        //xpath for vedios frame
        WebElement element = driver.findElement(By.xpath("//iframe[@ class='_1JqCrR']"));
        driver.switchTo().frame(element);
        //xpath for vedio playbutten
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement playbutton = driver.findElement(By.xpath("//button[@ class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")); 
        playbutton.click();
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_SPACE);
        r.keyRelease(KeyEvent.VK_SPACE);
        //xpath for addtocart
        Thread.sleep(2000);
        WebElement element2 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww _2Fj61M']"));
       Thread.sleep(2000);
       js.executeScript("arguments[0].click();", element2);
        	}

}
