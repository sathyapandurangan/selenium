package WebDriverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path_myntra {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\.eclipse\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WebElement element = driver.findElement(By.xpath("//a[@ href='/shop/men']"));
		System.out.println("element name:"+element.getText());
		WebElement element2 = driver.findElement(By.xpath("//input[@ placeholder='Search for products, brands and more']"));
		element2.sendKeys("baby dress");
	    WebElement element3 = driver.findElement(By.xpath("//span [@class='myntraweb-sprite desktop-iconSearch sprites-search']"));
	    element3.click();
	    List<WebElement> element4 = driver.findElements(By.xpath("//a[@ href='/shop/women']"));
		for(WebElement allelement:element4) {
			System.out.println(allelement.getText());
		}
		WebElement element5 = driver.findElement(By.xpath("//a[text()='kids']"));
		element5.click();
		System.out.println("element name:"+element5.getTagName());
	}
	

}
