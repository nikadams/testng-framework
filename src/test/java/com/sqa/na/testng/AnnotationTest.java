package com.sqa.na.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationTest {
	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("@AFTERsUITE");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
	}

	@BeforeSuite()
	public void beforeSuite() {
		System.out.println("@BeforeSuite");
	}

	@Test(priority = 0)
	public void f() {
		System.out.println("Test 1");
	}

	@Test(priority = 1)
	public void f2() {
		System.out.println("Test 2");
	}

	@Test(priority = 0)
	public void f3() {
		System.out.println("Test 3");
	}

	@Test(priority = 5)
	public void f4() {
		System.out.println("Test 4");
	}

	@Test(priority = 1)
	public void f5() {
		System.out.println("Test 5");
	}

}
