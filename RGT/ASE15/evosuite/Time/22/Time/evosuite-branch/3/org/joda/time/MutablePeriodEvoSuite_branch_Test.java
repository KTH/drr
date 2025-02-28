/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 16:46:55 GMT 2014
 */

package org.joda.time;

import static org.junit.Assert.*;
import org.junit.Test;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.Months;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePeriod;
import org.joda.time.Years;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.junit.runner.RunWith;

 
public class MutablePeriodEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      long long0 = 1263L;
      MutablePeriod mutablePeriod0 = new MutablePeriod(long0);
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      
      String string0 = null;
      Duration duration0 = Duration.parse(string0);
      assertNotNull(duration0);
      assertEquals(0L, duration0.getMillis());
      
      mutablePeriod0.add((ReadableDuration) duration0);
      assertEquals(0L, duration0.getMillis());
      assertEquals(8, mutablePeriod0.size());
  }

  //@Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Instant instant0 = new Instant();
      assertNotNull(instant0);
      assertEquals(1392409281320L, instant0.getMillis());
      
      Days days0 = Days.daysBetween((ReadableInstant) instant0, (ReadableInstant) instant0);
      assertNotNull(days0);
      assertEquals(1392409281320L, instant0.getMillis());
      assertEquals(1, days0.size());
      
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
      assertEquals(1392409281320L, instant0.getMillis());
      assertEquals(1, days0.size());
      assertEquals(8, mutablePeriod0.size());
      
      ReadableDuration readableDuration0 = null;
      mutablePeriod0.add(readableDuration0);
      assertEquals(1392409281320L, instant0.getMillis());
      assertEquals(1, days0.size());
      assertEquals(8, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Years years0 = Years.THREE;
      assertNotNull(years0);
      assertEquals(1, years0.size());
      
      MutablePeriod mutablePeriod0 = years0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1, years0.size());
      
      long long0 = (-1L);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      assertNotNull(iSOChronology0);
      
      Interval interval0 = new Interval(long0, long0, (Chronology) iSOChronology0);
      assertNotNull(interval0);
      assertEquals((-1L), interval0.getEndMillis());
      assertEquals((-1L), interval0.getStartMillis());
      
      mutablePeriod0.add((ReadableInterval) interval0);
      assertEquals(8, mutablePeriod0.size());
      assertEquals((-1L), interval0.getEndMillis());
      assertEquals((-1L), interval0.getStartMillis());
      assertEquals(1, years0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = (-1618);
      MutablePeriod mutablePeriod0 = new MutablePeriod(int0, int0, int0, int0, int0, int0, int0, int0);
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      
      ReadableInterval readableInterval0 = null;
      mutablePeriod0.add(readableInterval0);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Years years0 = Years.THREE;
      assertNotNull(years0);
      assertEquals(1, years0.size());
      
      MutablePeriod mutablePeriod0 = years0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1, years0.size());
      
      ReadableInstant readableInstant0 = null;
      mutablePeriod0.setPeriod(readableInstant0, readableInstant0);
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1, years0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      long long0 = 0L;
      PeriodType periodType0 = PeriodType.yearMonthDay();
      assertNotNull(periodType0);
      assertEquals(3, periodType0.size());
      assertEquals("YearMonthDay", periodType0.getName());
      
      Chronology chronology0 = null;
      MutablePeriod mutablePeriod0 = new MutablePeriod(long0, long0, periodType0, chronology0);
      assertNotNull(mutablePeriod0);
      assertEquals(3, periodType0.size());
      assertEquals("YearMonthDay", periodType0.getName());
      assertEquals(3, mutablePeriod0.size());
      
      MutableInterval mutableInterval0 = new MutableInterval();
      assertNotNull(mutableInterval0);
      assertEquals(0L, mutableInterval0.getStartMillis());
      assertEquals(0L, mutableInterval0.getEndMillis());
      
      Interval interval0 = mutableInterval0.toInterval();
      assertNotNull(interval0);
      assertEquals(0L, mutableInterval0.getStartMillis());
      assertEquals(0L, mutableInterval0.getEndMillis());
      assertEquals(0L, interval0.getEndMillis());
      assertEquals(0L, interval0.getStartMillis());
      
      Interval interval1 = interval0.gap((ReadableInterval) mutableInterval0);
      assertNull(interval1);
      assertEquals(0L, mutableInterval0.getStartMillis());
      assertEquals(0L, mutableInterval0.getEndMillis());
      assertEquals(0L, interval0.getEndMillis());
      assertEquals(0L, interval0.getStartMillis());
      
      mutablePeriod0.setPeriod((ReadableInterval) interval1);
      assertEquals(0L, mutableInterval0.getStartMillis());
      assertEquals(0L, mutableInterval0.getEndMillis());
      assertEquals(3, periodType0.size());
      assertEquals("YearMonthDay", periodType0.getName());
      assertEquals(0L, interval0.getEndMillis());
      assertEquals(0L, interval0.getStartMillis());
      assertEquals(3, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Years years0 = Years.THREE;
      assertNotNull(years0);
      assertEquals(1, years0.size());
      
      MutablePeriod mutablePeriod0 = years0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1, years0.size());
      
      long long0 = (-1L);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      assertNotNull(iSOChronology0);
      
      Interval interval0 = new Interval(long0, long0, (Chronology) iSOChronology0);
      assertNotNull(interval0);
      assertEquals((-1L), interval0.getEndMillis());
      assertEquals((-1L), interval0.getStartMillis());
      
      mutablePeriod0.setPeriod((ReadableInterval) interval0);
      assertEquals((-1L), interval0.getEndMillis());
      assertEquals((-1L), interval0.getStartMillis());
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1, years0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ReadableInstant readableInstant0 = null;
      MutablePeriod mutablePeriod0 = new MutablePeriod(readableInstant0, readableInstant0);
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      
      long long0 = (-1L);
      mutablePeriod0.setPeriod(long0);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Years years0 = Years.THREE;
      assertNotNull(years0);
      assertEquals(1, years0.size());
      
      MutablePeriod mutablePeriod0 = years0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1, years0.size());
      
      int int0 = 735;
      mutablePeriod0.setHours(int0);
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1, years0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      long long0 = (-17L);
      DateTime dateTime0 = new DateTime(long0);
      assertNotNull(dateTime0);
      assertEquals((-17L), dateTime0.getMillis());
      
      int int0 = dateTime0.getMinuteOfHour();
      assertEquals(59, int0);
      assertEquals((-17L), dateTime0.getMillis());
      
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      assertNotNull(buddhistChronology0);
      
      LenientChronology lenientChronology0 = LenientChronology.getInstance((Chronology) buddhistChronology0);
      assertNotNull(lenientChronology0);
      
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) int0, (long) int0, (Chronology) lenientChronology0);
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      assertEquals((-17L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      long long0 = 1263L;
      MutablePeriod mutablePeriod0 = new MutablePeriod(long0);
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      
      int int0 = (-1275);
      mutablePeriod0.addDays(int0);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "}-_";
      // Undeclared exception!
      try {
        MutablePeriod mutablePeriod0 = MutablePeriod.parse(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"}-_\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = 1;
      Years years0 = Years.THREE;
      assertNotNull(years0);
      assertEquals(1, years0.size());
      
      MutablePeriod mutablePeriod0 = years0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
      assertEquals(1, years0.size());
      assertEquals(8, mutablePeriod0.size());
      
      mutablePeriod0.setValue(int0, int0);
      assertEquals(1, years0.size());
      assertEquals(8, mutablePeriod0.size());
  }

  //@Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Instant instant0 = new Instant();
      assertNotNull(instant0);
      assertEquals(1392409281320L, instant0.getMillis());
      
      Days days0 = Days.daysBetween((ReadableInstant) instant0, (ReadableInstant) instant0);
      assertNotNull(days0);
      assertEquals(1, days0.size());
      assertEquals(1392409281320L, instant0.getMillis());
      
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
      assertEquals(1, days0.size());
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1392409281320L, instant0.getMillis());
      
      int int0 = 0;
      mutablePeriod0.setMinutes(int0);
      assertEquals(1, days0.size());
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1392409281320L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      long long0 = (-17L);
      DateTime dateTime0 = new DateTime(long0);
      assertNotNull(dateTime0);
      assertEquals((-17L), dateTime0.getMillis());
      
      Duration duration0 = new Duration(long0);
      assertNotNull(duration0);
      assertEquals((-17L), duration0.getMillis());
      
      int int0 = dateTime0.getMinuteOfHour();
      assertEquals(59, int0);
      assertEquals((-17L), dateTime0.getMillis());
      
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) dateTime0, (ReadableDuration) duration0);
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      assertEquals((-17L), dateTime0.getMillis());
      assertEquals((-17L), duration0.getMillis());
      
      mutablePeriod0.setMonths(int0);
      assertEquals(8, mutablePeriod0.size());
      assertEquals((-17L), dateTime0.getMillis());
      assertEquals((-17L), duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = 4578;
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      
      mutablePeriod0.setMillis(int0);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = PeriodType.WEEK_INDEX;
      assertEquals(2, int0);
      
      PeriodType periodType0 = null;
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) int0, (long) int0, periodType0);
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      long long0 = 1263L;
      MutablePeriod mutablePeriod0 = new MutablePeriod(long0);
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      
      int int0 = (-1275);
      mutablePeriod0.addSeconds(int0);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PeriodType periodType0 = PeriodType.years();
      assertNotNull(periodType0);
      assertEquals(1, periodType0.size());
      assertEquals("Years", periodType0.getName());
      
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      assertNotNull(mutablePeriod0);
      assertEquals(1, mutablePeriod0.size());
      assertEquals(1, periodType0.size());
      assertEquals("Years", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = 4578;
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      
      mutablePeriod0.addMinutes(int0);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      long long0 = (-17L);
      DateTime dateTime0 = new DateTime(long0);
      assertNotNull(dateTime0);
      assertEquals((-17L), dateTime0.getMillis());
      
      Duration duration0 = new Duration(long0);
      assertNotNull(duration0);
      assertEquals((-17L), duration0.getMillis());
      
      int int0 = dateTime0.getMinuteOfHour();
      assertEquals(59, int0);
      assertEquals((-17L), dateTime0.getMillis());
      
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) dateTime0, (ReadableDuration) duration0);
      assertNotNull(mutablePeriod0);
      assertEquals((-17L), duration0.getMillis());
      assertEquals(8, mutablePeriod0.size());
      assertEquals((-17L), dateTime0.getMillis());
      
      mutablePeriod0.addWeeks(int0);
      assertEquals((-17L), duration0.getMillis());
      assertEquals(8, mutablePeriod0.size());
      assertEquals((-17L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      
      int int0 = mutablePeriod0.getSeconds();
      assertEquals(0, int0);
      assertEquals(8, mutablePeriod0.size());
      
      mutablePeriod0.setPeriod((long) int0, (long) int0);
      assertEquals(8, mutablePeriod0.size());
  }

  //@Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Instant instant0 = new Instant();
      assertNotNull(instant0);
      assertEquals(1392409281320L, instant0.getMillis());
      
      Days days0 = Days.daysBetween((ReadableInstant) instant0, (ReadableInstant) instant0);
      assertNotNull(days0);
      assertEquals(1, days0.size());
      assertEquals(1392409281320L, instant0.getMillis());
      
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1, days0.size());
      assertEquals(1392409281320L, instant0.getMillis());
      
      MutablePeriod mutablePeriod1 = new MutablePeriod((Object) mutablePeriod0);
      assertNotSame(mutablePeriod0, mutablePeriod1);
      assertNotSame(mutablePeriod1, mutablePeriod0);
      assertNotNull(mutablePeriod1);
      assertEquals(8, mutablePeriod0.size());
      assertEquals(8, mutablePeriod1.size());
      assertEquals(1, days0.size());
      assertEquals(1392409281320L, instant0.getMillis());
      assertTrue(mutablePeriod0.equals((Object)mutablePeriod1));
      assertTrue(mutablePeriod1.equals((Object)mutablePeriod0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      long long0 = (-17L);
      DateTime dateTime0 = new DateTime(long0);
      assertNotNull(dateTime0);
      assertEquals((-17L), dateTime0.getMillis());
      
      Duration duration0 = new Duration(long0);
      assertNotNull(duration0);
      assertEquals((-17L), duration0.getMillis());
      
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableDuration) duration0, (ReadableInstant) dateTime0);
      assertNotNull(mutablePeriod0);
      assertEquals((-17L), duration0.getMillis());
      assertEquals((-17L), dateTime0.getMillis());
      assertEquals(8, mutablePeriod0.size());
  }

  //@Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Instant instant0 = new Instant();
      assertNotNull(instant0);
      assertEquals(1392409281320L, instant0.getMillis());
      
      Days days0 = Days.daysBetween((ReadableInstant) instant0, (ReadableInstant) instant0);
      assertNotNull(days0);
      assertEquals(1, days0.size());
      assertEquals(1392409281320L, instant0.getMillis());
      
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
      assertEquals(1, days0.size());
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1392409281320L, instant0.getMillis());
      
      int int0 = 0;
      mutablePeriod0.setWeeks(int0);
      assertEquals(1, days0.size());
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1392409281320L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      long long0 = (-1L);
      PeriodType periodType0 = PeriodType.yearDay();
      assertNotNull(periodType0);
      assertEquals("YearDay", periodType0.getName());
      assertEquals(2, periodType0.size());
      
      Instant instant0 = new Instant(long0);
      assertNotNull(instant0);
      assertEquals((-1L), instant0.getMillis());
      
      DateTime dateTime0 = instant0.toDateTime();
      assertNotNull(dateTime0);
      assertEquals((-1L), dateTime0.getMillis());
      assertEquals((-1L), instant0.getMillis());
      
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) dateTime0, (ReadableInstant) dateTime0, periodType0);
      assertNotNull(mutablePeriod0);
      assertEquals(2, mutablePeriod0.size());
      assertEquals("YearDay", periodType0.getName());
      assertEquals(2, periodType0.size());
      assertEquals((-1L), dateTime0.getMillis());
      assertEquals((-1L), instant0.getMillis());
  }

  //@Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Instant instant0 = new Instant();
      assertNotNull(instant0);
      assertEquals(1392409281320L, instant0.getMillis());
      
      long long0 = (-3576L);
      Instant instant1 = instant0.minus(long0);
      assertNotSame(instant0, instant1);
      assertNotSame(instant1, instant0);
      assertNotNull(instant1);
      assertEquals(1392409281320L, instant0.getMillis());
      assertEquals(1392409284896L, instant1.getMillis());
      assertFalse(instant0.equals((Object)instant1));
      assertFalse(instant1.equals((Object)instant0));
      
      Days days0 = Days.daysBetween((ReadableInstant) instant1, (ReadableInstant) instant1);
      assertNotSame(instant0, instant1);
      assertNotSame(instant1, instant0);
      assertNotNull(days0);
      assertEquals(1392409281320L, instant0.getMillis());
      assertEquals(1392409284896L, instant1.getMillis());
      assertEquals(1, days0.size());
      assertFalse(instant0.equals((Object)instant1));
      assertFalse(instant1.equals((Object)instant0));
      
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      assertNotSame(instant0, instant1);
      assertNotSame(instant1, instant0);
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1392409281320L, instant0.getMillis());
      assertEquals(1392409284896L, instant1.getMillis());
      assertEquals(1, days0.size());
      assertFalse(instant0.equals((Object)instant1));
      assertFalse(instant1.equals((Object)instant0));
      
      mutablePeriod0.setPeriod((ReadableInstant) instant1, (ReadableInstant) instant0);
      assertNotSame(instant0, instant1);
      assertNotSame(instant1, instant0);
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1392409281320L, instant0.getMillis());
      assertEquals(1392409284896L, instant1.getMillis());
      assertEquals(1, days0.size());
      assertFalse(instant0.equals((Object)instant1));
      assertFalse(instant1.equals((Object)instant0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Years years0 = Years.THREE;
      assertNotNull(years0);
      assertEquals(1, years0.size());
      
      MutablePeriod mutablePeriod0 = years0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1, years0.size());
      
      int int0 = 735;
      mutablePeriod0.addMonths(int0);
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1, years0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = 0;
      MutablePeriod mutablePeriod0 = new MutablePeriod(int0, int0, int0, int0);
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = 1;
      Years years0 = Years.THREE;
      assertNotNull(years0);
      assertEquals(1, years0.size());
      
      MutablePeriod mutablePeriod0 = years0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
      assertEquals(1, years0.size());
      assertEquals(8, mutablePeriod0.size());
      
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      assertNotNull(julianChronology0);
      
      mutablePeriod0.add((long) int0, (Chronology) julianChronology0);
      assertEquals(1, years0.size());
      assertEquals(8, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = PeriodType.WEEK_INDEX;
      assertEquals(2, int0);
      
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      
      DurationFieldType durationFieldType0 = DurationFieldType.MONTHS_TYPE;
      assertNotNull(durationFieldType0);
      assertEquals("months", durationFieldType0.getName());
      assertEquals("months", durationFieldType0.toString());
      
      mutablePeriod0.set(durationFieldType0, int0);
      assertEquals("months", durationFieldType0.getName());
      assertEquals("months", durationFieldType0.toString());
      assertEquals(8, mutablePeriod0.size());
  }

  //@Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Instant instant0 = new Instant();
      assertNotNull(instant0);
      assertEquals(1392409281320L, instant0.getMillis());
      
      Days days0 = Days.daysBetween((ReadableInstant) instant0, (ReadableInstant) instant0);
      assertNotNull(days0);
      assertEquals(1, days0.size());
      assertEquals(1392409281320L, instant0.getMillis());
      
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1, days0.size());
      assertEquals(1392409281320L, instant0.getMillis());
      
      int int0 = 0;
      mutablePeriod0.addMillis(int0);
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1, days0.size());
      assertEquals(1392409281320L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ReadableInstant readableInstant0 = null;
      MutablePeriod mutablePeriod0 = new MutablePeriod(readableInstant0, readableInstant0);
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      
      long long0 = (-1L);
      mutablePeriod0.add(long0);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Chronology chronology0 = null;
      int int0 = (-521);
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) int0, chronology0);
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
  }

  //@Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Instant instant0 = new Instant();
      assertNotNull(instant0);
      assertEquals(1392409281320L, instant0.getMillis());
      
      Days days0 = Days.daysBetween((ReadableInstant) instant0, (ReadableInstant) instant0);
      assertNotNull(days0);
      assertEquals(1392409281320L, instant0.getMillis());
      assertEquals(1, days0.size());
      
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
      assertEquals(1392409281320L, instant0.getMillis());
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1, days0.size());
      
      mutablePeriod0.mergePeriod((ReadablePeriod) mutablePeriod0);
      assertEquals(1392409281320L, instant0.getMillis());
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1, days0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = 1;
      Years years0 = Years.THREE;
      assertNotNull(years0);
      assertEquals(1, years0.size());
      
      MutablePeriod mutablePeriod0 = years0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1, years0.size());
      
      mutablePeriod0.addYears(int0);
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1, years0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int int0 = 1;
      Duration duration0 = Duration.standardSeconds((long) int0);
      assertNotNull(duration0);
      assertEquals(1000L, duration0.getMillis());
      
      ReadableInstant readableInstant0 = null;
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      assertNotNull(periodType0);
      assertEquals("YearMonthDayTime", periodType0.getName());
      assertEquals(7, periodType0.size());
      
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableDuration) duration0, readableInstant0, periodType0);
      assertNotNull(mutablePeriod0);
      assertEquals(1000L, duration0.getMillis());
      assertEquals(7, mutablePeriod0.size());
      assertEquals("YearMonthDayTime", periodType0.getName());
      assertEquals(7, periodType0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int int0 = 1;
      ReadableInstant readableInstant0 = null;
      Duration duration0 = new Duration((long) int0, (long) int0);
      assertNotNull(duration0);
      assertEquals(0L, duration0.getMillis());
      
      PeriodType periodType0 = PeriodType.yearDay();
      assertNotNull(periodType0);
      assertEquals(2, periodType0.size());
      assertEquals("YearDay", periodType0.getName());
      
      MutablePeriod mutablePeriod0 = new MutablePeriod(readableInstant0, (ReadableDuration) duration0, periodType0);
      assertNotNull(mutablePeriod0);
      assertEquals(2, periodType0.size());
      assertEquals("YearDay", periodType0.getName());
      assertEquals(2, mutablePeriod0.size());
      assertEquals(0L, duration0.getMillis());
      
      MutablePeriod mutablePeriod1 = mutablePeriod0.copy();
      assertNotSame(mutablePeriod0, mutablePeriod1);
      assertNotSame(mutablePeriod1, mutablePeriod0);
      assertNotNull(mutablePeriod1);
      assertEquals(2, periodType0.size());
      assertEquals("YearDay", periodType0.getName());
      assertEquals(2, mutablePeriod0.size());
      assertEquals(2, mutablePeriod1.size());
      assertEquals(0L, duration0.getMillis());
      assertTrue(mutablePeriod0.equals((Object)mutablePeriod1));
      assertTrue(mutablePeriod1.equals((Object)mutablePeriod0));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      long long0 = (-1L);
      MutablePeriod mutablePeriod0 = new MutablePeriod(long0, long0);
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int int0 = PeriodType.WEEK_INDEX;
      assertEquals(2, int0);
      
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      
      mutablePeriod0.setDays(int0);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearDay();
      assertNotNull(periodType0);
      assertEquals(2, periodType0.size());
      assertEquals("YearDay", periodType0.getName());
      
      String string0 = "2";
      MutablePeriod mutablePeriod0 = null;
      try {
        mutablePeriod0 = new MutablePeriod((Object) string0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"2\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Chronology chronology0 = null;
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) chronology0, chronology0);
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Months months0 = Months.ZERO;
      assertNotNull(months0);
      assertEquals(1, months0.size());
      
      MutablePeriod mutablePeriod0 = months0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1, months0.size());
      
      int int0 = 60012;
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      assertNotNull(durationFieldType0);
      assertEquals("weekyears", durationFieldType0.toString());
      assertEquals("weekyears", durationFieldType0.getName());
      
      // Undeclared exception!
      try {
        mutablePeriod0.add(durationFieldType0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weekyears'
         //
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      long long0 = 1263L;
      MutablePeriod mutablePeriod0 = new MutablePeriod(long0);
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      
      int int0 = (-1275);
      mutablePeriod0.addHours(int0);
      assertEquals(8, mutablePeriod0.size());
  }

  //@Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Instant instant0 = new Instant();
      assertNotNull(instant0);
      assertEquals(1392409281320L, instant0.getMillis());
      
      Days days0 = Days.daysBetween((ReadableInstant) instant0, (ReadableInstant) instant0);
      assertNotNull(days0);
      assertEquals(1392409281320L, instant0.getMillis());
      assertEquals(1, days0.size());
      
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
      assertEquals(1392409281320L, instant0.getMillis());
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1, days0.size());
      
      int int0 = 0;
      mutablePeriod0.setYears(int0);
      assertEquals(1392409281320L, instant0.getMillis());
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1, days0.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      long long0 = (-17L);
      DateTime dateTime0 = new DateTime(long0);
      assertNotNull(dateTime0);
      assertEquals((-17L), dateTime0.getMillis());
      
      Duration duration0 = new Duration(long0);
      assertNotNull(duration0);
      assertEquals((-17L), duration0.getMillis());
      
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) dateTime0, (ReadableDuration) duration0);
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      assertEquals((-17L), duration0.getMillis());
      assertEquals((-17L), dateTime0.getMillis());
      
      Period period0 = mutablePeriod0.toPeriod();
      assertNotNull(period0);
      assertEquals(8, period0.size());
      assertEquals(8, mutablePeriod0.size());
      assertEquals((-17L), duration0.getMillis());
      assertEquals((-17L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ReadableInstant readableInstant0 = null;
      MutablePeriod mutablePeriod0 = new MutablePeriod(readableInstant0, readableInstant0);
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      
      int int0 = 1120;
      mutablePeriod0.setSeconds(int0);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      long long0 = (-1041L);
      PeriodType periodType0 = PeriodType.weeks();
      assertNotNull(periodType0);
      assertEquals("Weeks", periodType0.getName());
      assertEquals(1, periodType0.size());
      
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      assertNotNull(islamicChronology0);
      
      MutablePeriod mutablePeriod0 = new MutablePeriod(long0, periodType0, (Chronology) islamicChronology0);
      assertNotNull(mutablePeriod0);
      assertEquals("Weeks", periodType0.getName());
      assertEquals(1, periodType0.size());
      assertEquals(1, mutablePeriod0.size());
      
      int int0 = (-2321);
      // Undeclared exception!
      try {
        mutablePeriod0.add(int0, int0, int0, int0, int0, int0, int0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'years'
         //
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      int int0 = 1;
      ReadableInstant readableInstant0 = null;
      Duration duration0 = new Duration((long) int0, (long) int0);
      assertNotNull(duration0);
      assertEquals(0L, duration0.getMillis());
      
      PeriodType periodType0 = PeriodType.yearDay();
      assertNotNull(periodType0);
      assertEquals("YearDay", periodType0.getName());
      assertEquals(2, periodType0.size());
      
      MutablePeriod mutablePeriod0 = new MutablePeriod(readableInstant0, (ReadableDuration) duration0, periodType0);
      assertNotNull(mutablePeriod0);
      assertEquals("YearDay", periodType0.getName());
      assertEquals(2, periodType0.size());
      assertEquals(0L, duration0.getMillis());
      assertEquals(2, mutablePeriod0.size());
      
      mutablePeriod0.setPeriod((ReadableDuration) duration0);
      assertEquals("YearDay", periodType0.getName());
      assertEquals(2, periodType0.size());
      assertEquals(0L, duration0.getMillis());
      assertEquals(2, mutablePeriod0.size());
  }
}
