package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path_mytrip {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\.eclipse\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//span[@ class='chNavIcon appendBottom2 chSprite chTrains']"));
		element.click();
		String tagName = element.getTagName();
		System.out.println("element name is:"+tagName);
		String text = element.getText();
		System.out.println("text is:"+text);
		WebElement element2 = driver.findElement(By.xpath("//span[@ class='chNavIcon appendBottom2 chSprite chHotels']"));
		boolean displayed = element2.isDisplayed();
		System.out.println("is this displayed:"+displayed);
		String text2 = element2.getText();
		System.out.println("text2 is:"+text2);
		element2.click();
		
		driver.close();
	}

}
