package GIT;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Gitrep {
	
	WebDriver driver;
	
	public class GitRep {
		@Test(priority=1)
		public void method1()
		{ System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.get("http://www.gmail.com");
		 driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			String title = driver.getTitle();
		Assert.assertEquals(title, "Gmail");
			System.out.println("first gitrep");
			driver.quit();
		}
		@Test(priority=2)
		public void method2()
		{
			driver = new ChromeDriver();
			
			 driver.get("http://www.gmail.com");
			 driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("second gitrep");
			String title2 = driver.getTitle();
			Assert.assertEquals(title2, "Gmail");
			driver.quit();
		}
		@Test(priority=3)
		public void method3()
		{
			System.out.println("third gitrep");
		}

	}


}
