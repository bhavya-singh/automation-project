package automationFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/switch-window");
		
		WebElement newtabButton = driver.findElement(By.id("new-tab-button"));
		newtabButton.click();
		
		String originalHandle = driver.getWindowHandle();
		
		for(String handle1: driver.getWindowHandles()){
			driver.switchTo().window(handle1);
		}
		
		//Thread.sleep(3000);	
		driver.switchTo().window(originalHandle);
		
		driver.quit();	
		
	}

}
