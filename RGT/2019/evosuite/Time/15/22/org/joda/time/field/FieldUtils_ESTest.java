/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 04 13:21:32 GMT 2019
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;


import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.FieldUtils;
import org.junit.runner.RunWith;


public class FieldUtils_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = FieldUtils.safeMultiplyToInt(5502L, 2751L);
      assertEquals(15136002, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue((-1206), (-1206), (-1206), (-525));
      assertEquals((-1048), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = FieldUtils.safeNegate(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeNegate(Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Integer.MIN_VALUE cannot be negated
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = FieldUtils.safeAdd((-489), (-2393));
      assertEquals((-2882), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = FieldUtils.safeAdd(4, (-343));
      assertEquals((-339), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeAdd(2146846979, 2146846790);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: 2146846979 + 2146846790
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      long long0 = FieldUtils.safeAdd((-5000L), 0L);
      assertEquals((-5000L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      long long0 = FieldUtils.safeAdd(656L, (-2416L));
      assertEquals((-1760L), long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeAdd((-3124L), (-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -3124 + -9223372036854775808
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      long long0 = FieldUtils.safeSubtract((-977L), 2305L);
      assertEquals((-3282L), long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      long long0 = FieldUtils.safeSubtract(1508L, 3600L);
      assertEquals((-2092L), long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeSubtract((-9223372036854775808L), 664L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -9223372036854775808 - 664
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply((-9969464), 3176);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: -9969464 * 3176
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply(122, 352831696);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: 122 * 352831696
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = FieldUtils.safeMultiply((-3176), 3139);
      assertEquals((-9969464), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(955L, (-1));
      assertEquals((-955L), long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((-5000L), 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((-1374L), 1);
      assertEquals((-1374L), long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply((-9223372036854775808L), 15136002);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -9223372036854775808 * 15136002
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply((-9223372036854775808L), (-1));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -9223372036854775808 * -1
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(0L, 153692453);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(1L, 1L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((long) 1, (long) 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((long) 0, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(100L, (long) 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply(2147483647L, (-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: 2147483647 * -9223372036854775808
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply((-9223372036854775808L), (-1L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -9223372036854775808 * -1
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

////  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply((-1L), (-9223372036854775802L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -1 * -9223372036854775802
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeToInt((-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: -9223372036854775808
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiplyToInt(2592000000L, 2147483647L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 5566277613024000000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfHour();
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds(dateTimeField0, 1, 1319, 2949);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1 for minuteOfHour must be in the range [1319,2949]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfHalfday();
      FieldUtils.verifyValueBounds(dateTimeField0, 10, 1, 357);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.clockhourOfDay();
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds(dateTimeField0, 153692453, (-2258), 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 153692453 for clockhourOfDay must be in the range [-2258,1]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds((DateTimeFieldType) null, Integer.MIN_VALUE, 2796, 1807);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.IllegalFieldValueException", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 0, 0);
      assertEquals("centuryOfEra", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds(dateTimeFieldType0, 1900, 1900, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1900 for clockhourOfHalfday must be in the range [1900,0]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds("5#w0$'21>-PYuz_PW/S", (-5577), 28265625, (-5577));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -5577 for 5#w0$'21>-PYuz_PW/S must be in the range [28265625,-5577]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FieldUtils.verifyValueBounds("dq$$79~Q9aS", (-1), (-1), 0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds("Asia/Karachi", 0, (-372), (-1250));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for Asia/Karachi must be in the range [-372,-1250]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.getWrappedValue((-2133), 1459, 0, (-4682));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MIN > MAX
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue((-2134), 1, Integer.MIN_VALUE, 1);
      assertEquals((-2133), int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue((-794), 0, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      boolean boolean0 = FieldUtils.equals((Object) "Integer.MIN_VALUE cannot be negated", (Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      boolean boolean0 = FieldUtils.equals((Object) null, (Object) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Integer integer0 = new Integer(12);
      boolean boolean0 = FieldUtils.equals((Object) null, (Object) integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Integer integer0 = new Integer(489);
      Integer integer1 = new Integer((-2393));
      boolean boolean0 = FieldUtils.equals((Object) integer0, (Object) integer1);
      assertFalse(boolean0);
  }
}
