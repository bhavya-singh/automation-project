package form;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/form");
		
		FormPage fp = new FormPage();
		fp.submitForm(driver);

		//Confirming the behavior of the test
		ConfirmationPage cp = new ConfirmationPage();
		cp.waitForAlertBanner(driver);
		assertEquals("The form was successfully submitted!", cp.getAlertBannerText(driver));
		
		driver.quit();			
	}

}
