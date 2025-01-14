/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 02 16:48:27 GMT 2019
 */

package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.math.Fraction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class Fraction_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_FIFTH;
      int int0 = fraction0.intValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Fraction fraction0 = Fraction.FOUR_FIFTHS;
      Fraction fraction1 = fraction0.add(fraction0);
      assertEquals(8, fraction1.getNumerator());
      assertEquals(5, fraction1.getDenominator());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Fraction fraction0 = Fraction.FOUR_FIFTHS;
      float float0 = fraction0.floatValue();
      assertEquals(0.8F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE;
      long long0 = fraction0.longValue();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_FIFTHS;
      double double0 = fraction0.doubleValue();
      assertEquals(0.6, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction("1/3");
      assertEquals(0.3333333333333333, fraction0.doubleValue(), 0.01);
      assertEquals(1, fraction0.getNumerator());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(11, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The denominator must not be zero
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(Integer.MIN_VALUE, (-1119));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: can't negate
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction((-46), Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: can't negate
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(81, 81, 1);
      fraction0.ONE_QUARTER.toProperString();
      assertEquals(1, fraction0.getDenominator());
      assertEquals(162, fraction0.getNumerator());
      assertEquals(162.0, fraction0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(0, 0, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The denominator must not be zero
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(0, 0, (-4084));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The denominator must not be negative
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(4855, (-2609), 4855);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The numerator must not be negative
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-4685), 1, 10000);
      Fraction fraction1 = Fraction.ONE_HALF;
      Fraction fraction2 = fraction0.TWO_FIFTHS.add(fraction1);
      assertEquals((-46850001), fraction0.getNumerator());
      assertEquals(0.9F, fraction2.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction((-2147483646), 4483, 180);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Numerator too large to represent as an Integer.
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(2, 2147483646, 3970);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Numerator too large to represent as an Integer.
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getReducedFraction(1, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The denominator must not be zero
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(0, 2397);
      String string0 = fraction0.toProperString();
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(Integer.MIN_VALUE, Integer.MIN_VALUE);
      assertEquals(1, fraction0.getDenominator());
      assertEquals((byte)1, fraction0.byteValue());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getReducedFraction(53059, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: can't negate
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getReducedFraction(Integer.MIN_VALUE, (-773));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: can't negate
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-3398.8513));
      Fraction fraction1 = fraction0.invert();
      assertEquals((-10000), fraction1.getNumerator());
      assertEquals((-2.942170491542245E-4), fraction1.doubleValue(), 0.01);
      assertEquals((byte) (-70), fraction0.byteValue());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(1.7976931348623157E308);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The value must not be greater than Integer.MAX_VALUE or NaN
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The string must not be null
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction("org.apache.commons.lang3.math.Fraction");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction("1 1/3");
      assertEquals(1.3333333333333333, fraction0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction("4 x-");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // The fraction could not be parsed as the format X Y/Z
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction("1");
      assertEquals(1, fraction0.getNumerator());
      assertEquals(1.0, fraction0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-2840.38241827));
      Fraction fraction1 = fraction0.TWO_THIRDS.reduce();
      Fraction fraction2 = fraction1.TWO_THIRDS.subtract(fraction1);
      assertEquals(1, fraction2.getDenominator());
      assertEquals((-2840.3823F), fraction0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(0, (-1928));
      Fraction fraction1 = fraction0.reduce();
      assertEquals(1928, fraction0.getDenominator());
      assertFalse(fraction1.equals((Object)fraction0));
      assertEquals(1, fraction1.getDenominator());
      assertEquals(0, fraction1.getNumerator());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(1, 366);
      Fraction fraction1 = fraction0.TWO_QUARTERS.reduce();
      assertEquals(0.5, fraction1.doubleValue(), 0.01);
      assertEquals(2, fraction1.getDenominator());
      assertEquals(0.0027322404F, fraction0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_QUARTER;
      // Undeclared exception!
      try { 
        fraction0.ZERO.invert();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Unable to invert zero.
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      Fraction fraction1 = Fraction.getReducedFraction(Integer.MIN_VALUE, 1503);
      // Undeclared exception!
      try { 
        fraction0.ONE_HALF.divideBy(fraction1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: can't negate numerator
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-3398.8513));
      Fraction fraction1 = fraction0.THREE_FIFTHS.subtract(fraction0);
      Fraction fraction2 = fraction1.invert();
      assertEquals(33994513, fraction1.getNumerator());
      assertEquals(2.941651201180614E-4, fraction2.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(Integer.MIN_VALUE, 2);
      // Undeclared exception!
      try { 
        fraction0.negate();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: too large to negate
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-1), 12);
      Fraction fraction1 = fraction0.abs();
      assertEquals((-0.083333336F), fraction0.floatValue(), 0.01F);
      assertEquals(0.083333336F, fraction1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_QUARTERS;
      // Undeclared exception!
      try { 
        fraction0.pow(81);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mulPos
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_FIFTHS;
      Fraction fraction1 = fraction0.pow(0);
      assertEquals(1.0F, fraction1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_QUARTER;
      // Undeclared exception!
      try { 
        fraction0.FOUR_FIFTHS.pow(Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(1576.747717126934);
      // Undeclared exception!
      try { 
        fraction0.pow((-901));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mulPos
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(10000, 587);
      Fraction fraction1 = Fraction.getFraction((-1950.371306));
      // Undeclared exception!
      try { 
        fraction0.add(fraction1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(Integer.MIN_VALUE, 1);
      // Undeclared exception!
      try { 
        fraction0.add(fraction0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((double) Integer.MAX_VALUE);
      // Undeclared exception!
      try { 
        fraction0.add(fraction0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((double) Integer.MAX_VALUE);
      Fraction fraction1 = fraction0.negate();
      // Undeclared exception!
      try { 
        fraction1.subtract(fraction0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_QUARTER;
      Fraction fraction1 = fraction0.ONE.subtract(fraction0);
      assertEquals(0.75, fraction1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((double) Integer.MAX_VALUE);
      Fraction fraction1 = fraction0.negate();
      // Undeclared exception!
      try { 
        fraction0.ONE.subtract(fraction1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction((-1), (-1));
      // Undeclared exception!
      try { 
        fraction0.THREE_FIFTHS.subtract((Fraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fraction must not be null
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(1, 1, 2260);
      Fraction fraction1 = fraction0.ZERO.subtract(fraction0);
      assertEquals(1.0004425F, fraction0.floatValue(), 0.01F);
      assertEquals((-1.0004425F), fraction1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_FIFTH;
      Fraction fraction1 = Fraction.ZERO;
      Fraction fraction2 = fraction0.add(fraction1);
      assertSame(fraction2, fraction0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(1, 366);
      Fraction fraction1 = Fraction.getFraction(3565, 25, 10000);
      // Undeclared exception!
      try { 
        fraction0.subtract(fraction1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: numerator too large after multiply
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_FIFTHS;
      // Undeclared exception!
      try { 
        fraction0.multiplyBy((Fraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fraction must not be null
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      Fraction fraction1 = Fraction.FOUR_FIFTHS;
      Fraction fraction2 = fraction0.add(fraction1);
      Fraction fraction3 = fraction0.divideBy(fraction2);
      assertEquals(0.0, fraction3.doubleValue(), 0.01);
      assertSame(fraction2, fraction1);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_THIRDS;
      Fraction fraction1 = Fraction.getReducedFraction(0, 2);
      Fraction fraction2 = fraction0.multiplyBy(fraction1);
      assertSame(fraction2, fraction1);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_THIRDS;
      // Undeclared exception!
      try { 
        fraction0.TWO_THIRDS.divideBy((Fraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fraction must not be null
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(0, (-1928));
      // Undeclared exception!
      try { 
        fraction0.ONE_QUARTER.divideBy(fraction0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The fraction to divide by must not be zero
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE;
      Object object0 = new Object();
      boolean boolean0 = fraction0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(2328.215119);
      Fraction fraction1 = Fraction.getFraction(1152, 1152, 1152);
      boolean boolean0 = fraction1.equals(fraction0);
      assertFalse(boolean0);
      assertEquals(2328.215F, fraction0.floatValue(), 0.01F);
      assertEquals(1328256, fraction1.getNumerator());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      Fraction fraction1 = fraction0.negate();
      Fraction fraction2 = fraction1.reduce();
      assertEquals(0, fraction2.getNumerator());
      assertEquals(1, fraction2.getDenominator());
      assertSame(fraction2, fraction1);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_HALF;
      fraction0.hashCode();
      fraction0.hashCode();
      assertEquals(2, fraction0.getDenominator());
      assertEquals(1, fraction0.getNumerator());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-3398.8513));
      Fraction fraction1 = Fraction.getFraction(2777, 2777);
      int int0 = fraction1.compareTo(fraction0);
      assertEquals(1, int0);
      assertEquals((-3398.8513), fraction0.doubleValue(), 0.01);
      assertEquals(1.0, fraction1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_HALF;
      Fraction fraction1 = Fraction.getFraction(1, 1);
      int int0 = fraction0.compareTo(fraction1);
      assertEquals((-1), int0);
      assertEquals(1.0F, fraction1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      Fraction fraction1 = fraction0.negate();
      int int0 = fraction1.compareTo(fraction0);
      assertTrue(fraction1.equals((Object)fraction0));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(2777, 2777);
      Fraction fraction1 = Fraction.getFraction(2777, 2777);
      int int0 = fraction0.compareTo(fraction1);
      assertFalse(fraction1.equals((Object)fraction0));
      assertEquals(0, int0);
      assertEquals(2777, fraction1.getDenominator());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_HALF;
      fraction0.toString();
      String string0 = fraction0.toString();
      assertNotNull(string0);
      assertEquals("1/2", string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-2840.38241827));
      String string0 = fraction0.toProperString();
      assertEquals("-2840 1205/3151", string0);
      assertEquals(3151, fraction0.getDenominator());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(1, 1);
      String string0 = fraction0.toProperString();
      assertEquals(1, fraction0.getDenominator());
      assertEquals("1", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction((-2147483646), (-2147483646));
      Fraction fraction1 = fraction0.negate();
      String string0 = fraction1.toProperString();
      assertEquals("-1", string0);
      assertEquals(1, fraction1.getDenominator());
      assertEquals(1, fraction0.getNumerator());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-2840.38241827));
      Fraction fraction1 = Fraction.THREE_QUARTERS;
      fraction1.THREE_QUARTERS.toString();
      Fraction fraction2 = fraction1.THREE_QUARTERS.abs();
      Fraction fraction3 = fraction1.TWO_THIRDS.reduce();
      assertEquals(3, fraction3.getDenominator());
      
      int int0 = fraction0.compareTo(fraction1);
      assertEquals((-2840.3823F), fraction0.floatValue(), 0.01F);
      assertEquals((-1), int0);
      
      String string0 = fraction2.toProperString();
      assertEquals("3/4", string0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_QUARTERS;
      Fraction fraction1 = fraction0.ONE_FIFTH.invert();
      String string0 = fraction1.toProperString();
      assertEquals(3, fraction0.getProperNumerator());
      assertEquals("5", string0);
      assertNotNull(string0);
      assertEquals(1, fraction1.getDenominator());
      assertEquals(0, fraction0.getProperWhole());
  }
}
