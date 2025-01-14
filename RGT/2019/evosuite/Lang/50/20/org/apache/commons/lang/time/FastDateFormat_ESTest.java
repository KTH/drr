/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 10:21:52 GMT 2019
 */

package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import java.text.ChoiceFormat;
import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang.time.FastDateFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;


public class FastDateFormat_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("org.apache.commons.lang.time.FastDateFormat$TimeZoneDisplayKey");
      Locale locale0 = Locale.CANADA;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(3, 3, timeZone0, locale0);
      String string0 = fastDateFormat0.format((long) 3);
      assertEquals("01/01/70 12:00 AM", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", locale0);
      int int0 = fastDateFormat0.getMaxLengthEstimate();
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("E", locale0);
      String string0 = fastDateFormat0.toString();
      assertEquals("FastDateFormat[E]", string0);
      assertEquals(3, fastDateFormat0.getMaxLengthEstimate());
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.UK;
      // Undeclared exception!
      try { 
        FastDateFormat.getDateTimeInstance(1244, 25, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 25
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ROOT;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, timeZone0, locale0);
      boolean boolean0 = fastDateFormat0.getTimeZoneOverridesCalendar();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(1);
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Calendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat$TextField", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0);
      ParsePosition parsePosition0 = new ParsePosition(2);
      fastDateFormat0.parseObject("[", parsePosition0);
      assertEquals(0, parsePosition0.getIndex());
      assertEquals("java.text.ParsePosition[index=0,errorIndex=0]", parsePosition0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, timeZone0, (Locale) null);
      Locale locale0 = fastDateFormat0.getLocale();
      // Undeclared exception!
      try { 
        FastDateFormat.getDateInstance(3114, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style 3114
         //
         verifyException("java.text.DateFormat", e);
      }
  }

//  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1);
      String string0 = fastDateFormat0.format((long) 1);
      assertEquals("January 1, 1970 12:00:00 AM GMT", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      assertNotNull(fastDateFormat0);
      
      fastDateFormat0.getPattern();
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(3, "2/14/14 8:21 PM");
      Locale locale0 = Locale.ITALY;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(3, 1, (TimeZone) simpleTimeZone0, locale0);
      assertEquals("dd/MM/yy H.mm.ss z", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FastDateFormat.getInstance("6WZ");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("!sAI", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: A
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("MeezLy[k");
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("k", timeZone0);
      FastDateFormat.getTimeInstance(2, timeZone0);
      TimeZone timeZone1 = fastDateFormat0.getTimeZone();
      fastDateFormat0.hashCode();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone1);
      NumberFormat.getCurrencyInstance();
      ChoiceFormat choiceFormat0 = new ChoiceFormat("");
      StringBuffer stringBuffer0 = new StringBuffer();
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0, 2);
      // Undeclared exception!
      try { 
        choiceFormat0.format((long) 1, stringBuffer0, fieldPosition0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("java.text.ChoiceFormat", e);
      }
  }

//  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      String string0 = fastDateFormat0.format(date0);
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
      assertEquals("2/14/14 8:21 PM", string0);
  }

//  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance();
      assertNotSame(fastDateFormat1, fastDateFormat0);
      assertFalse(fastDateFormat1.getTimeZoneOverridesCalendar());
      assertNotNull(fastDateFormat1);
      assertEquals(21, fastDateFormat1.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = new Locale("", "", "");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance((String) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The pattern must not be null
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(",Bcr69TfNBd 3j98>2");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: B
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("MeezLy[k");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("CP0&AfHj,!", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: C
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("!_zD]V<?g;VBCOD");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: V
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Fvd_<E+B4!3a>U");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: v
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("s8S\"4GwLJi8'Kul!h=");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: L
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("s4I", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("MeezLy[mk");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("J", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: J
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("KjbE!EKIQ", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: j
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("W5+$N&");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: N
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("MeezLy[k");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("-mO`3 &U*e", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: O
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("2/14/14 8:21 PM", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: P
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("{QEA~:(M UoDm", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Q
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Locale locale0 = new Locale("");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("=ww7R+Z", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: R
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1661), "", 0, 0, (-1661), (-1661), (-686), 0, Integer.MIN_VALUE, Integer.MIN_VALUE);
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("#TK3S0>h_q0", (TimeZone) simpleTimeZone0);
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
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("XE?I(!r[^}k(3YR\"C");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: X
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("~MYY`!L.Xgo+\"f?");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: YY
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("bvc$", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: b
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("<.c5f0?OI ", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: c
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("MeezLy[k");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: ee
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("kf-g`{fACL");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      FastDateFormat fastDateFormat0 = new FastDateFormat("kf-g`{fACL", timeZone0, locale0);
      // Undeclared exception!
      try { 
        fastDateFormat0.parsePattern();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: f
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("$=gd=-r%rU<OEqqCA5f", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: g
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("9i$wvhph]#");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: i
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Locale locale0 = Locale.UK;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("lA]y=lFl`TTwI~Wk", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: l
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("_[ynE^MRfr$}0N\"F,#");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: n
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("[p", (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: p
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Zha*qOM?>");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: q
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2, "A", 0, 0, (-2695), 0, (-2140), 1558, 0, 1558, 3, 1125, 1);
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("rpAdc#$jCGlcKM\"", (TimeZone) simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: r
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(" at index: ", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: t
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("MuT@@#+#o;nBrs6", timeZone0, (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: u
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("/^x|");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: x
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(2, locale0);
      assertEquals(15, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("E", locale0);
      List list0 = fastDateFormat0.parsePattern();
      assertFalse(list0.isEmpty());
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(3600000, "_811@");
      Locale locale0 = Locale.TAIWAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(3, 1, (TimeZone) simpleTimeZone0, locale0);
      assertEquals(24, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.UK;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, timeZone0, locale0);
      StringBuffer stringBuffer0 = new StringBuffer();
      FieldPosition fieldPosition0 = new FieldPosition(0);
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Object) locale0, stringBuffer0, fieldPosition0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: java.util.Locale
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

//  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      assertNotNull(fastDateFormat0);
      
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      String string0 = fastDateFormat0.format((Object) date0);
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
      assertEquals("2/14/14 8:21 PM", string0);
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      StringBuffer stringBuffer0 = new StringBuffer();
      FieldPosition fieldPosition0 = new FieldPosition(0);
      Locale locale0 = Locale.FRENCH;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
      fastDateFormat0.format((Object) mockGregorianCalendar0, stringBuffer0, fieldPosition0);
      assertEquals(24, stringBuffer0.length());
      assertEquals("vendredi 14 f\u00E9vrier 2014", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", locale0);
      Long long0 = new Long(0);
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0, 121);
      fastDateFormat0.format((Object) long0, (StringBuffer) null, fieldPosition0);
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1);
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0);
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Object) null, (StringBuffer) null, fieldPosition0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: <null>
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

//  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.UK;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, timeZone0, locale0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("[", locale0);
      Calendar calendar0 = mockSimpleDateFormat0.getCalendar();
      String string0 = fastDateFormat0.format(calendar0);
      assertEquals("20:21:21 o'clock GMT", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      boolean boolean0 = fastDateFormat0.equals("2/14/14 8:21 PM");
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      Locale locale0 = Locale.CHINA;
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance("", locale0);
      fastDateFormat0.equals(fastDateFormat1);
      assertFalse(fastDateFormat1.getTimeZoneOverridesCalendar());
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Locale locale0 = new Locale("M/d/yy", "M/d/yy", "M/d/yy");
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("M/d/yy", locale0);
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateInstance(3, (TimeZone) null);
      boolean boolean0 = fastDateFormat0.equals(fastDateFormat1);
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
      assertFalse(boolean0);
      assertEquals(10, fastDateFormat1.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("MeezLy[k");
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", timeZone0);
      assertTrue(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("#/d/yy", (TimeZone) null, locale0);
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance("#/d/yy", (TimeZone) null);
      boolean boolean0 = fastDateFormat0.equals(fastDateFormat1);
      assertFalse(boolean0);
  }

//  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      Locale locale0 = Locale.CANADA_FRENCH;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      String string0 = fastDateFormat0.format((Object) date0);
      assertEquals("10/15/82 12:00 AM", string0);
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(10, 1052, (-513), (-513), 1, 0);
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      StringBuffer stringBuffer0 = new StringBuffer(charBuffer0);
      fastDateFormat0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals(29, stringBuffer0.length());
      assertEquals("MMMM d, yyyy h:mm:ss a z", fastDateFormat0.getPattern());
  }

//  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1052, 2, 1052);
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      StringBuffer stringBuffer0 = new StringBuffer(charBuffer0);
      mockGregorianCalendar0.set(1, 1365, (-277), 1365, 1);
      fastDateFormat0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals(32, stringBuffer0.length());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-58565300340000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=114,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=9,HOUR_OF_DAY=21,MINUTE=1,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer(2);
      Locale locale0 = Locale.GERMAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(1, locale0);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(3, "Y", 3, 2, 2, 1, 1, 1, 3, 3);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(simpleTimeZone0, locale0);
      fastDateFormat0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals(18, stringBuffer0.length());
      assertEquals("20:21:21 GMT+00:00", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      System.setCurrentTimeMillis((-2322L));
      StringBuffer stringBuffer0 = new StringBuffer(2);
      Locale locale0 = Locale.GERMAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(1, locale0);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(3, "Y", 3, 2, 2, 1, 1, 1, 3, 3);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(simpleTimeZone0, locale0);
      fastDateFormat0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals("00:59:57 GMT+01:00", stringBuffer0.toString());
      assertEquals(18, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      int int0 = 1;
      FastDateFormat.getDateTimeInstance(1, 1);
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("y;\"Uo).");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: U
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0);
      TimeZone timeZone0 = fastDateFormat0.getTimeZone();
      Calendar calendar0 = MockCalendar.getInstance();
      StringBuffer stringBuffer0 = new StringBuffer();
      fastDateFormat0.format(calendar0, stringBuffer0);
      FastDateFormat.getDateTimeInstance(1, 2, timeZone0);
      // Undeclared exception!
      try { 
        FastDateFormat.getDateInstance(1979, timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style 1979
         //
         verifyException("java.text.DateFormat", e);
      }
  }
}
