package WebDriverMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path_FirstCry {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\.eclipse\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.firstcry.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("search_box"));
		element.click();
		element.sendKeys("baby cloth",Keys.ENTER);
	  List<WebElement> elements1 = driver.findElements(By.xpath("//a[@target='_blank']"));
		for(WebElement ele:elements1) {
			System.out.println("elements1 is:"+ele.getText());
		}
		WebElement element2 = driver.findElement(By.linkText("Fareto Baby Boy's & Girl's Clothing Set,Multicolour"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("element2 is:"+element2.getText());
		WebElement element3 = driver.findElement(By.xpath("//div [@class='li_txt1 wifi lft'][1]"));
		System.out.println("element3 is:"+element3.getTagName());
		driver.close();
	}
	
	}
