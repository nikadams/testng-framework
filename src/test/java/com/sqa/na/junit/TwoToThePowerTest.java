package com.sqa.na.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TwoToThePowerTest {
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 3 }, { 4 }, { 5 } });
	}

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

	private final int BASE = 2;

	private final int POWER;

	public TwoToThePowerTest(final int power) {
		this.POWER = power;
	}

	@Test
	public void f() {

		org.testng.Assert.assertEquals(calculateTwo2PowerX(this.BASE, this.POWER), Math.pow(this.BASE, this.POWER));
	}
}
