package GIT;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.qa.util.TestUtil;
public class Gitrep {
	
	WebDriver driver;
	 driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	public class GitRep {
		@Test(priority=1)
		public void method1()
		{ System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.get("http://www.gmail.com");
		
			System.out.println("first gitrep");
			driver.quit();
		}
		@Test(priority=2)
		public void method2()
		{
			driver = new ChromeDriver();
			 driver.get("http://www.gmail.com");
			System.out.println("second gitrep");
			driver.quit();
		}
		@Test(priority=3)
		public void method3()
		{
			System.out.println("third gitrep");
		}

	}


}
