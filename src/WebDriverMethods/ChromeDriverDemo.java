package WebDriverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\.eclipse\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  //lanch chrome driver
		Thread.sleep(2000);
		driver.manage().window().maximize();  //window maximize
		driver.get("https://www.google.co.in/");  //get url
		String title = driver.getTitle();
		System.out.println("title:"+title);   //get title
		String currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl is:"+currentUrl);  //get currenturl
		Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.in/"); //navigate to next url
		String pageSource = driver.getPageSource();  //get page sourve
		System.out.println(pageSource);
		//xpath for search element
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);
		//xpath for iphone element
		List<WebElement> elements = driver.findElements(By.xpath("//span [@class='a-truncate-cut']"));
		for(WebElement ele:elements) {
			System.out.println(ele.getText());
		}
		
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().refresh();
		driver.close();
		driver.quit();
		
	}

}
