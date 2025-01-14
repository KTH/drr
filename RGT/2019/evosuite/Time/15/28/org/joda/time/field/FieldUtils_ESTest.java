/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 04 13:33:52 GMT 2019
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;


import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.Hours;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.FieldUtils;
import org.junit.runner.RunWith;


public class FieldUtils_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.getWrappedValue(965, 965, (-1), (-3250));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MIN > MAX
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  public void test02()  throws Throwable  {
      int int0 = FieldUtils.safeAdd(0, 965);
      assertEquals(965, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      Hours hours1 = hours0.minus(2944656);
      assertEquals((-2944653), hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeAdd((-144), Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -144 + -2147483648
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Hours hours0 = Hours.THREE;
      int[] intArray0 = buddhistChronology0.get((ReadablePeriod) hours0, (long) (-1716), (long) 2944656);
      assertArrayEquals(new int[] {0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      long long0 = FieldUtils.safeAdd(0L, (-1L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeAdd((-9223372036854775808L), (-2196L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -9223372036854775808 + -2196
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      long long0 = FieldUtils.safeSubtract(3136L, 57);
      assertEquals(3079L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeSubtract(5299204L, (-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: 5299204 - -9223372036854775808
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply(Integer.MIN_VALUE, 17887500);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: -2147483648 * 17887500
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = FieldUtils.safeMultiply((-1716), (-1716));
      assertEquals(2944656, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply((-538), Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: -538 * -2147483648
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(1855L, (-1));
      assertEquals((-1855L), long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(3136L, 1);
      assertEquals(3136L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(2629746000L, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((-2196L), 2509);
      assertEquals((-5509764L), long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply(15778800000L, (-2146319699));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: 15778800000 * -2146319699
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(2592000000L, 1L);
      assertEquals(2592000000L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = FieldUtils.safeMultiplyToInt(1, (-1L));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = FieldUtils.safeMultiplyToInt(0L, (-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((long) 3582, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiplyToInt(Integer.MAX_VALUE, 31556952000L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: 2147483647 * 31556952000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply((-1L), (-9223372036854775784L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -1 * -9223372036854775784
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiplyToInt(Integer.MAX_VALUE, Integer.MAX_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 4611686014132420609
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      try { 
        buddhistChronology0.getDateTimeMillis((-1716), (-1716), 2944656, (-1716));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1716 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfSecond();
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds(dateTimeField0, 1, 1, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1 for millisOfSecond must be in the range [1,0]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1), 0, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1 for dayOfWeek must be in the range [0,-1]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds(dateTimeFieldType0, 4031, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 4031 for secondOfDay must be in the range [0,0]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds("must not be larger than ", Integer.MIN_VALUE, 4116, (-2516));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2147483648 for must not be larger than  must be in the range [4116,-2516]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FieldUtils.verifyValueBounds("(9hfC]sBhZ:}", (-2636), (-2636), 0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds("", (-1), (-1), (-5396));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1 for  must be in the range [-1,-5396]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue(0, 1, 57);
      assertEquals(57, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue(3290, (-2516), 4116);
      assertEquals(3290, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue(1, 1, Integer.MIN_VALUE, 1);
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object object0 = new Object();
      boolean boolean0 = FieldUtils.equals((Object) null, object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      boolean boolean0 = FieldUtils.equals((Object) ")n'toOI!.k", (Object) ")n'toOI!.k");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Object object0 = new Object();
      Object object1 = new Object();
      boolean boolean0 = FieldUtils.equals(object0, object1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Integer integer0 = new Integer(857);
      boolean boolean0 = FieldUtils.equals((Object) integer0, (Object) null);
      assertFalse(boolean0);
  }
}
