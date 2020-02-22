package myntra_rosmariya_testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import myntra_rosmariya_pageobjects.baseclass;
import myntra_rosmariya_pageobjects.myntrapageobjects;

public class Logintestcase extends baseclass{
	@Test
	public void lOGIN() throws InterruptedException
	{
		driver.get(URL);
		myntrapageobjects prod2 = new myntrapageobjects(driver);
		
		prod2.uemail(EMAIL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		prod2.prod_pass(PASSWORD);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		prod2.submitbutton();
		
		
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//prod.continuebutton();


}}
