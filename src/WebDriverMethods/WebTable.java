package WebDriverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println("all datas:");
		List<WebElement> elements = driver.findElements(By.xpath("(//table)[1]/tbody/tr/td"));
	    for(WebElement all : elements) {
	    	System.out.println(all.getText());
	    }
	    List<WebElement> elements2 = driver.findElements(By.xpath("(//table)[1]/tbody/tr[2]/td"));
	   System.out.println("1st rows:");
	    for(WebElement row:elements2) {
	    	System.out.println(row.getText());
	    }
	    List<WebElement> elements3 = driver.findElements(By.xpath("(//table)[1]/tbody/tr/td[1]"));
	    System.out.println("1st column");
	    for(WebElement column:elements3) {
	    	System.out.println(column.getText());
	    }
	    WebElement element = driver.findElement(By.xpath("(//table)[1]/tbody/tr[6]/td[2]"));
	    System.out.println("perticular cell:"+element);
	    WebElement element2 = driver.findElement(By.xpath("(//thead)"));
	    System.out.println("head of the table is:"+element2.getText());
	}
	

}
