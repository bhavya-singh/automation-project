package automationFramework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		
		WebElement autocomplete = driver.findElement(By.id("autocomplete"));
		autocomplete.click();
		autocomplete.sendKeys("1555 Palo Alto Avenue, Beaumont, CA, USA");
		
		Thread.sleep(1000);
		
		WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
		autocompleteResult.click();
		
		driver.quit();		

	}

}
