/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 02 02:06:36 GMT 2019
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Month;
import org.jfree.data.time.Second;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYSeries;
import org.junit.runner.RunWith;


public class XYSeries_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hour hour0 = new Hour();
      XYSeries xYSeries0 = new XYSeries(hour0, true, true);
      xYSeries0.add((double) 23, (double) 0);
      xYSeries0.addOrUpdate((Number) 23, (Number) 23);
      assertEquals(2, xYSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockDate mockDate0 = new MockDate(999L);
      Month month0 = new Month(mockDate0);
      XYSeries xYSeries0 = new XYSeries(month0, false, false);
      int int0 = xYSeries0.getMaximumItemCount();
      assertFalse(xYSeries0.getAllowDuplicateXValues());
      assertEquals(Integer.MAX_VALUE, int0);
      assertFalse(xYSeries0.getAutoSort());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Second second0 = new Second();
      XYSeries xYSeries0 = new XYSeries(second0, false, false);
      xYSeries0.getItems();
      assertFalse(xYSeries0.getAllowDuplicateXValues());
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
      assertFalse(xYSeries0.getAutoSort());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hour hour0 = new Hour();
      XYSeries xYSeries0 = new XYSeries(hour0, true, true);
      // Undeclared exception!
      try { 
        xYSeries0.updateByIndex(0, 23);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hour hour0 = new Hour();
      XYSeries xYSeries0 = new XYSeries(hour0, true);
      XYDataItem xYDataItem0 = new XYDataItem((Number) 0, (Number) 0);
      xYSeries0.add(xYDataItem0);
      assertEquals(1, xYSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      XYSeries xYSeries0 = new XYSeries(millisecond0);
      // Undeclared exception!
      try { 
        xYSeries0.remove((Number) 999);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hour hour0 = new Hour();
      XYSeries xYSeries0 = new XYSeries(hour0, true);
      boolean boolean0 = xYSeries0.getAllowDuplicateXValues();
      assertTrue(boolean0);
      assertTrue(xYSeries0.getAutoSort());
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockDate mockDate0 = new MockDate(11, 0, 0, 0, 0, 11);
      Week week0 = new Week(mockDate0);
      XYSeries xYSeries0 = new XYSeries(week0, true, false);
      boolean boolean0 = xYSeries0.getAutoSort();
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
      assertTrue(boolean0);
      assertFalse(xYSeries0.getAllowDuplicateXValues());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Year year0 = new Year();
      XYSeries xYSeries0 = new XYSeries(year0, false, false);
      xYSeries0.addOrUpdate((double) (-9999), (double) 9999);
      xYSeries0.add((double) 9999, (double) (-9999), false);
      xYSeries0.addOrUpdate(3978.4035710808, 3978.4035710808);
      xYSeries0.setMaximumItemCount(2);
      assertEquals(2, xYSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      XYSeries xYSeries0 = new XYSeries(fixedMillisecond0, false);
      // Undeclared exception!
      try { 
        xYSeries0.add((XYDataItem) null, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'item' argument.
         //
         verifyException("org.jfree.data.xy.XYSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Year year0 = new Year();
      XYSeries xYSeries0 = new XYSeries(year0, true, false);
      xYSeries0.add(0.0, 0.0);
      // Undeclared exception!
      try { 
        xYSeries0.add(0.0, (Number) (-9999));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // X-value already exists.
         //
         verifyException("org.jfree.data.xy.XYSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Year year0 = new Year(1035);
      XYSeries xYSeries0 = new XYSeries(year0, true);
      xYSeries0.add((Number) (-9999), (Number) 9999);
      xYSeries0.add((-457.1301), (Number) 9999, false);
      xYSeries0.addOrUpdate((Number) (-9999), (Number) (-9999));
      assertEquals(3, xYSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Year year0 = new Year();
      XYSeries xYSeries0 = new XYSeries(year0, false, false);
      xYSeries0.addOrUpdate((double) (-9999), (double) 9999);
      // Undeclared exception!
      try { 
        xYSeries0.add((double) (-9999), (-1.0), true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // X-value already exists.
         //
         verifyException("org.jfree.data.xy.XYSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Year year0 = new Year();
      XYSeries xYSeries0 = new XYSeries(year0, false, false);
      xYSeries0.addOrUpdate((double) (-9999), (double) 9999);
      xYSeries0.add((double) 9999, (double) (-9999), false);
      xYSeries0.setMaximumItemCount(2);
      xYSeries0.add((-1.0), (double) (-9999));
      assertEquals(2, xYSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Year year0 = new Year();
      XYSeries xYSeries0 = new XYSeries(year0);
      xYSeries0.delete(9999, (-9999));
      assertTrue(xYSeries0.getAutoSort());
      assertTrue(xYSeries0.getAllowDuplicateXValues());
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Short short0 = new Short((short)44);
      XYSeries xYSeries0 = new XYSeries(short0, false, true);
      // Undeclared exception!
      try { 
        xYSeries0.delete(0, Integer.MAX_VALUE);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Week week0 = new Week();
      XYSeries xYSeries0 = new XYSeries(week0, false);
      xYSeries0.clear();
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
      assertTrue(xYSeries0.getAllowDuplicateXValues());
      assertFalse(xYSeries0.getAutoSort());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Year year0 = new Year(1035);
      XYSeries xYSeries0 = new XYSeries(year0, true);
      xYSeries0.add((Number) (-9999), (Number) 9999);
      assertEquals(1, xYSeries0.getItemCount());
      
      xYSeries0.clear();
      assertTrue(xYSeries0.getAllowDuplicateXValues());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Year year0 = new Year(1035);
      XYSeries xYSeries0 = new XYSeries(year0, true);
      xYSeries0.add((Number) (-9999), (Number) 9999);
      assertEquals(1, xYSeries0.getItemCount());
      
      xYSeries0.update((-9999), 9999);
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockDate mockDate0 = new MockDate(11, 0, 0, 0, 0, 11);
      Week week0 = new Week(mockDate0);
      XYSeries xYSeries0 = new XYSeries(week0, true, false);
      // Undeclared exception!
      try { 
        xYSeries0.update(53, (-9999));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No observation for x = 53
         //
         verifyException("org.jfree.data.xy.XYSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Year year0 = new Year(1067);
      XYSeries xYSeries0 = new XYSeries(year0, true);
      // Undeclared exception!
      try { 
        xYSeries0.addOrUpdate((Number) null, (Number) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'x' argument.
         //
         verifyException("org.jfree.data.xy.XYSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      XYSeries xYSeries0 = new XYSeries(millisecond0, false, false);
      xYSeries0.addOrUpdate((Number) 999, (Number) 0);
      xYSeries0.addOrUpdate((Number) 999, (Number) 999);
      assertEquals(1, xYSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Year year0 = new Year();
      XYSeries xYSeries0 = new XYSeries(year0, true, false);
      xYSeries0.addOrUpdate((-2477.4246781), (double) 9999);
      assertFalse(xYSeries0.getAllowDuplicateXValues());
      assertTrue(xYSeries0.getAutoSort());
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Year year0 = new Year();
      XYSeries xYSeries0 = new XYSeries(year0, false, false);
      xYSeries0.addOrUpdate((double) (-9999), (double) 9999);
      xYSeries0.add((double) 9999, (double) (-9999), false);
      xYSeries0.setMaximumItemCount(2);
      xYSeries0.addOrUpdate((Number) (-9999), (Number) 9999);
      assertEquals(2, xYSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Year year0 = new Year();
      XYSeries xYSeries0 = new XYSeries(year0, false, false);
      xYSeries0.add((-682.73003309329), (Number) null, true);
      double[][] doubleArray0 = xYSeries0.toArray();
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
      assertFalse(xYSeries0.getAllowDuplicateXValues());
      assertFalse(xYSeries0.getAutoSort());
      assertEquals(2, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Year year0 = new Year();
      XYSeries xYSeries0 = new XYSeries(year0, false, false);
      xYSeries0.addOrUpdate((-2477.4246781), (double) 9999);
      double[][] doubleArray0 = xYSeries0.toArray();
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
      assertEquals(2, doubleArray0.length);
      assertFalse(xYSeries0.getAllowDuplicateXValues());
      assertFalse(xYSeries0.getAutoSort());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Year year0 = new Year(1035);
      XYSeries xYSeries0 = new XYSeries(year0, true);
      xYSeries0.add((Number) (-9999), (Number) 9999);
      xYSeries0.createCopy(10021, (-4));
      assertEquals(1, xYSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Minute minute0 = new Minute();
      XYSeries xYSeries0 = new XYSeries(minute0, false);
      xYSeries0.addOrUpdate((Number) 0, (Number) 0);
      // Undeclared exception!
      try { 
        xYSeries0.createCopy((-1411), (-1411));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Year year0 = new Year(1035);
      XYSeries xYSeries0 = new XYSeries(year0, true);
      XYSeries xYSeries1 = new XYSeries(year0, true, false);
      boolean boolean0 = xYSeries0.equals(xYSeries1);
      assertFalse(boolean0);
      assertTrue(xYSeries0.getAllowDuplicateXValues());
      assertEquals(Integer.MAX_VALUE, xYSeries1.getMaximumItemCount());
      assertTrue(xYSeries1.getAutoSort());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Year year0 = new Year(1035);
      XYSeries xYSeries0 = new XYSeries(year0, true);
      boolean boolean0 = xYSeries0.equals(year0);
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
      assertTrue(xYSeries0.getAutoSort());
      assertTrue(xYSeries0.getAllowDuplicateXValues());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeZone timeZone0 = TimeZone.getTimeZone("B(o^");
      Year year0 = new Year(mockDate0, timeZone0);
      XYSeries xYSeries0 = new XYSeries(year0);
      XYSeries xYSeries1 = new XYSeries(mockDate0);
      boolean boolean0 = xYSeries0.equals(xYSeries1);
      assertFalse(boolean0);
      assertEquals(Integer.MAX_VALUE, xYSeries1.getMaximumItemCount());
      assertTrue(xYSeries1.getAllowDuplicateXValues());
      assertTrue(xYSeries1.getAutoSort());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Year year0 = new Year(3575);
      XYSeries xYSeries0 = new XYSeries(year0, true, true);
      XYSeries xYSeries1 = xYSeries0.createCopy(9999, 3575);
      xYSeries1.setMaximumItemCount(53);
      boolean boolean0 = xYSeries0.equals(xYSeries1);
      assertEquals(53, xYSeries1.getMaximumItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Year year0 = new Year(1067);
      XYSeries xYSeries0 = new XYSeries(year0, true);
      XYSeries xYSeries1 = new XYSeries(year0, false, true);
      boolean boolean0 = xYSeries0.equals(xYSeries1);
      assertFalse(xYSeries1.getAutoSort());
      assertTrue(xYSeries1.getAllowDuplicateXValues());
      assertEquals(Integer.MAX_VALUE, xYSeries1.getMaximumItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      XYSeries xYSeries0 = new XYSeries("\"aoRnUT", false);
      XYSeries xYSeries1 = (XYSeries)xYSeries0.clone();
      boolean boolean0 = xYSeries0.equals(xYSeries1);
      assertTrue(boolean0);
      assertFalse(xYSeries1.getAutoSort());
      assertTrue(xYSeries1.getAllowDuplicateXValues());
      assertEquals(Integer.MAX_VALUE, xYSeries1.getMaximumItemCount());
      assertNotSame(xYSeries1, xYSeries0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Year year0 = new Year(1067);
      XYSeries xYSeries0 = new XYSeries(year0, true);
      xYSeries0.add((Number) (-9999), (Number) 9999);
      XYSeries xYSeries1 = new XYSeries(year0, true, true);
      boolean boolean0 = xYSeries0.equals(xYSeries1);
      assertTrue(xYSeries1.getAllowDuplicateXValues());
      assertEquals(Integer.MAX_VALUE, xYSeries1.getMaximumItemCount());
      assertFalse(boolean0);
      assertTrue(xYSeries1.getAutoSort());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MockDate mockDate0 = new MockDate(451, 1462, 1462, (-813), (-813), (-813));
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(0);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Millisecond millisecond0 = new Millisecond(mockDate0, timeZone0);
      XYSeries xYSeries0 = new XYSeries(millisecond0, true, true);
      xYSeries0.hashCode();
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
      assertTrue(xYSeries0.getAllowDuplicateXValues());
      assertTrue(xYSeries0.getAutoSort());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Year year0 = new Year();
      XYSeries xYSeries0 = new XYSeries(year0, false, false);
      xYSeries0.add((-682.73003309329), (Number) null, true);
      xYSeries0.hashCode();
      assertFalse(xYSeries0.getAllowDuplicateXValues());
      assertFalse(xYSeries0.getAutoSort());
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Year year0 = new Year();
      XYSeries xYSeries0 = new XYSeries(year0, false, false);
      xYSeries0.add((-682.73003309329), (Number) null, true);
      xYSeries0.addOrUpdate((-2477.4246781), (double) 9999);
      xYSeries0.hashCode();
      assertEquals(2, xYSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Second second0 = new Second();
      XYSeries xYSeries0 = new XYSeries(second0, false, false);
      xYSeries0.add(0.0, 0.0);
      xYSeries0.addOrUpdate((double) 59, (-3640.68794543));
      xYSeries0.add((Number) 59, (Number) 0);
      xYSeries0.hashCode();
      assertEquals(3, xYSeries0.getItemCount());
  }
}
