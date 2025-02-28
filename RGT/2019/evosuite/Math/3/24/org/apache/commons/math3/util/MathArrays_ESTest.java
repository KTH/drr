/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 19:43:11 GMT 2019
 */

package org.apache.commons.math3.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.Field;
import org.apache.commons.math3.FieldElement;
import org.apache.commons.math3.util.MathArrays;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;


public class MathArrays_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      try { 
        MathArrays.checkOrder(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // points 0 and 1 are not strictly increasing (0 >= 0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = MathArrays.copyOf(doubleArray0);
      assertEquals(2, doubleArray1.length);
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Field<Integer> field0 = (Field<Integer>) mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn((Class) null).when(field0).getRuntimeClass();
      // Undeclared exception!
      try { 
        MathArrays.buildArray(field0, (-1886), (-1886));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.reflect.Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[6];
      int[] intArray1 = MathArrays.copyOf(intArray0);
      assertNotSame(intArray1, intArray0);
      assertEquals(6, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      boolean boolean0 = MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[][] doubleArray1 = new double[2][2];
      MathArrays.sortInPlace(doubleArray0, doubleArray1);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      double[][] doubleArray1 = new double[3][6];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      MathArrays.sortInPlace(doubleArray0, mathArrays_OrderDirection0, doubleArray1);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = MathArrays.scale((-3831.0852317), doubleArray0);
      assertArrayEquals(new double[] {-0.0, -0.0, -0.0, -0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      MathArrays.scaleInPlace(0.0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = MathArrays.ebeAdd(doubleArray0, doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[8];
      try { 
        MathArrays.ebeAdd(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 7 != 8
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = MathArrays.ebeSubtract(doubleArray0, doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[5];
      try { 
        MathArrays.ebeSubtract(doubleArray1, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 5 != 9
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = MathArrays.convolve(doubleArray0, doubleArray0);
      try { 
        MathArrays.ebeMultiply(doubleArray1, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 3 != 2
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = MathArrays.ebeDivide(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[9];
      try { 
        MathArrays.ebeDivide(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 9
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double double0 = MathArrays.distance1(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[8];
      int int0 = MathArrays.distance1(intArray0, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double double0 = MathArrays.distance(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[] intArray0 = new int[8];
      double double0 = MathArrays.distance(intArray0, intArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double double0 = MathArrays.distanceInf(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int[] intArray0 = new int[2];
      int int0 = MathArrays.distanceInf(intArray0, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "org.apache.commons.math3.util.MathArrays$2";
      stringArray0[1] = "IrUR8EYO$2Tn3dHF";
      stringArray0[2] = "";
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      boolean boolean0 = MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      // Undeclared exception!
      try { 
        MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Integer[] integerArray0 = new Integer[5];
      integerArray0[0] = (Integer) 2491;
      integerArray0[1] = (Integer) 0;
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      boolean boolean0 = MathArrays.isMonotonic(integerArray0, mathArrays_OrderDirection0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "A%.Bq]3Sms";
      // Undeclared exception!
      try { 
        MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "c1X6Qe:?d0U_JrX";
      stringArray0[1] = "";
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      boolean boolean0 = MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int[] intArray0 = new int[2];
      Double[] doubleArray0 = new Double[6];
      doubleArray0[0] = (Double) (double)intArray0[0];
      doubleArray0[1] = (Double) Double.NaN;
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      boolean boolean0 = MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "ZERO_NORM_FOR_ROTATION_AXIS";
      stringArray0[1] = "SINE_TABLE_A";
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      // Undeclared exception!
      try { 
        MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "number of interpolation points ({0})";
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      boolean boolean0 = MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-384.144);
      MathArrays.checkOrder(doubleArray0);
      assertArrayEquals(new double[] {(-384.144), 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 5552.61734892;
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      boolean boolean0 = MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = Double.NaN;
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      try { 
        MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // points 1 and 2 are not strictly decreasing (0 <= 0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-3160.235171527);
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      try { 
        MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // points 0 and 1 are not decreasing (-3,160.235 < 0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      long[][] longArray0 = new long[4][1];
      MathArrays.checkRectangular(longArray0);
      assertEquals(4, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      long[][] longArray0 = new long[3][8];
      long[] longArray1 = new long[3];
      longArray0[0] = longArray1;
      try { 
        MathArrays.checkRectangular(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // some rows have length 8 while others have length 3
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      MathArrays.checkPositive(doubleArray0);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 3287.73;
      try { 
        MathArrays.checkPositive(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      long[] longArray0 = new long[2];
      MathArrays.checkNonNegative(longArray0);
      assertEquals(2, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      long[] longArray0 = new long[3];
      longArray0[1] = (-1L);
      try { 
        MathArrays.checkNonNegative(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      long[][] longArray0 = new long[5][5];
      MathArrays.checkNonNegative(longArray0);
      assertEquals(5, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      long[][] longArray0 = new long[5][1];
      long[] longArray1 = new long[5];
      longArray1[4] = (-1L);
      longArray0[0] = longArray1;
      try { 
        MathArrays.checkNonNegative(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double double0 = MathArrays.safeNorm(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = Double.NaN;
      double double0 = MathArrays.safeNorm(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[5] = 1.7976931348623157E308;
      doubleArray0[7] = 4.3466666666666665E18;
      double double0 = MathArrays.safeNorm(doubleArray0);
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[2] = 1.34217729E8;
      doubleArray0[3] = (-2.6437112632041807E-8);
      doubleArray0[4] = (-2.6437112632041807E-8);
      double[] doubleArray1 = MathArrays.normalizeArray(doubleArray0, (-2.6437112632041807E-8));
      double double0 = MathArrays.safeNorm(doubleArray1);
      assertArrayEquals(new double[] {-0.0, -0.0, (-2.6437112632041817E-8), 5.207366638719277E-24, 5.207366638719277E-24, -0.0, -0.0}, doubleArray1, 0.01);
      assertEquals(2.6437112632041817E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      double[][] doubleArray0 = new double[7][3];
      try { 
        MathArrays.sortInPlace((double[]) null, mathArrays_OrderDirection0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      double[] doubleArray0 = new double[15];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      double[][] doubleArray1 = new double[2][8];
      doubleArray1[0] = null;
      try { 
        MathArrays.sortInPlace(doubleArray0, mathArrays_OrderDirection0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      double[][] doubleArray1 = new double[2][4];
      try { 
        MathArrays.sortInPlace(doubleArray0, mathArrays_OrderDirection0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 4 != 0
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = MathArrays.linearCombination(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[5];
      try { 
        MathArrays.linearCombination(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 5
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = MathArrays.linearCombination(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = Double.NaN;
      double double0 = MathArrays.linearCombination(doubleArray0, doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      double double0 = MathArrays.linearCombination(0.0, 0.0, (-4664.576412551), 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      double double0 = MathArrays.linearCombination(Double.NaN, Double.NaN, Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      double double0 = MathArrays.linearCombination((-1.0), 3.834E-20, (-1111.27155222828), 3.834E-20, 4254.8325819544, (-1998.2298270469337));
      assertEquals((-8502133.3743524), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      double double0 = MathArrays.linearCombination((-384.144), (-384.144), (-384.144), 1.34217729E8, 1449.66, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      double double0 = MathArrays.linearCombination(0.0, 3.834E-20, 0.0, -0.0, 0.0, 0.0, (-912.17231), (-470.655));
      assertEquals(429318.45856305, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      double double0 = MathArrays.linearCombination((-1026.191079267), (-3333.15619), (-1026.191079267), (-1473.7958863981085), 1.7976931348623157E308, Double.POSITIVE_INFINITY, 2050.981761402, 0.0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      boolean boolean0 = MathArrays.equals((float[]) null, (float[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      float[] floatArray0 = new float[0];
      boolean boolean0 = MathArrays.equals(floatArray0, (float[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      float[] floatArray0 = new float[8];
      boolean boolean0 = MathArrays.equals(floatArray0, floatArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      float[] floatArray0 = new float[0];
      boolean boolean0 = MathArrays.equals((float[]) null, floatArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      float[] floatArray0 = new float[6];
      float[] floatArray1 = new float[0];
      boolean boolean0 = MathArrays.equals(floatArray0, floatArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      float[] floatArray0 = new float[3];
      floatArray0[1] = Float.NaN;
      boolean boolean0 = MathArrays.equals(floatArray0, floatArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      boolean boolean0 = MathArrays.equalsIncludingNaN((float[]) null, (float[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      float[] floatArray0 = new float[8];
      boolean boolean0 = MathArrays.equalsIncludingNaN(floatArray0, (float[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      float[] floatArray0 = new float[8];
      boolean boolean0 = MathArrays.equalsIncludingNaN(floatArray0, floatArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      float[] floatArray0 = new float[0];
      boolean boolean0 = MathArrays.equalsIncludingNaN((float[]) null, floatArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      float[] floatArray0 = new float[8];
      float[] floatArray1 = new float[4];
      boolean boolean0 = MathArrays.equalsIncludingNaN(floatArray0, floatArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      float[] floatArray0 = new float[3];
      floatArray0[0] = (-1.0F);
      float[] floatArray1 = new float[3];
      boolean boolean0 = MathArrays.equalsIncludingNaN(floatArray0, floatArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      boolean boolean0 = MathArrays.equals((double[]) null, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      boolean boolean0 = MathArrays.equals(doubleArray0, doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      boolean boolean0 = MathArrays.equals(doubleArray0, (double[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      boolean boolean0 = MathArrays.equals((double[]) null, (double[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[0];
      boolean boolean0 = MathArrays.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = Double.NaN;
      boolean boolean0 = MathArrays.equals(doubleArray0, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      boolean boolean0 = MathArrays.equalsIncludingNaN((double[]) null, (double[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      boolean boolean0 = MathArrays.equalsIncludingNaN(doubleArray0, doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      boolean boolean0 = MathArrays.equalsIncludingNaN(doubleArray0, (double[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      boolean boolean0 = MathArrays.equalsIncludingNaN((double[]) null, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = MathArrays.convolve(doubleArray0, doubleArray0);
      boolean boolean0 = MathArrays.equalsIncludingNaN(doubleArray0, doubleArray1);
      assertEquals(9, doubleArray1.length);
      assertFalse(boolean0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-3160.235171527);
      double[] doubleArray1 = MathArrays.ebeMultiply(doubleArray0, doubleArray0);
      boolean boolean0 = MathArrays.equalsIncludingNaN(doubleArray1, doubleArray0);
      assertArrayEquals(new double[] {9987086.339356288, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      try { 
        MathArrays.normalizeArray(doubleArray0, Float.NEGATIVE_INFINITY);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot normalize to an infinite value
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      try { 
        MathArrays.normalizeArray(doubleArray0, Double.NaN);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot normalize to NaN
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = Double.NEGATIVE_INFINITY;
      try { 
        MathArrays.normalizeArray(doubleArray0, (-3809.240592892));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array contains an infinite element, -\u221E at index 1
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = Double.NaN;
      try { 
        MathArrays.normalizeArray(doubleArray0, (-2247.4809096778));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // array sums to zero
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = Double.NaN;
      doubleArray0[2] = 3169.3093387408453;
      double[] doubleArray1 = MathArrays.normalizeArray(doubleArray0, (-2247.4809096778));
      assertArrayEquals(new double[] {-0.0, Double.NaN, (-2247.4809096778)}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      Class<FieldElement> class0 = FieldElement.class;
      Field<Object> field0 = (Field<Object>) mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(field0).getRuntimeClass();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(field0).getZero();
      Object[][] objectArray0 = MathArrays.buildArray(field0, 16, 16);
      assertEquals(16, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      try { 
        MathArrays.convolve(doubleArray0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no data
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[0];
      try { 
        MathArrays.convolve(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no data
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }
}
