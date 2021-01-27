package automationFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ExecuteJavascript {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/modal");
		
		WebElement openmodalButton = driver.findElement(By.id("modal-button"));
		openmodalButton.click();
		
		//Thread.sleep(1000);
		
		WebElement closeButton = driver.findElement(By.id("close-button"));
		//closeButton.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", closeButton);
		
		driver.quit();		

	}
}