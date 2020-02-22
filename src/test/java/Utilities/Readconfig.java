package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	
	Properties pro;
	
	File src = new File ("./configuration/config.properties");{
	
	try {
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
	} catch (Exception e){
		System.out.println("get message"+ e.getMessage());
		
	}
	
	}
	public String getApplicationUrl()
	{
		String url = pro.getProperty("baseUrl");
		return url;
	}
	public String getLoggin()
	{
		String path = pro.getProperty("URL");
		return path;
	}
	public String getUname()
	{
		String EMAIL = pro.getProperty("EMAIL");
		return EMAIL;
	}
	 public String getpasswd()
	 {
		 String PASSWORD =pro.getProperty("PASSWORD");
		return PASSWORD;
	}
	 public String geturl()
	 {
		 String GETURL =pro.getProperty("GETURL");
		 return GETURL;
	 }
	

}

