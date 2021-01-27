package automationFramework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardMouseInput {

	public static void main(String[] args) {
		
		new KeyboardMouseInput() {};
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/keypress");
		
		WebElement name = driver.findElement(By.id("name"));
		name.click();
		name.sendKeys("Bhavya Singh");
		
		WebElement btn = driver.findElement(By.id("button"));
		btn.click();
		
		driver.quit();
	}

}
