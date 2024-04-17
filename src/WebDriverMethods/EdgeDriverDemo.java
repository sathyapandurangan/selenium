package WebDriverMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\DELL\\.eclipse\\Selenium\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/chrome/");
		driver.get("https://mail.google.com/");
		String pageSource2 = driver.getPageSource();
		System.out.println("pagesource2 value:"+pageSource2);
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("title value:"+title);
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().to("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=678802104188&hvpos=&hvnetw=g&hvrand=5697323969980109748&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061895&hvtargid=kwd-10573980&hydadcr=14453_2371562&gad_source=1");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title2 = driver.getTitle();
		System.out.println("title2 value:"+title2);
		driver.navigate().forward();
		WebDriver driver1 = new EdgeDriver();
		driver1.get("https://www.firstcry.com/");
		String title3 = driver1.getTitle();
		System.out.println("title3:"+title3);
		driver.navigate().back();
		driver.navigate().refresh();
		driver.quit();
		driver1.quit();
	}
	

}
