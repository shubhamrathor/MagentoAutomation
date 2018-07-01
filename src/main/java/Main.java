

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main 
{
  WebDriver driver;
  By logout=By.xpath("//a[text()='Log Out']");
   public Main(WebDriver driver)
   {
	   this.driver=driver;
   }
   public void clickOnLogout()
   {
	   driver.findElement(logout).click();;
   }
}
