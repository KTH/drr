/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 02 17:01:57 GMT 2019
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
      Fraction fraction0 = Fraction.FOUR_FIFTHS;
      int int0 = fraction0.intValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-2959.491648));
      float float0 = fraction0.floatValue();
      assertEquals((-17185768), fraction0.getNumerator());
      assertEquals((-2959.491648011021), fraction0.doubleValue(), 0.01);
      assertEquals((-2959.4917F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_FIFTH;
      long long0 = fraction0.longValue();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-1.0));
      double double0 = fraction0.doubleValue();
      assertEquals((-1.0), double0, 0.01);
      assertEquals((-1), fraction0.getNumerator());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_FIFTH;
      Fraction fraction1 = fraction0.ONE_QUARTER.subtract(fraction0);
      assertEquals(0.05, fraction1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction("1/5");
      assertEquals(5, fraction0.getDenominator());
      assertEquals(0.2, fraction0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(0, 0);
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
        Fraction.getFraction(Integer.MIN_VALUE, Integer.MIN_VALUE);
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
        Fraction.getFraction(3592, Integer.MIN_VALUE);
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
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(4, 1089, (-1));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The denominator must not be negative
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction((-892), (-892), 1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The numerator must not be negative
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction((-2147483645), 0, 16);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Numerator too large to represent as an Integer.
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(63612, 2, 63612);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Numerator too large to represent as an Integer.
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getReducedFraction(884, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The denominator must not be zero
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(3592, Integer.MIN_VALUE);
      assertEquals(268435456, fraction0.getDenominator());
      assertEquals((-1.6726553E-6F), fraction0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getReducedFraction(3597, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: can't negate
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getReducedFraction(Integer.MIN_VALUE, (-2147483635));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: can't negate
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction("Numerator too large to represent as an Integer.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction("9 mzsxe#~");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // The fraction could not be parsed as the format X Y/Z
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction("!~bzK!5?-5]Ds!<;");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"!~bzK!5?-5]Ds!<;\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_FIFTH;
      Fraction fraction1 = fraction0.reduce();
      assertSame(fraction1, fraction0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Fraction fraction0 = Fraction.FOUR_FIFTHS;
      Fraction fraction1 = fraction0.ZERO.reduce();
      assertFalse(fraction1.equals((Object)fraction0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(0, 0, 405);
      Fraction fraction1 = fraction0.reduce();
      assertFalse(fraction1.equals((Object)fraction0));
      assertEquals(405, fraction0.getDenominator());
      assertEquals(1, fraction1.getDenominator());
      assertEquals(0, fraction1.getNumerator());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(25, 25, 25);
      Fraction fraction1 = fraction0.reduce();
      assertEquals(26, fraction1.getNumerator());
      assertEquals(1, fraction1.getDenominator());
      assertEquals(26, fraction0.getProperWhole());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_THIRDS;
      // Undeclared exception!
      try { 
        fraction0.ZERO.pow((-2817));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Unable to invert zero.
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(Integer.MIN_VALUE, 2927);
      // Undeclared exception!
      try { 
        fraction0.invert();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: can't negate numerator
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(Integer.MIN_VALUE, 1);
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
  public void test30()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_FIFTHS;
      Fraction fraction1 = fraction0.THREE_FIFTHS.negate();
      Fraction fraction2 = fraction1.abs();
      assertEquals((-0.6), fraction1.doubleValue(), 0.01);
      assertEquals(0.6F, fraction2.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_FIFTH;
      Fraction fraction1 = fraction0.TWO_QUARTERS.pow(0);
      int int0 = fraction0.compareTo(fraction1);
      assertEquals((-1), int0);
      assertEquals(0, fraction1.getProperNumerator());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-2298.102));
      // Undeclared exception!
      try { 
        fraction0.pow(Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mulPos
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-1353), (-1353));
      Fraction fraction1 = fraction0.pow(14);
      assertEquals(1, fraction1.getDenominator());
      assertEquals(1353, fraction0.getDenominator());
      assertEquals((short)1, fraction0.shortValue());
      assertEquals(1, fraction1.intValue());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_FIFTH;
      Fraction fraction1 = fraction0.ONE_HALF.add(fraction0);
      assertEquals(0.7F, fraction1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(2.147483647E9);
      // Undeclared exception!
      try { 
        fraction0.ONE.add(fraction0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      Fraction fraction1 = Fraction.getFraction(Integer.MIN_VALUE, 211499);
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
  public void test37()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_THIRD;
      // Undeclared exception!
      try { 
        fraction0.THREE_QUARTERS.subtract((Fraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fraction must not be null
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction((-815), (-815));
      Fraction fraction1 = Fraction.ZERO;
      Fraction fraction2 = fraction0.subtract(fraction1);
      assertEquals(1.0, fraction2.doubleValue(), 0.01);
      assertSame(fraction2, fraction0);
      assertEquals(1, fraction2.getNumerator());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(591.1231006);
      Fraction fraction1 = Fraction.getReducedFraction((-457), (-2147483646));
      Fraction fraction2 = fraction0.ONE_THIRD.subtract(fraction1);
      // Undeclared exception!
      try { 
        fraction0.ONE_QUARTER.add(fraction2);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: numerator too large after multiply
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-1.0));
      // Undeclared exception!
      try { 
        fraction0.TWO_THIRDS.multiplyBy((Fraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fraction must not be null
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Fraction fraction0 = Fraction.FOUR_FIFTHS;
      Fraction fraction1 = Fraction.getFraction((double) 0);
      Fraction fraction2 = fraction0.TWO_FIFTHS.multiplyBy(fraction1);
      assertSame(fraction2, fraction1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_FIFTH;
      Fraction fraction1 = fraction0.TWO_FIFTHS.divideBy(fraction0);
      assertEquals(1, fraction1.getDenominator());
      assertEquals(2.0F, fraction1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_FIFTHS;
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
  public void test44()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction((-815), (-815));
      Fraction fraction1 = Fraction.ZERO;
      // Undeclared exception!
      try { 
        fraction0.divideBy(fraction1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The fraction to divide by must not be zero
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction((-2234), 7);
      Object object0 = new Object();
      boolean boolean0 = fraction0.equals(object0);
      assertFalse(boolean0);
      assertEquals(7, fraction0.getDenominator());
      assertEquals((-319.14285714285717), fraction0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction((-2234), 7);
      Fraction fraction1 = Fraction.getFraction((double) 7);
      boolean boolean0 = fraction1.equals(fraction0);
      assertFalse(boolean0);
      assertEquals((-319.14285714285717), fraction0.doubleValue(), 0.01);
      assertEquals(7, fraction1.getNumerator());
      assertEquals(7, fraction0.getDenominator());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(1, 1, 2052);
      Fraction fraction1 = Fraction.getFraction("1 1/2052");
      boolean boolean0 = fraction0.equals(fraction1);
      assertTrue(boolean0);
      assertEquals(2053, fraction1.getNumerator());
      assertEquals(2052, fraction1.getDenominator());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(591.1231006);
      fraction0.ONE_HALF.hashCode();
      assertEquals(591.1231F, fraction0.floatValue(), 0.01F);
      assertEquals(5199, fraction0.getDenominator());
      assertEquals(3073249, fraction0.getNumerator());
      assertEquals(591.1231005962685, fraction0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_FIFTH;
      Fraction fraction1 = Fraction.TWO_FIFTHS;
      fraction0.TWO_THIRDS.hashCode();
      assertEquals(5, fraction0.getDenominator());
      assertEquals(1, fraction0.getNumerator());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Fraction fraction0 = Fraction.FOUR_FIFTHS;
      Fraction fraction1 = fraction0.TWO_FIFTHS.abs();
      int int0 = fraction1.compareTo(fraction0);
      assertEquals((-1), int0);
      assertEquals(0.4F, fraction1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-1353), (-1353));
      Fraction fraction1 = fraction0.invert();
      int int0 = fraction1.compareTo(fraction0);
      assertTrue(fraction1.equals((Object)fraction0));
      assertEquals(1353, fraction0.getNumerator());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_QUARTERS;
      Fraction fraction1 = Fraction.ONE_HALF;
      int int0 = fraction0.compareTo(fraction1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Fraction fraction0 = Fraction.FOUR_FIFTHS;
      Fraction fraction1 = fraction0.subtract(fraction0);
      int int0 = fraction0.compareTo(fraction1);
      assertEquals(1, int0);
      assertEquals(1, fraction1.getDenominator());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE;
      fraction0.ONE_THIRD.toString();
      assertEquals(1, fraction0.getDenominator());
      assertEquals(1, fraction0.getNumerator());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Fraction fraction0 = Fraction.FOUR_FIFTHS;
      Fraction fraction1 = fraction0.TWO_FIFTHS.abs();
      fraction1.toProperString();
      assertEquals(5, fraction1.getDenominator());
      assertEquals(2, fraction1.getNumerator());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(680, (-615));
      Fraction fraction1 = fraction0.invert();
      fraction0.ZERO.toProperString();
      Fraction fraction2 = fraction1.invert();
      fraction2.ZERO.multiplyBy(fraction1);
      fraction1.compareTo(fraction2);
      Fraction fraction3 = Fraction.getFraction(2147483646, 1, 1);
      // Undeclared exception!
      try { 
        fraction3.multiplyBy(fraction0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-1288), 1692);
      fraction0.ONE.toProperString();
      fraction0.ONE_HALF.negate();
      fraction0.TWO_FIFTHS.abs();
      // Undeclared exception!
      try { 
        fraction0.pow(1692);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-1.0));
      String string0 = fraction0.toProperString();
      assertEquals(1, fraction0.getDenominator());
      assertEquals("-1", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction((-2234), 7);
      String string0 = fraction0.toProperString();
      assertEquals("-319 1/7", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_FIFTH;
      String string0 = fraction0.toProperString();
      assertNotNull(string0);
      assertEquals("1/5", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((double) 7);
      String string0 = fraction0.toProperString();
      assertEquals("7", string0);
      assertEquals(7, fraction0.getNumerator());
  }
}
