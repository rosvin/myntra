package myntra_rosmariya_testcases;

import org.testng.annotations.Test;

import myntra_rosmariya_pageobjects.baseclass;
import myntra_rosmariya_pageobjects.myntrapageobjects;

public class add_product_cart extends baseclass {
	
	@Test
	public void addtocart() throws InterruptedException
	{
		driver.get(baseUrl);
		myntrapageobjects prod = new myntrapageobjects(driver);
		Thread.sleep(1000);
		prod.addproduct();
		prod.prod_cart();
		prod.prod_bag();
	}

}
