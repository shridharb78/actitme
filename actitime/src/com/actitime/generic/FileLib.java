package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileLib {

	public String getPropertyData(String key) throws IOException
	{
		FileInputStream fis= new FileInputStream("./data/actitimecommondata.property");
		Properties p= new Properties();
		p.load(fis);
		String data= p.getProperty(key);
		return data;
	}
	
	
	public void getExcelData()
	{
	
	}
	
	
	
	public void setExcelData()
	{
		
	}
}
