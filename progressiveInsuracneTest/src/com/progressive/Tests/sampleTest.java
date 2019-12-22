package com.progressive.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampleTest {
	
	
	@BeforeTest
	public void teststart() {
		
		
		System.out.println("I am in before test");
	}
	
	
	@Test
	public void maintest() {
		
		//Assert.assertTrue(true);
		Assert.assertFalse(true);
	//	Assert.assertTrue(autoEnabled);
	//	Assert.assertEquals("michae","michael");	
		
	}
	
	
	
	@AfterTest
	public void aftertest() {
		System.out.println("I am in before test");
		
	}
	
	

}
