package form;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {

	public void submitForm(WebDriver driver)
	{
		driver.findElement(By.id("first-name")).sendKeys("Bhavya");	
		driver.findElement(By.id("last-name")).sendKeys("Singh");
		driver.findElement(By.id("job-title")).sendKeys("SQ Intern");
		driver.findElement(By.id("radio-button-3")).click();
		driver.findElement(By.id("checkbox-2")).click();
		driver.findElement(By.id("select-menu")).click();
		driver.findElement(By.cssSelector("option[value='1']")).click();
		driver.findElement(By.id("datepicker")).sendKeys("31/01/2021");
		driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
	}

}
