package com.sqa.na.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTest {
	boolean check = true;
	String str;

	@Test
	public void assertFalse() {
		Assert.assertFalse(!this.check, "Boolean value is true");

	}

	@Test
	public void assertNull() {
		Assert.assertNull(this.str, "the object is not null");
	}

	@Test
	public void assertTrue() {
		final int number = 10;

		Assert.assertTrue(number > 0, "Number is less than or equal to 0");
	}

	@Test
	void assertEquals() {
		String str1 = new String("string");
		String str2 = new String("string");
		Assert.assertEquals(str1, str2, "These items are not equal");

	}

	@Test
	void assertNotEquals() {
		String str1 = new String("Test");
		String str2 = new String("testing");
		Assert.assertNotEquals(str1, str2, "Object values are equal");
	}

	@Test
	void assertNotNull() {
		String str = "test";
		Assert.assertNotNull(str, "Object is not null");
	}

	@Test
	void assertNotSame() {
		String str1 = new String("test");
		String str2 = new String("testing");
		Assert.assertNotSame(str1, str2, "These objects are the same");
	}

	@Test
	void assertSame() {
		String str1 = new String("string");
		String str2 = str1;
		Assert.assertSame(str1, str2, "The object references are not the same");
	}
}
