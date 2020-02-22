package myntra_rosmariya_testcases;

import java.util.concurrent.TimeUnit;


import org.testng.Assert;
import org.testng.annotations.Test;

import myntra_rosmariya_pageobjects.baseclass;
import myntra_rosmariya_pageobjects.myntrapageobjects;

public class add_product_cart extends baseclass {
	
	@Test
	public void addtocart() throws InterruptedException
	{
		driver.get(baseUrl);
		myntrapageobjects prod = new myntrapageobjects(driver);
	
		prod.addproduct();
		prod.prod_cart();
		prod.prod_bag();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        prod.uemail(EMAIL);
		
		prod.prod_pass(PASSWORD);
		
		prod.submitbutton();
		
		prod.prod_cart();
		
		prod.womencat();
		
		prod.placeorderlog();
		prod.contbutton();

if(driver.getCurrentUrl().equals("https://www.myntra.com/checkout/paymentyyy"))
		{
			Assert.assertTrue(true);
			System.out.print("Matches");
		}
		else
		{
			Assert.assertFalse(false);
			System.out.print(" Do not Matches");
		}
	}

}
