/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 02 01:51:11 GMT 2019
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.util.TimeZone;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFormattedTextField;
import javax.swing.JLayeredPane;
import javax.swing.text.StyledEditorKit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.time.Day;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Minute;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.SerialDate;
import org.jfree.data.time.SpreadsheetDate;
import org.jfree.data.time.TimeSeriesDataItem;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYSeries;
import org.junit.runner.RunWith;


public class XYSeries_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      XYDataItem xYDataItem0 = new XYDataItem(bigInteger0, bigInteger0);
      XYSeries xYSeries0 = new XYSeries(xYDataItem0);
      xYSeries0.add((-163.443828947292), (-1703.7215332185));
      xYSeries0.createCopy(0, 0);
      assertEquals(1, xYSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      XYSeries xYSeries0 = new XYSeries(integer0, false, false);
      XYSeries xYSeries1 = (XYSeries)xYSeries0.clone();
      assertEquals(Integer.MAX_VALUE, xYSeries1.getMaximumItemCount());
      assertFalse(xYSeries1.getAutoSort());
      assertNotSame(xYSeries1, xYSeries0);
      assertFalse(xYSeries1.getAllowDuplicateXValues());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      Hour hour0 = new Hour(mockDate0);
      XYSeries xYSeries0 = new XYSeries(hour0);
      int int0 = xYSeries0.getMaximumItemCount();
      assertEquals(Integer.MAX_VALUE, int0);
      assertTrue(xYSeries0.getAllowDuplicateXValues());
      assertTrue(xYSeries0.getAutoSort());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hour hour0 = new Hour();
      XYSeries xYSeries0 = new XYSeries(hour0, true, false);
      xYSeries0.add((double) 0, (Number) 0, true);
      // Undeclared exception!
      try { 
        xYSeries0.add(0.0, (Number) 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // X-value already exists.
         //
         verifyException("org.jfree.data.xy.XYSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      XYSeries xYSeries0 = new XYSeries(integer0, false, false);
      xYSeries0.getItems();
      assertFalse(xYSeries0.getAllowDuplicateXValues());
      assertFalse(xYSeries0.getAutoSort());
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      XYSeries xYSeries0 = new XYSeries(integer0, false, false);
      Float float0 = new Float(1865.5049F);
      XYDataItem xYDataItem0 = new XYDataItem((Number) integer0, (Number) float0);
      xYSeries0.add(xYDataItem0, false);
      xYSeries0.toArray();
      assertEquals(1, xYSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(0.0, 0.0);
      XYSeries xYSeries0 = new XYSeries(xYDataItem0, true);
      xYSeries0.addOrUpdate(0.0, 0.0);
      xYSeries0.hashCode();
      assertEquals(1, xYSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) minute0, (Number) 0);
      XYSeries xYSeries0 = new XYSeries(timeSeriesDataItem0, false);
      // Undeclared exception!
      try { 
        xYSeries0.updateByIndex((-739), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      XYSeries xYSeries0 = new XYSeries(integer0, false, false);
      xYSeries0.addOrUpdate(146.6738815, 0.0);
      assertEquals(1, xYSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Year year0 = new Year((-4163));
      XYSeries xYSeries0 = new XYSeries(year0, false);
      // Undeclared exception!
      try { 
        xYSeries0.remove((Number) 9999);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 1900, 0, 0, 482, 482);
      Millisecond millisecond0 = new Millisecond(mockDate0);
      XYSeries xYSeries0 = new XYSeries(millisecond0, false);
      boolean boolean0 = xYSeries0.getAllowDuplicateXValues();
      assertTrue(boolean0);
      assertFalse(xYSeries0.getAutoSort());
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeZone timeZone0 = TimeZone.getDefault();
      Day day0 = new Day(mockDate0, timeZone0);
      Hour hour0 = new Hour(2, day0);
      XYSeries xYSeries0 = new XYSeries(hour0);
      boolean boolean0 = xYSeries0.getAutoSort();
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
      assertTrue(xYSeries0.getAllowDuplicateXValues());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      XYSeries xYSeries0 = new XYSeries(integer0, false, false);
      Float float0 = new Float(1865.5049F);
      XYDataItem xYDataItem0 = new XYDataItem((Number) integer0, (Number) float0);
      xYSeries0.add(xYDataItem0, false);
      xYSeries0.add((-1.0), (double) 1);
      xYSeries0.add((Number) float0, (Number) float0);
      xYSeries0.setMaximumItemCount(2);
      assertEquals(2, xYSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour((-559), day0);
      XYSeries xYSeries0 = new XYSeries(hour0, false);
      // Undeclared exception!
      try { 
        xYSeries0.add((XYDataItem) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'item' argument.
         //
         verifyException("org.jfree.data.xy.XYSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Day day0 = new Day();
      XYSeries xYSeries0 = new XYSeries(day0, true, true);
      Integer integer0 = JLayeredPane.DEFAULT_LAYER;
      xYSeries0.addOrUpdate((Number) integer0, (Number) integer0);
      xYSeries0.addOrUpdate((Number) integer0, (Number) integer0);
      assertEquals(2, xYSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      Year year0 = new Year(mockDate0);
      Week week0 = new Week((-7), year0);
      XYSeries xYSeries0 = new XYSeries(week0);
      XYDataItem xYDataItem0 = new XYDataItem(1.0, (double) 0L);
      xYSeries0.add(xYDataItem0, true);
      xYSeries0.addOrUpdate((Number) 9999, (Number) 1);
      xYSeries0.add(xYDataItem0, false);
      assertEquals(3, xYSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Year year0 = new Year((-4163));
      XYSeries xYSeries0 = new XYSeries(year0, false);
      xYSeries0.add(0.8, 0.0, false);
      assertEquals(1, xYSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      XYSeries xYSeries0 = new XYSeries(integer0, false, false);
      Float float0 = new Float(1865.5049F);
      XYDataItem xYDataItem0 = new XYDataItem((Number) integer0, (Number) float0);
      xYSeries0.add(xYDataItem0, false);
      // Undeclared exception!
      try { 
        xYSeries0.add(xYDataItem0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // X-value already exists.
         //
         verifyException("org.jfree.data.xy.XYSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      XYSeries xYSeries0 = new XYSeries(integer0, false, false);
      Float float0 = new Float(1865.5049F);
      xYSeries0.add((double) (-35), (double) 1);
      xYSeries0.setMaximumItemCount(2);
      xYSeries0.add((Number) float0, (Number) float0);
      xYSeries0.add((-1362.33006), 0.0, true);
      assertEquals(2, xYSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Year year0 = new Year((-4163));
      XYSeries xYSeries0 = new XYSeries(year0, false);
      xYSeries0.clear();
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
      assertTrue(xYSeries0.getAllowDuplicateXValues());
      assertFalse(xYSeries0.getAutoSort());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem((double) (-3169), 3257.7519117099505);
      XYSeries xYSeries0 = new XYSeries(xYDataItem0, true);
      xYSeries0.add(xYDataItem0, false);
      assertEquals(1, xYSeries0.getItemCount());
      
      xYSeries0.clear();
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Hour hour0 = new Hour();
      XYSeries xYSeries0 = new XYSeries(hour0, false, false);
      xYSeries0.add((Number) 23, (Number) 0, false);
      assertEquals(1, xYSeries0.getItemCount());
      
      xYSeries0.update(23, 0);
      assertFalse(xYSeries0.getAutoSort());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Week week0 = new Week(3786, 3786);
      XYSeries xYSeries0 = new XYSeries(week0, false, false);
      xYSeries0.add((Number) 1, (Number) 53);
      xYSeries0.delete(0, 0);
      // Undeclared exception!
      try { 
        xYSeries0.update(1, 53);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No observation for x = 1
         //
         verifyException("org.jfree.data.xy.XYSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      XYSeries xYSeries0 = new XYSeries(fixedMillisecond0);
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
  public void test24()  throws Throwable  {
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      XYSeries xYSeries0 = new XYSeries(integer0, false, false);
      xYSeries0.addOrUpdate((Number) integer0, (Number) integer0);
      xYSeries0.addOrUpdate((Number) integer0, (Number) integer0);
      assertEquals(1, xYSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Minute minute0 = new Minute();
      XYSeries xYSeries0 = new XYSeries(minute0, true, false);
      Byte byte0 = new Byte((byte) (-56));
      xYSeries0.addOrUpdate((Number) byte0, (Number) byte0);
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
      assertFalse(xYSeries0.getAllowDuplicateXValues());
      assertTrue(xYSeries0.getAutoSort());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Minute minute0 = new Minute();
      XYSeries xYSeries0 = new XYSeries(minute0, false, false);
      xYSeries0.setMaximumItemCount(0);
      Byte byte0 = new Byte((byte) (-56));
      xYSeries0.addOrUpdate((Number) byte0, (Number) byte0);
      assertEquals(0, xYSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
      Day day0 = new Day(spreadsheetDate0);
      XYSeries xYSeries0 = new XYSeries(day0, false, false);
      xYSeries0.add((double) 1, (Number) null);
      double[][] doubleArray0 = xYSeries0.toArray();
      assertEquals(2, doubleArray0.length);
      assertFalse(xYSeries0.getAutoSort());
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Day day0 = new Day();
      XYSeries xYSeries0 = new XYSeries(day0, true, true);
      RegularTimePeriod regularTimePeriod0 = day0.next();
      XYSeries xYSeries1 = xYSeries0.createCopy((-346), 127);
      assertTrue(xYSeries1.equals((Object)xYSeries0));
      
      xYSeries1.setKey(regularTimePeriod0);
      boolean boolean0 = xYSeries1.equals(xYSeries0);
      assertFalse(xYSeries1.equals((Object)xYSeries0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Day day0 = new Day();
      XYSeries xYSeries0 = new XYSeries(day0, true, true);
      StyledEditorKit.FontFamilyAction styledEditorKit_FontFamilyAction0 = new StyledEditorKit.FontFamilyAction("", "");
      JCheckBoxMenuItem jCheckBoxMenuItem0 = new JCheckBoxMenuItem(styledEditorKit_FontFamilyAction0);
      boolean boolean0 = xYSeries0.equals(jCheckBoxMenuItem0);
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
      assertFalse(boolean0);
      assertTrue(xYSeries0.getAutoSort());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      XYSeries xYSeries0 = new XYSeries(integer0, false, false);
      XYSeries xYSeries1 = xYSeries0.createCopy(1, (-35));
      boolean boolean0 = xYSeries1.equals(xYSeries0);
      assertFalse(xYSeries1.getAutoSort());
      assertTrue(boolean0);
      assertEquals(Integer.MAX_VALUE, xYSeries1.getMaximumItemCount());
      assertNotSame(xYSeries1, xYSeries0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      XYSeries xYSeries0 = new XYSeries(integer0, false, false);
      XYSeries xYSeries1 = xYSeries0.createCopy(1, (-35));
      xYSeries1.setMaximumItemCount(2);
      boolean boolean0 = xYSeries1.equals(xYSeries0);
      assertEquals(2, xYSeries1.getMaximumItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(2125);
      XYSeries xYSeries0 = new XYSeries(serialDate0, true);
      XYSeries xYSeries1 = new XYSeries(serialDate0, false, false);
      boolean boolean0 = xYSeries0.equals(xYSeries1);
      assertEquals(Integer.MAX_VALUE, xYSeries1.getMaximumItemCount());
      assertFalse(xYSeries1.getAutoSort());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Week week0 = new Week();
      XYSeries xYSeries0 = new XYSeries(week0, true, true);
      XYSeries xYSeries1 = new XYSeries(week0, true, false);
      boolean boolean0 = xYSeries0.equals(xYSeries1);
      assertEquals(Integer.MAX_VALUE, xYSeries1.getMaximumItemCount());
      assertFalse(boolean0);
      assertTrue(xYSeries1.getAutoSort());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      XYSeries xYSeries0 = new XYSeries(integer0, false, false);
      XYSeries xYSeries1 = xYSeries0.createCopy(1, (-35));
      assertTrue(xYSeries1.equals((Object)xYSeries0));
      
      Float float0 = new Float(1865.5049F);
      XYDataItem xYDataItem0 = new XYDataItem((Number) integer0, (Number) float0);
      xYSeries1.add(xYDataItem0, false);
      boolean boolean0 = xYSeries1.equals(xYSeries0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Minute minute0 = new Minute();
      XYSeries xYSeries0 = new XYSeries(minute0, false, false);
      JFormattedTextField jFormattedTextField0 = new JFormattedTextField(xYSeries0);
      assertFalse(xYSeries0.getAutoSort());
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      XYSeries xYSeries0 = new XYSeries(integer0, false, false);
      Float float0 = new Float(1865.5049F);
      XYDataItem xYDataItem0 = new XYDataItem((Number) integer0, (Number) float0);
      xYSeries0.add(xYDataItem0, false);
      xYSeries0.add((-1.0), (double) 1);
      xYSeries0.hashCode();
      assertEquals(2, xYSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      XYSeries xYSeries0 = new XYSeries(integer0, false, false);
      Float float0 = new Float(1865.5049F);
      XYDataItem xYDataItem0 = new XYDataItem((Number) integer0, (Number) float0);
      xYSeries0.add(xYDataItem0, false);
      xYSeries0.add((-1.0), (double) 1);
      xYSeries0.add((Number) float0, (Number) float0);
      xYSeries0.hashCode();
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
      assertFalse(xYSeries0.getAutoSort());
  }
}
