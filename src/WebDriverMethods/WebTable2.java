package WebDriverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://catking.in/list-of-countries-capitals-currencies-of-the-world");
		System.out.println("rows are:");
		//xpath for row
		List<WebElement> elements1 = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
		for(WebElement row:elements1) {
		System.out.println(row.getText());
	  }//xpath for cell
		String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		System.out.println("perticular cell is:"+text);
		//xpath for column
		System.out.println("columns are:");
		List<WebElement> column = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
	     for(WebElement col:column) {
	    	 System.out.println(col.getText());
	     }
	     
	}

}
