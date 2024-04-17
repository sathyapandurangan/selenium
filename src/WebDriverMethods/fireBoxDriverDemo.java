package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;

public class fireBoxDriverDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\.eclipse\\Selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://web.whatsapp.com/");
		driver.get("https://www.flipkart.com/");
		WebElement element = driver.findElement(By.xpath("//img[@ src='https://static-assets-web.flixcart.com/batman-returns/batman-returns/p/images/header_cart-eed150.svg']"));
		element.click();
		driver.findElement(By.linkText("Login")).click();
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("title:"+title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("url is:"+currentUrl);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		driver.navigate().to("https://www.firstcry.com/");
		driver.navigate().forward();
		driver.navigate().back();
		driver.close();
		
		
		
		
		
			}

}
