/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:07:25 GMT 2014
 */

package org.apache.commons.math.stat;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.stat.Frequency;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class FrequencyEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      int int0 = 74;
      Frequency frequency1 = new Frequency();
      assertNotSame(frequency1, frequency0);
      assertTrue(frequency1.equals((Object)frequency0));
      assertNotNull(frequency1);
      
      frequency1.addValue((Comparable<?>) int0);
      assertNotSame(frequency1, frequency0);
      assertFalse(frequency1.equals((Object)frequency0));
      
      boolean boolean0 = frequency1.equals((Object) frequency0);
      assertNotSame(frequency0, frequency1);
      assertNotSame(frequency1, frequency0);
      assertFalse(frequency0.equals((Object)frequency1));
      assertFalse(frequency1.equals((Object)frequency0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      int int0 = 1354;
      Integer integer0 = new Integer(int0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals(1354, (int)integer0);
      
      boolean boolean0 = frequency0.equals((Object) integer0);
      assertTrue(integer0.equals((Object)int0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      Frequency frequency1 = new Frequency();
      assertNotSame(frequency1, frequency0);
      assertTrue(frequency1.equals((Object)frequency0));
      assertNotNull(frequency1);
      
      boolean boolean0 = frequency1.equals((Object) frequency0);
      assertNotSame(frequency1, frequency0);
      assertNotSame(frequency0, frequency1);
      assertTrue(frequency1.equals((Object)frequency0));
      assertTrue(frequency0.equals((Object)frequency1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      String string0 = null;
      boolean boolean0 = frequency0.equals((Object) string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      int int0 = frequency0.hashCode();
      assertEquals(31, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      int int0 = (-3437);
      int int1 = 695;
      Integer integer0 = new Integer(int1);
      assertTrue(integer0.equals((Object)int1));
      assertFalse(integer0.equals((Object)int0));
      assertFalse(int1 == int0);
      assertEquals(695, (int)integer0);
      
      frequency0.addValue((Object) integer0);
      assertTrue(integer0.equals((Object)int1));
      assertFalse(integer0.equals((Object)int0));
      assertFalse(int1 == int0);
      
      Integer integer1 = new Integer(int0);
      assertNotSame(integer1, integer0);
      assertFalse(int0 == int1);
      assertFalse(integer1.equals((Object)int1));
      assertTrue(integer1.equals((Object)int0));
      assertFalse(integer1.equals((Object)integer0));
      assertEquals((-3437), (int)integer1);
      
      double double0 = frequency0.getCumPct((Object) integer1);
      assertNotSame(integer1, integer0);
      assertFalse(int0 == int1);
      assertFalse(integer1.equals((Object)int1));
      assertTrue(integer1.equals((Object)int0));
      assertFalse(integer1.equals((Object)integer0));
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      int int0 = 1354;
      Integer integer0 = new Integer(int0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals(1354, (int)integer0);
      
      frequency0.addValue(integer0);
      assertTrue(integer0.equals((Object)int0));
      
      frequency0.addValue(integer0);
      assertTrue(integer0.equals((Object)int0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      // Undeclared exception!
      try {
        frequency0.addValue((Object) frequency0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class (org.apache.commons.math.stat.Frequency) does not implement Comparable
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      int int0 = 74;
      frequency0.addValue((Comparable<?>) int0);
      String string0 = frequency0.toString();
      assertNotNull(string0);
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n74\t1\t100%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      int int0 = (-3437);
      int int1 = 695;
      Integer integer0 = new Integer(int1);
      assertFalse(int1 == int0);
      assertFalse(integer0.equals((Object)int0));
      assertTrue(integer0.equals((Object)int1));
      assertEquals(695, (int)integer0);
      
      frequency0.addValue((Object) integer0);
      assertFalse(int1 == int0);
      assertFalse(integer0.equals((Object)int0));
      assertTrue(integer0.equals((Object)int1));
      
      int int2 = 169;
      Integer integer1 = new Integer(int2);
      assertNotSame(integer1, integer0);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(integer1.equals((Object)integer0));
      assertFalse(integer1.equals((Object)int1));
      assertFalse(integer1.equals((Object)int0));
      assertTrue(integer1.equals((Object)int2));
      assertEquals(169, (int)integer1);
      
      frequency0.addValue(int0);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      
      long long0 = frequency0.getCumFreq((Object) integer1);
      assertNotSame(integer1, integer0);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(integer1.equals((Object)integer0));
      assertFalse(integer1.equals((Object)int1));
      assertFalse(integer1.equals((Object)int0));
      assertTrue(integer1.equals((Object)int2));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      int int0 = 74;
      double double0 = frequency0.getPct(int0);
      assertEquals(Double.NaN, double0, 0.01D);
      
      long long0 = frequency0.getCount((Object) double0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      long long0 = 744L;
      frequency0.addValue(long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      char char0 = 'U';
      long long0 = frequency0.getCumFreq(char0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      char char0 = 'U';
      frequency0.addValue(char0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      int int0 = (-3437);
      Integer integer0 = new Integer(int0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals((-3437), (int)integer0);
      
      long long0 = frequency0.getCumFreq((int) integer0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      int int0 = (-3437);
      double double0 = frequency0.getCumPct(int0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      char char0 = ';';
      double double0 = frequency0.getPct(char0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      char char0 = '6';
      double double0 = frequency0.getCumPct(char0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      char char0 = 'U';
      long long0 = frequency0.getCount(char0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      int int0 = 1354;
      Integer integer0 = new Integer(int0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals(1354, (int)integer0);
      
      double double0 = frequency0.getPct((Object) integer0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      long long0 = 744L;
      double double0 = frequency0.getPct(long0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      int int0 = (-3437);
      long long0 = frequency0.getCount((Comparable<?>) int0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      char char0 = ';';
      long long0 = frequency0.getCount((int) char0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      char char0 = '6';
      double double0 = frequency0.getCumPct((long) char0);
      assertEquals(Double.NaN, double0, 0.01D);
  }
}
