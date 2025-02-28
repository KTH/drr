/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:47:16 GMT 2014
 */

package org.joda.time.field;

import static org.junit.Assert.*;
import org.junit.Test;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.joda.time.Chronology;
import org.joda.time.Days;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.Period;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.field.UnsupportedDurationField;
import org.junit.runner.RunWith;

 
public class UnsupportedDurationFieldEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      assertNotNull(durationFieldType0);
      assertEquals("halfdays", durationFieldType0.getName());
      assertEquals("halfdays", durationFieldType0.toString());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("halfdays", unsupportedDurationField0.getName());
      assertEquals("halfdays", durationFieldType0.getName());
      assertEquals("halfdays", durationFieldType0.toString());
      
      boolean boolean0 = unsupportedDurationField0.equals((Object) durationFieldType0);
      assertFalse(boolean0);
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("halfdays", unsupportedDurationField0.getName());
      assertEquals("halfdays", durationFieldType0.getName());
      assertEquals("halfdays", durationFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = 0;
      Period period0 = Period.weeks(int0);
      assertNotNull(period0);
      
      DurationFieldType durationFieldType0 = period0.getFieldType(int0);
      assertNotNull(durationFieldType0);
      assertEquals("years", durationFieldType0.toString());
      assertEquals("years", durationFieldType0.getName());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals("years", durationFieldType0.toString());
      assertEquals("years", durationFieldType0.getName());
      assertEquals("years", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      
      boolean boolean0 = unsupportedDurationField0.equals((Object) unsupportedDurationField0);
      assertTrue(boolean0);
      assertEquals("years", durationFieldType0.toString());
      assertEquals("years", durationFieldType0.getName());
      assertEquals("years", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Days days0 = Days.SIX;
      assertNotNull(days0);
      assertEquals(1, days0.size());
      
      DurationFieldType durationFieldType0 = days0.getFieldType();
      assertNotNull(durationFieldType0);
      assertEquals("days", durationFieldType0.getName());
      assertEquals("days", durationFieldType0.toString());
      assertEquals(1, days0.size());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals("days", durationFieldType0.getName());
      assertEquals("days", durationFieldType0.toString());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("days", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(1, days0.size());
      
      UnsupportedDurationField unsupportedDurationField1 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertSame(unsupportedDurationField1, unsupportedDurationField0);
      assertNotNull(unsupportedDurationField1);
      assertEquals("days", durationFieldType0.getName());
      assertEquals("days", durationFieldType0.toString());
      assertEquals(false, unsupportedDurationField1.isSupported());
      assertEquals(true, unsupportedDurationField1.isPrecise());
      assertEquals(0L, unsupportedDurationField1.getUnitMillis());
      assertEquals("days", unsupportedDurationField1.getName());
      assertEquals(1, days0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      assertNotNull(durationFieldType0);
      assertEquals("eras", durationFieldType0.toString());
      assertEquals("eras", durationFieldType0.getName());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals("eras", durationFieldType0.toString());
      assertEquals("eras", durationFieldType0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("eras", unsupportedDurationField0.getName());
      
      int int0 = 1596;
      // Undeclared exception!
      try {
        long long0 = unsupportedDurationField0.getMillis(int0, (long) int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      assertNotNull(ethiopicChronology0);
      
      StrictChronology strictChronology0 = StrictChronology.getInstance((Chronology) ethiopicChronology0);
      assertNotNull(strictChronology0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = 0;
      Period period0 = Period.weeks(int0);
      assertNotNull(period0);
      
      DurationFieldType durationFieldType0 = period0.getFieldType(int0);
      assertNotNull(durationFieldType0);
      assertEquals("years", durationFieldType0.getName());
      assertEquals("years", durationFieldType0.toString());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals("years", durationFieldType0.getName());
      assertEquals("years", durationFieldType0.toString());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("years", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      
      boolean boolean0 = unsupportedDurationField0.isPrecise();
      assertTrue(boolean0);
      assertEquals("years", durationFieldType0.getName());
      assertEquals("years", durationFieldType0.toString());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("years", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      assertNotNull(durationFieldType0);
      assertEquals("minutes", durationFieldType0.toString());
      assertEquals("minutes", durationFieldType0.getName());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("minutes", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("minutes", durationFieldType0.toString());
      assertEquals("minutes", durationFieldType0.getName());
      
      int int0 = unsupportedDurationField0.hashCode();
      assertEquals(1064901855, int0);
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("minutes", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("minutes", durationFieldType0.toString());
      assertEquals("minutes", durationFieldType0.getName());
      
      // Undeclared exception!
      try {
        int int1 = unsupportedDurationField0.getDifference((long) int0, (long) int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // minutes field is unsupported
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      assertNotNull(durationFieldType0);
      assertEquals("weekyears", durationFieldType0.getName());
      assertEquals("weekyears", durationFieldType0.toString());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals("weekyears", durationFieldType0.getName());
      assertEquals("weekyears", durationFieldType0.toString());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("weekyears", unsupportedDurationField0.getName());
      
      int int0 = 48;
      // Undeclared exception!
      try {
        long long0 = unsupportedDurationField0.getMillis(int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // weekyears field is unsupported
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = 0;
      Period period0 = Period.weeks(int0);
      assertNotNull(period0);
      
      DurationFieldType durationFieldType0 = period0.getFieldType(int0);
      assertNotNull(durationFieldType0);
      assertEquals("years", durationFieldType0.toString());
      assertEquals("years", durationFieldType0.getName());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("years", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("years", durationFieldType0.toString());
      assertEquals("years", durationFieldType0.getName());
      
      int int1 = unsupportedDurationField0.compareTo((DurationField) unsupportedDurationField0);
      assertEquals(0, int1);
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("years", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("years", durationFieldType0.toString());
      assertEquals("years", durationFieldType0.getName());
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DurationFieldType durationFieldType0 = null;
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      
      long long0 = 48L;
      // Undeclared exception!
      try {
        long long1 = unsupportedDurationField0.getMillis(long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // null field is unsupported
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      assertNotNull(durationFieldType0);
      assertEquals("minutes", durationFieldType0.getName());
      assertEquals("minutes", durationFieldType0.toString());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals("minutes", durationFieldType0.getName());
      assertEquals("minutes", durationFieldType0.toString());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("minutes", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      
      long long0 = 0L;
      // Undeclared exception!
      try {
        long long1 = unsupportedDurationField0.getValueAsLong(long0, long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // minutes field is unsupported
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = 1827;
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      assertNotNull(durationFieldType0);
      assertEquals("days", durationFieldType0.getName());
      assertEquals("days", durationFieldType0.toString());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("days", unsupportedDurationField0.getName());
      assertEquals("days", durationFieldType0.getName());
      assertEquals("days", durationFieldType0.toString());
      
      // Undeclared exception!
      try {
        long long0 = unsupportedDurationField0.add((long) int0, int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // days field is unsupported
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      assertNotNull(durationFieldType0);
      assertEquals("weekyears", durationFieldType0.getName());
      assertEquals("weekyears", durationFieldType0.toString());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals("weekyears", durationFieldType0.getName());
      assertEquals("weekyears", durationFieldType0.toString());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("weekyears", unsupportedDurationField0.getName());
      
      long long0 = unsupportedDurationField0.getUnitMillis();
      assertEquals(0L, long0);
      assertEquals("weekyears", durationFieldType0.getName());
      assertEquals("weekyears", durationFieldType0.toString());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("weekyears", unsupportedDurationField0.getName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      assertNotNull(durationFieldType0);
      assertEquals("years", durationFieldType0.toString());
      assertEquals("years", durationFieldType0.getName());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals("years", durationFieldType0.toString());
      assertEquals("years", durationFieldType0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("years", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      
      long long0 = (-37L);
      // Undeclared exception!
      try {
        int int0 = unsupportedDurationField0.getValue(long0, long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // years field is unsupported
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = 0;
      Period period0 = Period.weeks(int0);
      assertNotNull(period0);
      
      DurationFieldType durationFieldType0 = period0.getFieldType(int0);
      assertNotNull(durationFieldType0);
      assertEquals("years", durationFieldType0.toString());
      assertEquals("years", durationFieldType0.getName());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("years", unsupportedDurationField0.getName());
      assertEquals("years", durationFieldType0.toString());
      assertEquals("years", durationFieldType0.getName());
      
      String string0 = unsupportedDurationField0.toString();
      assertEquals("UnsupportedDurationField[years]", string0);
      assertNotNull(string0);
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("years", unsupportedDurationField0.getName());
      assertEquals("years", durationFieldType0.toString());
      assertEquals("years", durationFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      assertNotNull(durationFieldType0);
      assertEquals("centuries", durationFieldType0.getName());
      assertEquals("centuries", durationFieldType0.toString());
      
      long long0 = (-9L);
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("centuries", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("centuries", durationFieldType0.getName());
      assertEquals("centuries", durationFieldType0.toString());
      
      // Undeclared exception!
      try {
        long long1 = unsupportedDurationField0.add(long0, long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // centuries field is unsupported
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      assertNotNull(durationFieldType0);
      assertEquals("hours", durationFieldType0.toString());
      assertEquals("hours", durationFieldType0.getName());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("hours", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("hours", durationFieldType0.toString());
      assertEquals("hours", durationFieldType0.getName());
      
      long long0 = 82L;
      // Undeclared exception!
      try {
        long long1 = unsupportedDurationField0.getValueAsLong(long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // hours field is unsupported
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = 0;
      Period period0 = Period.weeks(int0);
      assertNotNull(period0);
      
      DurationFieldType durationFieldType0 = period0.getFieldType(int0);
      assertNotNull(durationFieldType0);
      assertEquals("years", durationFieldType0.toString());
      assertEquals("years", durationFieldType0.getName());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("years", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("years", durationFieldType0.toString());
      assertEquals("years", durationFieldType0.getName());
      
      // Undeclared exception!
      try {
        int int1 = unsupportedDurationField0.getValue((long) int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // years field is unsupported
         //
      }
  }

  @Test(timeout = 4000)
  public void test18() {}
//   @Test(timeout = 4000)
//   public void test18()  throws Throwable  {
//       DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
//       assertNotNull(durationFieldType0);
//       assertEquals("halfdays", durationFieldType0.getName());
//       assertEquals("halfdays", durationFieldType0.toString());
//       
//       UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
//       assertNotNull(unsupportedDurationField0);
//       assertEquals("halfdays", unsupportedDurationField0.getName());
//       assertEquals(false, unsupportedDurationField0.isSupported());
//       assertEquals(true, unsupportedDurationField0.isPrecise());
//       assertEquals(0L, unsupportedDurationField0.getUnitMillis());
//       assertEquals("halfdays", durationFieldType0.getName());
//       assertEquals("halfdays", durationFieldType0.toString());
//       
//       DurationFieldType durationFieldType1 = unsupportedDurationField0.getType();
//       assertSame(durationFieldType1, durationFieldType0);
//       assertSame(durationFieldType0, durationFieldType1);
//       assertNotNull(durationFieldType1);
//       assertEquals("halfdays", durationFieldType1.getName());
//       assertEquals("halfdays", durationFieldType1.toString());
//       assertEquals("halfdays", unsupportedDurationField0.getName());
//       assertEquals(false, unsupportedDurationField0.isSupported());
//       assertEquals(true, unsupportedDurationField0.isPrecise());
//       assertEquals(0L, unsupportedDurationField0.getUnitMillis());
//       assertEquals("halfdays", durationFieldType0.getName());
//       assertEquals("halfdays", durationFieldType0.toString());
//   }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      assertNotNull(durationFieldType0);
      assertEquals("halfdays", durationFieldType0.toString());
      assertEquals("halfdays", durationFieldType0.getName());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals("halfdays", durationFieldType0.toString());
      assertEquals("halfdays", durationFieldType0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("halfdays", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      
      long long0 = (-1082L);
      // Undeclared exception!
      try {
        long long1 = unsupportedDurationField0.getMillis(long0, long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // halfdays field is unsupported
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Days days0 = Days.SIX;
      assertNotNull(days0);
      assertEquals(1, days0.size());
      
      DurationFieldType durationFieldType0 = days0.getFieldType();
      assertNotNull(durationFieldType0);
      assertEquals("days", durationFieldType0.getName());
      assertEquals("days", durationFieldType0.toString());
      assertEquals(1, days0.size());
      
      DurationFieldType durationFieldType1 = DurationFieldType.minutes();
      assertNotSame(durationFieldType1, durationFieldType0);
      assertNotNull(durationFieldType1);
      assertEquals("minutes", durationFieldType1.getName());
      assertEquals("minutes", durationFieldType1.toString());
      assertFalse(durationFieldType1.equals((Object)durationFieldType0));
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotSame(durationFieldType0, durationFieldType1);
      assertNotNull(unsupportedDurationField0);
      assertEquals("days", durationFieldType0.getName());
      assertEquals("days", durationFieldType0.toString());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("days", unsupportedDurationField0.getName());
      assertEquals(1, days0.size());
      assertFalse(durationFieldType0.equals((Object)durationFieldType1));
      
      UnsupportedDurationField unsupportedDurationField1 = UnsupportedDurationField.getInstance(durationFieldType1);
      assertNotSame(durationFieldType1, durationFieldType0);
      assertNotSame(unsupportedDurationField1, unsupportedDurationField0);
      assertNotNull(unsupportedDurationField1);
      assertEquals("minutes", durationFieldType1.getName());
      assertEquals("minutes", durationFieldType1.toString());
      assertEquals(false, unsupportedDurationField1.isSupported());
      assertEquals(true, unsupportedDurationField1.isPrecise());
      assertEquals("minutes", unsupportedDurationField1.getName());
      assertEquals(0L, unsupportedDurationField1.getUnitMillis());
      assertFalse(durationFieldType1.equals((Object)durationFieldType0));
      assertFalse(unsupportedDurationField1.equals((Object)unsupportedDurationField0));
      
      boolean boolean0 = unsupportedDurationField0.equals((Object) unsupportedDurationField1);
      assertFalse(boolean0);
      assertNotSame(durationFieldType0, durationFieldType1);
      assertNotSame(durationFieldType1, durationFieldType0);
      assertNotSame(unsupportedDurationField1, unsupportedDurationField0);
      assertNotSame(unsupportedDurationField0, unsupportedDurationField1);
      assertEquals("days", durationFieldType0.getName());
      assertEquals("days", durationFieldType0.toString());
      assertEquals("minutes", durationFieldType1.getName());
      assertEquals("minutes", durationFieldType1.toString());
      assertEquals(false, unsupportedDurationField1.isSupported());
      assertEquals(true, unsupportedDurationField1.isPrecise());
      assertEquals("minutes", unsupportedDurationField1.getName());
      assertEquals(0L, unsupportedDurationField1.getUnitMillis());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("days", unsupportedDurationField0.getName());
      assertEquals(1, days0.size());
      assertFalse(durationFieldType0.equals((Object)durationFieldType1));
      assertFalse(durationFieldType1.equals((Object)durationFieldType0));
      assertFalse(unsupportedDurationField1.equals((Object)unsupportedDurationField0));
      assertFalse(unsupportedDurationField0.equals((Object)unsupportedDurationField1));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      assertNotNull(durationFieldType0);
      assertEquals("minutes", durationFieldType0.getName());
      assertEquals("minutes", durationFieldType0.toString());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("minutes", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("minutes", durationFieldType0.getName());
      assertEquals("minutes", durationFieldType0.toString());
      
      long long0 = (-1948L);
      // Undeclared exception!
      try {
        long long1 = unsupportedDurationField0.getDifferenceAsLong(long0, long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // minutes field is unsupported
         //
      }
  }
}
