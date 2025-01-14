/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:46:22 GMT 2014
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
      String string0 = "l";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      String string0 = "F";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      String string0 = "L";
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
      String string0 = "0";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      String string0 = ",?+(k^";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      String string0 = "--...";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      String string0 = "e~hM+IhuUGw";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      String string0 = "...";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      String string0 = "0E'";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      String string0 = "0xdEw.]@";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      String string0 = "-0x...";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      String string0 = "-0x";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      String string0 = "0e";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      String string0 = "..";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      String string0 = "-";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      String string0 = null;
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      String string0 = "0x0";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      String string0 = "0";
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      String string0 = null;
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      byte[] byteArray0 = new byte[22];
      byte byte0 = (byte)115;
      byte byte1 = NumberUtils.max(byteArray0[3], byteArray0[3], byte0);
      assertEquals((byte)115, byte1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      byte byte0 = (byte) (-1);
      byte byte1 = (byte)0;
      byte byte2 = NumberUtils.max(byte0, byte1, byte0);
      assertEquals((byte)0, byte2);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      short[] shortArray0 = new short[8];
      short short0 = (short)38;
      shortArray0[7] = short0;
      int int0 = NumberUtils.max((int) shortArray0[5], (int) shortArray0[5], (int) shortArray0[7]);
      assertEquals(38, int0);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)38}, shortArray0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      int int0 = 0;
      int int1 = 69;
      int int2 = NumberUtils.max(int0, int1, int0);
      assertEquals(69, int2);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertTrue(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(int1 == int0);
      assertTrue(int1 == int2);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      short short0 = (short)1479;
      short short1 = (short)1;
      long long0 = NumberUtils.max((long) short1, (long) short1, (long) short0);
      assertEquals(1479L, long0);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      short short0 = (short)1479;
      long long0 = (-1421L);
      long long1 = NumberUtils.max(long0, (long) short0, (long) short0);
      assertEquals(1479L, long1);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      String string0 = "IllegalArgumentException occurred";
      byte byte0 = (byte) (-71);
      byte byte1 = NumberUtils.toByte(string0, byte0);
      assertEquals((byte) (-71), byte1);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
      
      byte byte2 = (byte)0;
      assertFalse(byte2 == byte1);
      
      byte byte3 = (byte) (-15);
      assertFalse(byte3 == byte1);
      
      byte byte4 = NumberUtils.min(byte2, byte3, byte1);
      assertEquals((byte) (-71), byte4);
      assertFalse(byte0 == byte2);
      assertTrue(byte0 == byte4);
      assertFalse(byte0 == byte3);
      assertTrue(byte0 == byte1);
      assertTrue(byte4 == byte0);
      assertTrue(byte4 == byte1);
      assertFalse(byte4 == byte3);
      assertFalse(byte4 == byte2);
      assertFalse(byte3 == byte4);
      assertFalse(byte3 == byte2);
      assertFalse(byte3 == byte1);
      assertFalse(byte3 == byte0);
      assertFalse(byte2 == byte4);
      assertFalse(byte2 == byte0);
      assertFalse(byte2 == byte3);
      assertFalse(byte2 == byte1);
      assertFalse(byte1 == byte3);
      assertTrue(byte1 == byte4);
      assertTrue(byte1 == byte0);
      assertFalse(byte1 == byte2);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      String string0 = "IllegalArgumentException occurred";
      byte byte0 = (byte) (-71);
      byte byte1 = NumberUtils.toByte(string0, byte0);
      assertEquals((byte) (-71), byte1);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
      
      byte byte2 = (byte)0;
      assertFalse(byte2 == byte1);
      
      byte byte3 = NumberUtils.min(byte2, byte0, byte1);
      assertEquals((byte) (-71), byte3);
      assertTrue(byte0 == byte3);
      assertTrue(byte0 == byte1);
      assertFalse(byte0 == byte2);
      assertFalse(byte1 == byte2);
      assertTrue(byte1 == byte0);
      assertTrue(byte1 == byte3);
      assertFalse(byte2 == byte1);
      assertFalse(byte2 == byte3);
      assertFalse(byte2 == byte0);
      assertTrue(byte3 == byte0);
      assertTrue(byte3 == byte1);
      assertFalse(byte3 == byte2);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      byte[] byteArray0 = new byte[22];
      byte byte0 = NumberUtils.min(byteArray0[4], byteArray0[4], byteArray0[4]);
      assertEquals((byte)0, byte0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      short short0 = (short) (-2123);
      short short1 = (short) (-2779);
      short short2 = NumberUtils.min(short0, short0, short1);
      assertEquals((short) (-2779), short2);
      assertTrue(short2 == short1);
      assertFalse(short2 == short0);
      assertTrue(short1 == short2);
      assertFalse(short1 == short0);
      assertFalse(short0 == short2);
      assertFalse(short0 == short1);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      short short0 = (short) (-2123);
      short short1 = (short)69;
      short short2 = NumberUtils.min(short1, short0, short0);
      assertEquals((short) (-2123), short2);
      assertFalse(short1 == short0);
      assertFalse(short1 == short2);
      assertFalse(short0 == short1);
      assertTrue(short0 == short2);
      assertFalse(short2 == short1);
      assertTrue(short2 == short0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      String string0 = "L";
      short short0 = (short) (-1902);
      short short1 = (short)64;
      short short2 = NumberUtils.max(short0, short1, short1);
      assertEquals((short)64, short2);
      assertTrue(short2 == short1);
      assertFalse(short2 == short0);
      assertFalse(short1 == short0);
      assertTrue(short1 == short2);
      assertFalse(short0 == short2);
      assertFalse(short0 == short1);
      
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
      
      int int1 = NumberUtils.min((int) short2, (int) short2, int0);
      assertEquals(0, int1);
      assertTrue(short2 == short1);
      assertFalse(short2 == short0);
      assertTrue(int1 == int0);
      assertFalse(short1 == short0);
      assertTrue(short1 == short2);
      assertTrue(int0 == int1);
      assertFalse(short0 == short2);
      assertFalse(short0 == short1);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      short short0 = (short) (-1902);
      short short1 = (short)1292;
      short short2 = NumberUtils.max(short0, short0, short1);
      assertEquals((short)1292, short2);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
      assertFalse(short1 == short0);
      assertTrue(short1 == short2);
      assertFalse(short0 == short1);
      assertFalse(short0 == short2);
      
      int int0 = NumberUtils.min((int) short2, (int) short0, (int) short2);
      assertEquals((-1902), int0);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
      assertFalse(short1 == short0);
      assertTrue(short1 == short2);
      assertFalse(short0 == short1);
      assertFalse(short0 == short2);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      long long0 = 693L;
      int int0 = 245;
      long long1 = NumberUtils.min(long0, long0, (long) int0);
      assertEquals(245L, long1);
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      long long0 = 81L;
      long long1 = 1L;
      long long2 = NumberUtils.min(long0, long1, long1);
      assertEquals(1L, long2);
      assertTrue(long2 == long1);
      assertFalse(long2 == long0);
      assertFalse(long0 == long2);
      assertFalse(long0 == long1);
      assertTrue(long1 == long2);
      assertFalse(long1 == long0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      long long0 = 693L;
      float[] floatArray0 = new float[10];
      floatArray0[4] = (float) long0;
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(693.0F, float0, 0.01F);
      assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, 693.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      float[] floatArray0 = new float[19];
      float float0 = Float.NaN;
      floatArray0[1] = float0;
      float float1 = NumberUtils.max(floatArray0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, Float.NaN, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      //  // Unstable assertion: assertTrue(float1 == float0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
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
  public void test038()  throws Throwable  {
      long long0 = 81L;
      long long1 = NumberUtils.min(long0, long0, long0);
      assertEquals(81L, long1);
      assertTrue(long0 == long1);
      assertTrue(long1 == long0);
      
      double[] doubleArray0 = new double[15];
      doubleArray0[1] = (double) long1;
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(81.0, double0, 0.01D);
      assertArrayEquals(new double[] {0.0, 81.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      float float0 = Float.NaN;
      double[] doubleArray0 = new double[8];
      doubleArray0[6] = (double) float0;
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.NaN, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
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
  public void test041()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte)120;
      byteArray0[1] = byte0;
      byte byte1 = NumberUtils.max(byteArray0);
      assertEquals((byte)120, byte1);
      assertArrayEquals(new byte[] {(byte)0, (byte)120, (byte)0}, byteArray0);
      assertTrue(byte1 == byte0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      byte[] byteArray0 = null;
      // Undeclared exception!
      try {
        byte byte0 = NumberUtils.max(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      short[] shortArray0 = new short[8];
      short short0 = (short)38;
      shortArray0[7] = short0;
      short short1 = NumberUtils.max(shortArray0);
      assertEquals((short)38, short1);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)38}, shortArray0);
      assertTrue(short1 == short0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
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
  public void test045()  throws Throwable  {
      int int0 = 1149;
      int[] intArray0 = new int[6];
      intArray0[4] = int0;
      int int1 = NumberUtils.max(intArray0);
      assertEquals(1149, int1);
      assertArrayEquals(new int[] {0, 0, 0, 0, 1149, 0}, intArray0);
      assertTrue(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      int[] intArray0 = null;
      // Undeclared exception!
      try {
        int int0 = NumberUtils.max(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      long[] longArray0 = new long[10];
      long long0 = (-4190L);
      longArray0[0] = long0;
      long long1 = NumberUtils.max(longArray0);
      assertEquals(0L, long1);
      assertArrayEquals(new long[] {(-4190L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L}, longArray0);
      assertFalse(long1 == long0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
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
  public void test049()  throws Throwable  {
      float[] floatArray0 = new float[4];
      float float0 = 1.0F;
      floatArray0[0] = float0;
      float float1 = NumberUtils.min(floatArray0);
      assertEquals(0.0F, float1, 0.01F);
      assertArrayEquals(new float[] {1.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      assertFalse(float1 == float0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      float[] floatArray0 = new float[4];
      float float0 = Float.NaN;
      floatArray0[3] = float0;
      float float1 = NumberUtils.min(floatArray0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, Float.NaN}, floatArray0, 0.01F);
      //  // Unstable assertion: assertTrue(float1 == float0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      double[] doubleArray0 = new double[15];
      double double0 = (-1609.5576222);
      doubleArray0[3] = double0;
      double double1 = NumberUtils.min(doubleArray0);
      assertEquals((-1609.5576222), double1, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, (-1609.5576222), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertTrue(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      double double0 = Double.NaN;
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = double0;
      double double1 = NumberUtils.min(doubleArray0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, Double.NaN}, doubleArray0, 0.01);
      //  // Unstable assertion: assertTrue(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      byte[] byteArray0 = new byte[22];
      byte byte0 = (byte) (-3);
      byteArray0[1] = byte0;
      byte byte1 = NumberUtils.min(byteArray0);
      assertEquals((byte) (-3), byte1);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-3), (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertTrue(byte1 == byte0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      short[] shortArray0 = new short[24];
      short short0 = (short) (-3705);
      shortArray0[1] = short0;
      short short1 = NumberUtils.min(shortArray0);
      assertEquals((short) (-3705), short1);
      assertArrayEquals(new short[] {(short)0, (short) (-3705), (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0}, shortArray0);
      assertTrue(short1 == short0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      short[] shortArray0 = null;
      // Undeclared exception!
      try {
        short short0 = NumberUtils.min(shortArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      int[] intArray0 = new int[7];
      int int0 = 5411;
      intArray0[0] = int0;
      int int1 = NumberUtils.min(intArray0);
      assertEquals(0, int1);
      assertArrayEquals(new int[] {5411, 0, 0, 0, 0, 0, 0}, intArray0);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      int[] intArray0 = null;
      // Undeclared exception!
      try {
        int int0 = NumberUtils.min(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      long[] longArray0 = new long[7];
      long long0 = 1790L;
      longArray0[0] = long0;
      long long1 = NumberUtils.min(longArray0);
      assertEquals(0L, long1);
      assertArrayEquals(new long[] {1790L, 0L, 0L, 0L, 0L, 0L, 0L}, longArray0);
      assertFalse(long1 == long0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
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
  public void test060()  throws Throwable  {
      String string0 = "";
      // Undeclared exception!
      try {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // A blank string is not a valid number
         //
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      String string0 = null;
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal(string0);
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      String string0 = null;
      BigInteger bigInteger0 = NumberUtils.createBigInteger(string0);
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      String string0 = null;
      Long long0 = NumberUtils.createLong(string0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      String string0 = null;
      Integer integer0 = NumberUtils.createInteger(string0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      String string0 = null;
      Double double0 = NumberUtils.createDouble(string0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      String string0 = null;
      Float float0 = NumberUtils.createFloat(string0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      String string0 = "\\Y/wz0m=M&pvpqp356";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\\Y/wz0m=M\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      String string0 = "0E't3";
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
  public void test069()  throws Throwable  {
      String string0 = "-IzUQ'HLwQ#ysTL";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -IzUQ'HLwQ#ysTL is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      String string0 = "Strings must not be null";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Strings must not be null is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      String string0 = "IzUQ'HLwQ#vsTL";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // IzUQ'HLwQ#vsTL is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      String string0 = "n\"#:F";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // n\"#:F is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      String string0 = "taA6:}[l@Oa2(wgZ{D";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // taA6:}[l@Oa2(wgZ{D is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      String string0 = "0E";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0E is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      String string0 = "0E,tp";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0E,tp is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      String string0 = ".5";
      Float float0 = (Float)NumberUtils.createNumber(string0);
      assertEquals(0.5F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      String string0 = ">eKxE";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // >eKxE is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      String string0 = "9\"2DV|Xmtx^bjvw1d";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 9\"2DV|Xmtx^bjvw1d is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      String string0 = "javW.text.Noralize is not avilCbl";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // javW.text.Noralize is not avilCbl is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      String string0 = "=zs8Q peuuWk.*";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // =zs8Q peuuWk.* is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      String string0 = ".";
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
  public void test082()  throws Throwable  {
      String string0 = "18|*]D(@.Ee(g$;@-";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 18|*]D(@.Ee(g$;@- is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      String string0 = "-0X\\Y/wz0m=M&pvpqp3^6";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-\\Y/wz0m=M&pvpqp3^6\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      String string0 = "0X is not a valid number.";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \" is not a valid number.\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      String string0 = "-0x...";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-...\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      String string0 = "lNe_Of";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // lNe_Of is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test087() {}
//   @Test(timeout = 4000)
//   public void test087()  throws Throwable  {
//       String string0 = "--0X0X is not a valid number.";
//       Number number0 = NumberUtils.createNumber(string0);
//       assertNull(number0);
//   }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
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
  public void test089()  throws Throwable  {
      String string0 = null;
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      String string0 = "0x0";
      Integer integer0 = (Integer)NumberUtils.createNumber(string0);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      String string0 = null;
      short short0 = (short)444;
      short short1 = NumberUtils.toShort(string0, short0);
      assertEquals((short)444, short1);
      assertTrue(short1 == short0);
      assertTrue(short0 == short1);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      String string0 = null;
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      float float0 = 1021.0F;
      String string0 = null;
      double double0 = NumberUtils.toDouble(string0, (double) float0);
      assertEquals(1021.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      short[] shortArray0 = new short[24];
      String string0 = null;
      float float0 = NumberUtils.toFloat(string0, (float) shortArray0[5]);
      assertEquals(0.0F, float0, 0.01F);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0}, shortArray0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      short short0 = (short)1479;
      String string0 = null;
      long long0 = NumberUtils.max((long) short0, (long) short0, (long) short0);
      assertEquals(1479L, long0);
      
      long long1 = NumberUtils.toLong(string0, long0);
      assertEquals(1479L, long1);
      assertTrue(long0 == long1);
      assertTrue(long1 == long0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      String string0 = null;
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      String string0 = "0x0";
      double double0 = NumberUtils.toDouble(string0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      byte[] byteArray0 = new byte[22];
      float float0 = NumberUtils.max((float) byteArray0[5], (float) byteArray0[5], (float) byteArray0[5]);
      assertEquals(0.0F, float0, 0.01F);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      String string0 = "..";
      long long0 = NumberUtils.toLong(string0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      float float0 = 1.0F;
      short short0 = (short)444;
      float float1 = NumberUtils.min(float0, (float) short0, float0);
      assertEquals(1.0F, float1, 0.01F);
      assertTrue(float0 == float1);
      assertTrue(float1 == float0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      long[] longArray0 = new long[7];
      double double0 = NumberUtils.min((double) longArray0[0], (double) longArray0[0], (double) longArray0[0]);
      assertEquals(0.0, double0, 0.01D);
      assertArrayEquals(new long[] {0L, 0L, 0L, 0L, 0L, 0L, 0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      assertNotNull(numberUtils0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      String string0 = "-0x";
      short short0 = NumberUtils.toShort(string0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      long long0 = 1L;
      byte byte0 = (byte) (-1);
      double double0 = NumberUtils.max((double) long0, (double) byte0, (double) long0);
      assertEquals(1.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      String string0 = "--...";
      float float0 = NumberUtils.toFloat(string0);
      assertEquals(0.0F, float0, 0.01F);
  }
}
