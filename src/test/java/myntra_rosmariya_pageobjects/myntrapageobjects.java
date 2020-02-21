package myntra_rosmariya_pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myntrapageobjects {

	
	WebDriver ldriver;
	
	public myntrapageobjects (WebDriver rdriver)
	{
		
     ldriver = rdriver;
     PageFactory.initElements(rdriver,this);


	}
    @FindBy(xpath = "//div[contains(text(),'ADD TO BAG')]")
    WebElement product;
    
    @FindBy(xpath = "//span[@class='myntraweb-sprite desktop-iconBag sprites-headerBag']")
    WebElement productbag;
    
    @FindBy(xpath = "//div[contains(@class,'button-base-button')]")
    WebElement placeorder;
    
    public void addproduct()
    {
    	product.click();
    }
    public void prod_cart()
    {
    	productbag.click();
    }
    public void prod_bag()
    {
    	placeorder.click();
    }

}  
