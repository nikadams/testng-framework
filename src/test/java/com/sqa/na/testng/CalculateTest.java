package com.sqa.na.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculateTest {

	private static double calculateTwo2PowerX(double base, double power) {

		if (power == 0) {
			return 1;
		}

		double total = base;
		for (int i = 1; i < power; i++) {
			total = total * base;
		}

		return total;
	}

	@DataProvider(name = "power")
	public Object[][] dp() {
		// double value = Math.pow(2, 9);
		return new Object[][] { { 9, 4 }, { 10, 1 }, { 7, 3 }, { 19, 4 }, { 100, 0 } };
	}

	@Test(dataProvider = "power")
	public void f(double base, double power) {
		// System.out.println("Calculated method is:" +
		// calculateTwo2PowerX(base, power));
		// System.out.println("Math value is:" + Math.pow(base, power));
		Assert.assertEquals(calculateTwo2PowerX(base, power), Math.pow(base, power), "The values are not equal");

	}
}
