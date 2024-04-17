package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\.eclipse\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=6228952739125217079&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
	    driver.manage().window().maximize();
	    WebElement element = driver.findElement(By.linkText("About Us"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView();", element);
	    Thread.sleep(3000);
	    js.executeScript("window.scroll(0,0)");
	    Thread.sleep(3000);
	    js.executeScript("window.scroll(0,1000)");
	    Thread.sleep(3000);
	    js.executeScript("window.scroll(0,-500)");
	    Thread.sleep(3000);
	    WebElement element2 = driver.findElement(By.id("twotabsearchtextbox"));
	    js.executeScript("arguments[0].value='kurthi'", element2);
	    Dimension size = driver.manage().window().getSize();
	    System.out.println(size.getWidth());
	    System.out.println(size.getHeight());
		
	}

}
