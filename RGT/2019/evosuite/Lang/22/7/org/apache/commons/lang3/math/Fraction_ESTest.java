/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 02 16:59:47 GMT 2019
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
      Fraction fraction0 = Fraction.FOUR_FIFTHS;
      Fraction fraction1 = fraction0.TWO_FIFTHS.reduce();
      assertEquals(2, fraction1.getNumerator());
      
      Fraction fraction2 = Fraction.ONE;
      fraction2.ONE_QUARTER.toString();
      assertEquals(1, fraction2.getDenominator());
      assertEquals(1, fraction2.getNumerator());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(31, 0, 25);
      String string0 = fraction0.toProperString();
      assertEquals("31", string0);
      assertEquals(25, fraction0.getDenominator());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-1894.856940582));
      float float0 = fraction0.floatValue();
      assertEquals((-1894.8569F), float0, 0.01F);
      assertEquals(706, fraction0.getDenominator());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_THIRDS;
      long long0 = fraction0.longValue();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_FIFTHS;
      double double0 = fraction0.doubleValue();
      assertEquals(0.4, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-3630), (-1018));
      assertEquals(3630, fraction0.getNumerator());
      assertEquals(3.5658152F, fraction0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(596, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The denominator must not be zero
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction("1/5");
      assertEquals(5, fraction0.getDenominator());
      assertEquals(0.2, fraction0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(2, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: can't negate
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(31, 1, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The denominator must not be zero
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(3, (-364), (-1082));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The denominator must not be negative
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction((-1), (-1), 1667);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The numerator must not be negative
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(Integer.MIN_VALUE, 47, 1931279);
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
        Fraction.getFraction(1431655765, 782, 10035);
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
        Fraction.getReducedFraction(0, 0);
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
      Fraction fraction0 = Fraction.getReducedFraction((-32), Integer.MIN_VALUE);
      assertEquals(1, fraction0.getNumerator());
      assertEquals(1.4901161193847656E-8, fraction0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getReducedFraction((-1), Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: can't negate
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getReducedFraction(Integer.MIN_VALUE, (-371));
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
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction("X~qm+.*]OEgk;c$9");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction("-3332 1963/8233");
      assertEquals((-3332.2384307056964), fraction0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction("4 7C9J");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // The fraction could not be parsed as the format X Y/Z
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(0, 31);
      Fraction fraction1 = fraction0.reduce();
      assertFalse(fraction1.equals((Object)fraction0));
      assertEquals(31, fraction0.getDenominator());
      assertEquals(0, fraction1.getNumerator());
      assertEquals(1, fraction1.getDenominator());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((double) 0);
      Fraction fraction1 = fraction0.reduce();
      assertEquals(0.0F, fraction1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(319, 319);
      Fraction fraction1 = fraction0.reduce();
      assertEquals(1, fraction1.getNumerator());
      assertEquals(319, fraction0.getNumerator());
      assertEquals(1, fraction1.getProperWhole());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-3332.2384307060524));
      Fraction fraction1 = fraction0.ONE_HALF.divideBy(fraction0);
      assertEquals((-1.5004928680752017E-4), fraction1.doubleValue(), 0.01);
      assertEquals((-27434319), fraction0.getNumerator());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      // Undeclared exception!
      try { 
        fraction0.pow((-1705));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Unable to invert zero.
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_FIFTHS;
      Fraction fraction1 = Fraction.getFraction(Integer.MIN_VALUE, 2747);
      // Undeclared exception!
      try { 
        fraction0.TWO_QUARTERS.divideBy(fraction1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: can't negate numerator
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(Integer.MIN_VALUE, 2423);
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
  public void test33()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_HALF;
      Fraction fraction1 = fraction0.negate();
      Fraction fraction2 = fraction0.multiplyBy(fraction1);
      Fraction fraction3 = fraction2.abs();
      assertEquals(1, fraction3.getNumerator());
      assertEquals((-0.25F), fraction2.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(0, 31);
      Fraction fraction1 = fraction0.ONE.abs();
      assertEquals(31, fraction0.getDenominator());
      assertEquals(0, fraction0.getNumerator());
      assertEquals((short)1, fraction1.shortValue());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_FIFTH;
      Fraction fraction1 = fraction0.pow(0);
      assertEquals((short)1, fraction1.shortValue());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_THIRD;
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
  public void test37()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(986.3529111283533);
      Fraction fraction1 = fraction0.TWO_QUARTERS.subtract(fraction0);
      // Undeclared exception!
      try { 
        fraction0.multiplyBy(fraction1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_THIRDS;
      Fraction fraction1 = Fraction.TWO_FIFTHS;
      Fraction fraction2 = fraction0.divideBy(fraction1);
      // Undeclared exception!
      try { 
        fraction2.pow((-3506));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mulPos
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Fraction fraction0 = Fraction.FOUR_FIFTHS;
      Fraction fraction1 = Fraction.getFraction(2, 2147483620);
      Fraction fraction2 = fraction0.subtract(fraction1);
      // Undeclared exception!
      try { 
        fraction1.ONE.add(fraction2);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(2.147483647E9);
      Fraction fraction1 = fraction0.ONE.subtract(fraction0);
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
  public void test41()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_HALF;
      Fraction fraction1 = Fraction.getFraction((-9), 2147483635);
      // Undeclared exception!
      try { 
        fraction0.subtract(fraction1);
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
      Fraction fraction0 = Fraction.TWO_THIRDS;
      // Undeclared exception!
      try { 
        fraction0.ONE_THIRD.add((Fraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fraction must not be null
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(0, 2725);
      Fraction fraction1 = fraction0.ZERO.add(fraction0);
      assertSame(fraction1, fraction0);
      assertEquals(0.0, fraction1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(0, 2725);
      Fraction fraction1 = fraction0.subtract(fraction0);
      assertNotSame(fraction1, fraction0);
      assertTrue(fraction1.equals((Object)fraction0));
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_THIRDS;
      Fraction fraction1 = Fraction.ZERO;
      Fraction fraction2 = fraction0.subtract(fraction1);
      int int0 = fraction0.compareTo(fraction2);
      assertEquals(0, int0);
      assertSame(fraction2, fraction0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(986.3529111283533);
      Fraction fraction1 = fraction0.THREE_QUARTERS.add(fraction0);
      assertEquals(3865495, fraction1.getNumerator());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_FIFTH;
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
  public void test48()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(986.3529111283533);
      Fraction fraction1 = fraction0.ZERO.pow(3);
      assertEquals(986.3529F, fraction0.floatValue(), 0.01F);
      assertEquals(1, fraction1.getDenominator());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(0, 31);
      Fraction fraction1 = fraction0.ONE_FIFTH.multiplyBy(fraction0);
      assertEquals(31, fraction0.getDenominator());
      assertEquals(0.0F, fraction1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_QUARTERS;
      // Undeclared exception!
      try { 
        fraction0.ONE_THIRD.divideBy((Fraction) null);
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
      Fraction fraction0 = Fraction.ONE;
      Fraction fraction1 = Fraction.getReducedFraction(0, 9);
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
  public void test52()  throws Throwable  {
      Fraction fraction0 = Fraction.FOUR_FIFTHS;
      Object object0 = new Object();
      boolean boolean0 = fraction0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_QUARTER;
      Fraction fraction1 = fraction0.invert();
      boolean boolean0 = fraction0.equals(fraction1);
      assertFalse(boolean0);
      assertEquals(4, fraction1.getNumerator());
      assertEquals(4.0F, fraction1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_HALF;
      Fraction fraction1 = fraction0.multiplyBy(fraction0);
      Fraction fraction2 = fraction0.multiplyBy(fraction0);
      boolean boolean0 = fraction2.equals(fraction1);
      assertTrue(boolean0);
      assertEquals(2, fraction0.getDenominator());
      assertEquals(1, fraction0.getNumerator());
      assertEquals(0.25F, fraction2.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_HALF;
      Fraction fraction1 = fraction0.negate();
      int int0 = fraction0.compareTo(fraction1);
      assertEquals(1, int0);
      assertEquals((-0.5), fraction1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_HALF;
      Fraction fraction1 = fraction0.multiplyBy(fraction0);
      int int0 = fraction1.compareTo(fraction0);
      assertEquals(0.25F, fraction1.floatValue(), 0.01F);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_HALF;
      Fraction fraction1 = fraction0.negate();
      Fraction fraction2 = fraction0.multiplyBy(fraction1);
      Fraction fraction3 = Fraction.getFraction((double) (-0.25F));
      int int0 = fraction2.compareTo(fraction3);
      assertEquals(0, int0);
      assertEquals(4, fraction3.getDenominator());
      assertEquals((-0.25F), fraction2.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_QUARTERS;
      Fraction fraction1 = Fraction.ONE_HALF;
      int int0 = fraction0.compareTo(fraction1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(47, 47, 856);
      fraction0.ONE.toProperString();
      assertEquals(47.054905F, fraction0.floatValue(), 0.01F);
      assertEquals(47.054906542056074, fraction0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_THIRDS;
      fraction0.ZERO.toProperString();
      fraction0.TWO_QUARTERS.negate();
      int int0 = 929;
      Fraction.getReducedFraction(929, 929);
      // Undeclared exception!
      try { 
        fraction0.pow((-4643));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE;
      String string0 = fraction0.toProperString();
      assertNotNull(string0);
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-1.0));
      String string0 = fraction0.toProperString();
      assertEquals(1, fraction0.getDenominator());
      assertNotNull(string0);
      assertEquals("-1", string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-3332.2384307060524));
      String string0 = fraction0.toProperString();
      assertEquals("-3332 1963/8233", string0);
      assertEquals((-3332.2385F), fraction0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      double double0 = 0.6202056000001903;
      Fraction fraction0 = Fraction.getFraction(0.6202056000001903);
      int int0 = 1365;
      Fraction fraction1 = Fraction.getFraction(1365, 1365);
      Fraction fraction2 = Fraction.getReducedFraction(2390, 5);
      fraction2.THREE_QUARTERS.toString();
      Fraction.getReducedFraction((-5911), 5);
      Fraction.getReducedFraction(1365, 4);
      Fraction fraction3 = Fraction.getReducedFraction(2390, 2390);
      Fraction.getFraction((-2325), 5);
      fraction0.ONE.divideBy(fraction1);
      Fraction fraction4 = Fraction.getFraction((-72.2919203));
      fraction4.FOUR_FIFTHS.hashCode();
      fraction4.THREE_QUARTERS.toProperString();
      Fraction.getFraction(0.6202056000001903);
      double double1 = 6.98593149994764E-9;
      Fraction fraction5 = Fraction.getFraction(6.98593149994764E-9);
      fraction5.THREE_QUARTERS.add(fraction3);
      fraction5.TWO_THIRDS.hashCode();
      Fraction.getFraction((double) 1365);
      Fraction fraction6 = Fraction.getFraction((-2502.0663));
      // Undeclared exception!
      try { 
        fraction6.subtract(fraction1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: numerator too large after multiply
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }
}
