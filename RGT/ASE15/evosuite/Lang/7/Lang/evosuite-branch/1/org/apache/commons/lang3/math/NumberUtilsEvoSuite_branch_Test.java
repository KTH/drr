/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:33:05 GMT 2014
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
      String string0 = "7L";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      String string0 = "L";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      String string0 = "0e";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      String string0 = "3";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      String string0 = ".";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      String string0 = "--org.apache.commons.lang3.StringUtils";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      String string0 = "+AI";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      String string0 = "E=0lVv54XYY1U hV*;M";
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
      String string0 = ".0PK~";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      String string0 = "0eK";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      String string0 = "0x0D";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      String string0 = "0xg^P\"u0ge%s";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      String string0 = "0x-0xZTl!Io1dlzg;eg:y+h:";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      String string0 = "-0x";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      String string0 = "-0x1f";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      String string0 = "1f";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      String string0 = "0D";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      String string0 = null;
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      String string0 = "-";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      String string0 = "3";
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      String string0 = null;
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      byte byte0 = (byte)32;
      byte byte1 = (byte)88;
      byte byte2 = NumberUtils.max(byte0, byte0, byte1);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
      assertEquals((byte)88, byte2);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      byte byte0 = (byte)7;
      byte byte1 = (byte)44;
      byte byte2 = NumberUtils.max(byte0, byte1, byte0);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertEquals((byte)44, byte2);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      short short0 = (short)0;
      short short1 = (short)108;
      short short2 = NumberUtils.max(short0, short0, short1);
      assertTrue(short2 == short1);
      assertFalse(short2 == short0);
      assertTrue(short1 == short2);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
      assertFalse(short0 == short2);
      assertEquals((short)108, short2);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      short short0 = (short)0;
      short short1 = (short)2;
      short short2 = NumberUtils.max(short0, short1, short1);
      assertFalse(short1 == short0);
      assertTrue(short1 == short2);
      assertTrue(short2 == short1);
      assertFalse(short2 == short0);
      assertFalse(short0 == short1);
      assertFalse(short0 == short2);
      assertEquals((short)2, short2);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      byte byte0 = (byte)0;
      byte byte1 = (byte)7;
      String string0 = null;
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
      
      int int1 = NumberUtils.max((int) byte0, int0, (int) byte1);
      assertFalse(int0 == int1);
      assertFalse(byte1 == byte0);
      assertFalse(int1 == int0);
      assertFalse(byte0 == byte1);
      assertEquals(7, int1);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      byte byte0 = (byte) (-23);
      String string0 = null;
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
      
      int int1 = NumberUtils.max((int) byte0, int0, (int) byte0);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      String string0 = "0XN";
      short short0 = NumberUtils.toShort(string0);
      assertEquals((short)0, short0);
      
      long long0 = (-2724L);
      long long1 = NumberUtils.max(long0, long0, (long) short0);
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
      assertEquals(0L, long1);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      short short0 = (short)1;
      long long0 = 1573L;
      long long1 = NumberUtils.max((long) short0, long0, (long) short0);
      assertTrue(long1 == long0);
      assertTrue(long0 == long1);
      assertEquals(1573L, long1);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      byte byte0 = (byte)78;
      byte byte1 = (byte)69;
      byte byte2 = NumberUtils.min(byte0, byte0, byte1);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertEquals((byte)69, byte2);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      byte byte0 = (byte)89;
      byte byte1 = (byte)54;
      byte byte2 = NumberUtils.min(byte0, byte1, byte0);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertEquals((byte)54, byte2);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      byte byte0 = (byte)32;
      byte byte1 = (byte)0;
      short short0 = NumberUtils.min((short) byte0, (short) byte0, (short) byte1);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      String string0 = "-0x-0xZTl!Io1dlzg;eg:y+h:";
      byte byte0 = (byte) (-121);
      byte byte1 = NumberUtils.toByte(string0, byte0);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
      assertEquals((byte) (-121), byte1);
      
      short short0 = (short)5;
      short short1 = NumberUtils.min(short0, (short) byte1, short0);
      assertFalse(short1 == short0);
      assertTrue(byte1 == byte0);
      assertFalse(short0 == short1);
      assertTrue(byte0 == byte1);
      assertEquals((short) (-121), short1);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      String string0 = "";
      int int0 = 479;
      byte byte0 = (byte) (-55);
      byte byte1 = NumberUtils.toByte(string0, byte0);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
      assertEquals((byte) (-55), byte1);
      
      int int1 = 3623;
      int int2 = NumberUtils.min(int1, int0, (int) byte1);
      assertFalse(int1 == int0);
      assertFalse(int1 == int2);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
      assertEquals((-55), int2);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      int int0 = 0;
      byte byte0 = (byte)32;
      int int1 = NumberUtils.min(int0, (int) byte0, int0);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      byte byte0 = (byte)89;
      long long0 = 0L;
      long long1 = NumberUtils.min((long) byte0, (long) byte0, long0);
      assertTrue(long1 == long0);
      assertTrue(long0 == long1);
      assertEquals(0L, long1);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      String string0 = null;
      long long0 = NumberUtils.toLong(string0);
      assertEquals(0L, long0);
      
      short short0 = (short)981;
      long long1 = NumberUtils.min((long) short0, long0, long0);
      assertTrue(long1 == long0);
      assertTrue(long0 == long1);
      assertEquals(0L, long1);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      short short0 = (short)616;
      float[] floatArray0 = new float[7];
      floatArray0[5] = (float) short0;
      float float0 = NumberUtils.max(floatArray0);
      assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 616.0F, 0.0F}, floatArray0, 0.01F);
      assertEquals(616.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      float[] floatArray0 = new float[9];
      float float0 = Float.NaN;
      floatArray0[1] = float0;
      float float1 = NumberUtils.max(floatArray0);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, Float.NaN, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
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
  public void test041()  throws Throwable  {
      String string0 = "%16G3B6jcU rd%vfi";
      byte byte0 = (byte)88;
      byte byte1 = NumberUtils.toByte(string0, byte0);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
      assertEquals((byte)88, byte1);
      
      double[] doubleArray0 = new double[6];
      doubleArray0[3] = (double) byte1;
      double double0 = NumberUtils.max(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 88.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(88.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double double0 = Double.NaN;
      doubleArray0[7] = double0;
      double double1 = NumberUtils.max(doubleArray0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.NaN, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
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
  public void test044()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)7;
      byteArray0[4] = byte0;
      byte byte1 = NumberUtils.max(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)7}, byteArray0);
      assertTrue(byte1 == byte0);
      assertEquals((byte)7, byte1);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      short[] shortArray0 = new short[5];
      short short0 = (short)981;
      shortArray0[1] = short0;
      short short1 = NumberUtils.max(shortArray0);
      assertArrayEquals(new short[] {(short)0, (short)981, (short)0, (short)0, (short)0}, shortArray0);
      assertTrue(short1 == short0);
      assertEquals((short)981, short1);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      byte byte0 = (byte)78;
      byte byte1 = NumberUtils.min(byte0, byte0, byte0);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
      assertEquals((byte)78, byte1);
      
      int[] intArray0 = new int[9];
      intArray0[6] = (int) byte1;
      int int0 = NumberUtils.max(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 78, 0, 0}, intArray0);
      assertEquals(78, int0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
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
  public void test048()  throws Throwable  {
      long[] longArray0 = new long[3];
      long long0 = 615L;
      longArray0[1] = long0;
      long long1 = NumberUtils.max(longArray0);
      assertArrayEquals(new long[] {0L, 615L, 0L}, longArray0);
      assertTrue(long1 == long0);
      assertEquals(615L, long1);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
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
  public void test050()  throws Throwable  {
      float[] floatArray0 = new float[7];
      float float0 = 1.0F;
      floatArray0[0] = float0;
      float float1 = NumberUtils.min(floatArray0);
      assertArrayEquals(new float[] {1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      assertFalse(float1 == float0);
      assertEquals(0.0F, float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      float[] floatArray0 = new float[3];
      float float0 = Float.NaN;
      floatArray0[2] = float0;
      float float1 = NumberUtils.min(floatArray0);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, 0.0F, Float.NaN}, floatArray0, 0.01F);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      float[] floatArray0 = null;
      // Undeclared exception!
      try {
        float float0 = NumberUtils.min(floatArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double double0 = (-15.364165681130514);
      doubleArray0[4] = double0;
      double double1 = NumberUtils.min(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, (-15.364165681130514), 0.0}, doubleArray0, 0.01);
      assertTrue(double1 == double0);
      assertEquals((-15.364165681130514), double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      double[] doubleArray0 = new double[13];
      double double0 = Double.NaN;
      doubleArray0[2] = double0;
      double double1 = NumberUtils.min(doubleArray0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
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
  public void test056()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)18;
      byteArray0[0] = byte0;
      byte byte1 = NumberUtils.min(byteArray0);
      assertArrayEquals(new byte[] {(byte)18, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertFalse(byte1 == byte0);
      assertEquals((byte)0, byte1);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      byte[] byteArray0 = null;
      // Undeclared exception!
      try {
        byte byte0 = NumberUtils.min(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      short[] shortArray0 = new short[7];
      short short0 = (short) (-310);
      shortArray0[2] = short0;
      short short1 = NumberUtils.min(shortArray0);
      assertArrayEquals(new short[] {(short)0, (short)0, (short) (-310), (short)0, (short)0, (short)0, (short)0}, shortArray0);
      assertTrue(short1 == short0);
      assertEquals((short) (-310), short1);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
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
  public void test060()  throws Throwable  {
      int[] intArray0 = new int[6];
      int int0 = 2943;
      intArray0[0] = int0;
      int int1 = NumberUtils.min(intArray0);
      assertArrayEquals(new int[] {2943, 0, 0, 0, 0, 0}, intArray0);
      assertFalse(int1 == int0);
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
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
  public void test062()  throws Throwable  {
      long[] longArray0 = new long[9];
      long long0 = 576L;
      longArray0[0] = long0;
      long long1 = NumberUtils.min(longArray0);
      assertArrayEquals(new long[] {576L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L}, longArray0);
      assertFalse(long1 == long0);
      assertEquals(0L, long1);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
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
  public void test064()  throws Throwable  {
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
  public void test065()  throws Throwable  {
      String string0 = null;
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal(string0);
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      String string0 = null;
      BigInteger bigInteger0 = NumberUtils.createBigInteger(string0);
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      String string0 = null;
      Long long0 = NumberUtils.createLong(string0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      String string0 = null;
      Integer integer0 = NumberUtils.createInteger(string0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      String string0 = null;
      Double double0 = NumberUtils.createDouble(string0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      String string0 = null;
      Float float0 = NumberUtils.createFloat(string0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      String string0 = "K[p/X6Tc\"6bR#kMM2";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"K[p/X6Tc\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      String string0 = "The Array must not be null";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // The Array must not be null is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      String string0 = "1f";
      Float float0 = (Float)NumberUtils.createNumber(string0);
      assertEquals(1.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      String string0 = "0pVU?d";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0pVU?d is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      String string0 = "/`2{~V^iVJgwC\"L";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // /`2{~V^iVJgwC\"L is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      String string0 = "0F";
      BigDecimal bigDecimal0 = (BigDecimal)NumberUtils.createNumber(string0);
      assertNotNull(bigDecimal0);
      assertEquals(0, bigDecimal0.shortValue());
      assertEquals(0, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      String string0 = "0D";
      BigDecimal bigDecimal0 = (BigDecimal)NumberUtils.createNumber(string0);
      assertNotNull(bigDecimal0);
      assertEquals(0, bigDecimal0.shortValue());
      assertEquals(0, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      String string0 = "0eK~";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0eK~ is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      String string0 = "XTKah3E";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // XTKah3E is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      String string0 = "Wx4.";
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
  public void test081()  throws Throwable  {
      String string0 = "Fm+7>&Rqg\"E_Qteh')I";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Fm+7>&Rqg\"E_Qteh')I is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      String string0 = "Minimum abbreviation width is 4";
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
  public void test083()  throws Throwable  {
      String string0 = ".P^+V>gEM?]<jQeXB";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // .P^+V>gEM?]<jQeXB is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      String string0 = " is not a valid number.";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         //  is not a valid number. is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      String string0 = "[vZc:.nUq*oy&cFffl";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // [vZc:.nUq*oy&cFffl is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      String string0 = ".0eK~";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // .0eK~ is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      String string0 = "-0X";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      String string0 = "0XNAdfYzD";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"NAdfYzD\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      String string0 = "-0xZZ3";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-ZZ3\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      String string0 = "0x";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test091() {}
//   @Test(timeout = 4000)
//   public void test091()  throws Throwable  {
//       String string0 = "--0pVn?d";
//       Number number0 = NumberUtils.createNumber(string0);
//       assertNull(number0);
//   }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
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
  public void test093()  throws Throwable  {
      String string0 = null;
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      String string0 = null;
      short short0 = NumberUtils.toShort(string0, (short) byteArray0[1]);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      String string0 = ",";
      double double0 = NumberUtils.toDouble(string0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      String string0 = null;
      float float0 = NumberUtils.toFloat(string0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      String string0 = "";
      int int0 = 479;
      long long0 = NumberUtils.toLong(string0, (long) int0);
      assertEquals(479L, long0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      String string0 = null;
      double double0 = NumberUtils.toDouble(string0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      short short0 = (short)5;
      byte byte0 = (byte) (-106);
      float float0 = NumberUtils.max((float) short0, (float) byte0, (float) byte0);
      assertEquals(5.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      String string0 = null;
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      int int0 = 0;
      byte byte0 = (byte)32;
      byte byte1 = NumberUtils.max(byte0, byte0, byte0);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
      assertEquals((byte)32, byte1);
      
      float float0 = NumberUtils.min((float) byte0, (float) int0, (float) byte1);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)18;
      double double0 = NumberUtils.min((double) byteArray0[0], (double) byteArray0[0], (double) byte0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      assertNotNull(numberUtils0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      double double0 = 0.0;
      double double1 = NumberUtils.max(double0, double0, double0);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      assertEquals(0.0, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      String string0 = "1f";
      float float0 = NumberUtils.toFloat(string0);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      String string0 = "-";
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
  }
}
