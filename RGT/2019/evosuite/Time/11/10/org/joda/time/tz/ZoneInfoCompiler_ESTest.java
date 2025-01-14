/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 20:56:10 GMT 2019
 */

package org.joda.time.tz;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.tz.DateTimeZoneBuilder;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.ZoneInfoCompiler;
import org.junit.runner.RunWith;


public class ZoneInfoCompiler_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
      String[] stringArray0 = new String[7];
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      zoneInfoCompiler_DateTimeOfYear0.addRecurring(dateTimeZoneBuilder0, stringArray0[4], (-3501), 0, (-211));
      assertEquals(7, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
      String string0 = zoneInfoCompiler_DateTimeOfYear0.toString();
      assertEquals("MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringTokenizer stringTokenizer0 = new StringTokenizer("0I!t$FJg(+!n~uuN", "0I!t$FJg(+!n~uuN");
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear(stringTokenizer0);
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("", 0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("0I!t$FJg(+!n~uuN", false);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      DateTimeZoneBuilder.writeMillis(objectOutputStream0, (-24L));
      dateTimeZoneBuilder1.setStandardOffset(5);
      zoneInfoCompiler_DateTimeOfYear0.addCutover(dateTimeZoneBuilder0, 1);
      int int0 = zoneInfoCompiler_DateTimeOfYear0.iMillisOfDay;
      boolean boolean0 = ZoneInfoCompiler.verbose();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ZoneInfoCompiler.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseDayOfWeek((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-dst";
      try { 
        ZoneInfoCompiler.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear1 = ZoneInfoCompiler.getStartOfYear();
      assertSame(zoneInfoCompiler_DateTimeOfYear1, zoneInfoCompiler_DateTimeOfYear0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Chronology chronology0 = ZoneInfoCompiler.getLenientISOChronology();
      Chronology chronology1 = ZoneInfoCompiler.getLenientISOChronology();
      assertSame(chronology1, chronology0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      hashMap0.put("MIN > MAX", dateTimeZone0);
      hashMap0.put("J>D'", dateTimeZone0);
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.writeZoneInfoMap((DataOutputStream) null, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseYear("maximum", (-1158));
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseYear("min", 65535);
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseYear("oe[]&", (-3175));
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"oe[]&\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseYear("max", 1329);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseYear("only", (-2088));
      assertEquals((-2088), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = ZoneInfoCompiler.parseOptional("G4J!>|NS#uf1R pbv@");
      assertEquals("G4J!>|NS#uf1R pbv@", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = ZoneInfoCompiler.parseOptional("-");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseTime("0I!t$FJg(+!n~uuN");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseTime("-9O3mz");
      assertEquals((-32400000), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseTime("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('G');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('S');
      assertEquals('s', char0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('U');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('W');
      assertEquals('w', char0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('Z');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('g');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('s');
      assertEquals('s', char0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('u');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('w');
      assertEquals('w', char0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('z');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('f');
      assertEquals('w', char0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("", false);
      boolean boolean0 = ZoneInfoCompiler.test("", dateTimeZone0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      boolean boolean0 = ZoneInfoCompiler.test("-", fixedDateTimeZone0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      File file0 = MockFile.createTempFile("PeriodType does not support fields: ", "PeriodType does not support fields: ");
      try { 
        zoneInfoCompiler0.compile(file0, (File[]) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Destination is not a directory: /var/folders/_v/6v597zmn4_v31cq2n2x1n4fc0000gn/T/PeriodType does not support fields: 0PeriodType does not support fields: 
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      MockFile mockFile0 = new MockFile("AM");
      File[] fileArray0 = new File[0];
      Map<String, DateTimeZone> map0 = zoneInfoCompiler0.compile(mockFile0, fileArray0);
      assertTrue(map0.isEmpty());
  }

//  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      MockFile mockFile0 = new MockFile("Z?1?zsE1nHhK~{V");
      FileSystemHandling.shouldAllThrowIOExceptions();
      File[] fileArray0 = new File[0];
      try { 
        zoneInfoCompiler0.compile(mockFile0, fileArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Destination directory doesn't exist and cannot be created: Z?1?zsE1nHhK~{V
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

//  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String[] stringArray0 = new String[8];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("G4J!>|NS#uf1R pbv@");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "  ");
      stringArray0[0] = "G4J!>|NS#uf1R pbv@";
      stringArray0[1] = "t8u)ggre";
      stringArray0[2] = "au ){&x%ky'lS;D1B<";
      stringArray0[3] = "T";
      stringArray0[4] = "t8u)ggre";
      stringArray0[5] = "  -src <directory>    Specify where to read source files";
      stringArray0[6] = "Cannot find time zone '";
      stringArray0[7] = "+00:39";
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

//  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "G4J!>|NS#uf1R pbv@";
      stringArray0[1] = "G4J!>|NS#uf1R pbv@";
      stringArray0[2] = "G4J!>|NS#uf1R pbv@";
      stringArray0[3] = "G4J!>|NS#uf1R pbv@";
      stringArray0[4] = "G4J!>|NS#uf1R pbv@";
      stringArray0[5] = "G4J!>|NS#uf1R pbv@";
      stringArray0[6] = "G4J!>|NS#uf1R pbv@";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("G4J!>|NS#uf1R pbv@");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "G4J!>|NS#uf1R pbv@");
      ZoneInfoCompiler.main(stringArray0);
      assertEquals(7, stringArray0.length);
  }

//  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String[] stringArray0 = new String[8];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("G4J!>|NS#uf1R pbv@");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, " > ");
      stringArray0[0] = "G4J!>|NS#uf1R pbv@";
      stringArray0[1] = "t8u)ggre";
      stringArray0[2] = "au ){&x%ky'lS;D1B<";
      stringArray0[3] = "T";
      stringArray0[4] = "t8u)ggre";
      stringArray0[5] = "  -src <directory>    Specify where to read source files";
      stringArray0[6] = "Cannot find time zone '";
      stringArray0[7] = "+00:39";
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
  public void test38()  throws Throwable  {
      StringTokenizer stringTokenizer0 = new StringTokenizer("4g&]xouldiGiF<", "g4j!>|ns", true);
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = null;
      try {
        zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear(stringTokenizer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // g
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler$DateTimeOfYear", e);
      }
  }
}
