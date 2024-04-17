package WebDriverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/table");
		System.out.println("all datas:");
		List<WebElement> elements = driver.findElements(By.xpath("(//table)[2]/tbody/tr/td"));
		for(WebElement all:elements) {
		System.out.println(all.getText());	
		}
		System.out.println("1st row is:");
		List<WebElement> elements2 = driver.findElements(By.xpath("(//table)[2]/tbody/tr[1]/td"));
	    for(WebElement row:elements2) {
	    	System.out.println(row.getText());
	    }
	    System.out.println("1st column");
	    List<WebElement> elements3 = driver.findElements(By.xpath("(//table)[2]/tbody/tr/td[1]"));
	    for(WebElement column:elements3) {
	    	System.out.println(column.getText());
	    }
	    System.out.println("perticular cell");
	    WebElement element = driver.findElement(By.xpath("(//table)[2]/tbody/tr[3]/td[1]"));
	    System.out.println(element.getText());
	    System.out.println("table head is:");
	    WebElement element2 = driver.findElement(By.xpath("(//thead)[2]"));
	    System.out.println(element2.getText());
	}
	

}
