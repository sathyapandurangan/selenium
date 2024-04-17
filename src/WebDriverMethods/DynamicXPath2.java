package WebDriverMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicXPath2 {
	static WebDriver driver;
	
	public static void browserLanch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	}
	
	  public static void findElement() {
		Actions s = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement fashion = driver.findElement(By.xpath("(//div[@class='YBLJE4'])[3]"));
		s.moveToElement(fashion).build().perform();
		WebElement foot = driver.findElement(By.xpath("(//a[@class='_1BJVlg'])[4]"));
		s.moveToElement(foot).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement flat = driver.findElement(By.xpath("//a[text()='Women Flats']"));
		flat.click();
	}
	  public static void price() {
		  List<WebElement> allprice = driver.findElements(By.xpath("//div[@class='_3I9_wc']//preceding::div[@class='_30jeq3']"));
	      for(WebElement all:allprice) {
	    	  String getprice = all.getText();
	    	  System.out.println(getprice);
	    	  String replaceAll = getprice.replaceAll("$", "");
	    	  System.out.println("empty list of replaceal is:"+replaceAll);
	      }
	      
	  }
	public static void main(String[] args) {
		browserLanch();
		findElement() ;
		price();
		
	}

}
