/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 23:09:45 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Locale;
import java.util.Set;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;


public class DateTimeZone_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)buddhistChronology0.getZone();
      Object object0 = ((DateTimeZone)cachedDateTimeZone0).writeReplace();
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHours((-675));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Offset is too large
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      String string0 = dateTimeZone0.toString();
      assertEquals("America/Los_Angeles", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Set<String> set0 = DateTimeZone.getAvailableIDs();
      assertFalse(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      String string0 = dateTimeZone0.getShortName((long) 1);
      assertEquals("+00:00:00.001", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NameProvider nameProvider0 = DateTimeZone.getNameProvider();
      DateTimeZone.setNameProvider(nameProvider0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Provider provider0 = DateTimeZone.getProvider();
      assertNotNull(provider0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseLocalDateTime("78'o>:h&W!Z;.(@8d");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"78'o>:h&W!Z;.(@8d\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("America/Los_Angeles", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZone.setDefault((DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone must not be null
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("America/Los_Angeles", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      assertTrue(dateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("+00:00");
      assertNotNull(dateTimeZone0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, 618);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 618
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes((-2379), (-1989));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1989
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(572);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 572, true);
      assertEquals("+572:00", dateTimeZone0.toString());
      assertEquals((-2059199428L), long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      boolean boolean0 = dateTimeZone0.isStandardOffset(0L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertSame(dateTimeZone0, fixedDateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      // Undeclared exception!
      try { 
        DateTimeZone.forTimeZone(timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'America/Los_Angeles' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone0.toString());
      assertNotNull(dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1989));
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("-00:00:01.989");
      assertSame(dateTimeZone1, dateTimeZone0);
      assertNotNull(dateTimeZone1);
      assertEquals("-00:00:01.989", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZone.setNameProvider((NameProvider) null);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      assertEquals("+00:00:01", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1417), "gKx#_pq\"ID!,b4");
      DateTimeZone.forTimeZone(simpleTimeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(simpleTimeZone0);
      assertNotNull(dateTimeZone0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.GERMANY;
      String string0 = dateTimeZone0.getShortName(39291904L, locale0);
      assertNotNull(string0);
      assertEquals("-08:00", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2545, "CAT");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(simpleTimeZone0);
      Locale locale0 = Locale.TAIWAN;
      String string0 = dateTimeZone0.UTC.getName((long) 2545, locale0);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(50);
      String string0 = dateTimeZone0.getName((long) 50);
      assertEquals("+50:00", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = new LocalDateTime(0L);
      DateTime dateTime0 = localDateTime0.toDateTime();
      fixedDateTimeZone0.getOffset((ReadableInstant) dateTime0);
      assertEquals(0L, dateTime0.getMillis());
  }

//  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      dateTimeZone0.getOffset((ReadableInstant) null);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isStandardOffset(21859200000L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      int int0 = dateTimeZone0.getOffsetFromLocal(9223372036854775807L);
      assertEquals((-28378000), int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2545, "CAT");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(simpleTimeZone0);
      int int0 = dateTimeZone0.getOffsetFromLocal(2545);
      assertEquals(7200000, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2524, "CAT");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(simpleTimeZone0);
      int int0 = dateTimeZone0.getOffsetFromLocal((-2109290652001L));
      assertEquals(7452000, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(3);
      // Undeclared exception!
      try { 
        dateTimeZone0.adjustOffset(9223372036854775807L, false);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1989));
      long long0 = dateTimeZone0.convertLocalToUTC(1L, true);
      assertEquals(1990L, long0);
      assertEquals("-00:00:01.989", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      // Undeclared exception!
      try { 
        dateTimeZone0.convertLocalToUTC(9223372036854775807L, false);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      // Undeclared exception!
      try { 
        dateTimeZone0.convertLocalToUTC(9223372036854775807L, true);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(9);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 9);
      assertEquals("+00:00:00.009", dateTimeZone0.toString());
      assertEquals(28800018L, long0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((Chronology) iSOChronology0);
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      boolean boolean0 = dateTimeZone0.UTC.isLocalDateTimeGap((LocalDateTime) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(572);
      long long0 = dateTimeZone0.adjustOffset((-1179L), false);
      assertEquals((-1179L), long0);
      assertEquals("+572:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      long long0 = dateTimeZone0.adjustOffset(751L, true);
      assertEquals(751L, long0);
  }
}
