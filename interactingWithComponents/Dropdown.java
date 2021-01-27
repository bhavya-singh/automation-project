package interactingWithComponents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/dropdown");
		
		WebElement dropdownButton = driver.findElement(By.id("dropdownMenuButton"));
		dropdownButton.click();
		
		WebElement select = driver.findElement(By.xpath("/html/body/div/div/div/a[6]"));
		select.click();
		
		driver.quit();
		
	}

}
