/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 22 19:30:11 GMT 2019
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Second;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;


public class Week_ESTest {

//  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "");
      Week week0 = new Week(mockDate0, simpleTimeZone0);
      assertEquals(100701L, week0.getSerialIndex());
      assertEquals((-2209075200001L), week0.getLastMillisecond());
  }

//  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA_FRENCH;
      Week week0 = new Week(mockDate0, timeZone0, locale0);
      week0.hashCode();
      assertEquals(1392409281319L, week0.getLastMillisecond());
      assertEquals(106749L, week0.getSerialIndex());
  }

//  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA_FRENCH;
      Week week0 = new Week(mockDate0, timeZone0, locale0);
      int int0 = week0.compareTo(week0);
      assertEquals(0, int0);
      assertEquals(1392409281319L, week0.getLastMillisecond());
      assertEquals(7, week0.getWeek());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        Week.parseWeek("Week 7, 2014");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't evaluate the week.
         //
         verifyException("org.jfree.data.time.Week", e);
      }
  }

//  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Week week0 = new Week();
      week0.getYearValue();
      assertEquals(1392409281319L, week0.getLastMillisecond());
      assertEquals(106749L, week0.getSerialIndex());
  }

//  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA_FRENCH;
      Week week0 = new Week(mockDate0, timeZone0, locale0);
      String string0 = week0.toString();
      assertEquals(1392409281319L, week0.getLastMillisecond());
      assertEquals("Week 7, 2014", string0);
  }

//  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA_FRENCH;
      Week week0 = new Week(mockDate0, timeZone0, locale0);
      long long0 = week0.getSerialIndex();
      assertEquals(106749L, long0);
      assertEquals(1392409281319L, week0.getLastMillisecond());
  }

//  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Week week0 = new Week();
      long long0 = week0.getMiddleMillisecond();
      assertEquals(1392409281319L, week0.getLastMillisecond());
      assertEquals(106749L, week0.getSerialIndex());
      assertEquals(1392409281320L, long0);
  }

//  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA_FRENCH;
      Week week0 = new Week(mockDate0, timeZone0, locale0);
      RegularTimePeriod regularTimePeriod0 = week0.previous();
      assertEquals(106748L, regularTimePeriod0.getSerialIndex());
      assertEquals(1392409281319L, regularTimePeriod0.getLastMillisecond());
  }

//  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Week week0 = new Week((-3229), 9999);
      RegularTimePeriod regularTimePeriod0 = week0.next();
      assertEquals(1392409281319L, week0.getLastMillisecond());
      assertEquals(530046L, week0.getSerialIndex());
      assertNull(regularTimePeriod0);
  }

//  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockDate mockDate0 = new MockDate(9999, 3528, (-293), (-293), 60);
      Year year0 = new Year(mockDate0);
      Week week0 = new Week(9999, year0);
      assertEquals(1392409281319L, week0.getLastMillisecond());
      assertEquals(15, week0.getWeek());
  }

