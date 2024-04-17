package WebDriverMethods;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo1 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\.eclipse\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jiomart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("autocomplete-0-input")).sendKeys("baby soap",Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> elements = driver.findElements(By.xpath("//div[@ class='plp-card-details-name line-clamp jm-body-xs jm-fc-primary-grey-80']"));
		for(WebElement ele:elements) {
			System.out.println("list all values:"+ele.getText());
		}
		WebElement element3 = driver.findElement(By.xpath("//ul [@class='ais-RefinementList-list']"));
		boolean selected = element3.isSelected();
		System.out.println("is selected:"+selected);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\DELL\\.eclipse\\Selenium-workspace\\Screenshot\\jiomart.png");
		FileUtils.copyFile(src, des);
	}

}
