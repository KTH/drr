/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:23:48 GMT 2014
 */

package org.jfree.data;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;

import org.jfree.chart.util.SortOrder;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.UnknownKeyException;
import org.junit.runner.RunWith;

 
public class DefaultKeyedValuesEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      int int0 = 0;
      defaultKeyedValues0.insertValue(int0, (Comparable) int0, (double) int0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      double double0 = (-23.928651356814996);
      DefaultKeyedValues defaultKeyedValues1 = (DefaultKeyedValues)defaultKeyedValues0.clone();
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertNotSame(defaultKeyedValues0, defaultKeyedValues1);
      assertTrue(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertTrue(defaultKeyedValues0.equals((Object)defaultKeyedValues1));
      assertEquals(1, defaultKeyedValues1.getItemCount());
      assertEquals(1, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues1);
      
      defaultKeyedValues0.addValue((Comparable) int0, double0);
      assertNotSame(defaultKeyedValues0, defaultKeyedValues1);
      assertFalse(defaultKeyedValues0.equals((Object)defaultKeyedValues1));
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      boolean boolean0 = defaultKeyedValues0.equals((Object) defaultKeyedValues1);
      assertFalse(boolean0);
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertNotSame(defaultKeyedValues0, defaultKeyedValues1);
      assertFalse(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertFalse(defaultKeyedValues0.equals((Object)defaultKeyedValues1));
      assertEquals(1, defaultKeyedValues1.getItemCount());
      assertEquals(1, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      int int0 = 0;
      defaultKeyedValues0.insertValue(int0, (Comparable) int0, (Number) int0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      DefaultKeyedValues defaultKeyedValues1 = (DefaultKeyedValues)defaultKeyedValues0.clone();
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertNotSame(defaultKeyedValues0, defaultKeyedValues1);
      assertTrue(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertTrue(defaultKeyedValues0.equals((Object)defaultKeyedValues1));
      assertEquals(1, defaultKeyedValues1.getItemCount());
      assertEquals(1, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues1);
      
      defaultKeyedValues0.clear();
      assertNotSame(defaultKeyedValues0, defaultKeyedValues1);
      assertFalse(defaultKeyedValues0.equals((Object)defaultKeyedValues1));
      assertEquals(0, defaultKeyedValues0.getItemCount());
      
      int int1 = 1;
      defaultKeyedValues0.setValue((Comparable) int1, (Number) int1);
      assertNotSame(defaultKeyedValues0, defaultKeyedValues1);
      assertFalse(defaultKeyedValues0.equals((Object)defaultKeyedValues1));
      assertFalse(int1 == int0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      boolean boolean0 = defaultKeyedValues0.equals((Object) defaultKeyedValues1);
      assertFalse(boolean0);
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertNotSame(defaultKeyedValues0, defaultKeyedValues1);
      assertFalse(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertFalse(defaultKeyedValues0.equals((Object)defaultKeyedValues1));
      assertEquals(1, defaultKeyedValues1.getItemCount());
      assertEquals(1, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      int int0 = 0;
      ArrayList<Object> arrayList0 = new ArrayList<Object>(int0);
      assertEquals("[]", arrayList0.toString());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertNotNull(arrayList0);
      
      boolean boolean0 = defaultKeyedValues0.equals((Object) arrayList0);
      assertFalse(boolean0);
      assertEquals("[]", arrayList0.toString());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals(0, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      int int0 = 0;
      defaultKeyedValues0.insertValue(int0, (Comparable) int0, (Number) int0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      DefaultKeyedValues defaultKeyedValues1 = (DefaultKeyedValues)defaultKeyedValues0.clone();
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertNotSame(defaultKeyedValues0, defaultKeyedValues1);
      assertTrue(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertTrue(defaultKeyedValues0.equals((Object)defaultKeyedValues1));
      assertEquals(1, defaultKeyedValues1.getItemCount());
      assertEquals(1, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues1);
      
      defaultKeyedValues0.clear();
      assertNotSame(defaultKeyedValues0, defaultKeyedValues1);
      assertFalse(defaultKeyedValues0.equals((Object)defaultKeyedValues1));
      assertEquals(0, defaultKeyedValues0.getItemCount());
      
      boolean boolean0 = defaultKeyedValues0.equals((Object) defaultKeyedValues1);
      assertFalse(boolean0);
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertNotSame(defaultKeyedValues0, defaultKeyedValues1);
      assertFalse(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertFalse(defaultKeyedValues0.equals((Object)defaultKeyedValues1));
      assertEquals(1, defaultKeyedValues1.getItemCount());
      assertEquals(0, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      String string0 = "J";
      int int0 = defaultKeyedValues0.hashCode();
      assertEquals(1, int0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
      
      defaultKeyedValues0.setValue((Comparable) string0, (Number) int0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      SortOrder sortOrder0 = SortOrder.DESCENDING;
      assertEquals("SortOrder.DESCENDING", sortOrder0.toString());
      assertNotNull(sortOrder0);
      
      defaultKeyedValues0.sortByValues(sortOrder0);
      assertEquals("SortOrder.DESCENDING", sortOrder0.toString());
      assertEquals(1, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      int int0 = 0;
      defaultKeyedValues0.insertValue(int0, (Comparable) int0, (Number) int0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      SortOrder sortOrder0 = SortOrder.DESCENDING;
      assertEquals("SortOrder.DESCENDING", sortOrder0.toString());
      assertNotNull(sortOrder0);
      
      defaultKeyedValues0.sortByKeys(sortOrder0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      assertEquals("SortOrder.DESCENDING", sortOrder0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      int int0 = defaultKeyedValues0.hashCode();
      assertEquals(1, int0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
      
      Long long0 = new Long((long) int0);
      assertEquals(1L, (long)long0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
      
      // Undeclared exception!
      try {
        defaultKeyedValues0.removeValue((Comparable) long0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The key (1) is not recognised.
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      int int0 = 1;
      defaultKeyedValues0.setValue((Comparable) int0, (Number) int0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      // Undeclared exception!
      try {
        defaultKeyedValues0.insertValue(int0, (Comparable) int0, (Number) int0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      int int0 = 0;
      defaultKeyedValues0.insertValue(int0, (Comparable) int0, (double) int0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      defaultKeyedValues0.insertValue(int0, (Comparable) int0, (Number) int0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      int int0 = 0;
      Comparable<Double> comparable0 = null;
      // Undeclared exception!
      try {
        defaultKeyedValues0.insertValue(int0, (Comparable) comparable0, (double) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = 1130;
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      // Undeclared exception!
      try {
        defaultKeyedValues0.insertValue(int0, (Comparable) int0, (double) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 'position' out of bounds.
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      int int0 = (-52);
      // Undeclared exception!
      try {
        defaultKeyedValues0.insertValue(int0, (Comparable) int0, (double) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 'position' out of bounds.
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      Comparable<Long> comparable0 = null;
      double double0 = (-4654.747404751);
      // Undeclared exception!
      try {
        defaultKeyedValues0.setValue(comparable0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      long long0 = 2L;
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      // Undeclared exception!
      try {
        Number number0 = defaultKeyedValues0.getValue((Comparable) long0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Key not found: 2
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      String string0 = "J";
      int int0 = defaultKeyedValues0.hashCode();
      assertEquals(1, int0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
      
      defaultKeyedValues0.setValue((Comparable) string0, (Number) int0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      Integer integer0 = (Integer)defaultKeyedValues0.getValue((Comparable) string0);
      assertEquals(1, (int)integer0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      Comparable<Object> comparable0 = null;
      // Undeclared exception!
      try {
        defaultKeyedValues0.removeValue(comparable0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      List list0 = defaultKeyedValues0.getKeys();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertEquals(0, list0.size());
      assertEquals(true, list0.isEmpty());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      long long0 = (-17L);
      boolean boolean0 = defaultKeyedValues0.equals((Object) defaultKeyedValues0);
      assertTrue(boolean0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
      
      defaultKeyedValues0.setValue((Comparable) boolean0, (double) long0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      defaultKeyedValues0.removeValue((Comparable) boolean0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      int int0 = 0;
      defaultKeyedValues0.insertValue(int0, (Comparable) int0, (Number) int0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      DefaultKeyedValues defaultKeyedValues1 = (DefaultKeyedValues)defaultKeyedValues0.clone();
      assertNotSame(defaultKeyedValues0, defaultKeyedValues1);
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertTrue(defaultKeyedValues0.equals((Object)defaultKeyedValues1));
      assertTrue(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertEquals(1, defaultKeyedValues0.getItemCount());
      assertEquals(1, defaultKeyedValues1.getItemCount());
      assertNotNull(defaultKeyedValues1);
      
      boolean boolean0 = defaultKeyedValues0.equals((Object) defaultKeyedValues1);
      assertTrue(boolean0);
      assertNotSame(defaultKeyedValues0, defaultKeyedValues1);
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertTrue(defaultKeyedValues0.equals((Object)defaultKeyedValues1));
      assertTrue(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertEquals(1, defaultKeyedValues0.getItemCount());
      assertEquals(1, defaultKeyedValues1.getItemCount());
  }
}
