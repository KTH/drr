/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 14:38:08 GMT 2019
 */

package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.apache.commons.lang.time.DurationFormatUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class DurationFormatUtils_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("s", (-1649));
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(1871L);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("0java.lang.StringBuffer@000000000800java.lang.StringBuffer@000000000900java.lang.StringBuffer@0000000010000", 67);
      String string0 = durationFormatUtils_Token0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DurationFormatUtils durationFormatUtils0 = new DurationFormatUtils();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS(0L);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-1L), (-1L), "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(0L, "java.lang.StringBuffer@00000000170java.lang.StringBuffer@00000000180java.lang.StringBuffer@00000000190java.lang.StringBuffer@00000000200java.lang.StringBuffer@00000000210java.lang.StringBuffer@00000000221java.lang.StringBuffer@0000000023871java.lang.StringBuffer@0000000024", false);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(0L, true, true);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords((-403L), false, false);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO((-1L), 2419200000L);
      assertNotNull(string0);
  }

//  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      String string0 = DurationFormatUtils.formatPeriod((-2773L), 2419200000L, "d", false, timeZone0);
      assertEquals("-308", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      String string0 = DurationFormatUtils.formatPeriod((-802L), 2419202754L, ":?gM/@&/VbW", true, timeZone0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[2];
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("7M]Xm)Ni1GU@\"", 1);
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      // Undeclared exception!
      try { 
        DurationFormatUtils.format(durationFormatUtils_TokenArray0, 1, 1, 1, 0, 1, 0, 0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-1L), (-1L), "0java.lang.StringBuffer@000000000800java.lang.StringBuffer@000000000900java.lang.StringBuffer@000000001099");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Long long0 = new Long((-59087L));
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(long0);
      boolean boolean0 = durationFormatUtils_Token0.equals("0java.lang.StringBuffer@00000000090java.lang.StringBuffer@00000000100java.lang.StringBuffer@0000000011-59java.lang.StringBuffer@0000000012");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("m");
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(durationFormatUtils_Token0, 392);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("s", (-1649));
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("0java.lang.StringBuffer@00000000560java.lang.StringBuffer@00000000570java.lang.StringBuffer@00000000580java.lang.StringBuffer@0000000059");
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("java.lang.StringBuffer@00000000160java.lang.StringBuffer@00000000170java.lang.StringBuffer@00000000180java.lang.StringBuffer@00000000190java.lang.StringBuffer@00000000200java.lang.StringBuffer@00000000210java.lang.StringBuffer@0000000022000java.lang.StringBuffer@0000000023");
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(stringBuffer0, 115);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Long long0 = new Long((-59087L));
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(long0);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("d");
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(durationFormatUtils_Token0);
      DurationFormatUtils.Token durationFormatUtils_Token2 = new DurationFormatUtils.Token(durationFormatUtils_Token1);
      boolean boolean0 = durationFormatUtils_Token2.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }
}
