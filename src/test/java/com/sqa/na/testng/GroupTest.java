package com.sqa.na.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTest {
	boolean check = true;
	String str;

	@Test(groups = "assert")
	public void assertFalse() {
		Assert.assertFalse(!this.check, "Boolean value is true");

	}

	@Test(groups = "assert")
	public void assertNull() {
		Assert.assertNull(this.str, "the object is not null");
	}

	@Test(groups = "groupTest")
	public void assertTrue() {
		final int number = 10;

		Assert.assertTrue(number > 0, "Number is less than or equal to 0");
	}

	@Test(dependsOnMethods = "assert")
	public void testHomeLink() {

	}

	@Test(groups = "groupTest1")
	void assertEquals() {
		String str1 = new String("string");
		String str2 = new String("string");
		Assert.assertEquals(str1, str2, "These items are not equal");

	}

	@Test(groups = "assert")
	void assertNotEquals() {
		String str1 = new String("Test");
		String str2 = new String("testing");
		Assert.assertNotEquals(str1, str2, "Object values are equal");
	}

	@Test(groups = "assert")
	void assertNotNull() {
		String str = null;
		Assert.assertNotNull(str, "Object is not null");
	}

	@Test(dependsOnGroups = "assert")
	void assertNotSame() {
		String str1 = new String("test");
		String str2 = new String("testing");
		Assert.assertNotSame(str1, str2, "These objects are the same");
	}

	@Test(dependsOnGroups = "assert")
	void assertSame() {
		String str1 = new String("string");
		String str2 = str1;
		Assert.assertSame(str1, str2, "The object references are not the same");
	}
}
