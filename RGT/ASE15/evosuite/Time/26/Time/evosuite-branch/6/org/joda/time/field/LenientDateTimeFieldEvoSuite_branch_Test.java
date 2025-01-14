/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:26:07 GMT 2014
 */

package org.joda.time.field;

import static org.junit.Assert.*;
import org.junit.Test;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.MonthDay;
import org.joda.time.ReadableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.LimitChronology;
import org.joda.time.field.LenientDateTimeField;
import org.joda.time.field.StrictDateTimeField;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

 
public class LenientDateTimeFieldEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeField dateTimeField0 = null;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      assertNotNull(islamicChronology0);
      
      DateTimeField dateTimeField1 = LenientDateTimeField.getInstance(dateTimeField0, (Chronology) islamicChronology0);
      assertNull(dateTimeField1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      assertNotNull(buddhistChronology0);
      
      LenientChronology lenientChronology0 = LenientChronology.getInstance((Chronology) buddhistChronology0);
      assertNotNull(lenientChronology0);
      
      int int0 = (-1789);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis(int0);
      assertNotNull(fixedDateTimeZone0);
      assertEquals("-00:00:01.789", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("-00:00:01.789", fixedDateTimeZone0.toString());
      
      MonthDay monthDay0 = new MonthDay((DateTimeZone) fixedDateTimeZone0);
      assertNotNull(monthDay0);
      assertEquals("-00:00:01.789", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("-00:00:01.789", fixedDateTimeZone0.toString());
      assertEquals(2, monthDay0.size());
      
      DateMidnight dateMidnight0 = new DateMidnight((long) int0, (Chronology) lenientChronology0);
      assertNotNull(dateMidnight0);
      assertEquals((-86400000L), dateMidnight0.getMillis());
      
      DateTime dateTime0 = monthDay0.toDateTime((ReadableInstant) dateMidnight0);
      assertNotNull(dateTime0);
      assertEquals((-27734400000L), dateTime0.getMillis());
      assertEquals((-86400000L), dateMidnight0.getMillis());
      assertEquals("-00:00:01.789", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("-00:00:01.789", fixedDateTimeZone0.toString());
      assertEquals(2, monthDay0.size());
      
      LimitChronology limitChronology0 = LimitChronology.getInstance((Chronology) buddhistChronology0, (ReadableDateTime) dateTime0, (ReadableDateTime) dateMidnight0);
      assertNotNull(limitChronology0);
      assertEquals((-27734400000L), dateTime0.getMillis());
      assertEquals((-86400000L), dateMidnight0.getMillis());
      assertEquals("-00:00:01.789", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("-00:00:01.789", fixedDateTimeZone0.toString());
      assertEquals(2, monthDay0.size());
      
      DateTimeField dateTimeField0 = limitChronology0.monthOfYear();
      assertNotNull(dateTimeField0);
      assertEquals((-27734400000L), dateTime0.getMillis());
      assertEquals((-86400000L), dateMidnight0.getMillis());
      assertEquals("-00:00:01.789", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("-00:00:01.789", fixedDateTimeZone0.toString());
      assertEquals("monthOfYear", dateTimeField0.getName());
      assertEquals(true, dateTimeField0.isSupported());
      assertEquals(false, dateTimeField0.isLenient());
      assertEquals(2, monthDay0.size());
      
      LenientDateTimeField lenientDateTimeField0 = new LenientDateTimeField(dateTimeField0, buddhistChronology0);
      assertNotNull(lenientDateTimeField0);
      assertEquals((-27734400000L), dateTime0.getMillis());
      assertEquals(true, lenientDateTimeField0.isLenient());
      assertEquals(true, lenientDateTimeField0.isSupported());
      assertEquals("monthOfYear", lenientDateTimeField0.getName());
      assertEquals((-86400000L), dateMidnight0.getMillis());
      assertEquals("-00:00:01.789", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("-00:00:01.789", fixedDateTimeZone0.toString());
      assertEquals("monthOfYear", dateTimeField0.getName());
      assertEquals(true, dateTimeField0.isSupported());
      assertEquals(false, dateTimeField0.isLenient());
      assertEquals(2, monthDay0.size());
      
      StrictDateTimeField strictDateTimeField0 = new StrictDateTimeField(lenientDateTimeField0);
      assertNotNull(strictDateTimeField0);
      assertEquals((-27734400000L), dateTime0.getMillis());
      assertEquals(true, lenientDateTimeField0.isLenient());
      assertEquals(true, lenientDateTimeField0.isSupported());
      assertEquals("monthOfYear", lenientDateTimeField0.getName());
      assertEquals("monthOfYear", strictDateTimeField0.getName());
      assertEquals(true, strictDateTimeField0.isSupported());
      assertEquals(false, strictDateTimeField0.isLenient());
      assertEquals((-86400000L), dateMidnight0.getMillis());
      assertEquals("-00:00:01.789", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("-00:00:01.789", fixedDateTimeZone0.toString());
      assertEquals("monthOfYear", dateTimeField0.getName());
      assertEquals(true, dateTimeField0.isSupported());
      assertEquals(false, dateTimeField0.isLenient());
      assertEquals(2, monthDay0.size());
      
      LenientDateTimeField lenientDateTimeField1 = (LenientDateTimeField)LenientDateTimeField.getInstance((DateTimeField) strictDateTimeField0, (Chronology) lenientChronology0);
      assertNotNull(lenientDateTimeField1);
      assertSame(lenientDateTimeField0, lenientDateTimeField1);
      assertSame(lenientDateTimeField1, lenientDateTimeField0);
      assertEquals((-27734400000L), dateTime0.getMillis());
      assertEquals(true, lenientDateTimeField0.isLenient());
      assertEquals(true, lenientDateTimeField0.isSupported());
      assertEquals("monthOfYear", lenientDateTimeField0.getName());
      assertEquals("monthOfYear", strictDateTimeField0.getName());
      assertEquals(true, strictDateTimeField0.isSupported());
      assertEquals(false, strictDateTimeField0.isLenient());
      assertEquals((-86400000L), dateMidnight0.getMillis());
      assertEquals("-00:00:01.789", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("-00:00:01.789", fixedDateTimeZone0.toString());
      assertEquals("monthOfYear", lenientDateTimeField1.getName());
      assertEquals(true, lenientDateTimeField1.isSupported());
      assertEquals(true, lenientDateTimeField1.isLenient());
      assertEquals("monthOfYear", dateTimeField0.getName());
      assertEquals(true, dateTimeField0.isSupported());
      assertEquals(false, dateTimeField0.isLenient());
      assertEquals(2, monthDay0.size());
  }
}
