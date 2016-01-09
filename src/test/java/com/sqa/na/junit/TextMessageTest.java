/**
 *   File Name: TextMessageTest.java<br>
 *
 *   Adams, Nik<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jan 7, 2016
 *
 */

package com.sqa.na.junit;

import org.junit.Assert;
import org.junit.Test;

/**
 * TextMessageTest //ADDD (description of class)
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
public class TextMessageTest {

	@Test
	public void test() {
		final String message = "This is a text message";
		String test = "";
		int length = message.length();

		Assert.assertEquals("The messages are not equal", message, "This is a text message");
		Assert.assertTrue("String length is 0", length > 0);
	}

}
