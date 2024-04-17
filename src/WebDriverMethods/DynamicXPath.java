package WebDriverMethods;

import java.text.CollationKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicXPath {
	static WebDriver driver;
	static List<Integer> list = new ArrayList<Integer>();
	static Integer max;
	private static void browserlanch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebElement men = driver.findElement(By.xpath("(//div[@class='desktop-navLink'])[1]"));
        Actions s=new Actions(driver);
        s.moveToElement(men).perform();
        driver.findElement(By.xpath("(//a[text()='Casual Shoes'])[1]")).click();
        List<WebElement> allprices = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));
	    for(WebElement prices:allprices) {
	    	String text = prices.getText();
	    	String replaceAll = text.replaceAll("Rs. ", "");
	    	int num = Integer.parseInt(replaceAll);
	    	list.add(num);
	    	}
	    System.out.println(list);
	    max = Collections.max(list);
	    System.out.println("maximum value:"+max);
	    WebElement details = driver.findElement(By.xpath("//li[@class='product-base']//following::span[text()='"+max+"']//ancestor::div[@class='product-productMetaInfo']"));
	    System.out.println("product details:"+details.getText());	
	}
	public static void main(String[] args) {
		browserlanch();
	}
	}
