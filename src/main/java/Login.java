

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login 
{
	WebDriver driver=null;
	By email=By.id("email");
	By pwd=By.id("pass");
	By login=By.xpath("//button[@id='send2']");
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	public void sendEmail(String mail)
	{
		driver.findElement(email).sendKeys(mail);
	}
	public void sendPassword(String password)
	{
		driver.findElement(pwd).sendKeys(password);
	}
	public void clickOnLogin()
	{
		driver.findElement(login).click();
	}
}
