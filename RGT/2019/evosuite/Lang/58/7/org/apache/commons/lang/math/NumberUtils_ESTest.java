/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 03 11:50:00 GMT 2019
 */

package org.apache.commons.lang.math;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang.math.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class NumberUtils_ESTest {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("e", (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      double double0 = NumberUtils.toDouble("4b@[MG");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      float float0 = NumberUtils.toFloat((String) null);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      float float0 = NumberUtils.min((-1.0F), (-3028.0F), 0.0F);
      assertEquals((-3028.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      double double0 = NumberUtils.min((double) (-2187.013F), (double) (-1L), 120.489015);
      assertEquals((-2187.012939453125), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      double double0 = NumberUtils.max((double) 0, (double) 43, (double) 0);
      assertEquals(43.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      long long0 = NumberUtils.toLong("6l_gq^SR}+l~J9R~");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      float float0 = NumberUtils.max((-1407.0F), (-1407.0F), (-1.0F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      int int0 = NumberUtils.stringToInt((String) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      long long0 = NumberUtils.toLong((String) null, 1245L);
      assertEquals(1245L, long0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      float float0 = NumberUtils.toFloat("", (float) 3021L);
      assertEquals(3021.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      double double0 = NumberUtils.toDouble((String) null, (double) (short)30210);
      assertEquals(30210.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Number number0 = NumberUtils.createNumber((String) null);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      try { 
        NumberUtils.createNumber("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // A blank string is not a valid number
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("--^P6");
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("0x7C");
      assertEquals(124, number0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-0x");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      try { 
        NumberUtils.createNumber(" is not a valid number.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         //  is not a valid number. is not a valid number.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      try { 
        NumberUtils.createNumber("QUC.iQ%?w{g4?gtL");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // QUC.iQ%?w{g4?gtL is not a valid number.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      try { 
        NumberUtils.createNumber("org.apache.commons.lang.StringUtils");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // org.apache.commons.lang.StringUtils is not a valid number.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Number number0 = NumberUtils.createNumber(".0");
      assertEquals((short)0, number0.shortValue());
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0E");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0E is not a valid number.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0e#{%dbT0k[p^fSrl");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0e#{%dbT0k[p^fSrl is not a valid number.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("5D");
      assertEquals(5.0, number0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      try { 
        NumberUtils.createNumber("W~F");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // W~F is not a valid number.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      try { 
        NumberUtils.createNumber("d");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // d is not a valid number.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("-2f");
      assertEquals((-2.0F), number0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("-6L");
      assertEquals((-6L), number0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("0L");
      assertEquals(0L, number0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-fL");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -fL is not a valid number.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("0D");
      assertEquals((short)0, number0.shortValue());
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      try { 
        NumberUtils.createNumber("Minimum abbreviation width with offset is 7");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      try { 
        NumberUtils.createNumber("EZ9pu@$`e4");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"E\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Float float0 = NumberUtils.createFloat((String) null);
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Double double0 = NumberUtils.createDouble((String) null);
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger((String) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Long long0 = NumberUtils.createLong((String) null);
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger((String) null);
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal((String) null);
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = new byte[7];
      boolean boolean0 = NumberUtils.equals(byteArray0, byteArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = NumberUtils.equals(byteArray0, byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      boolean boolean0 = NumberUtils.equals((byte[]) null, byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      boolean boolean0 = NumberUtils.equals(byteArray0, (byte[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = new byte[5];
      boolean boolean0 = NumberUtils.equals(byteArray0, byteArray1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)28;
      byte[] byteArray1 = new byte[5];
      boolean boolean0 = NumberUtils.equals(byteArray0, byteArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      short[] shortArray0 = new short[3];
      short[] shortArray1 = new short[5];
      boolean boolean0 = NumberUtils.equals(shortArray0, shortArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      short[] shortArray0 = new short[2];
      boolean boolean0 = NumberUtils.equals(shortArray0, shortArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      short[] shortArray0 = new short[9];
      boolean boolean0 = NumberUtils.equals((short[]) null, shortArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      short[] shortArray0 = new short[7];
      boolean boolean0 = NumberUtils.equals(shortArray0, (short[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      short[] shortArray0 = new short[6];
      short[] shortArray1 = new short[6];
      boolean boolean0 = NumberUtils.equals(shortArray1, shortArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      short[] shortArray0 = new short[6];
      shortArray0[0] = (short) (-878);
      short[] shortArray1 = new short[6];
      boolean boolean0 = NumberUtils.equals(shortArray1, shortArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      int[] intArray0 = new int[4];
      boolean boolean0 = NumberUtils.equals((int[]) null, intArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      int[] intArray0 = new int[2];
      boolean boolean0 = NumberUtils.equals(intArray0, intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      int[] intArray0 = new int[5];
      int[] intArray1 = new int[5];
      boolean boolean0 = NumberUtils.equals(intArray0, intArray1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      int[] intArray0 = new int[5];
      boolean boolean0 = NumberUtils.equals(intArray0, (int[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      int[] intArray0 = new int[6];
      int[] intArray1 = new int[2];
      boolean boolean0 = NumberUtils.equals(intArray0, intArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      int[] intArray0 = new int[5];
      int[] intArray1 = new int[5];
      intArray1[2] = (-249);
      boolean boolean0 = NumberUtils.equals(intArray0, intArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      long[] longArray0 = new long[3];
      long[] longArray1 = new long[7];
      boolean boolean0 = NumberUtils.equals(longArray0, longArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      long[] longArray0 = new long[7];
      boolean boolean0 = NumberUtils.equals(longArray0, longArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      long[] longArray0 = new long[9];
      boolean boolean0 = NumberUtils.equals((long[]) null, longArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      long[] longArray0 = new long[9];
      boolean boolean0 = NumberUtils.equals(longArray0, (long[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      long[] longArray0 = new long[4];
      long[] longArray1 = new long[4];
      boolean boolean0 = NumberUtils.equals(longArray1, longArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      long[] longArray0 = new long[4];
      longArray0[1] = 1L;
      long[] longArray1 = new long[4];
      boolean boolean0 = NumberUtils.equals(longArray1, longArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      float[] floatArray0 = new float[1];
      float[] floatArray1 = new float[1];
      boolean boolean0 = NumberUtils.equals(floatArray0, floatArray1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      boolean boolean0 = NumberUtils.equals((float[]) null, (float[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      float[] floatArray0 = new float[2];
      boolean boolean0 = NumberUtils.equals((float[]) null, floatArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      float[] floatArray0 = new float[1];
      boolean boolean0 = NumberUtils.equals(floatArray0, (float[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      float[] floatArray0 = new float[3];
      float[] floatArray1 = new float[1];
      boolean boolean0 = NumberUtils.equals(floatArray0, floatArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      float[] floatArray0 = new float[1];
      float[] floatArray1 = new float[1];
      floatArray1[0] = (float) (-1);
      boolean boolean0 = NumberUtils.equals(floatArray0, floatArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = new double[5];
      boolean boolean0 = NumberUtils.equals(doubleArray0, doubleArray1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      boolean boolean0 = NumberUtils.equals(doubleArray0, doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      boolean boolean0 = NumberUtils.equals((double[]) null, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      boolean boolean0 = NumberUtils.equals(doubleArray0, (double[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[8];
      boolean boolean0 = NumberUtils.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 1.0F;
      double[] doubleArray1 = new double[5];
      boolean boolean0 = NumberUtils.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((long[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      long[] longArray0 = new long[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      long[] longArray0 = new long[5];
      longArray0[0] = 2675L;
      long long0 = NumberUtils.min(longArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((int[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[0] = 101;
      int int0 = NumberUtils.min(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((short[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      short[] shortArray0 = new short[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(shortArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      short[] shortArray0 = new short[6];
      shortArray0[0] = (short) (byte)91;
      short short0 = NumberUtils.min(shortArray0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)108;
      byte byte0 = NumberUtils.min(byteArray0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) (short)1;
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((float[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      float[] floatArray0 = new float[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(floatArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      float[] floatArray0 = new float[8];
      floatArray0[5] = (-1819.5269F);
      float float0 = NumberUtils.min(floatArray0);
      assertEquals((-1819.5269F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((long[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      long[] longArray0 = new long[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      long[] longArray0 = new long[6];
      longArray0[3] = 1L;
      long long0 = NumberUtils.max(longArray0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      int[] intArray0 = new int[5];
      int int0 = NumberUtils.max(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((int[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-1578);
      int int0 = NumberUtils.max(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      short[] shortArray0 = new short[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(shortArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((short[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      short[] shortArray0 = new short[8];
      shortArray0[1] = (short)1242;
      short short0 = NumberUtils.max(shortArray0);
      assertEquals((short)1242, short0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[4] = (byte)120;
      byte byte0 = NumberUtils.max(byteArray0);
      assertEquals((byte)120, byte0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-744.65760118191);
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((float[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      float[] floatArray0 = new float[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(floatArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      float[] floatArray0 = new float[7];
      floatArray0[0] = (float) (byte) (-84);
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      long long0 = NumberUtils.min(1L, 0L, 1L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      long long0 = NumberUtils.min(0L, 1L, (-884L));
      assertEquals((-884L), long0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      int int0 = NumberUtils.min(45, (-5235), (-414));
      assertEquals((-5235), int0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      int int0 = NumberUtils.min(1, 1, (-839));
      assertEquals((-839), int0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      short short0 = NumberUtils.min((short)0, (short)2342, (short)0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      short short0 = NumberUtils.min((short)7, (short)4, (short)0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte) (-1), (byte) (-55), (byte)0);
      assertEquals((byte) (-55), byte0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte)91, (byte)91, (byte) (-84));
      assertEquals((byte) (-84), byte0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      long long0 = NumberUtils.max(0L, 0L, (-1L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      long long0 = NumberUtils.max((-1L), (long) (byte)0, 388L);
      assertEquals(388L, long0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      int int0 = NumberUtils.max((int) (byte)0, 2767, (int) (short)0);
      assertEquals(2767, int0);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      int int0 = NumberUtils.max((-414), (-414), 45);
      assertEquals(45, int0);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      short short0 = NumberUtils.max((short) (-1526), (short)2160, (short)0);
      assertEquals((short)2160, short0);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      short short0 = NumberUtils.max((short) (-1000), (short) (-1000), (short)0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte)60, (byte)0, (byte)60);
      assertEquals((byte)60, byte0);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte) (-60), (byte) (-30), (byte)0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      int int0 = NumberUtils.compare(1914.71145637, 2342.0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      int int0 = NumberUtils.compare((float) 0, 518.2F);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0bF=b6=fDD");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0xE");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x'oCAgO]WF</");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x2`ODlrYk\"_r,::v$#3");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0xCannot pad a negative amount: ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("5Et");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("--,a>Y}m");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("...");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("esyIH]$<r5");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("+403NxV");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("5E+{t");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test149()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("--");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test150()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("e");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test151()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("E");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test152()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("d");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test153()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("5D");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test154()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-2f");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test155()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("3F");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test156()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("L");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test157()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("4L");
      assertTrue(boolean0);
  }
}
