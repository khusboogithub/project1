package test;

import java.io.IOException;

import generics.BaseTest;
import pom.POM;

public class Test extends BaseTest
{
	@org.testng.annotations.Test
	public void loginmethod() throws IOException
	{
		POM login=new POM(driver);
		login.submitDetails();
		
	}

}
