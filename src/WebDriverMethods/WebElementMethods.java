package WebDriverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\.eclipse\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WebElement element = driver.findElement(By.xpath("//input [@placeholder='Search for products, brands and more']"));
		element.click();
		element.sendKeys("kurthis",Keys.ENTER);
		WebElement element2 = driver.findElement(By.xpath("//img[@ draggable='false']"));
		boolean displayed = element2.isDisplayed();
		System.out.println("is displayed:"+displayed);
		boolean enabled = element2.isEnabled();
		System.out.println("is enabled:"+enabled);
		boolean selected = element2.isSelected();
		System.out.println("is selected;"+selected);
		List<WebElement> elements = driver.findElements(By.xpath("//h4[@ class='product-product']"));
for(WebElement ele:elements) {
	System.out.println(ele.getText());
}
    driver.close();

	}

}
