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
    //Login data
    @FindBy (xpath = "//input[@placeholder='Your Email Address']")
    WebElement email;
    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[2]/input[1]")
    WebElement password;
    @FindBy(xpath = "//button[@class='login-login-button']")
    WebElement submit;
    //bag
    @FindBy(xpath ="//div[@id='placeOrderButton']")
    WebElement Continue_b;
    @FindBy(xpath ="//span[contains(text(),'Bag')]")
    WebElement bag;
    
   
    
    @FindBy(xpath ="//div[contains(@class,'button-base-button')]")
    WebElement wear;
    @FindBy(xpath ="//div[@id='placeOrderButton']")
    WebElement cont;
    
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

    public void uemail(String EMAIL)
    {
    email.sendKeys(EMAIL);}
    	
    public void prod_pass(String PASSWORD)
    {
    	password.sendKeys(PASSWORD);
    	
    }
    public void submitbutton()
    {
    	submit.click();
    }
	
	
	public void womencat()
	{
		bag.click();
	}
	public void placeorderlog()
	{
		wear.click();
	}
	public void contbutton()
	{
		cont.click();
	}
	}

