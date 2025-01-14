/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 16:41:01 GMT 2014
 */

package org.apache.commons.lang3.math;

import static org.junit.Assert.*;
import org.junit.Test;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.math.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;

import org.junit.runner.RunWith;

 
public class NumberUtilsEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      String string0 = "5N";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      String string0 = "-F";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      String string0 = "D";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      String string0 = ".";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      String string0 = "3E";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      String string0 = "---0Xorg.apache.commons.lang3.math.NumberUtils";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      String string0 = "-0X}$O2";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      String string0 = "+i";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      String string0 = "ePj&4H\"Aco6,";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      String string0 = "...";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      String string0 = "3E1";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      String string0 = "0xai#(sBH?t&Zq8Rj";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      String string0 = "-0x is not a valid number.";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      String string0 = "-0xD";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      String string0 = "-0x";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      String string0 = "0.l";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      String string0 = "-0x3jhMp}4G5+)\"v1CR";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      String string0 = "-";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      String string0 = null;
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      String string0 = "..";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      String string0 = "1";
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      String string0 = "";
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      byte byte0 = (byte)45;
      byte byte1 = (byte)64;
      byte byte2 = NumberUtils.max(byte0, byte0, byte1);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
      assertEquals((byte)64, byte2);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      byte byte0 = (byte) (-47);
      byte byte1 = (byte) (-37);
      byte byte2 = NumberUtils.max(byte0, byte1, byte1);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
      assertEquals((byte) (-37), byte2);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      short short0 = (short)137;
      short short1 = (short)1473;
      short short2 = NumberUtils.max(short0, short0, short1);
      assertFalse(short0 == short1);
      assertFalse(short0 == short2);
      assertTrue(short2 == short1);
      assertFalse(short2 == short0);
      assertFalse(short1 == short0);
      assertTrue(short1 == short2);
      assertEquals((short)1473, short2);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      String string0 = "SecurityException occurred";
      short short0 = (short)3323;
      short short1 = NumberUtils.toShort(string0, short0);
      assertTrue(short1 == short0);
      assertTrue(short0 == short1);
      assertEquals((short)3323, short1);
      
      short short2 = (short)13;
      assertFalse(short2 == short1);
      
      short short3 = NumberUtils.max(short2, short1, short2);
      assertFalse(short1 == short2);
      assertTrue(short1 == short0);
      assertTrue(short1 == short3);
      assertFalse(short2 == short3);
      assertFalse(short2 == short1);
      assertFalse(short2 == short0);
      assertTrue(short0 == short3);
      assertFalse(short0 == short2);
      assertTrue(short0 == short1);
      assertFalse(short3 == short2);
      assertTrue(short3 == short0);
      assertTrue(short3 == short1);
      assertEquals((short)3323, short3);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      int int0 = (-1931);
      int int1 = 4167;
      int int2 = NumberUtils.max(int0, int0, int1);
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
      assertTrue(int1 == int2);
      assertFalse(int1 == int0);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertEquals(4167, int2);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte) (-32);
      int int0 = 387;
      int int1 = NumberUtils.max((int) byteArray0[0], int0, (int) byte0);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals(387, int1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      long long0 = 0L;
      long long1 = 113L;
      long long2 = NumberUtils.max(long0, long0, long1);
      assertFalse(long0 == long2);
      assertFalse(long0 == long1);
      assertTrue(long2 == long1);
      assertFalse(long2 == long0);
      assertFalse(long1 == long0);
      assertTrue(long1 == long2);
      assertEquals(113L, long2);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      byte byte0 = (byte)26;
      long long0 = 2860L;
      long long1 = NumberUtils.max((long) byte0, long0, long0);
      assertTrue(long0 == long1);
      assertTrue(long1 == long0);
      assertEquals(2860L, long1);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      String string0 = null;
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
      
      long long0 = NumberUtils.max((long) int0, (long) int0, (long) int0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      byte byte0 = (byte)80;
      byte byte1 = (byte) (-60);
      byte byte2 = NumberUtils.min(byte0, byte0, byte1);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
      assertEquals((byte) (-60), byte2);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      byte byte0 = (byte)80;
      byte byte1 = (byte)32;
      byte byte2 = NumberUtils.min(byte0, byte1, byte1);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
      assertEquals((byte)32, byte2);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      short short0 = (short)34;
      short short1 = (short) (-684);
      short short2 = NumberUtils.min(short0, short0, short1);
      assertFalse(short1 == short0);
      assertTrue(short1 == short2);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
      assertFalse(short0 == short1);
      assertFalse(short0 == short2);
      assertEquals((short) (-684), short2);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      short short0 = (short) (-514);
      short short1 = (short) (-1074);
      short short2 = NumberUtils.min(short0, short1, short1);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
      assertFalse(short0 == short2);
      assertFalse(short0 == short1);
      assertFalse(short1 == short0);
      assertTrue(short1 == short2);
      assertEquals((short) (-1074), short2);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      byte byte0 = (byte) (-14);
      byte byte1 = (byte)68;
      int int0 = NumberUtils.min((int) byte1, (int) byte1, (int) byte0);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      assertEquals((-14), int0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      short[] shortArray0 = new short[5];
      short short0 = (short) (-997);
      int int0 = NumberUtils.min((int) shortArray0[0], (int) short0, (int) short0);
      assertEquals((-997), int0);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)0, (short)0, (short)0}, shortArray0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      long long0 = 852L;
      long long1 = 0L;
      long long2 = NumberUtils.min(long0, long0, long1);
      assertFalse(long0 == long2);
      assertFalse(long0 == long1);
      assertTrue(long1 == long2);
      assertFalse(long1 == long0);
      assertFalse(long2 == long0);
      assertTrue(long2 == long1);
      assertEquals(0L, long2);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      byte byte0 = (byte)26;
      long long0 = 2860L;
      long long1 = NumberUtils.min(long0, (long) byte0, (long) byte0);
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
      assertEquals(26L, long1);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      long long0 = (-683L);
      float[] floatArray0 = new float[5];
      floatArray0[0] = (float) long0;
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(0.0F, float0, 0.01F);
      assertArrayEquals(new float[] {(-683.0F), 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      float[] floatArray0 = new float[5];
      float float0 = Float.NaN;
      floatArray0[1] = float0;
      float float1 = NumberUtils.max(floatArray0);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, Float.NaN, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      float[] floatArray0 = null;
      // Undeclared exception!
      try {
        float float0 = NumberUtils.max(floatArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      float float0 = 1121.3326F;
      doubleArray0[3] = (double) float0;
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(1121.3326416015625, double0, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 1121.3326416015625, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      double double0 = Double.NaN;
      doubleArray0[6] = double0;
      double double1 = NumberUtils.max(doubleArray0);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.NaN, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      double[] doubleArray0 = null;
      // Undeclared exception!
      try {
        double double0 = NumberUtils.max(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte) (-32);
      byteArray0[0] = byte0;
      byte byte1 = NumberUtils.max(byteArray0);
      assertFalse(byte1 == byte0);
      assertEquals((byte)0, byte1);
      assertArrayEquals(new byte[] {(byte) (-32), (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byte byte0 = NumberUtils.max(byteArray0);
      assertEquals((byte)0, byte0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      short[] shortArray0 = new short[5];
      short short0 = (short)882;
      shortArray0[2] = short0;
      short short1 = NumberUtils.max(shortArray0);
      assertTrue(short1 == short0);
      assertEquals((short)882, short1);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)882, (short)0, (short)0}, shortArray0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      short[] shortArray0 = null;
      // Undeclared exception!
      try {
        short short0 = NumberUtils.max(shortArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      int[] intArray0 = new int[8];
      int int0 = 2216;
      intArray0[1] = int0;
      int int1 = NumberUtils.max(intArray0);
      assertTrue(int1 == int0);
      assertEquals(2216, int1);
      assertArrayEquals(new int[] {0, 2216, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      long[] longArray0 = new long[4];
      long long0 = 278L;
      longArray0[1] = long0;
      long long1 = NumberUtils.max(longArray0);
      assertTrue(long1 == long0);
      assertEquals(278L, long1);
      assertArrayEquals(new long[] {0L, 278L, 0L, 0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      long[] longArray0 = null;
      // Undeclared exception!
      try {
        long long0 = NumberUtils.max(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      float[] floatArray0 = new float[6];
      float float0 = (-2113.4575F);
      floatArray0[1] = float0;
      float float1 = NumberUtils.min(floatArray0);
      assertTrue(float1 == float0);
      assertEquals((-2113.4575F), float1, 0.01F);
      assertArrayEquals(new float[] {0.0F, (-2113.4575F), 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      float[] floatArray0 = new float[6];
      float float0 = Float.NaN;
      floatArray0[5] = float0;
      float float1 = NumberUtils.min(floatArray0);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, 0.0F, Float.NaN}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      long long0 = 852L;
      double[] doubleArray0 = new double[26];
      doubleArray0[0] = (double) long0;
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals(0.0, double0, 0.01D);
      assertArrayEquals(new double[] {852.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double double0 = Double.NaN;
      doubleArray0[7] = double0;
      double double1 = NumberUtils.min(doubleArray0);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.NaN, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      double[] doubleArray0 = null;
      // Undeclared exception!
      try {
        double double0 = NumberUtils.min(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      byte byte0 = (byte)45;
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = byte0;
      byte byte1 = NumberUtils.min(byteArray0);
      assertFalse(byte1 == byte0);
      assertEquals((byte)0, byte1);
      assertArrayEquals(new byte[] {(byte)45, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      short[] shortArray0 = new short[5];
      short short0 = (short) (-997);
      shortArray0[1] = short0;
      short short1 = NumberUtils.min(shortArray0);
      assertTrue(short1 == short0);
      assertEquals((short) (-997), short1);
      assertArrayEquals(new short[] {(short)0, (short) (-997), (short)0, (short)0, (short)0}, shortArray0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      int[] intArray0 = new int[20];
      short short0 = (short) (-2418);
      intArray0[3] = (int) short0;
      int int0 = NumberUtils.min(intArray0);
      assertEquals((-2418), int0);
      assertArrayEquals(new int[] {0, 0, 0, (-2418), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      long[] longArray0 = new long[6];
      long long0 = (-1710L);
      longArray0[4] = long0;
      long long1 = NumberUtils.min(longArray0);
      assertTrue(long1 == long0);
      assertEquals((-1710L), long1);
      assertArrayEquals(new long[] {0L, 0L, 0L, 0L, (-1710L), 0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      long[] longArray0 = null;
      // Undeclared exception!
      try {
        long long0 = NumberUtils.min(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      String string0 = null;
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal(string0);
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      String string0 = null;
      BigInteger bigInteger0 = NumberUtils.createBigInteger(string0);
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      String string0 = null;
      Long long0 = NumberUtils.createLong(string0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      String string0 = null;
      Integer integer0 = NumberUtils.createInteger(string0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      String string0 = null;
      Double double0 = NumberUtils.createDouble(string0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      String string0 = null;
      Float float0 = NumberUtils.createFloat(string0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      String string0 = "0.";
      Float float0 = (Float)NumberUtils.createNumber(string0);
      assertEquals(0.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      String string0 = ">}$O2";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \">}$O2\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      String string0 = "The Array must not b null";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // The Array must not b null is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      String string0 = "rn 0f";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // rn 0f is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      String string0 = "IllegalAccessException occurred";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // IllegalAccessException occurred is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      String string0 = "2?%>L";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 2?%>L is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      String string0 = ":rqXwvh0H(L&h,/F";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // :rqXwvh0H(L&h,/F is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      String string0 = "D";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // D is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      String string0 = "0.l";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0.l is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      String string0 = "3E1";
      Float float0 = (Float)NumberUtils.createNumber(string0);
      assertEquals(30.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      String string0 = "-xgll";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -xgll is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      String string0 = "org.apache.c-mmn<ang3.math.NuberUtil";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // org.apache.c-mmn<ang3.math.NuberUtil is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      String string0 = "orgapachecommons.lang3.math.NumberUtis";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // orgapachecommons.lang3.math.NumberUtis is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      String string0 = "&/E";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // &/E is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      String string0 = "-0Xorg.apache.commons.lang3.math.NumberUtils";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-org.apache.commons.lang3.math.NumberUtils\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      String string0 = "0XIllgalAccesException occurred";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"IllgalAccesException occurred\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      String string0 = "0xThe Array must not b null";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"The Array must not b null\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      String string0 = "--Wi\"";
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      String string0 = "";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // A blank string is not a valid number
         //
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      String string0 = null;
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      String string0 = "...";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      String string0 = null;
      short short0 = NumberUtils.toShort(string0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      String string0 = null;
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      String string0 = null;
      double double0 = NumberUtils.toDouble(string0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      String string0 = "3E1";
      float float0 = 3164.032F;
      float float1 = NumberUtils.toFloat(string0, float0);
      assertFalse(float1 == float0);
      assertFalse(float0 == float1);
      assertEquals(30.0F, float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      String string0 = null;
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
      
      long long0 = NumberUtils.toLong(string0, (long) int0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      short short0 = (short)1872;
      String string0 = "-0x";
      int int0 = NumberUtils.toInt(string0, (int) short0);
      assertEquals(1872, int0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      String string0 = " ";
      double double0 = NumberUtils.toDouble(string0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      float float0 = (-772.3F);
      float float1 = NumberUtils.max(float0, float0, float0);
      assertTrue(float0 == float1);
      assertTrue(float1 == float0);
      assertEquals((-772.3F), float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      String string0 = "...";
      long long0 = NumberUtils.toLong(string0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte) (-32);
      float float0 = NumberUtils.min((float) byte0, (float) byte0, (float) byteArray0[1]);
      assertEquals((-32.0F), float0, 0.01F);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      String string0 = "SecurityException occurred";
      double double0 = 30.1848129752;
      double double1 = NumberUtils.toDouble(string0, double0);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
      assertEquals(30.1848129752, double1, 0.01D);
      
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
      
      double double2 = NumberUtils.min((double) byte0, (double) byte0, double1);
      assertFalse(double0 == double2);
      assertTrue(double0 == double1);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertTrue(double1 == double0);
      assertFalse(double1 == double2);
      assertEquals(0.0, double2, 0.01D);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      assertNotNull(numberUtils0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      double double0 = (-1089.651921481624);
      double double1 = NumberUtils.max(double0, double0, double0);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      assertEquals((-1089.651921481624), double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      String string0 = null;
      float float0 = NumberUtils.toFloat(string0);
      assertEquals(0.0F, float0, 0.01F);
  }
}
