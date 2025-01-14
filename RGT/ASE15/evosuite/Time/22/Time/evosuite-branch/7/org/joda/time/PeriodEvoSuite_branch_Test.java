/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:27:31 GMT 2014
 */

package org.joda.time;

import static org.junit.Assert.*;
import org.junit.Test;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.MutableDateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.TimeOfDay;
import org.joda.time.Weeks;
import org.joda.time.YearMonthDay;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.runner.RunWith;

 
public class PeriodEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = (-4);
      Period period0 = Period.years(int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      PeriodType periodType0 = null;
      Period period1 = period0.normalizedStandard(periodType0);
      assertTrue(period0.equals((Object)period1));
      assertTrue(period1.equals((Object)period0));
      assertNotNull(period1);
      assertNotSame(period0, period1);
      assertNotSame(period1, period0);
      assertEquals(8, period0.size());
      assertEquals(8, period1.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = PeriodType.DAY_INDEX;
      assertEquals(3, int0);
      
      int int1 = 0;
      assertFalse(int1 == int0);
      
      Period period0 = new Period(int1, int0, int0, int1, int1, int0, int1, int0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      PeriodType periodType0 = PeriodType.standard();
      assertNotNull(periodType0);
      assertEquals(8, periodType0.size());
      assertEquals("Standard", periodType0.getName());
      
      Period period1 = period0.normalizedStandard(periodType0);
      assertTrue(period0.equals((Object)period1));
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertTrue(period1.equals((Object)period0));
      assertNotNull(period1);
      assertNotSame(period0, period1);
      assertNotSame(period1, period0);
      assertEquals(8, period0.size());
      assertEquals(8, periodType0.size());
      assertEquals("Standard", periodType0.getName());
      assertEquals(8, period1.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = PeriodType.DAY_INDEX;
      assertEquals(3, int0);
      
      Period period0 = Period.months(int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      // Undeclared exception!
      try {
        Hours hours0 = period0.toStandardHours();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Hours as this period contains months and months vary in length
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = (-4);
      Period period0 = Period.years(int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      ReadablePeriod readablePeriod0 = null;
      Period period1 = period0.minus(readablePeriod0);
      assertNotNull(period1);
      assertSame(period1, period0);
      assertSame(period0, period1);
      assertEquals(8, period1.size());
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = (-2997);
      Weeks weeks0 = Weeks.weeks(int0);
      assertNotNull(weeks0);
      assertEquals(1, weeks0.size());
      
      Days days0 = weeks0.toStandardDays();
      assertNotNull(days0);
      assertEquals(1, days0.size());
      assertEquals(1, weeks0.size());
      
      Minutes minutes0 = days0.toStandardMinutes();
      assertNotNull(minutes0);
      assertEquals(1, minutes0.size());
      assertEquals(1, days0.size());
      assertEquals(1, weeks0.size());
      
      Period period0 = Period.minutes(int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      Period period1 = period0.minus((ReadablePeriod) minutes0);
      assertFalse(period1.equals((Object)period0));
      assertFalse(period0.equals((Object)period1));
      assertNotNull(period1);
      assertNotSame(period1, period0);
      assertNotSame(period0, period1);
      assertEquals(1, minutes0.size());
      assertEquals(1, days0.size());
      assertEquals(8, period1.size());
      assertEquals(8, period0.size());
      assertEquals(1, weeks0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = 0;
      Period period0 = Period.seconds(int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      int int1 = 2473;
      Period period1 = period0.minusMillis(int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertFalse(period1.equals((Object)period0));
      assertFalse(period0.equals((Object)period1));
      assertNotNull(period1);
      assertNotSame(period1, period0);
      assertNotSame(period0, period1);
      assertEquals(8, period1.size());
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = 0;
      Period period0 = Period.seconds(int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      Period period1 = period0.plusSeconds(int0);
      assertNotNull(period1);
      assertSame(period1, period0);
      assertSame(period0, period1);
      assertEquals(8, period1.size());
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = 1160;
      PeriodType.YEAR_INDEX = int0;
      Period period0 = Period.weeks(PeriodType.YEAR_INDEX);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      Period period1 = period0.minusMinutes(PeriodType.YEAR_INDEX);
      assertFalse(period1.equals((Object)period0));
      assertFalse(period0.equals((Object)period1));
      assertNotNull(period1);
      assertNotSame(period1, period0);
      assertNotSame(period0, period1);
      assertEquals(8, period1.size());
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = PeriodType.DAY_INDEX;
      assertEquals(3, int0);
      
      int int1 = 0;
      assertFalse(int1 == int0);
      
      Period period0 = new Period(int1, int0, int0, int1, int1, int0, int1, int0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      Period period1 = period0.plusHours(int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertNotNull(period1);
      assertSame(period0, period1);
      assertSame(period1, period0);
      assertEquals(8, period0.size());
      assertEquals(8, period1.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = 758;
      Period period0 = Period.years(int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      int int1 = 0;
      Period period1 = period0.minusDays(int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertNotNull(period1);
      assertSame(period1, period0);
      assertSame(period0, period1);
      assertEquals(8, period1.size());
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = (-5);
      Weeks weeks0 = Weeks.weeks(int0);
      assertNotNull(weeks0);
      assertEquals(1, weeks0.size());
      
      Period period0 = weeks0.toPeriod();
      assertNotNull(period0);
      assertEquals(8, period0.size());
      assertEquals(1, weeks0.size());
      
      int int1 = 0;
      Period period1 = period0.minusWeeks(int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertNotNull(period1);
      assertSame(period0, period1);
      assertSame(period1, period0);
      assertEquals(8, period0.size());
      assertEquals(8, period1.size());
      assertEquals(1, weeks0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = 0;
      Period period0 = Period.seconds(int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      int int1 = 2473;
      Period period1 = period0.plusMonths(int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertFalse(period0.equals((Object)period1));
      assertFalse(period1.equals((Object)period0));
      assertNotNull(period1);
      assertNotSame(period0, period1);
      assertNotSame(period1, period0);
      assertEquals(8, period0.size());
      assertEquals(8, period1.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Weeks weeks0 = Weeks.THREE;
      assertNotNull(weeks0);
      assertEquals(1, weeks0.size());
      
      Period period0 = weeks0.toPeriod();
      assertNotNull(period0);
      assertEquals(8, period0.size());
      assertEquals(1, weeks0.size());
      
      int int0 = (-2101);
      Period period1 = period0.minusYears(int0);
      assertFalse(period0.equals((Object)period1));
      assertFalse(period1.equals((Object)period0));
      assertNotNull(period1);
      assertNotSame(period0, period1);
      assertNotSame(period1, period0);
      assertEquals(8, period0.size());
      assertEquals(1, weeks0.size());
      assertEquals(8, period1.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = Period.weeks(PeriodType.YEAR_INDEX);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      ReadablePeriod readablePeriod0 = null;
      Period period1 = period0.plus(readablePeriod0);
      assertNotNull(period1);
      assertSame(period0, period1);
      assertSame(period1, period0);
      assertEquals(8, period0.size());
      assertEquals(8, period1.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = PeriodType.DAY_INDEX;
      assertEquals(3, int0);
      
      Period period0 = new Period(int0, int0, int0, int0, int0, int0, int0, int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      Period period1 = period0.plus((ReadablePeriod) period0);
      assertFalse(period1.equals((Object)period0));
      assertFalse(period0.equals((Object)period1));
      assertNotNull(period1);
      assertNotSame(period1, period0);
      assertNotSame(period0, period1);
      assertEquals(8, period1.size());
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = (-5);
      Weeks weeks0 = Weeks.weeks(int0);
      assertNotNull(weeks0);
      assertEquals(1, weeks0.size());
      
      Period period0 = weeks0.toPeriod();
      assertNotNull(period0);
      assertEquals(8, period0.size());
      assertEquals(1, weeks0.size());
      
      int int1 = 0;
      Months months0 = Months.MIN_VALUE;
      assertNotNull(months0);
      assertEquals(1, months0.size());
      
      DurationFieldType durationFieldType0 = months0.getFieldType(int1);
      assertFalse(int1 == int0);
      assertNotNull(durationFieldType0);
      assertEquals(1, months0.size());
      assertEquals("months", durationFieldType0.toString());
      assertEquals("months", durationFieldType0.getName());
      
      Period period1 = period0.withFieldAdded(durationFieldType0, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertNotNull(period1);
      assertSame(period0, period1);
      assertSame(period1, period0);
      assertEquals(1, months0.size());
      assertEquals(8, period0.size());
      assertEquals(8, period1.size());
      assertEquals(1, weeks0.size());
      assertEquals("months", durationFieldType0.toString());
      assertEquals("months", durationFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      assertNotNull(seconds0);
      assertEquals(1, seconds0.size());
      
      Period period0 = seconds0.toPeriod();
      assertNotNull(period0);
      assertEquals(8, period0.size());
      assertEquals(1, seconds0.size());
      
      DurationFieldType durationFieldType0 = null;
      int int0 = 8;
      // Undeclared exception!
      try {
        Period period1 = period0.withFieldAdded(durationFieldType0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Chronology chronology0 = null;
      Period period0 = new Period((long) PeriodType.MILLI_INDEX, (long) PeriodType.MILLI_INDEX, chronology0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      assertNotNull(durationFieldType0);
      assertEquals("weeks", durationFieldType0.toString());
      assertEquals("weeks", durationFieldType0.getName());
      
      Period period1 = period0.withFieldAdded(durationFieldType0, PeriodType.MILLI_INDEX);
      assertFalse(period1.equals((Object)period0));
      assertFalse(period0.equals((Object)period1));
      assertNotNull(period1);
      assertNotSame(period1, period0);
      assertNotSame(period0, period1);
      assertEquals("weeks", durationFieldType0.toString());
      assertEquals("weeks", durationFieldType0.getName());
      assertEquals(8, period1.size());
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = 1;
      Period period0 = Period.hours(int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      DurationFieldType durationFieldType0 = null;
      // Undeclared exception!
      try {
        Period period1 = period0.withField(durationFieldType0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = (-2027);
      Period period0 = Period.ZERO;
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      assertNotNull(durationFieldType0);
      assertEquals("weeks", durationFieldType0.toString());
      assertEquals("weeks", durationFieldType0.getName());
      
      Period period1 = period0.withField(durationFieldType0, int0);
      assertFalse(period0.equals((Object)period1));
      assertFalse(period1.equals((Object)period0));
      assertNotNull(period1);
      assertNotSame(period0, period1);
      assertNotSame(period1, period0);
      assertEquals("weeks", durationFieldType0.toString());
      assertEquals("weeks", durationFieldType0.getName());
      assertEquals(8, period0.size());
      assertEquals(8, period1.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = 0;
      Period period0 = Period.seconds(int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      ReadablePeriod readablePeriod0 = null;
      Period period1 = period0.withFields(readablePeriod0);
      assertNotNull(period1);
      assertSame(period1, period0);
      assertSame(period0, period1);
      assertEquals(8, period1.size());
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      long long0 = 21L;
      PeriodType periodType0 = PeriodType.yearWeekDay();
      assertNotNull(periodType0);
      assertEquals("YearWeekDay", periodType0.getName());
      assertEquals(3, periodType0.size());
      
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      assertNotNull(gJChronology0);
      
      Period period0 = new Period(long0, long0, periodType0, (Chronology) gJChronology0);
      assertNotNull(period0);
      assertEquals("YearWeekDay", periodType0.getName());
      assertEquals(3, periodType0.size());
      assertEquals(3, period0.size());
      
      Period period1 = period0.withPeriodType(periodType0);
      assertNotNull(period1);
      assertSame(period1, period0);
      assertSame(period0, period1);
      assertEquals("YearWeekDay", periodType0.getName());
      assertEquals(3, periodType0.size());
      assertEquals(3, period1.size());
      assertEquals(3, period0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Chronology chronology0 = null;
      TimeOfDay timeOfDay0 = new TimeOfDay(chronology0);
      assertNotNull(timeOfDay0);
      assertEquals(4, timeOfDay0.size());
      
      Period period0 = Period.fieldDifference((ReadablePartial) timeOfDay0, (ReadablePartial) timeOfDay0);
      assertNotNull(period0);
      assertEquals(4, period0.size());
      assertEquals(4, timeOfDay0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ReadablePartial readablePartial0 = null;
      // Undeclared exception!
      try {
        Period period0 = Period.fieldDifference(readablePartial0, readablePartial0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = PeriodType.DAY_INDEX;
      assertEquals(3, int0);
      
      Period period0 = Period.weeks(int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      Seconds seconds0 = period0.toStandardSeconds();
      assertNotNull(seconds0);
      assertEquals(1, seconds0.size());
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = PeriodType.DAY_INDEX;
      assertEquals(3, int0);
      
      PeriodType periodType0 = PeriodType.standard();
      assertNotNull(periodType0);
      assertEquals(8, periodType0.size());
      assertEquals("Standard", periodType0.getName());
      
      Period period0 = new Period(int0, int0, int0, int0, int0, int0, int0, int0, periodType0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      assertEquals(8, periodType0.size());
      assertEquals("Standard", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int int0 = (-2027);
      Period period0 = Period.ZERO;
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      Period period1 = period0.minusWeeks(int0);
      assertFalse(period0.equals((Object)period1));
      assertFalse(period1.equals((Object)period0));
      assertNotNull(period1);
      assertNotSame(period0, period1);
      assertNotSame(period1, period0);
      assertEquals(8, period0.size());
      assertEquals(8, period1.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = 0;
      Period period0 = new Period((long) int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      assertNotNull(weeks0);
      assertEquals(1, weeks0.size());
      
      Duration duration0 = weeks0.toStandardDuration();
      assertNotNull(duration0);
      assertEquals(1298798109705600000L, duration0.getMillis());
      assertEquals(1, weeks0.size());
      
      ReadableInstant readableInstant0 = null;
      Period period0 = new Period((ReadableDuration) duration0, readableInstant0);
      assertNotNull(period0);
      assertEquals(1298798109705600000L, duration0.getMillis());
      assertEquals(1, weeks0.size());
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = 758;
      Period period0 = Period.years(int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      // Undeclared exception!
      try {
        Minutes minutes0 = period0.toStandardMinutes();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Minutes as this period contains years and years vary in length
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = PeriodType.DAY_INDEX;
      assertEquals(3, int0);
      
      PeriodType periodType0 = PeriodType.standard();
      assertNotNull(periodType0);
      assertEquals("Standard", periodType0.getName());
      assertEquals(8, periodType0.size());
      
      Period period0 = new Period((long) int0, periodType0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      assertEquals("Standard", periodType0.getName());
      assertEquals(8, periodType0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = (-5);
      Period period0 = Period.days(int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int int0 = (-2997);
      Period period0 = Period.minutes(int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      Weeks weeks0 = period0.toStandardWeeks();
      assertNotNull(weeks0);
      assertEquals(1, weeks0.size());
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = (-5);
      Period period0 = new Period(int0, PeriodType.DAY_INDEX, int0, int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Period period0 = Period.ZERO;
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      Days days0 = period0.toStandardDays();
      assertNotNull(days0);
      assertEquals(8, period0.size());
      assertEquals(1, days0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = 53;
      Period period0 = Period.weeks(int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      Period period1 = period0.withHours(int0);
      assertFalse(period0.equals((Object)period1));
      assertFalse(period1.equals((Object)period0));
      assertNotNull(period1);
      assertNotSame(period0, period1);
      assertNotSame(period1, period0);
      assertEquals(8, period0.size());
      assertEquals(8, period1.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int int0 = 53;
      Period period0 = Period.weeks(int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      Period period1 = period0.minusSeconds(int0);
      assertFalse(period0.equals((Object)period1));
      assertFalse(period1.equals((Object)period0));
      assertNotNull(period1);
      assertNotSame(period0, period1);
      assertNotSame(period1, period0);
      assertEquals(8, period0.size());
      assertEquals(8, period1.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int int0 = (-4);
      Period period0 = Period.years(int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      Period period1 = period0.withWeeks(int0);
      assertFalse(period1.equals((Object)period0));
      assertFalse(period0.equals((Object)period1));
      assertNotNull(period1);
      assertNotSame(period1, period0);
      assertNotSame(period0, period1);
      assertEquals(8, period1.size());
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      int int0 = (-5);
      Weeks weeks0 = Weeks.weeks(int0);
      assertNotNull(weeks0);
      assertEquals(1, weeks0.size());
      
      Period period0 = weeks0.toPeriod();
      assertNotNull(period0);
      assertEquals(1, weeks0.size());
      assertEquals(8, period0.size());
      
      Period period1 = period0.normalizedStandard();
      assertTrue(period1.equals((Object)period0));
      assertTrue(period0.equals((Object)period1));
      assertNotNull(period1);
      assertNotSame(period1, period0);
      assertNotSame(period0, period1);
      assertEquals(1, weeks0.size());
      assertEquals(8, period1.size());
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int int0 = PeriodType.DAY_INDEX;
      assertEquals(3, int0);
      
      Period period0 = Period.weeks(int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      Period period1 = period0.withSeconds(int0);
      assertFalse(period1.equals((Object)period0));
      assertFalse(period0.equals((Object)period1));
      assertNotNull(period1);
      assertNotSame(period1, period0);
      assertNotSame(period0, period1);
      assertEquals(8, period1.size());
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Weeks weeks0 = Weeks.THREE;
      assertNotNull(weeks0);
      assertEquals(1, weeks0.size());
      
      Period period0 = weeks0.toPeriod();
      assertNotNull(period0);
      assertEquals(8, period0.size());
      assertEquals(1, weeks0.size());
      
      int int0 = 0;
      Period period1 = period0.minusYears(int0);
      assertNotNull(period1);
      assertSame(period1, period0);
      assertSame(period0, period1);
      assertEquals(8, period1.size());
      assertEquals(8, period0.size());
      assertEquals(1, weeks0.size());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Instant instant0 = new Instant();
      assertNotNull(instant0);
      assertEquals(1392409281320L, instant0.getMillis());
      
      ISOChronology iSOChronology0 = (ISOChronology)instant0.getChronology();
      assertNotNull(iSOChronology0);
      assertEquals(1392409281320L, instant0.getMillis());
      
      YearMonthDay yearMonthDay0 = new YearMonthDay((Chronology) iSOChronology0);
      assertNotNull(yearMonthDay0);
      assertEquals(3, yearMonthDay0.size());
      assertEquals(1392409281320L, instant0.getMillis());
      
      Period period0 = new Period((ReadablePartial) yearMonthDay0, (ReadablePartial) yearMonthDay0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      assertEquals(3, yearMonthDay0.size());
      assertEquals(1392409281320L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      int int0 = 1160;
      Period period0 = Period.weeks(PeriodType.YEAR_INDEX);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      Period period1 = period0.minusHours(int0);
      assertFalse(period1.equals((Object)period0));
      assertFalse(period0.equals((Object)period1));
      assertNotNull(period1);
      assertNotSame(period1, period0);
      assertNotSame(period0, period1);
      assertEquals(8, period1.size());
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Period period0 = new Period();
      assertNotNull(period0);
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      int int0 = (-4);
      Period period0 = Period.years(int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      Period period1 = period0.withDays(int0);
      assertFalse(period0.equals((Object)period1));
      assertFalse(period1.equals((Object)period0));
      assertNotNull(period1);
      assertNotSame(period0, period1);
      assertNotSame(period1, period0);
      assertEquals(8, period0.size());
      assertEquals(8, period1.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      int int0 = (-2997);
      Period period0 = Period.minutes(int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      Duration duration0 = period0.toStandardDuration();
      assertNotNull(duration0);
      assertEquals((-179820000L), duration0.getMillis());
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Period period0 = Period.weeks(PeriodType.YEAR_INDEX);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      Period period1 = period0.minusMinutes(PeriodType.YEAR_INDEX);
      assertNotNull(period1);
      assertSame(period1, period0);
      assertSame(period0, period1);
      assertEquals(8, period1.size());
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearWeekDay();
      assertNotNull(periodType0);
      assertEquals(3, periodType0.size());
      assertEquals("YearWeekDay", periodType0.getName());
      
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      assertNotNull(gJChronology0);
      
      Instant instant0 = gJChronology0.getGregorianCutover();
      assertNotNull(instant0);
      assertEquals((-12219292800000L), instant0.getMillis());
      
      MutableDateTime mutableDateTime0 = instant0.toMutableDateTime();
      assertNotNull(mutableDateTime0);
      assertEquals((-12219292800000L), instant0.getMillis());
      assertEquals(0, mutableDateTime0.getRoundingMode());
      assertEquals((-12219292800000L), mutableDateTime0.getMillis());
      
      DateTime dateTime0 = mutableDateTime0.toDateTimeISO();
      assertNotNull(dateTime0);
      assertEquals((-12219292800000L), instant0.getMillis());
      assertEquals((-12219292800000L), dateTime0.getMillis());
      assertEquals(0, mutableDateTime0.getRoundingMode());
      assertEquals((-12219292800000L), mutableDateTime0.getMillis());
      
      Period period0 = new Period((ReadableInstant) dateTime0, (ReadableInstant) dateTime0, periodType0);
      assertNotNull(period0);
      assertEquals(3, period0.size());
      assertEquals(3, periodType0.size());
      assertEquals("YearWeekDay", periodType0.getName());
      assertEquals((-12219292800000L), instant0.getMillis());
      assertEquals((-12219292800000L), dateTime0.getMillis());
      assertEquals(0, mutableDateTime0.getRoundingMode());
      assertEquals((-12219292800000L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      int int0 = 758;
      Period period0 = Period.years(int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      Period period1 = period0.minusDays(int0);
      assertFalse(period0.equals((Object)period1));
      assertFalse(period1.equals((Object)period0));
      assertNotNull(period1);
      assertNotSame(period0, period1);
      assertNotSame(period1, period0);
      assertEquals(8, period0.size());
      assertEquals(8, period1.size());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      int int0 = 0;
      Period period0 = Period.seconds(int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      Period period1 = period0.minusMillis(int0);
      assertNotNull(period1);
      assertSame(period1, period0);
      assertSame(period0, period1);
      assertEquals(8, period1.size());
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      assertNotNull(timeOfDay0);
      assertEquals(4, timeOfDay0.size());
      
      PeriodType periodType0 = null;
      Period period0 = new Period((ReadablePartial) timeOfDay0, (ReadablePartial) timeOfDay0, periodType0);
      assertNotNull(period0);
      assertEquals(4, timeOfDay0.size());
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      long long0 = 2544L;
      PeriodType periodType0 = PeriodType.years();
      assertNotNull(periodType0);
      assertEquals("Years", periodType0.getName());
      assertEquals(1, periodType0.size());
      
      Period period0 = new Period(long0, long0, periodType0);
      assertNotNull(period0);
      assertEquals(1, period0.size());
      assertEquals("Years", periodType0.getName());
      assertEquals(1, periodType0.size());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String string0 = ":";
      // Undeclared exception!
      try {
        Period period0 = Period.parse(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \":\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Weeks weeks0 = Weeks.THREE;
      assertNotNull(weeks0);
      assertEquals(1, weeks0.size());
      
      Period period0 = weeks0.toPeriod();
      assertNotNull(period0);
      assertEquals(1, weeks0.size());
      assertEquals(8, period0.size());
      
      int int0 = 0;
      Period period1 = period0.minusMonths(int0);
      assertNotNull(period1);
      assertSame(period1, period0);
      assertSame(period0, period1);
      assertEquals(8, period1.size());
      assertEquals(1, weeks0.size());
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      int int0 = PeriodType.DAY_INDEX;
      assertEquals(3, int0);
      
      Period period0 = Period.weeks(int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      Period period1 = period0.withMinutes(int0);
      assertFalse(period1.equals((Object)period0));
      assertFalse(period0.equals((Object)period1));
      assertNotNull(period1);
      assertNotSame(period1, period0);
      assertNotSame(period0, period1);
      assertEquals(8, period1.size());
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      int int0 = (-4);
      Period period0 = Period.years(int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      Period period1 = period0.withMillis(int0);
      assertFalse(period1.equals((Object)period0));
      assertFalse(period0.equals((Object)period1));
      assertNotNull(period1);
      assertNotSame(period1, period0);
      assertNotSame(period0, period1);
      assertEquals(8, period1.size());
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      int int0 = PeriodType.DAY_INDEX;
      assertEquals(3, int0);
      
      ReadableInstant readableInstant0 = null;
      Duration duration0 = new Duration((long) int0, (long) int0);
      assertNotNull(duration0);
      assertEquals(0L, duration0.getMillis());
      
      PeriodType periodType0 = PeriodType.time();
      assertNotNull(periodType0);
      assertEquals("Time", periodType0.getName());
      assertEquals(4, periodType0.size());
      
      Period period0 = new Period(readableInstant0, (ReadableDuration) duration0, periodType0);
      assertNotNull(period0);
      assertEquals(0L, duration0.getMillis());
      assertEquals(4, period0.size());
      assertEquals("Time", periodType0.getName());
      assertEquals(4, periodType0.size());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ReadableInstant readableInstant0 = null;
      Period period0 = new Period(readableInstant0, readableInstant0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Period period0 = Period.weeks(PeriodType.YEAR_INDEX);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      assertNotNull(periodType0);
      assertEquals("YearWeekDayTime", periodType0.getName());
      assertEquals(7, periodType0.size());
      
      Period period1 = period0.withPeriodType(periodType0);
      assertFalse(period0.equals((Object)period1));
      assertFalse(period1.equals((Object)period0));
      assertNotNull(period1);
      assertNotSame(period0, period1);
      assertNotSame(period1, period0);
      assertEquals(8, period0.size());
      assertEquals(7, period1.size());
      assertEquals("YearWeekDayTime", periodType0.getName());
      assertEquals(7, periodType0.size());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      long long0 = 7L;
      DateTimeZone dateTimeZone0 = null;
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      assertNotNull(iSOChronology0);
      
      Period period0 = new Period(long0, (Chronology) iSOChronology0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      int int0 = PeriodType.DAY_INDEX;
      assertEquals(3, int0);
      
      Period period0 = new Period((long) int0, (long) int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      int int0 = PeriodType.DAY_INDEX;
      assertEquals(3, int0);
      
      Period period0 = Period.millis(int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Weeks weeks0 = Weeks.THREE;
      assertNotNull(weeks0);
      assertEquals(1, weeks0.size());
      
      Period period0 = weeks0.toPeriod();
      assertNotNull(period0);
      assertEquals(1, weeks0.size());
      assertEquals(8, period0.size());
      
      Period period1 = period0.toPeriod();
      assertNotNull(period1);
      assertSame(period0, period1);
      assertSame(period1, period0);
      assertEquals(1, weeks0.size());
      assertEquals(8, period0.size());
      assertEquals(8, period1.size());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      int int0 = (-4867);
      ReadableInstant readableInstant0 = null;
      Duration duration0 = Duration.standardMinutes((long) int0);
      assertNotNull(duration0);
      assertEquals((-292020000L), duration0.getMillis());
      
      Period period0 = new Period(readableInstant0, (ReadableDuration) duration0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      assertEquals((-292020000L), duration0.getMillis());
  }
}
