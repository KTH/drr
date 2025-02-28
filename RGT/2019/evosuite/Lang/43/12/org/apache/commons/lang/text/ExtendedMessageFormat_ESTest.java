/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 03 06:01:35 GMT 2019
 */

package org.apache.commons.lang.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import org.apache.commons.lang.text.ExtendedMessageFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.junit.runner.RunWith;

 
public class ExtendedMessageFormat_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMap<ChoiceFormat, MockDateFormat> hashMap0 = new HashMap<ChoiceFormat, MockDateFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("Unterminated format element at position ", hashMap0);
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormatsByArgumentIndex((Format[]) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("");
      Locale locale0 = Locale.CHINESE;
      NumberFormat numberFormat0 = NumberFormat.getPercentInstance(locale0);
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormat(123, numberFormat0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      HashMap<MockDateFormat, DecimalFormat> hashMap0 = new HashMap<MockDateFormat, DecimalFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(" ? cHV)7U", locale0, hashMap0);
      String string0 = extendedMessageFormat0.toPattern();
      assertEquals(" ? cHV)7U", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("gfXk^~u??P}");
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormats((Format[]) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("6qMP@xe2h ", hashMap0);
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormatByArgumentIndex(123, extendedMessageFormat0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HashMap<MockDateFormat, Object> hashMap0 = new HashMap<MockDateFormat, Object>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("+ZM3Y&S'nXc3-'R{4}}", hashMap0);
      // Undeclared exception!
      try { 
        extendedMessageFormat0.applyPattern("Q IL?\"{1,6\"Y");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unterminated format element at position 9
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat(":N\"-uL.bb`{ ", hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unterminated format element at position 11
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      HashMap<MockDateFormat, Object> hashMap0 = new HashMap<MockDateFormat, Object>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("Unreadable format element at position ", hashMap0);
      // Undeclared exception!
      try { 
        extendedMessageFormat0.applyPattern("Q IO?\"{1 \"Y");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 7: 1 \"
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      HashMap<MessageFormat, MockSimpleDateFormat> hashMap0 = new HashMap<MessageFormat, MockSimpleDateFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("", hashMap0);
      // Undeclared exception!
      try { 
        extendedMessageFormat0.applyPattern("}ly{,u:nJNiY}{TNX:");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 5: ,
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }
}
