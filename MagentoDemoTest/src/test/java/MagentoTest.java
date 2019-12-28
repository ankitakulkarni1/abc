

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MagentoTest {

	@Test
	public void MagTest(){
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		Welcome w = new Welcome(driver);
		w.clickOnMyAcct();
		Login l = new Login(driver);
		l.typeEmail("ankita17.abc@gmail.com");
		l.typePass("Welcome1234");
		l.clickOnLogin();
		Main m = new Main(driver);
		m.clickOnLogout();
		driver.quit();
		
		
		
	}

}
