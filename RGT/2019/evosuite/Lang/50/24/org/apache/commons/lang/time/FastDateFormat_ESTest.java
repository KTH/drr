/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 10:38:47 GMT 2019
 */

package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.time.DateTimeException;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.JapaneseDate;
import java.time.chrono.JapaneseEra;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang.time.FastDateFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;


public class FastDateFormat_ESTest {

//  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 0, locale0);
      StringBuffer stringBuffer0 = new StringBuffer(1);
      fastDateFormat0.format((long) 0, stringBuffer0);
      assertEquals(23, stringBuffer0.length());
      assertEquals("1970/01/01 0\u664200\u520600\u79D2 GMT", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getDateInstance((-1301), timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style -1301
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("Oqoj>?");
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDateFormat fastDateFormat0 = new FastDateFormat("", timeZone0, locale0);
      int int0 = fastDateFormat0.getMaxLengthEstimate();
      assertEquals(0, int0);
      assertTrue(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(1, locale0);
      String string0 = fastDateFormat0.toString();
      assertEquals("FastDateFormat[yyyy'\u5E74'M'\u6708'd'\u65E5']", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      assertNotNull(fastDateFormat0);
      
      fastDateFormat0.getTimeZoneOverridesCalendar();
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(3);
      assertEquals("h:mm a", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1, (TimeZone) simpleTimeZone0);
      String string0 = fastDateFormat0.format((long) 0);
      assertEquals("January 1, 1970 12:00:00 AM GMT+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("w;JT+E))", (TimeZone) simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: J
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 2, 895, 2, 0, 3);
      String string0 = fastDateFormat0.format((Calendar) mockGregorianCalendar0);
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
      assertEquals("8/11/05 2:00 AM", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("");
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, timeZone0, locale0);
      fastDateFormat0.getLocale();
      assertEquals(33, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = new Locale("+");
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, locale0);
      assertEquals(1, FastDateFormat.LONG);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(2, 3);
      assertEquals("MMM d, yyyy h:mm a", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "");
      Locale locale0 = Locale.PRC;
      FastDateFormat fastDateFormat0 = new FastDateFormat("", simpleTimeZone0, locale0);
      fastDateFormat0.getPattern();
      assertTrue(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FastDateFormat.getInstance("Z", (TimeZone) null);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("Z");
      mockSimpleDateFormat0.getCalendar();
      StringBuffer stringBuffer0 = new StringBuffer();
      assertEquals("", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(")K}FkyFQE8w", (TimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Q
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("");
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance();
      TimeZone timeZone0 = TimeZone.getDefault();
      ParsePosition parsePosition0 = new ParsePosition(293);
      fastDateFormat1.parseObject("", parsePosition0);
      FastDateFormat.getInstance("", timeZone0);
      TimeZone timeZone1 = fastDateFormat0.getTimeZone();
      FastDateFormat.getTimeInstance(1, timeZone1);
      FastDateFormat.getInstance("");
      long long0 = (-179L);
      // Undeclared exception!
      try { 
        ZoneOffset.ofHoursMinutes((-4434), 16);
        fail("Expecting exception: DateTimeException");
      
      } catch(DateTimeException e) {
         //
         // Zone offset hours not in valid range: value -4434 is not in the range -18 to 18
         //
         verifyException("java.time.ZoneOffset", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      fastDateFormat0.equals((Object) null);
      assertEquals("EEEE, MMMM d, yyyy", fastDateFormat0.getPattern());
  }

//  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance();
      assertNotSame(fastDateFormat1, fastDateFormat0);
      assertEquals(21, fastDateFormat1.getMaxLengthEstimate());
      assertFalse(fastDateFormat1.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.KOREA;
      FastDateFormat fastDateFormat0 = null;
      try {
        fastDateFormat0 = new FastDateFormat((String) null, timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The pattern must not be null
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("<@ApHI|6FqJ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: A
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      DateFormatSymbols dateFormatSymbols0 = new DateFormatSymbols(locale0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", dateFormatSymbols0);
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("(B#B,q9", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: B
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, ":~4Dq8");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(":~4Dq8", (TimeZone) simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: q
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("y4>WG#R!y[]", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: R
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Illegal pattern component: ", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("$Lbt8'", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: L
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("|-1aNePqKN;", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: N
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = new Locale("OV0p/F')D", "OV0p/F')D");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("OV0p/F')D", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: O
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("[Pc(<R");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: P
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("s{SC\"G-sp", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: C
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("The pattern must not be null", (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: T
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-2562), "");
      Locale locale0 = Locale.PRC;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("K!4s(U`a:yaUqN~XE=", (TimeZone) simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: U
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("+_ZV({Xq", (TimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: V
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("+]Xn2Jp'g>([~Y", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: X
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("+wH@\"Y<{BO\")JR)");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Y
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("b^tvb-~", (TimeZone) null, (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: b
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("+_cV({X{");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: c
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("eVel_Q.m,E) 1q");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: e
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Locale locale0 = new Locale("Illegal pattern component: ", "");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("96zf`35U", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: f
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("!=)\"gdzt1tQ_");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: g
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(78, "4:Z*KyAH#`j");
      Locale locale0 = Locale.FRENCH;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("i/Mua", (TimeZone) simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: i
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("j[MYK6$`>", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: j
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      Locale locale0 = Locale.KOREAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(" lN2j", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: l
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("n q");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("ZZnJ:)Sh`", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: n
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(93, "");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("org.apache.commons.lang.time.FastDateFormat$Pair", (TimeZone) simpleTimeZone0, (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("r(XcaR,7&N*@`n30ZV}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: r
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("FastDateFormat[", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: t
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("h.}u/w~js&", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: u
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("< /;vr$AI#5i5Kf9^<", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: v
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("xv3JCL:F[a[1xOyA~");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: x
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      timeZone0.toZoneId();
      Locale locale0 = new Locale("(?K2E");
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      Set<String> set0 = Calendar.getAvailableCalendarTypes();
      locale0.getDisplayLanguage();
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("(?K2E", (TimeZone) null, locale0);
      boolean boolean0 = fastDateFormat0.equals(set0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Locale locale0 = Locale.UK;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 0, locale0);
      StringBuffer stringBuffer0 = new StringBuffer(1);
      fastDateFormat0.format((long) 0, stringBuffer0);
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0, locale_FilteringMode0);
      Locale.lookupTag(linkedList0, list0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      mockSimpleDateFormat0.getTimeZone();
      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
      Locale.setDefault(locale_Category0, locale0);
      assertEquals("GBR", locale0.getISO3Country());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, (TimeZone) null);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("");
      NumberFormat numberFormat0 = mockSimpleDateFormat0.getNumberFormat();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "");
      FieldPosition fieldPosition0 = new FieldPosition(0);
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Object) numberFormat0, stringBuffer0, fieldPosition0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: java.text.DecimalFormat
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      StringBuffer stringBuffer0 = new StringBuffer();
      MockDate mockDate0 = new MockDate(810, 3, 85, 1, 3, 810);
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0, 3);
      fastDateFormat0.format((Object) mockDate0, stringBuffer0, fieldPosition0);
      assertEquals(15, stringBuffer0.length());
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("?");
      Long long0 = new Long(0L);
      String string0 = fastDateFormat0.format((Object) long0);
      assertEquals("?", string0);
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      StringBuffer stringBuffer0 = new StringBuffer();
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0, 3);
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Object) null, stringBuffer0, fieldPosition0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: <null>
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(0);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(3, 3, timeZone0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      FieldPosition fieldPosition0 = new FieldPosition(0);
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Object) mockGregorianCalendar0, (StringBuffer) null, fieldPosition0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat$UnpaddedMonthField", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, (TimeZone) null);
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance();
      assertNotNull(fastDateFormat1);
      
      fastDateFormat0.equals(fastDateFormat1);
      assertEquals(21, fastDateFormat1.getMaxLengthEstimate());
      assertEquals(50, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      int int0 = 0;
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(0);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      ZoneOffset zoneOffset1 = ZoneOffset.MAX;
      zoneOffset0.compareTo(zoneOffset1);
      Locale locale0 = Locale.ENGLISH;
      locale0.getUnicodeLocaleKeys();
      timeZone0.getDisplayName(locale0);
      FastDateFormat.getDateTimeInstance(0, 0, timeZone0);
      long long0 = 2314L;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("p");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: p
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("k");
      Locale locale0 = Locale.FRANCE;
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance("k", (TimeZone) null, locale0);
      boolean boolean0 = fastDateFormat0.equals(fastDateFormat1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      int int0 = 0;
      String string0 = "%./L";
      TimeZone timeZone0 = TimeZone.getTimeZone("%./L");
      FastDateFormat.getDateTimeInstance(0, 0, timeZone0);
      timeZone0.getDisplayName(false, 1);
      Date date0 = null;
      String string1 = null;
      MockSimpleDateFormat mockSimpleDateFormat0 = null;
      try {
        mockSimpleDateFormat0 = new MockSimpleDateFormat((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("S8", (TimeZone) null);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("S8");
      Calendar calendar0 = mockSimpleDateFormat0.getCalendar();
      StringBuffer stringBuffer0 = new StringBuffer(3);
      fastDateFormat0.applyRules(calendar0, stringBuffer0);
      assertEquals("3208", stringBuffer0.toString());
      assertEquals(4, stringBuffer0.length());
  }

//  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      Locale locale0 = Locale.CHINESE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      String string0 = fastDateFormat0.format(date0);
      assertEquals("10/15/82 12:00 AM", string0);
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      StringBuffer stringBuffer0 = new StringBuffer(2);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 3, 2, 2, 3, 3);
      fastDateFormat0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals("Friday, April 2, 0001", stringBuffer0.toString());
      assertEquals(21, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-193), (-3102), 0, 87, (-55));
      StringBuffer stringBuffer0 = new StringBuffer(2);
      fastDateFormat0.applyRules(mockGregorianCalendar0, stringBuffer0);
      assertEquals(20, stringBuffer0.length());
      assertEquals(31, fastDateFormat0.getMaxLengthEstimate());
  }

//  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("k", (TimeZone) null);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("k");
      Calendar calendar0 = mockSimpleDateFormat0.getCalendar();
      StringBuffer stringBuffer0 = new StringBuffer(3);
      fastDateFormat0.applyRules(calendar0, stringBuffer0);
      assertEquals("20", stringBuffer0.toString());
      assertEquals(2, stringBuffer0.length());
  }

//  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("k");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 3, 1);
      StringBuffer stringBuffer0 = new StringBuffer(1);
      fastDateFormat0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals(2, stringBuffer0.length());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62064921600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=3,MONTH=3,WEEK_OF_YEAR=14,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=91,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(3750, "");
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1, (TimeZone) simpleTimeZone0);
      String string0 = fastDateFormat0.format(0L);
      assertEquals("January 1, 1970 12:00:03 AM GMT+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "", 1, 1, 1, 3750, 1, 1, 1, 1);
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1, (TimeZone) simpleTimeZone0);
      String string0 = fastDateFormat0.format((long) 0);
      assertEquals("January 1, 1970 1:00:00 AM GMT+01:00", string0);
  }

//  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("Z", (TimeZone) null);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("Z");
      Calendar calendar0 = mockSimpleDateFormat0.getCalendar();
      StringBuffer stringBuffer0 = new StringBuffer(3);
      fastDateFormat0.format(calendar0, stringBuffer0);
      assertEquals("+0000", stringBuffer0.toString());
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }
}
