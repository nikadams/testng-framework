/**
 *   File Name: RuleAnnotation.java<br>
 *
 *   Adams, Nik<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jan 7, 2016
 *
 */

package com.sqa.na.junit;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * RuleAnnotation //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Adams, Nik
 * @version 1.0.0
 * @since 1.0
 *
 */
public class RuleAnnotation {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void test() {

		int x = 5;
		int y = 0;
		int result;

		this.thrown.expect(Exception.class);
		this.thrown.expectMessage("/ by zero");
		result = x / y;

		try {

			result = x / y;
		} catch (Exception e) {
			Assert.assertEquals("/ by zero", e.getMessage());
		}
	}

}
