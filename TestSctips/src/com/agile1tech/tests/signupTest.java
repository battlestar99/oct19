package com.agile1tech.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class signupTest {
	
	@BeforeMethod
	public void beforeTheTest() {
		
		System.out.println("This is  beforemethod");
		
	}
	@AfterMethod
	public void AfterTheTest() {
		
		System.out.println("This is aftermethod");
		
	}
	
	
	@Test(priority=1)
	public void validateURL() {
		
		System.out.println("This is  Test 2");
		
	}
	
	@Test(priority=2)
	public void validateTitle() {
		
		System.out.println("This is  Test 1");
		
	}
	
	@AfterTest
	public void quitTest() {
		
		System.out.println("This is a afterTest");
	}
	
	@BeforeTest
	public void setupTest() {
		
		System.out.println("This is in before Test");
		
	}
	

}
