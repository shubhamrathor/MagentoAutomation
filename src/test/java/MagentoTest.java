

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class MagentoTest {

	@Test
	public void test()
	{
		String url="https://magento.com";
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		Home h=new Home(driver);
		h.clickOnMyacct();
		Login l=new Login(driver);
		l.sendEmail("subramanyaraj87@gmail.com");
		l.sendPassword("Welcome123");
		l.clickOnLogin();
		Main m=new Main(driver);
		m.clickOnLogout();
	}

}
