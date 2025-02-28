/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 20:38:57 GMT 2019
 */

package org.joda.time.tz;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PipedReader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.joda.time.DateTimeZone;
import org.joda.time.tz.DateTimeZoneBuilder;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.ZoneInfoCompiler;
import org.junit.runner.RunWith;


public class ZoneInfoCompiler_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      zoneInfoCompiler_DateTimeOfYear0.addCutover(dateTimeZoneBuilder0, 35);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      zoneInfoCompiler_DateTimeOfYear0.addRecurring(dateTimeZoneBuilder0, "", 0, 91, (-431));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      DateTimeZone.getDefault();
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear();
      zoneInfoCompiler_DateTimeOfYear0.toString();
      ZoneInfoCompiler.parseZoneChar('z');
      zoneInfoCompiler_DateTimeOfYear0.toString();
      ZoneInfoCompiler.verbose();
      int int0 = 71;
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseYear("MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n", 71);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"monthofyear: 1
         // dayofmonth: 1
         // dayofweek: 0
         // advancedayofweek: false
         // millisofday: 0
         // zonechar: w
         // \"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ZoneInfoCompiler.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringTokenizer stringTokenizer0 = new StringTokenizer("rgE1n@k8");
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = null;
      try {
        zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear(stringTokenizer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"rgE1n@k8\" for monthOfYear is not supported
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseDayOfWeek((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-verbose";
      stringArray0[1] = "-verbose";
      ZoneInfoCompiler.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-?";
      ZoneInfoCompiler.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-src";
      stringArray0[1] = "The lower limit must be come before than the upper limit";
      try { 
        ZoneInfoCompiler.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear1 = ZoneInfoCompiler.getStartOfYear();
      assertSame(zoneInfoCompiler_DateTimeOfYear1, zoneInfoCompiler_DateTimeOfYear0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZoneInfoCompiler.getLenientISOChronology();
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseTime((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream(":t_O(i");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(objectOutputStream0);
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(8, 8);
      hashMap0.put("Destination directory doesn't exist and cannot be created: ", dateTimeZone0);
      hashMap0.put(":t_O(i", dateTimeZone0);
      ZoneInfoCompiler.writeZoneInfoMap(dataOutputStream0, hashMap0);
      assertFalse(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseYear("minimum", 4);
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = ZoneInfoCompiler.parseOptional("only");
      assertEquals("only", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = ZoneInfoCompiler.parseOptional("-");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseTime("-Unknown line: ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -Unknown line: 
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseTime("0S,PU:la5Z<k$QDN%R#");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseTime("-5QsdYS1N");
      assertEquals((-18000000), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('S');
      assertEquals('s', char0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('U');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('Z');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('g');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('u');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('w');
      assertEquals('w', char0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('O');
      assertEquals('w', char0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("E5_zRP^Ea&EGWr.3`u", false);
      boolean boolean0 = ZoneInfoCompiler.test("E5_zRP^Ea&EGWr.3`u", dateTimeZone0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      boolean boolean0 = ZoneInfoCompiler.test("-?", fixedDateTimeZone0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      MockFile mockFile0 = new MockFile("sJIJP$%&r", "");
      Map<String, DateTimeZone> map0 = zoneInfoCompiler0.compile(mockFile0, (File[]) null);
      assertEquals(0, map0.size());
  }

//  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("d");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "d");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "d";
      ZoneInfoCompiler.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      MockFile mockFile0 = new MockFile("sJIJP$%&r", "");
      mockFile0.mkdirs();
      Map<String, DateTimeZone> map0 = zoneInfoCompiler0.compile(mockFile0, (File[]) null);
      assertTrue(map0.isEmpty());
  }

//  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("^/t:q");
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      MockFile mockFile0 = new MockFile("^/t:q", "^/t:q");
      try { 
        zoneInfoCompiler0.compile(mockFile0, (File[]) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Destination directory doesn't exist and cannot be created: /Users/sophie/Documents/defects4j/tmp/run_evosuite.pl_17913_1561408606/^/t:q/^/t:q
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

//  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("^/t:q");
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      MockFile mockFile0 = new MockFile("^/t:q", "");
      try { 
        zoneInfoCompiler0.compile(mockFile0, (File[]) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Destination is not a directory: /Users/sophie/Documents/defects4j/tmp/run_evosuite.pl_17913_1561408606/^/t:q
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      StringReader stringReader0 = new StringReader("\nDayOfMonth: ");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      zoneInfoCompiler0.parseDataFile(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      StringReader stringReader0 = new StringReader("S^eAn#~}A");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 86400000);
      zoneInfoCompiler0.parseDataFile(bufferedReader0);
  }

//  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "7R*S^9";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("7R*S^9");
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)28;
      byteArray0[1] = (byte)71;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      stringArray0[1] = "J-zPi";
      stringArray0[2] = "2Hk";
      stringArray0[3] = "";
      stringArray0[4] = "\nOffsetMillis: ";
      stringArray0[5] = "3#A</7";
      stringArray0[6] = "?9xo|3_44F\"";
      stringArray0[7] = "";
      try { 
        ZoneInfoCompiler.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      StringReader stringReader0 = new StringReader("rule");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 86400000);
      // Undeclared exception!
      try { 
        zoneInfoCompiler0.parseDataFile(bufferedReader0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.StringTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringTokenizer stringTokenizer0 = new StringTokenizer("Gxcvd=c%9s6");
      stringTokenizer0.nextToken();
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear(stringTokenizer0);
  }
}
