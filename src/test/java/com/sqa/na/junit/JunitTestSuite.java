/**
 *   File Name: JunitTestSuite.java<br>
 *
 *   Adams, Nik<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jan 7, 2016
 *
 */

package com.sqa.na.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * JunitTestSuite //ADDD (description of class)
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

@RunWith(Suite.class)
@Suite.SuiteClasses({ TextMessageTest.class, TextLengthTest.class })
public class JunitTestSuite {

}
