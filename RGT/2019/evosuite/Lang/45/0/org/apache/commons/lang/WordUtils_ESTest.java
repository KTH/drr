/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 03 07:57:35 GMT 2019
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang.WordUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class WordUtils_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("lWindows 9.Windows 9_Windows 92Windows 9!Windows 9=Windows 9RWindows 9%Windows 9(Windows 9DWindows 9mWindows 9Z");
      assertEquals("Lwindows 9.windows 9_windows 92windows 9!windows 9=windows 9rwindows 9%windows 9(windows 9dwindows 9mwindows 9z", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = WordUtils.initials("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = WordUtils.wrap("user.timezone", 14);
      assertEquals("user.timezone", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      WordUtils wordUtils0 = new WordUtils();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = WordUtils.wrap((String) null, 1404, "X8>{~W.%", true);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = WordUtils.wrap(" 'l4Ue", (-423), " 'l4Ue", true);
      assertEquals("' 'l4Uel 'l4Ue4 'l4UeU 'l4Uee", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = WordUtils.wrap("Cannot pad a negative amount: ", (-1288), "", false);
      assertEquals("Cannotpadanegativeamount:", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = WordUtils.wrap("SunOS", 3, "SunOS", false);
      assertEquals("SunOS", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalize("Sunos", charArray0);
      assertEquals("Sunos", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[3];
      String string0 = WordUtils.capitalize((String) null, charArray0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = WordUtils.capitalize("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalizeFully("", charArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[3];
      String string0 = WordUtils.capitalizeFully((String) null, charArray0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalizeFully("file.separator", charArray0);
      assertEquals("file.separator", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.uncapitalize("EsoxkE", charArray0);
      assertEquals("EsoxkE", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = WordUtils.uncapitalize((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = WordUtils.uncapitalize("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = WordUtils.uncapitalize("qC< @j35$M");
      assertEquals("qC< @j35$M", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = WordUtils.swapCase((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = WordUtils.swapCase("~uV");
      assertEquals("~Uv", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = WordUtils.swapCase("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = WordUtils.swapCase("user.timezone");
      assertEquals("USER.TIMEZONE", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = WordUtils.initials((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.initials(":rf`u&}8CdZj)M", charArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = WordUtils.initials("% 2i[W n6?0'H");
      assertEquals("%2n", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      char[] charArray0 = new char[1];
      String string0 = WordUtils.initials("*P(Mal^l?H", charArray0);
      assertEquals("*", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[1] = 'M';
      String string0 = WordUtils.uncapitalize("_:Qy^myZ~MY", charArray0);
      assertEquals("_:Qy^myZ~My", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = WordUtils.abbreviate("user.timezone", 14, 14, "USER.TIMEZONE");
      assertNotNull(string0);
      assertEquals("user.timezone", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = WordUtils.abbreviate((String) null, 2430, 2430, "7,xetg");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = WordUtils.abbreviate("", 1404, 18, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = WordUtils.abbreviate("l._2!=R%(DmZ", (-1734), 0, "l._2!=R%(DmZ");
      assertEquals("l._2!=R%(DmZ", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = WordUtils.abbreviate(" ", 1251, 0, " ");
      assertEquals(" ", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = WordUtils.abbreviate("s^teTt3Ohr?C;; T", (-561), 0, " ");
      assertEquals(" ", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = WordUtils.abbreviate(" ", (-1), (-1), " ");
      assertEquals(" ", string0);
  }
}
