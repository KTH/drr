/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 04 11:41:02 GMT 2019
 */

package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.util.MathUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class MathUtils_ESTest {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      int int0 = MathUtils.hash((-819.0516));
      assertEquals(1842043811, int0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      int int0 = MathUtils.hash(doubleArray0);
      assertEquals((-196513505), int0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      float float0 = MathUtils.round((-1.0F), 205);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      double double0 = MathUtils.sinh((-1.0));
      assertEquals((-1.1752011936438014), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      double double0 = MathUtils.normalizeAngle(0.0, 285.2646);
      assertEquals(282.7433388230814, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      double double0 = MathUtils.cosh((-2095.701964939));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      double double0 = MathUtils.log((-1727.0), 2.2250738585072014E-308);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck((-1073741823), (-2146525376));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      int int0 = MathUtils.addAndCheck(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck(2146835057, 2146835057);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      long long0 = MathUtils.subAndCheck(1395L, 1395L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      long long0 = MathUtils.addAndCheck((long) 0, 1L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      long long0 = MathUtils.subAndCheck((long) (short) (-1), (long) 21);
      assertEquals((-22L), long0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck((long) (-661), 9223372036854775798L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient((-1528), 1108);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient((-1), (-349));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(16, 16);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(2008, 0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(67, 1);
      assertEquals(67L, long0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(11, 10);
      assertEquals(11L, long0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient(3019, 2598);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(48, 19);
      assertEquals(30.077000493866755, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(64, 8);
      assertEquals(4426165368L, long0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(4875, (-93));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(507, 1);
      assertEquals(507.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientDouble((short)524, 2822);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientDouble((-3122), (-3122));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(Integer.MAX_VALUE, Integer.MAX_VALUE);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(1, (short)0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(1, (byte) (-1));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(8, 7);
      assertEquals(8.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(393, 219);
      assertEquals(6.176898196513772E115, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientLog(0, 12);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientLog((-1149), (-4191));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(0, 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(1, 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(5, 1);
      assertEquals(1.6094379124341003, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(0, (-1));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(2005, 1588);
      assertEquals(1021.2733544509183, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(876, (short) (-1515));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) Float.NaN;
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) Float.NaN;
      double[] doubleArray1 = new double[5];
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((double) 1, (double) 1, (double) 1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((double) (-1275), (-190.55514023), (double) 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((double) 1395L, 311.17, 738.2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((-1.0), 2.0, 791.2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((double) 1, (-2351.055438), Double.POSITIVE_INFINITY);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      boolean boolean0 = MathUtils.equals((double[]) null, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      boolean boolean0 = MathUtils.equals(doubleArray0, (double[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((double[]) null, (double[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[3];
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      double double0 = MathUtils.factorialLog(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorial((-369));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for n!
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorial(107604);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // factorial value is too large to fit in a long
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      double double0 = MathUtils.factorialDouble(0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorialDouble((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for n!
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      double double0 = MathUtils.factorialDouble(2982);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorialLog((-290));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n > 0 for n!
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

//  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.gcd(0, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: gcd(0, -2,147,483,648) is 2^31
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      int int0 = MathUtils.gcd(4, 0);
      assertEquals(4, int0);
  }

//  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.gcd(Integer.MIN_VALUE, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: gcd(-2,147,483,648, 0) is 2^31
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      int int0 = MathUtils.lcm(1636, (-6));
      assertEquals(4908, int0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.gcd(Integer.MIN_VALUE, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: gcd(-2,147,483,648, -2,147,483,648) is 2^31
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      byte byte0 = MathUtils.indicator((byte) (-70));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      byte byte0 = MathUtils.indicator((byte)14);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      double double0 = MathUtils.indicator((double) 1);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      double double0 = MathUtils.indicator(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      double double0 = MathUtils.indicator((-1932.7));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      float float0 = MathUtils.indicator(Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      int int0 = MathUtils.indicator((-349));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      int int0 = MathUtils.indicator((int) (short)83);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      long long0 = MathUtils.indicator((-227L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      long long0 = MathUtils.indicator((long) 0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      short short0 = MathUtils.indicator((short) (-1515));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      short short0 = MathUtils.indicator((short)0);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      int int0 = MathUtils.lcm(0, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      int int0 = MathUtils.lcm((-1), 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.lcm(1, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: lcm is 2^31
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.lcm((-805), 2141294934);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.lcm(1225083039, 1616);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck((-475L), (-475L));
      assertEquals(225625L, long0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck(2147483647L, (long) (-350));
      assertEquals((-751619276450L), long0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((-1325L), (-9218868437227405313L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck((-349L), 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck(2432902008176640000L, (-1148L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck(2318L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      double double0 = MathUtils.nextAfter(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      float float0 = MathUtils.round((-2240.0F), (int) (byte) (-70));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      float float0 = MathUtils.round(0.0F, (-1239), 1);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      double double0 = MathUtils.nextAfter(0.9999999999999999, 3129.2156795356);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      double double0 = MathUtils.nextAfter(1.0, (-999.4));
      assertEquals(0.9999999999999999, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      double double0 = MathUtils.scalb(0.0, 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      double double0 = MathUtils.scalb((-3005.9385611363946), (-421));
      assertEquals((-5.55075329226999E-124), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      double double0 = MathUtils.scalb(Double.NaN, 2217);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      double double0 = MathUtils.scalb(Double.NEGATIVE_INFINITY, 0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      double double0 = MathUtils.round(Double.NaN, 31, 31);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      double double0 = MathUtils.round(Double.NEGATIVE_INFINITY, 0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      float float0 = MathUtils.round((-3095.0752F), 0, 0);
      assertEquals((-3096.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      float float0 = MathUtils.round((float) (short) (-2), 2, 2);
      assertEquals((-1.99F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      float float0 = MathUtils.round((float) (short)69, (-3), 3);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      float float0 = MathUtils.round((float) (short)3030, 5, 5);
      assertEquals(3030.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      float float0 = MathUtils.round((float) (short)65, (-6), 6);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      float float0 = MathUtils.round((float) (short)54, 7, 7);
      assertEquals(54.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.round((float) (byte)0, 0, 820);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid rounding method.
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      float float0 = MathUtils.round((float) (short)65, 2, 2);
      assertEquals(65.01F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      float float0 = MathUtils.round((float) (short) (-319), (-3), 3);
      assertEquals((-999.99994F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      float float0 = MathUtils.round((float) (short)3030, (-5), 5);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      float float0 = MathUtils.round((float) (short)3199, (int) (short)3199, 6);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      float float0 = MathUtils.round((float) 6, (int) (short) (-1));
      assertEquals(10.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.round((float) (short)65, (-7), 7);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Inexact result from rounding
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte)21);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte)0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte) (-13));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      double double0 = MathUtils.sign(6.283185307179586);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      double double0 = MathUtils.sign(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      double double0 = MathUtils.sign(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      double double0 = MathUtils.sign((-1045.53329470094));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      float float0 = MathUtils.sign((-1.0F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      float float0 = MathUtils.sign(Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      float float0 = MathUtils.sign((float) 0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      float float0 = MathUtils.sign(1.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      int int0 = MathUtils.sign(3);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      int int0 = MathUtils.sign(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      int int0 = MathUtils.sign((int) (short) (-2));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      long long0 = MathUtils.sign((long) 880);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      long long0 = MathUtils.sign(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      long long0 = MathUtils.sign((long) (-349));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      short short0 = MathUtils.sign((short) (-1));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      short short0 = MathUtils.sign((short)0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      short short0 = MathUtils.sign((short)15);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck((-425), Integer.MAX_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      int int0 = MathUtils.subAndCheck(52, 896);
      assertEquals((-844), int0);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck(2147483646, (-2146321217));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      long long0 = MathUtils.subAndCheck((long) (-509), (-9223372036854775808L));
      assertEquals(9223372036854775299L, long0);
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck((long) 1, (-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }
}
