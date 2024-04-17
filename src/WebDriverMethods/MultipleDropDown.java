package WebDriverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\.eclipse\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("colors"));
		Select s = new Select(element);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByValue("blue");
		Thread.sleep(2000);
		s.selectByValue("green");
		Thread.sleep(2000);
		s.selectByValue("yellow");
		Thread.sleep(2000);
		s.selectByVisibleText("White");
		Thread.sleep(2000);
		s.deselectByValue("blue");
		Thread.sleep(2000);
		s.deselectByValue("green");
		Thread.sleep(2000);
		s.deselectByValue("yellow");
		Thread.sleep(2000);
		s.deselectByVisibleText("White");
		Thread.sleep(2000);
		s.selectByIndex(0);
        boolean multiple = s.isMultiple();
        System.out.println(multiple);
        List<WebElement> options = s.getOptions();
        for(WebElement mul:options) {
        	System.out.println(mul.getText());
        }
        WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println("fso is:"+firstSelectedOption.getText());
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for(WebElement all:allSelectedOptions) {
			System.out.println("all selected options is:"+all.getText());
		}
		s.deselectAll();
	}

}
