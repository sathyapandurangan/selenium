package MiniProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {
	static int i;
	public static WebDriver driver;
	public static void BrowserLanch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
	}
	public static void findElement() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions s = new Actions(driver);
		WebElement men = driver.findElement(By.xpath("(//div[@class='desktop-navLink'])[1]"));
		s.moveToElement(men).perform();
		driver.findElement(By.xpath("//li[@data-reactid='93']")).click();
	}
	public static void getAllPrice() {
		int count=0;

		List<WebElement> price = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));
	    for(WebElement allprice:price) {
	    	String all = allprice.getText();
	    	System.out.println(all);
	    	count++;
	    	String replaceAll = all.replaceAll("Rs. ", "");
	    	int i = Integer.parseInt(replaceAll);
	    }
	    
    	System.out.println("replace value is:"+i);
	    System.out.println("number of time the loop execution:"+count);
	}
	
public static void main(String[] args) {
	BrowserLanch();
	findElement();
	getAllPrice();
}
}
