package myntra_rosmariya_pageobjects;




import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.config.PropertyGetter.PropertyCallback;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utilities.Readconfig;




public class baseclass {
	
	Readconfig readconfig = new Readconfig();
	
	public String baseUrl = readconfig.getApplicationUrl();

			//readconfig.getApplicationUrl();

	public static WebDriver driver;

	@BeforeClass
	public void setup()
	{
		
		driver = new ChromeDriver();
	}
   @AfterClass
    public void tearDown()
      {
          driver.quit();
      }
   
}