//  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Year year0 = new Year();
      Week week0 = new Week(0, year0);
      RegularTimePeriod regularTimePeriod0 = week0.next();
      boolean boolean0 = week0.equals(regularTimePeriod0);
      assertEquals(1392409281319L, regularTimePeriod0.getLastMillisecond());
      assertEquals(106743L, regularTimePeriod0.getSerialIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Week week0 = null;
      try {
        week0 = new Week((Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'time' argument.
         //
         verifyException("org.jfree.data.time.Week", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1709, 1709, 7, (-241), 7);
      Week week0 = null;
      try {
        week0 = new Week(mockDate0, (TimeZone) null, (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'zone' argument.
         //
         verifyException("org.jfree.data.time.Week", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockDate mockDate0 = new MockDate(52, 37, 37);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Week week0 = null;
      try {
        week0 = new Week(mockDate0, zoneInfo0, (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'locale' argument.
         //
         verifyException("org.jfree.data.time.Week", e);
      }
  }

//  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochMilli(1019L);
      Date date0 = Date.from(instant0);
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.CANADA_FRENCH;
      Week week0 = new Week(date0, timeZone0, locale0);
      RegularTimePeriod regularTimePeriod0 = week0.previous();
      assertEquals(104409L, regularTimePeriod0.getSerialIndex());
      assertNotNull(regularTimePeriod0);
      assertEquals(1392409281319L, regularTimePeriod0.getLastMillisecond());
      assertEquals(1970, week0.getYearValue());
  }

//  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Week week0 = new Week(1, 53);
      RegularTimePeriod regularTimePeriod0 = week0.previous();
      assertEquals(1392409281319L, week0.getLastMillisecond());
      assertEquals(2810L, week0.getSerialIndex());
      assertNull(regularTimePeriod0);
  }

//  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Week week0 = new Week(1900, 1900);
      RegularTimePeriod regularTimePeriod0 = week0.next();
      assertEquals(100754L, regularTimePeriod0.getSerialIndex());
      assertNotNull(regularTimePeriod0);
      assertEquals(1392409281319L, regularTimePeriod0.getLastMillisecond());
  }

//  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Week week0 = new Week(52, 0);
      RegularTimePeriod regularTimePeriod0 = week0.next();
      assertEquals(53L, regularTimePeriod0.getSerialIndex());
      assertEquals(1392409281319L, regularTimePeriod0.getLastMillisecond());
  }

//  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Week week0 = new Week();
      Date date0 = week0.getStart();
      Second second0 = new Second(date0, week0.DEFAULT_TIME_ZONE);
      boolean boolean0 = week0.equals(second0);
      assertFalse(boolean0);
      assertEquals(7, week0.getWeek());
      assertEquals(1392409281320L, second0.getFirstMillisecond());
      assertEquals(1392409281319L, week0.getLastMillisecond());
  }

//  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Year year0 = new Year();
      Week week0 = new Week(0, year0);
      RegularTimePeriod regularTimePeriod0 = week0.next();
      System.setCurrentTimeMillis(4L);
      Week week1 = new Week();
      boolean boolean0 = ((Week) regularTimePeriod0).equals(week1);
      assertFalse(regularTimePeriod0.equals((Object)week0));
      assertEquals(106743L, regularTimePeriod0.getSerialIndex());
      assertFalse(boolean0);
      assertEquals(104411L, week1.getSerialIndex());
  }

//  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Week week0 = new Week();
      Week week1 = new Week();
      boolean boolean0 = week0.equals(week1);
      assertEquals(7, week1.getWeek());
      assertEquals(1392409281319L, week1.getLastMillisecond());
      assertTrue(boolean0);
  }

//  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA_FRENCH;
      Week week0 = new Week(mockDate0, timeZone0, locale0);
      int int0 = week0.compareTo(timeZone0);
      assertEquals(1, int0);
      assertEquals(7, week0.getWeek());
      assertEquals(1392409281319L, week0.getLastMillisecond());
  }

//  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Week week0 = new Week(mockDate0);
      Locale locale0 = Locale.JAPAN;
      mockDate0.setTime(1);
      Week week1 = new Week(mockDate0, week0.DEFAULT_TIME_ZONE, locale0);
      int int0 = week0.compareTo(week1);
      assertEquals(1392409281319L, week0.getLastMillisecond());
      assertEquals(44, int0);
      assertEquals(7, week0.getWeek());
  }

//  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Week week0 = new Week();
      Millisecond millisecond0 = new Millisecond();
      int int0 = week0.compareTo(millisecond0);
      assertEquals(0, int0);
      assertEquals(1392409281319L, week0.getLastMillisecond());
      assertEquals(7, week0.getWeek());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Week week0 = Week.parseWeek((String) null);
      assertNull(week0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        Week.parseWeek("@BHbwWq79");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Could not find separator.
         //
         verifyException("org.jfree.data.time.Week", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        Week.parseWeek("-W51$8L+.2OTL(DkC");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't evaluate the year.
         //
         verifyException("org.jfree.data.time.Week", e);
      }
  }
}
