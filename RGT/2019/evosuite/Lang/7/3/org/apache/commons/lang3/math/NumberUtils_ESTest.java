/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 03 14:28:44 GMT 2019
 */

package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.math.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class NumberUtils_ESTest {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      float float0 = NumberUtils.max(1418.0145F, 0.0F, 1050.1196F);
      assertEquals(1418.0145F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      float float0 = NumberUtils.min((float) 155, 0.0F, (float) 0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      double double0 = NumberUtils.toDouble("Owx?r'~jWV;8#jUKPY");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      double double0 = NumberUtils.min(1.0, (double) (short)2144, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      short[] shortArray0 = new short[6];
      shortArray0[0] = (short) numberUtils0.SHORT_ONE;
      short short0 = NumberUtils.min(shortArray0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      byte byte0 = NumberUtils.toByte("");
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      double double0 = NumberUtils.max(0.0, (-1888.16653), 121.3);
      assertEquals(121.3, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      long long0 = NumberUtils.toLong("k;mjEB}6>9CHx9!4O");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      int int0 = NumberUtils.toInt("N1#L(Qvp1");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      float float0 = NumberUtils.toFloat("0x");
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      short short0 = NumberUtils.toShort("");
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      int int0 = NumberUtils.toInt((String) null, 2363);
      assertEquals(2363, int0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      long long0 = NumberUtils.toLong((String) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      float float0 = NumberUtils.toFloat((String) null, 1927.0167F);
      assertEquals(1927.0167F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      double double0 = NumberUtils.toDouble((String) null, (-15.876999855041504));
      assertEquals((-15.876999855041504), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      byte byte0 = NumberUtils.toByte((String) null);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      short short0 = NumberUtils.toShort((String) null);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Number number0 = NumberUtils.createNumber((String) null);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      try { 
        NumberUtils.createNumber("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // A blank string is not a valid number
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0x(9V`$MA");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"(9V`$MA\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0X~0E&'M");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"~0E&'M\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("-0X39F");
      assertEquals((-927), number0);
      assertNotNull(number0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-0xX3*i.Z-tQ~Vg[+Q");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-X3*i.Z-tQ~Vg[+Q\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      try { 
        NumberUtils.createNumber("...");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      try { 
        NumberUtils.createNumber("9e.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 9e. is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      try { 
        NumberUtils.createNumber(":FX)PE. FBneX5&3 ");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // :FX)PE. FBneX5&3  is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      try { 
        NumberUtils.createNumber("2NUL");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 2NUL is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      try { 
        NumberUtils.createNumber(" k^:reeh9E2m");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         //  k^:reeh9E2m is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      try { 
        NumberUtils.createNumber("yHW3\"q`0-+QP^e3");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0.:-pSl<Et*;=V+6p");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0.:-pSl<Et*;=V+6p is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0.:-pSl*;=V+6p");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0.:-pSl*;=V+6p is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      try { 
        NumberUtils.createNumber("@D");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // @D is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("39F");
      assertEquals(39.0F, number0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      try { 
        NumberUtils.createNumber("14G6d");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 14G6d is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      try { 
        NumberUtils.createNumber("42!.!?Z2Ml~:f");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 42!.!?Z2Ml~:f is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      try { 
        NumberUtils.createNumber(",.~nyraCl");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // ,.~nyraCl is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      try { 
        NumberUtils.createNumber("The Array must not be null");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // The Array must not be null is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      try { 
        NumberUtils.createNumber("--al");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // --al is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("5l");
      assertEquals(5L, number0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("0F");
      assertEquals((short)0, number0.shortValue());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      try { 
        NumberUtils.createNumber("5a{,K93");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"5a{,K93\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("0.");
      assertEquals(0.0F, number0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("9.");
      assertEquals(9.0F, number0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Float float0 = NumberUtils.createFloat((String) null);
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Double double0 = NumberUtils.createDouble((String) null);
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger((String) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Long long0 = NumberUtils.createLong((String) null);
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger((String) null);
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal((String) null);
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createBigDecimal("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // A blank string is not a valid number
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createBigDecimal("--");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -- is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((long[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      long[] longArray0 = new long[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      long[] longArray0 = new long[4];
      longArray0[0] = (long) (short)1700;
      long long0 = NumberUtils.min(longArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((int[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 48;
      int int0 = NumberUtils.min(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      short[] shortArray0 = new short[6];
      short short0 = NumberUtils.min(shortArray0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((short[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      short[] shortArray0 = new short[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(shortArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-22);
      byte byte0 = NumberUtils.min(byteArray0);
      assertEquals((byte) (-22), byte0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[5] = Double.NaN;
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = (-77.688648072);
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals((-77.688648072), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((float[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      float[] floatArray0 = new float[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(floatArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      float[] floatArray0 = new float[9];
      floatArray0[8] = Float.NaN;
      float float0 = NumberUtils.min(floatArray0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      float[] floatArray0 = new float[9];
      floatArray0[8] = (-1.0F);
      float float0 = NumberUtils.min(floatArray0);
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((long[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      long[] longArray0 = new long[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      long[] longArray0 = new long[9];
      longArray0[1] = (long) (short)1;
      long long0 = NumberUtils.max(longArray0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      int[] intArray0 = new int[4];
      int int0 = NumberUtils.max(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((int[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-1444);
      int int0 = NumberUtils.max(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((short[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      short[] shortArray0 = new short[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(shortArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      short[] shortArray0 = new short[4];
      shortArray0[1] = (short)1284;
      short short0 = NumberUtils.max(shortArray0);
      assertEquals((short)1284, short0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-82);
      byte byte0 = NumberUtils.max(byteArray0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = Double.NaN;
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1.0);
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((float[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      float[] floatArray0 = new float[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(floatArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      float[] floatArray0 = new float[3];
      floatArray0[1] = Float.NaN;
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      float[] floatArray0 = new float[5];
      floatArray0[0] = (-940.8214F);
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      long long0 = NumberUtils.min(667L, (-2207L), 667L);
      assertEquals((-2207L), long0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      long long0 = NumberUtils.min(864L, 3463L, (-1L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      int int0 = NumberUtils.min(2156, (-2716), 2004);
      assertEquals((-2716), int0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      int int0 = NumberUtils.min(1, 97, (-2653));
      assertEquals((-2653), int0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      short short0 = NumberUtils.min((short) (-1), (short) (-1), (short) (-1));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      short short0 = NumberUtils.min((short)1876, (short)1663, (short)1876);
      assertEquals((short)1663, short0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      short short0 = NumberUtils.min((short)1168, (short)427, (short) (-1603));
      assertEquals((short) (-1603), short0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte)2, (byte)0, (byte)0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte)0, (byte)0, (byte) (-32));
      assertEquals((byte) (-32), byte0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      long long0 = NumberUtils.max((-1242L), 0L, (-1L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      long long0 = NumberUtils.max(1L, (long) (byte)0, 6704L);
      assertEquals(6704L, long0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      int int0 = NumberUtils.max((int) (short) (-2255), 0, (int) (short)100);
      assertEquals(100, int0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      int int0 = NumberUtils.max((int) (short)0, (int) (short)0, (int) (short)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      Short short0 = NumberUtils.SHORT_ZERO;
      short short1 = NumberUtils.max((short) short0, (short)0, (short)2140);
      assertEquals((short)2140, short1);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      short short0 = NumberUtils.max((short)0, (short)654, (short) (-2574));
      assertEquals((short)654, short0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte)0, (byte)126, (byte)0);
      assertEquals((byte)126, byte0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte) (-1), (byte) (-1), (byte)119);
      assertEquals((byte)119, byte0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("--0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("L");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0X=Pr*|`xE-du:/V");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x39F");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x0E&'M");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0xb]zkyyE`Q?=~EiHNX.");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x}#(`\ft");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("9e.");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("..");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("...");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("E|IxccDi[~AqX3");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("+m=e&");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-e");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("E");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("9.");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("79em");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("d");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("D");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("f");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("39F");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("5l");
      assertTrue(boolean0);
  }
}
